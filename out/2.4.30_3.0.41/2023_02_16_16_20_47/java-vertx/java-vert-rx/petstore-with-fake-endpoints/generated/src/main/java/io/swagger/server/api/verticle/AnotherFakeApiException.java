package io.swagger.server.api.verticle;

import io.swagger.server.api.model.Client;
import io.swagger.server.api.MainApiException;

public final class AnotherFakeApiException extends MainApiException {
    public AnotherFakeApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}