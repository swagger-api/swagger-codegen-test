package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import io.swagger.model.Dog;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-20T14:02:21.673Z[Etc/UTC]")public class DogApiServiceImpl implements DogApiService {
      @Override
      public Response addDog(Dog body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response deleteDog(Long dogId, String apiKey, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getDogById(Long dogId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response updateDog(Dog body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response updateDogWithForm(Long dogId, String name, String status, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
