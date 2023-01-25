package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.math.BigDecimal;
import io.swagger.model.Client;
import org.joda.time.LocalDate;
import io.swagger.model.OuterComposite;
import io.swagger.model.User;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-25T10:43:41.530Z")
public interface FakeApiService {
      public Response fakeOuterBooleanSerialize(Boolean body, SecurityContext securityContext);
      public Response fakeOuterCompositeSerialize(OuterComposite body, SecurityContext securityContext);
      public Response fakeOuterNumberSerialize(BigDecimal body, SecurityContext securityContext);
      public Response fakeOuterStringSerialize(String body, SecurityContext securityContext);
      public Response testBodyWithQueryParams(User body, String query, SecurityContext securityContext);
      public Response testClientModel(Client body, SecurityContext securityContext);
      public Response testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, byte[] binary, LocalDate date, java.util.Date dateTime, String password, String paramCallback, SecurityContext securityContext);
      public Response testEnumParameters(List<String> enumFormStringArray, String enumFormString, List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble, SecurityContext securityContext);
      public Response testInlineAdditionalProperties(Object param, SecurityContext securityContext);
      public Response testJsonFormData(String param, String param2, SecurityContext securityContext);
}
