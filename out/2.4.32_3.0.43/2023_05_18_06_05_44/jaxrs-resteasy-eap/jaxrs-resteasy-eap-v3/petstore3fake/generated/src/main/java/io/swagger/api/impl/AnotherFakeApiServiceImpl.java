package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Client;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-05-18T06:16:15.318Z[Etc/UTC]")
public class AnotherFakeApiServiceImpl implements AnotherFakeApi {
      public Response testSpecialTags(Client body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
