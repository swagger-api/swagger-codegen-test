package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.io.File;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.SubCategory;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-05-18T06:18:35.822Z[Etc/UTC]")
public interface PetApiService {
      public Response addPet(Pet body, SecurityContext securityContext);
      public Response deletePet(Long petId, String apiKey, SecurityContext securityContext);
      public Response doCategoryStuff(SubCategory body, SecurityContext securityContext);
      public Response findPetsByStatus(List<String> status, SecurityContext securityContext);
      public Response findPetsByTags(List<String> tags, SecurityContext securityContext);
      public Response getPetById(Long petId, SecurityContext securityContext);
      public Response updatePet(Pet body, SecurityContext securityContext);
      public Response updatePetWithForm(Long petId, String name, String status, SecurityContext securityContext);
      public Response uploadFile(Long petId, String additionalMetadata, InputStream fileInputStream, Attachment fileDetail, SecurityContext securityContext);
}
