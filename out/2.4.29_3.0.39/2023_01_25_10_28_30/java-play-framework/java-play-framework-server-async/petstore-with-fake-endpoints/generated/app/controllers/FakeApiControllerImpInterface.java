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
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface FakeApiControllerImpInterface {
    CompletionStage<Boolean> fakeOuterBooleanSerialize(Boolean body) throws Exception;

    CompletionStage<OuterComposite> fakeOuterCompositeSerialize(OuterComposite body) throws Exception;

    CompletionStage<BigDecimal> fakeOuterNumberSerialize(BigDecimal body) throws Exception;

    CompletionStage<String> fakeOuterStringSerialize(String body) throws Exception;

    void testBodyWithQueryParams(User body,  @NotNull String query) throws Exception;

    CompletionStage<Client> testClientModel(Client body) throws Exception;

    void testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, byte[] binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback) throws Exception;

    void testEnumParameters(List<String> enumFormStringArray, String enumFormString, List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble) throws Exception;

    void testInlineAdditionalProperties(Object param) throws Exception;

    void testJsonFormData(String param, String param2) throws Exception;

}
