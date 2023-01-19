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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-19T15:02:22.555Z")

public class FakeApiControllerImp implements FakeApiControllerImpInterface {
    @Override
    public CompletionStage<Boolean> fakeOuterBooleanSerialize(Boolean body) throws Exception {
        //Do your magic!!!
        return CompletableFuture.supplyAsync(() -> {
           return new Boolean(true);
        });
    }

    @Override
    public CompletionStage<OuterComposite> fakeOuterCompositeSerialize(OuterComposite body) throws Exception {
        //Do your magic!!!
        return CompletableFuture.supplyAsync(() -> {
           return new OuterComposite();
        });
    }

    @Override
    public CompletionStage<BigDecimal> fakeOuterNumberSerialize(BigDecimal body) throws Exception {
        //Do your magic!!!
        return CompletableFuture.supplyAsync(() -> {
           return new BigDecimal(1.0);
        });
    }

    @Override
    public CompletionStage<String> fakeOuterStringSerialize(String body) throws Exception {
        //Do your magic!!!
        return CompletableFuture.supplyAsync(() -> {
           return new String();
        });
    }

    @Override
    public void testBodyWithQueryParams(User body,  @NotNull String query) throws Exception {
        //Do your magic!!!
    }

    @Override
    public CompletionStage<Client> testClientModel(Client body) throws Exception {
        //Do your magic!!!
        return CompletableFuture.supplyAsync(() -> {
           return new Client();
        });
    }

    @Override
    public void testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, byte[] binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void testEnumParameters(List<String> enumFormStringArray, String enumFormString, List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void testInlineAdditionalProperties(Object param) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void testJsonFormData(String param, String param2) throws Exception {
        //Do your magic!!!
    }

}
