package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.math.BigDecimal;
import io.swagger.model.Body2;
import io.swagger.model.Body4;
import io.swagger.model.Body5;
import io.swagger.model.Client;
import io.swagger.model.OuterComposite;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-19T15:18:01.081Z[Etc/UTC]")public interface FakeApiService {
      public Response fakeOuterBooleanSerialize(Boolean body, SecurityContext securityContext);
      public Response fakeOuterCompositeSerialize(OuterComposite body, SecurityContext securityContext);
      public Response fakeOuterNumberSerialize(BigDecimal body, SecurityContext securityContext);
      public Response fakeOuterStringSerialize(String body, SecurityContext securityContext);
      public Response testClientModel(Client body, SecurityContext securityContext);
      public Response testEndpointParameters(Body2 body, SecurityContext securityContext);
      public Response testEnumParameters(List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, SecurityContext securityContext);
      public Response testEnumRequestBody(Body4 body, SecurityContext securityContext);
      public Response testInlineAdditionalProperties(Map<String, String> body, SecurityContext securityContext);
      public Response testJsonFormData(Body5 body, SecurityContext securityContext);
}
