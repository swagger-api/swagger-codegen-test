package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AnimalApiService;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
@Path("/animal")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-04-06T09:17:06.490Z[Etc/UTC]")public class AnimalApi  {

    @Inject AnimalApiService service;

    @POST
    
    @Consumes({ "application/json", "application/xml" })
    
    @Operation(summary = "Add a new animal to the store", description = "", tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response addAnimal(@Parameter(description = "Animal object that needs to be added to the store" ,required=true) Animal body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addAnimal(body,securityContext);
    }
    @DELETE
    @Path("/{animalId}")
    
    
    @Operation(summary = "Deletes a animal", description = "", tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid animal value") })
    public Response deleteAnimal( @PathParam("animalId") Long animalId,@Parameter(description = "" )@HeaderParam("api_key") String apiKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteAnimal(animalId,apiKey,securityContext);
    }
    @GET
    @Path("/{animalId}")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Find animal by ID", description = "Returns a single animal", tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Animal.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Pet not found") })
    public Response getAnimalById( @PathParam("animalId") Long animalId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAnimalById(animalId,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json", "application/xml" })
    
    @Operation(summary = "Update an existing animal", description = "", tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Animal not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    public Response updateAnimal(@Parameter(description = "Animal object that needs to be added." ,required=true) Animal body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAnimal(body,securityContext);
    }
    @POST
    @Path("/{animalId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    
    @Operation(summary = "Updates a animal", description = "", tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response updateAnimalWithForm( @PathParam("animalId") Long animalId,@Parameter(description = "")@FormParam("name")  String name,@Parameter(description = "")@FormParam("status")  String status,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAnimalWithForm(animalId,name,status,securityContext);
    }
}
