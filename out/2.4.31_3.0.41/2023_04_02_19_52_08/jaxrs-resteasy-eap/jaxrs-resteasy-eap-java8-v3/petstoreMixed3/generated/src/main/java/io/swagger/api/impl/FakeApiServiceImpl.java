package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-04-02T20:06:03.184Z[Etc/UTC]")public class FakeApiServiceImpl implements FakeApi {
      public Response fakeOuterBooleanSerialize(Boolean body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response fakeOuterCompositeSerialize(OuterComposite body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response fakeOuterNumberSerialize(BigDecimal body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response fakeOuterStringSerialize(String body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testClientModel(Client body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testEndpointParameters(FakeBody body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testEnumParameters(List<String> enumHeaderStringArray,String enumHeaderString,List<String> enumQueryStringArray,String enumQueryString,Integer enumQueryInteger,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testEnumRequestBody(EnumFormBody body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testInlineAdditionalProperties(Map<String, String> body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testJsonFormData(FakeJsonFormDataBody body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
