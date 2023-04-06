package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import io.swagger.server.api.model.Client;
import io.swagger.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class AnotherFakeApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(AnotherFakeApiVerticle.class); 
    
    final static String TEST_SPECIAL_TAGS_SERVICE_ID = "test_special_tags";
    
    final AnotherFakeApi service;

    public AnotherFakeApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.AnotherFakeApiImpl");
            service = (AnotherFakeApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AnotherFakeApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for test_special_tags
        vertx.eventBus().<JsonObject> consumer(TEST_SPECIAL_TAGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "test_special_tags";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                Client body = Json.mapper.readValue(bodyParam.encode(), Client.class);
                service.testSpecialTags(body, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "test_special_tags");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("test_special_tags", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }
    
    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause); 
        }
            
        message.fail(code, statusMessage);
    }
    
    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
