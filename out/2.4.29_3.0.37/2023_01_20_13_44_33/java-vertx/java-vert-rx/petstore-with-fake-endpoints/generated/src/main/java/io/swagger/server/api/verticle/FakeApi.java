package io.swagger.server.api.verticle;

import java.math.BigDecimal;
import io.swagger.server.api.model.Client;
import java.time.LocalDate;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.OuterComposite;
import io.swagger.server.api.model.User;

import rx.Completable;
import rx.Single;

import java.util.List;
import java.util.Map;

public interface FakeApi  {
    //fakeOuterBooleanSerialize
    public Single<Boolean> fakeOuterBooleanSerialize(Boolean body);
    
    //fakeOuterCompositeSerialize
    public Single<OuterComposite> fakeOuterCompositeSerialize(OuterComposite body);
    
    //fakeOuterNumberSerialize
    public Single<BigDecimal> fakeOuterNumberSerialize(BigDecimal body);
    
    //fakeOuterStringSerialize
    public Single<String> fakeOuterStringSerialize(String body);
    
    //testBodyWithQueryParams
    public Completable testBodyWithQueryParams(User body,String query);
    
    //testClientModel
    public Single<Client> testClientModel(Client body);
    
    //testEndpointParameters
    public Completable testEndpointParameters(BigDecimal number,Double _double,String patternWithoutDelimiter,byte[] _byte,Integer integer,Integer int32,Long int64,Float _float,String string,byte[] binary,LocalDate date,OffsetDateTime dateTime,String password,String paramCallback);
    
    //testEnumParameters
    public Completable testEnumParameters(List<String> enumFormStringArray,String enumFormString,List<String> enumHeaderStringArray,String enumHeaderString,List<String> enumQueryStringArray,String enumQueryString,Integer enumQueryInteger,Double enumQueryDouble);
    
    //testInlineAdditionalProperties
    public Completable testInlineAdditionalProperties(Object param);
    
    //testJsonFormData
    public Completable testJsonFormData(String param,String param2);
    
}
