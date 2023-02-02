package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.math.BigDecimal;
import io.swagger.model.Client;
import io.swagger.model.EnumFormBody;
import io.swagger.model.FakeBody;
import io.swagger.model.FakeBody1;
import io.swagger.model.FakeJsonFormDataBody;
import io.swagger.model.OuterComposite;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-02-02T09:11:44.318Z[Etc/UTC]")public interface FakeApiService {
      public Response fakeOuterBooleanSerialize(Boolean body, SecurityContext securityContext);
      public Response fakeOuterCompositeSerialize(OuterComposite body, SecurityContext securityContext);
      public Response fakeOuterNumberSerialize(BigDecimal body, SecurityContext securityContext);
      public Response fakeOuterStringSerialize(String body, SecurityContext securityContext);
      public Response testClientModel(Client body, SecurityContext securityContext);
      public Response testEndpointParameters(FakeBody body, SecurityContext securityContext);
      public Response testEnumParameters(List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, SecurityContext securityContext);
      public Response testEnumRequestBody(EnumFormBody body, SecurityContext securityContext);
      public Response testInlineAdditionalProperties(Map<String, String> body, SecurityContext securityContext);
      public Response testJsonFormData(FakeJsonFormDataBody body, SecurityContext securityContext);
}
