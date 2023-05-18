package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import java.math.BigDecimal;
import io.swagger.server.api.model.Client;
import java.time.LocalDate;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.OuterComposite;
import io.swagger.server.api.model.User;

import java.util.List;
import java.util.Map;

public class FakeApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(FakeApiVerticle.class); 
    
    final static String FAKEOUTERBOOLEANSERIALIZE_SERVICE_ID = "fakeOuterBooleanSerialize";
    final static String FAKEOUTERCOMPOSITESERIALIZE_SERVICE_ID = "fakeOuterCompositeSerialize";
    final static String FAKEOUTERNUMBERSERIALIZE_SERVICE_ID = "fakeOuterNumberSerialize";
    final static String FAKEOUTERSTRINGSERIALIZE_SERVICE_ID = "fakeOuterStringSerialize";
    final static String TESTBODYWITHQUERYPARAMS_SERVICE_ID = "testBodyWithQueryParams";
    final static String TESTCLIENTMODEL_SERVICE_ID = "testClientModel";
    final static String TESTENDPOINTPARAMETERS_SERVICE_ID = "testEndpointParameters";
    final static String TESTENUMPARAMETERS_SERVICE_ID = "testEnumParameters";
    final static String TESTINLINEADDITIONALPROPERTIES_SERVICE_ID = "testInlineAdditionalProperties";
    final static String TESTJSONFORMDATA_SERVICE_ID = "testJsonFormData";
    
    final FakeApi service;

    public FakeApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.FakeApiImpl");
            service = (FakeApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("FakeApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for fakeOuterBooleanSerialize
        vertx.eventBus().<JsonObject> consumer(FAKEOUTERBOOLEANSERIALIZE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "fakeOuterBooleanSerialize";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                Boolean body = Json.mapper.readValue(bodyParam.encode(), Boolean.class);
                service.fakeOuterBooleanSerialize(body).subscribe(
                    result -> {
                        message.reply(new JsonObject(Json.encode(result)).encodePrettily());
                    },
                    error -> {
                        manageError(message, error, "fakeOuterBooleanSerialize");
                    });
            } catch (Exception e) {
                logUnexpectedError("fakeOuterBooleanSerialize", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for fakeOuterCompositeSerialize
        vertx.eventBus().<JsonObject> consumer(FAKEOUTERCOMPOSITESERIALIZE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "fakeOuterCompositeSerialize";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                OuterComposite body = Json.mapper.readValue(bodyParam.encode(), OuterComposite.class);
                service.fakeOuterCompositeSerialize(body).subscribe(
                    result -> {
                        message.reply(new JsonObject(Json.encode(result)).encodePrettily());
                    },
                    error -> {
                        manageError(message, error, "fakeOuterCompositeSerialize");
                    });
            } catch (Exception e) {
                logUnexpectedError("fakeOuterCompositeSerialize", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for fakeOuterNumberSerialize
        vertx.eventBus().<JsonObject> consumer(FAKEOUTERNUMBERSERIALIZE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "fakeOuterNumberSerialize";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                BigDecimal body = Json.mapper.readValue(bodyParam.encode(), BigDecimal.class);
                service.fakeOuterNumberSerialize(body).subscribe(
                    result -> {
                        message.reply(new JsonObject(Json.encode(result)).encodePrettily());
                    },
                    error -> {
                        manageError(message, error, "fakeOuterNumberSerialize");
                    });
            } catch (Exception e) {
                logUnexpectedError("fakeOuterNumberSerialize", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for fakeOuterStringSerialize
        vertx.eventBus().<JsonObject> consumer(FAKEOUTERSTRINGSERIALIZE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "fakeOuterStringSerialize";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                String body = Json.mapper.readValue(bodyParam.encode(), String.class);
                service.fakeOuterStringSerialize(body).subscribe(
                    result -> {
                        message.reply(new JsonObject(Json.encode(result)).encodePrettily());
                    },
                    error -> {
                        manageError(message, error, "fakeOuterStringSerialize");
                    });
            } catch (Exception e) {
                logUnexpectedError("fakeOuterStringSerialize", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for testBodyWithQueryParams
        vertx.eventBus().<JsonObject> consumer(TESTBODYWITHQUERYPARAMS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "testBodyWithQueryParams";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                User body = Json.mapper.readValue(bodyParam.encode(), User.class);
                String queryParam = message.body().getString("query");
                if(queryParam == null) {
                    manageError(message, new MainApiException(400, "query is required"), serviceId);
                    return;
                }
                String query = queryParam;
                service.testBodyWithQueryParams(body, query).subscribe(
                    () -> {
                        message.reply(null);
                    },
                    error -> {
                        manageError(message, error, "testBodyWithQueryParams");
                    });
            } catch (Exception e) {
                logUnexpectedError("testBodyWithQueryParams", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for testClientModel
        vertx.eventBus().<JsonObject> consumer(TESTCLIENTMODEL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "testClientModel";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                Client body = Json.mapper.readValue(bodyParam.encode(), Client.class);
                service.testClientModel(body).subscribe(
                    result -> {
                        message.reply(new JsonObject(Json.encode(result)).encodePrettily());
                    },
                    error -> {
                        manageError(message, error, "testClientModel");
                    });
            } catch (Exception e) {
                logUnexpectedError("testClientModel", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for testEndpointParameters
        vertx.eventBus().<JsonObject> consumer(TESTENDPOINTPARAMETERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "testEndpointParameters";
                String numberParam = message.body().getString("number");
                if(numberParam == null) {
                    manageError(message, new MainApiException(400, "number is required"), serviceId);
                    return;
                }
                BigDecimal number = Json.mapper.readValue(numberParam, BigDecimal.class);
                String _doubleParam = message.body().getString("double");
                if(_doubleParam == null) {
                    manageError(message, new MainApiException(400, "double is required"), serviceId);
                    return;
                }
                Double _double = Json.mapper.readValue(_doubleParam, Double.class);
                String patternWithoutDelimiterParam = message.body().getString("pattern_without_delimiter");
                if(patternWithoutDelimiterParam == null) {
                    manageError(message, new MainApiException(400, "pattern_without_delimiter is required"), serviceId);
                    return;
                }
                String patternWithoutDelimiter = patternWithoutDelimiterParam;
                String _byteParam = message.body().getString("byte");
                if(_byteParam == null) {
                    manageError(message, new MainApiException(400, "byte is required"), serviceId);
                    return;
                }
                byte[] _byte = Json.mapper.readValue(_byteParam, byte[].class);
                String integerParam = message.body().getString("integer");
                Integer integer = (integerParam == null) ? null : Json.mapper.readValue(integerParam, Integer.class);
                String int32Param = message.body().getString("int32");
                Integer int32 = (int32Param == null) ? null : Json.mapper.readValue(int32Param, Integer.class);
                String int64Param = message.body().getString("int64");
                Long int64 = (int64Param == null) ? null : Json.mapper.readValue(int64Param, Long.class);
                String _floatParam = message.body().getString("float");
                Float _float = (_floatParam == null) ? null : Json.mapper.readValue(_floatParam, Float.class);
                String stringParam = message.body().getString("string");
                String string = (stringParam == null) ? null : stringParam;
                String binaryParam = message.body().getString("binary");
                byte[] binary = (binaryParam == null) ? null : Json.mapper.readValue(binaryParam, byte[].class);
                String dateParam = message.body().getString("date");
                LocalDate date = (dateParam == null) ? null : Json.mapper.readValue(dateParam, LocalDate.class);
                String dateTimeParam = message.body().getString("dateTime");
                OffsetDateTime dateTime = (dateTimeParam == null) ? null : Json.mapper.readValue(dateTimeParam, OffsetDateTime.class);
                String passwordParam = message.body().getString("password");
                String password = (passwordParam == null) ? null : passwordParam;
                String paramCallbackParam = message.body().getString("callback");
                String paramCallback = (paramCallbackParam == null) ? null : paramCallbackParam;
                service.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback).subscribe(
                    () -> {
                        message.reply(null);
                    },
                    error -> {
                        manageError(message, error, "testEndpointParameters");
                    });
            } catch (Exception e) {
                logUnexpectedError("testEndpointParameters", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for testEnumParameters
        vertx.eventBus().<JsonObject> consumer(TESTENUMPARAMETERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "testEnumParameters";
                JsonArray enumFormStringArrayParam = message.body().getJsonArray("enum_form_string_array");
                List<String> enumFormStringArray = (enumFormStringArrayParam == null) ? null : Json.mapper.readValue(enumFormStringArrayParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String enumFormStringParam = message.body().getString("enum_form_string");
                String enumFormString = (enumFormStringParam == null) ? -efg : enumFormStringParam;
                JsonArray enumHeaderStringArrayParam = message.body().getJsonArray("enum_header_string_array");
                List<String> enumHeaderStringArray = (enumHeaderStringArrayParam == null) ? null : Json.mapper.readValue(enumHeaderStringArrayParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String enumHeaderStringParam = message.body().getString("enum_header_string");
                String enumHeaderString = (enumHeaderStringParam == null) ? -efg : enumHeaderStringParam;
                JsonArray enumQueryStringArrayParam = message.body().getJsonArray("enum_query_string_array");
                List<String> enumQueryStringArray = (enumQueryStringArrayParam == null) ? null : Json.mapper.readValue(enumQueryStringArrayParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String enumQueryStringParam = message.body().getString("enum_query_string");
                String enumQueryString = (enumQueryStringParam == null) ? -efg : enumQueryStringParam;
                String enumQueryIntegerParam = message.body().getString("enum_query_integer");
                Integer enumQueryInteger = (enumQueryIntegerParam == null) ? null : Json.mapper.readValue(enumQueryIntegerParam, Integer.class);
                String enumQueryDoubleParam = message.body().getString("enum_query_double");
                Double enumQueryDouble = (enumQueryDoubleParam == null) ? null : Json.mapper.readValue(enumQueryDoubleParam, Double.class);
                service.testEnumParameters(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble).subscribe(
                    () -> {
                        message.reply(null);
                    },
                    error -> {
                        manageError(message, error, "testEnumParameters");
                    });
            } catch (Exception e) {
                logUnexpectedError("testEnumParameters", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for testInlineAdditionalProperties
        vertx.eventBus().<JsonObject> consumer(TESTINLINEADDITIONALPROPERTIES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "testInlineAdditionalProperties";
                String paramParam = message.body().getString("param");
                if(paramParam == null) {
                    manageError(message, new MainApiException(400, "param is required"), serviceId);
                    return;
                }
                Object param = Json.mapper.readValue(paramParam, Object.class);
                service.testInlineAdditionalProperties(param).subscribe(
                    () -> {
                        message.reply(null);
                    },
                    error -> {
                        manageError(message, error, "testInlineAdditionalProperties");
                    });
            } catch (Exception e) {
                logUnexpectedError("testInlineAdditionalProperties", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for testJsonFormData
        vertx.eventBus().<JsonObject> consumer(TESTJSONFORMDATA_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "testJsonFormData";
                String paramParam = message.body().getString("param");
                if(paramParam == null) {
                    manageError(message, new MainApiException(400, "param is required"), serviceId);
                    return;
                }
                String param = paramParam;
                String param2Param = message.body().getString("param2");
                if(param2Param == null) {
                    manageError(message, new MainApiException(400, "param2 is required"), serviceId);
                    return;
                }
                String param2 = param2Param;
                service.testJsonFormData(param, param2).subscribe(
                    () -> {
                        message.reply(null);
                    },
                    error -> {
                        manageError(message, error, "testJsonFormData");
                    });
            } catch (Exception e) {
                logUnexpectedError("testJsonFormData", e);
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
