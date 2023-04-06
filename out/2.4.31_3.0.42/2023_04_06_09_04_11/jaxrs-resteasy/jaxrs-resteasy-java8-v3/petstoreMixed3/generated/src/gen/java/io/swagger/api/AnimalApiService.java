package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Animal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-04-06T09:19:44.879Z[Etc/UTC]")public interface AnimalApiService {
      Response addAnimal(Animal body,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteAnimal(Long animalId,String apiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getAnimalById(Long animalId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateAnimal(Animal body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateAnimalWithForm(Long animalId,String name,String status,SecurityContext securityContext)
      throws NotFoundException;
}
