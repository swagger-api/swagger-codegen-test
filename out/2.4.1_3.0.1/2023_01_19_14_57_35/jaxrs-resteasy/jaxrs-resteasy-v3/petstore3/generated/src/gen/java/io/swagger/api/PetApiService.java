package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Category;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.Tag;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-19T15:15:33.090Z[Etc/UTC]")public abstract class PetApiService {
    public abstract Response addPet(Long id,String name,Category category,List<String> photoUrls,List<Tag> tags,String status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deletePet(Long petId,String apiKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findPetsByStatus( String status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findPetsByTags( List<String> tags,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPetById(Long petId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePet(Long id,String name,Category category,List<String> photoUrls,List<Tag> tags,String status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePetWithForm(Long petId, String name, String status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response uploadFile(Long petId,Object body, String additionalMetadata,SecurityContext securityContext) throws NotFoundException;
}
