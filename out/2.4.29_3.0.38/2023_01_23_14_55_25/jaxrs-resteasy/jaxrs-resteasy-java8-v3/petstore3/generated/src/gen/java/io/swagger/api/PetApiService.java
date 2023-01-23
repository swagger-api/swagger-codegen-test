package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Category;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.Tag;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-23T15:02:10.987Z[Etc/UTC]")public interface PetApiService {
      Response addPet(Pet body,SecurityContext securityContext)
      throws NotFoundException;
      Response addPet(Long id,String name,Category category,List<String> photoUrls,List<Tag> tags,String status,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePet(Long petId,String apiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response findPetsByStatus(String status,SecurityContext securityContext)
      throws NotFoundException;
      Response findPetsByTags(List<String> tags,SecurityContext securityContext)
      throws NotFoundException;
      Response getPetById(Long petId,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePet(Pet body,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePet(Long id,String name,Category category,List<String> photoUrls,List<Tag> tags,String status,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePetWithForm(Long petId,String name,String status,SecurityContext securityContext)
      throws NotFoundException;
      Response uploadFile(Long petId,Object body,String additionalMetadata,SecurityContext securityContext)
      throws NotFoundException;
}
