package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.SinglePetResponse;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-20T14:02:30.740Z[Etc/UTC]")public class RandomPetApiServiceImpl implements RandomPetApiService {
      public Response getRandomPet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
