package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AnimalApiService;
import io.swagger.api.factories.AnimalApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Animal;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/animal")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-19T15:18:00.002Z[Etc/UTC]")public class AnimalApi  {
   private final AnimalApiService delegate;

   public AnimalApi(@Context ServletConfig servletContext) {
      AnimalApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AnimalApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AnimalApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AnimalApiServiceFactory.getAnimalApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json", "application/xml" })
    
    @Operation(summary = "Add a new animal to the store", description = "", security = {
        @SecurityRequirement(name = "api_key_query")    }, tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response addAnimal(@Parameter(description = "Animal object that needs to be added to the store" ,required=true) Animal body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addAnimal(body,securityContext);
    }
    @DELETE
    @Path("/{animalId}")
    
    
    @Operation(summary = "Deletes a animal", description = "", security = {
        @SecurityRequirement(name = "api_key_query")    }, tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid animal value") })
    public Response deleteAnimal(@Parameter(description = "Animal id to delete",required=true) @PathParam("animalId") Long animalId
,
@Parameter(description = "" )@HeaderParam("api_key") String apiKey

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAnimal(animalId,apiKey,securityContext);
    }
    @GET
    @Path("/{animalId}")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Find animal by ID", description = "Returns a single animal", security = {
        @SecurityRequirement(name = "api_key_query")    }, tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Animal.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Pet not found") })
    public Response getAnimalById(@Parameter(description = "ID of pet to return",required=true) @PathParam("animalId") Long animalId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAnimalById(animalId,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json", "application/xml" })
    
    @Operation(summary = "Update an existing animal", description = "", security = {
        @SecurityRequirement(name = "api_key_query")    }, tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Animal not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    public Response updateAnimal(@Parameter(description = "Animal object that needs to be added." ,required=true) Animal body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAnimal(body,securityContext);
    }
    @POST
    @Path("/{animalId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    
    @Operation(summary = "Updates a animal", description = "", security = {
        @SecurityRequirement(name = "api_key_query")    }, tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response updateAnimalWithForm(@Parameter(description = "ID of animal that needs to be updated",required=true) @PathParam("animalId") Long animalId
,@Parameter(description = "")  @FormParam("name")  String name
,@Parameter(description = "")  @FormParam("status")  String status
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAnimalWithForm(animalId,name,status,securityContext);
    }
}
