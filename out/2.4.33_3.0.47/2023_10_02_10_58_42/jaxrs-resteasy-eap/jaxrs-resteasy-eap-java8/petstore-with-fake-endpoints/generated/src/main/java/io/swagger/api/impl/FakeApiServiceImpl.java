package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import java.math.BigDecimal;
import io.swagger.model.Client;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import io.swagger.model.OuterComposite;
import io.swagger.model.User;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2023-10-02T11:06:08.781Z")
public class FakeApiServiceImpl implements FakeApi {
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
      public Response testBodyWithQueryParams(User body,String query,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testClientModel(Client body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testEndpointParameters(BigDecimal number,Double _double,String patternWithoutDelimiter,byte[] _byte,Integer integer,Integer int32,Long int64,Float _float,String string,byte[] binary,LocalDate date,OffsetDateTime dateTime,String password,String paramCallback,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testEnumParameters(List<String> enumFormStringArray,String enumFormString,List<String> enumHeaderStringArray,String enumHeaderString,List<String> enumQueryStringArray,String enumQueryString,Integer enumQueryInteger,Double enumQueryDouble,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testInlineAdditionalProperties(Object param,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testJsonFormData(String param,String param2,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
