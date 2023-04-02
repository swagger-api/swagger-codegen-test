package io.swagger.server.api.verticle;

import java.math.BigDecimal;
import io.swagger.server.api.model.Client;
import java.time.LocalDate;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.OuterComposite;
import io.swagger.server.api.model.User;

public final class FakeApiException extends MainApiException {
    public FakeApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final FakeApiException Fake_testEndpointParameters_400_Exception = new FakeApiException(400, "Invalid username supplied");
    public static final FakeApiException Fake_testEndpointParameters_404_Exception = new FakeApiException(404, "User not found");
    public static final FakeApiException Fake_testEnumParameters_400_Exception = new FakeApiException(400, "Invalid request");
    public static final FakeApiException Fake_testEnumParameters_404_Exception = new FakeApiException(404, "Not found");
    

}