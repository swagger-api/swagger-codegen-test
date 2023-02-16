package io.swagger.api;

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
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-02-16T16:41:08.090Z[Etc/UTC]")public interface FakeApiService {
      Response fakeOuterBooleanSerialize(Boolean body,SecurityContext securityContext)
      throws NotFoundException;
      Response fakeOuterCompositeSerialize(OuterComposite body,SecurityContext securityContext)
      throws NotFoundException;
      Response fakeOuterNumberSerialize(BigDecimal body,SecurityContext securityContext)
      throws NotFoundException;
      Response fakeOuterStringSerialize(String body,SecurityContext securityContext)
      throws NotFoundException;
      Response testClientModel(Client body,SecurityContext securityContext)
      throws NotFoundException;
      Response testEndpointParameters(FakeBody body,SecurityContext securityContext)
      throws NotFoundException;
      Response testEnumParameters(List<String> enumHeaderStringArray,String enumHeaderString,List<String> enumQueryStringArray,String enumQueryString,Integer enumQueryInteger,SecurityContext securityContext)
      throws NotFoundException;
      Response testEnumRequestBody(EnumFormBody body,SecurityContext securityContext)
      throws NotFoundException;
      Response testInlineAdditionalProperties(Map<String, String> body,SecurityContext securityContext)
      throws NotFoundException;
      Response testJsonFormData(FakeJsonFormDataBody body,SecurityContext securityContext)
      throws NotFoundException;
}
