package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.SubCategory;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-04-02T20:05:11.277Z[Etc/UTC]")public class PetApiServiceImpl implements PetApi {
      public Response addPet(Pet body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deletePet(Long petId,String apiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response doCategoryStuff(SubCategory body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response feedPet(Pet body,String token,String petType,String status,Long petId,,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response findPetsByStatus(List<String> status,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response findPetsByTags(List<String> tags,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getPetById(Long petId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updatePet(Pet body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updatePetWithForm(Long petId,String name,String status,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response uploadFile(Long petId,Object body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
