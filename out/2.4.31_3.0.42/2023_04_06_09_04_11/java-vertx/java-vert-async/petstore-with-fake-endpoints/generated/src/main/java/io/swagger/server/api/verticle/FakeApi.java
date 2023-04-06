package io.swagger.server.api.verticle;

import java.math.BigDecimal;
import io.swagger.server.api.model.Client;
import java.time.LocalDate;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.OuterComposite;
import io.swagger.server.api.model.User;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface FakeApi  {
    //fakeOuterBooleanSerialize
    void fakeOuterBooleanSerialize(Boolean body, Handler<AsyncResult<Boolean>> handler);
    
    //fakeOuterCompositeSerialize
    void fakeOuterCompositeSerialize(OuterComposite body, Handler<AsyncResult<OuterComposite>> handler);
    
    //fakeOuterNumberSerialize
    void fakeOuterNumberSerialize(BigDecimal body, Handler<AsyncResult<BigDecimal>> handler);
    
    //fakeOuterStringSerialize
    void fakeOuterStringSerialize(String body, Handler<AsyncResult<String>> handler);
    
    //testBodyWithQueryParams
    void testBodyWithQueryParams(User body, String query, Handler<AsyncResult<Void>> handler);
    
    //testClientModel
    void testClientModel(Client body, Handler<AsyncResult<Client>> handler);
    
    //testEndpointParameters
    void testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, byte[] binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback, Handler<AsyncResult<Void>> handler);
    
    //testEnumParameters
    void testEnumParameters(List<String> enumFormStringArray, String enumFormString, List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble, Handler<AsyncResult<Void>> handler);
    
    //testInlineAdditionalProperties
    void testInlineAdditionalProperties(Object param, Handler<AsyncResult<Void>> handler);
    
    //testJsonFormData
    void testJsonFormData(String param, String param2, Handler<AsyncResult<Void>> handler);
    
}
