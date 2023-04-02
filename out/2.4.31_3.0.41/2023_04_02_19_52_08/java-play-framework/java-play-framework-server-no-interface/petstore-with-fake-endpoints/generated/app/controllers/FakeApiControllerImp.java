package controllers;

import java.math.BigDecimal;
import apimodels.Client;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import apimodels.OuterComposite;
import apimodels.User;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-04-02T19:59:14.684Z")

public class FakeApiControllerImp  {
    
    public Boolean fakeOuterBooleanSerialize(Boolean body) throws Exception {
        //Do your magic!!!
        return new Boolean(true);
    }

    
    public OuterComposite fakeOuterCompositeSerialize(OuterComposite body) throws Exception {
        //Do your magic!!!
        return new OuterComposite();
    }

    
    public BigDecimal fakeOuterNumberSerialize(BigDecimal body) throws Exception {
        //Do your magic!!!
        return new BigDecimal(1.0);
    }

    
    public String fakeOuterStringSerialize(String body) throws Exception {
        //Do your magic!!!
        return new String();
    }

    
    public void testBodyWithQueryParams(User body,  @NotNull String query) throws Exception {
        //Do your magic!!!
    }

    
    public Client testClientModel(Client body) throws Exception {
        //Do your magic!!!
        return new Client();
    }

    
    public void testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, byte[] binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback) throws Exception {
        //Do your magic!!!
    }

    
    public void testEnumParameters(List<String> enumFormStringArray, String enumFormString, List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble) throws Exception {
        //Do your magic!!!
    }

    
    public void testInlineAdditionalProperties(Object param) throws Exception {
        //Do your magic!!!
    }

    
    public void testJsonFormData(String param, String param2) throws Exception {
        //Do your magic!!!
    }

}
