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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-10-02T11:01:31.361Z")

public class FakeApiControllerImp implements FakeApiControllerImpInterface {
    @Override
    public Boolean fakeOuterBooleanSerialize(Boolean body)  {
        //Do your magic!!!
        return new Boolean(true);
    }

    @Override
    public OuterComposite fakeOuterCompositeSerialize(OuterComposite body)  {
        //Do your magic!!!
        return new OuterComposite();
    }

    @Override
    public BigDecimal fakeOuterNumberSerialize(BigDecimal body)  {
        //Do your magic!!!
        return new BigDecimal(1.0);
    }

    @Override
    public String fakeOuterStringSerialize(String body)  {
        //Do your magic!!!
        return new String();
    }

    @Override
    public void testBodyWithQueryParams(User body,  @NotNull String query)  {
        //Do your magic!!!
    }

    @Override
    public Client testClientModel(Client body)  {
        //Do your magic!!!
        return new Client();
    }

    @Override
    public void testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, byte[] binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback)  {
        //Do your magic!!!
    }

    @Override
    public void testEnumParameters(List<String> enumFormStringArray, String enumFormString, List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble)  {
        //Do your magic!!!
    }

    @Override
    public void testInlineAdditionalProperties(Object param)  {
        //Do your magic!!!
    }

    @Override
    public void testJsonFormData(String param, String param2)  {
        //Do your magic!!!
    }

}
