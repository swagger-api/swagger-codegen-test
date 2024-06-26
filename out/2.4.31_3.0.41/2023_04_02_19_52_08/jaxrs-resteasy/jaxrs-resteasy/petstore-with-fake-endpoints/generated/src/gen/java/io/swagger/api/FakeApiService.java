package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import java.math.BigDecimal;
import io.swagger.model.Client;
import java.util.Date;
import io.swagger.model.OuterComposite;
import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2023-04-02T19:54:47.250Z")
public interface FakeApiService {
      Response fakeOuterBooleanSerialize(Boolean body,SecurityContext securityContext)
      throws NotFoundException;
      Response fakeOuterCompositeSerialize(OuterComposite body,SecurityContext securityContext)
      throws NotFoundException;
      Response fakeOuterNumberSerialize(BigDecimal body,SecurityContext securityContext)
      throws NotFoundException;
      Response fakeOuterStringSerialize(String body,SecurityContext securityContext)
      throws NotFoundException;
      Response testBodyWithQueryParams(User body,String query,SecurityContext securityContext)
      throws NotFoundException;
      Response testClientModel(Client body,SecurityContext securityContext)
      throws NotFoundException;
      Response testEndpointParameters(BigDecimal number,Double _double,String patternWithoutDelimiter,byte[] _byte,Integer integer,Integer int32,Long int64,Float _float,String string,byte[] binary,Date date,Date dateTime,String password,String paramCallback,SecurityContext securityContext)
      throws NotFoundException;
      Response testEnumParameters(List<String> enumFormStringArray,String enumFormString,List<String> enumHeaderStringArray,String enumHeaderString,List<String> enumQueryStringArray,String enumQueryString,Integer enumQueryInteger,Double enumQueryDouble,SecurityContext securityContext)
      throws NotFoundException;
      Response testInlineAdditionalProperties(Object param,SecurityContext securityContext)
      throws NotFoundException;
      Response testJsonFormData(String param,String param2,SecurityContext securityContext)
      throws NotFoundException;
}
