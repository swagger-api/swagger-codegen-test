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

public class FakeClassnameTags123ApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(FakeClassnameTags123ApiVerticle.class); 
    
    final static String TESTCLASSNAME_SERVICE_ID = "testClassname";
    
    final FakeClassnameTags123Api service;

    public FakeClassnameTags123ApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.FakeClassnameTags123ApiImpl");
            service = (FakeClassnameTags123Api)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("FakeClassnameTags123ApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for testClassname
        vertx.eventBus().<JsonObject> consumer(TESTCLASSNAME_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "testClassname";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                Client body = Json.mapper.readValue(bodyParam.encode(), Client.class);
                service.testClassname(body).subscribe(
                    result -> {
                        message.reply(new JsonObject(Json.encode(result)).encodePrettily());
                    },
                    error -> {
                        manageError(message, error, "testClassname");
                    });
            } catch (Exception e) {
                logUnexpectedError("testClassname", e);
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
