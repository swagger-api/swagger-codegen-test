package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import java.io.File;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.SubCategory;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-25T10:48:48.478Z[Etc/UTC]")public interface PetApiService {
      Response addPet(Pet body,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePet(Long petId,String apiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response doCategoryStuff(SubCategory body,SecurityContext securityContext)
      throws NotFoundException;
      Response findPetsByStatus(List<String> status,SecurityContext securityContext)
      throws NotFoundException;
      Response findPetsByTags(List<String> tags,SecurityContext securityContext)
      throws NotFoundException;
      Response getPetById(Long petId,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePet(Pet body,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePetWithForm(Long petId,String name,String status,SecurityContext securityContext)
      throws NotFoundException;
      Response uploadFile(MultipartFormDataInput input,Long petId,SecurityContext securityContext)
      throws NotFoundException;
}
