package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Dog;

import java.util.List;
import java.util.Map;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-05-18T06:18:40.128Z[Etc/UTC]")
public interface DogApiService {
      Response addDog(Dog body,SecurityContext securityContext) throws NotFoundException;
      Response deleteDog(Long dogId,String apiKey,SecurityContext securityContext) throws NotFoundException;
      Response getDogById(Long dogId,SecurityContext securityContext) throws NotFoundException;
      Response updateDog(Dog body,SecurityContext securityContext) throws NotFoundException;
      Response updateDogWithForm(Long dogId,String name,String status,SecurityContext securityContext) throws NotFoundException;
}
