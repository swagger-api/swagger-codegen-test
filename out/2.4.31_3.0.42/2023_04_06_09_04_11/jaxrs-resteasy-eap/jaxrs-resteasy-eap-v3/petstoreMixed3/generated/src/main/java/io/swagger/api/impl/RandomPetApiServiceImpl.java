package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.SinglePetResponse;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-04-06T09:19:47.146Z[Etc/UTC]")public class RandomPetApiServiceImpl implements RandomPetApi {
      public Response getRandomPet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
