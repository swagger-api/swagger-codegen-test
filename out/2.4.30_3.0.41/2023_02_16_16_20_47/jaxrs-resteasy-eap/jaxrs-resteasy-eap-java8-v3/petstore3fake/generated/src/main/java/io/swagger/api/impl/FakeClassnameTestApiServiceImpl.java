package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Client;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-02-16T16:40:48.904Z[Etc/UTC]")public class FakeClassnameTestApiServiceImpl implements FakeClassnameTestApi {
      public Response testClassname(Client body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
