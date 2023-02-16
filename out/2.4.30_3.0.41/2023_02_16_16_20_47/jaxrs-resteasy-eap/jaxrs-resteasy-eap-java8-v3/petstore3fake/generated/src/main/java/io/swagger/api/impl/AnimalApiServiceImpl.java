package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Animal;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-02-16T16:40:48.904Z[Etc/UTC]")public class AnimalApiServiceImpl implements AnimalApi {
      public Response addAnimal(Animal body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteAnimal(Long animalId,String apiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getAnimalById(Long animalId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateAnimal(Animal body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateAnimalWithForm(Long animalId,String name,String status,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
