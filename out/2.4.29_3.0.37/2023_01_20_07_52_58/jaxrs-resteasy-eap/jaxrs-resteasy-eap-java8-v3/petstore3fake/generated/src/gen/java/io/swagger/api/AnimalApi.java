package io.swagger.api;

import io.swagger.model.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Animal;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/animal")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-20T08:11:56.862Z[Etc/UTC]")public interface AnimalApi  {
   
    @POST
    
    @Consumes({ "application/json", "application/xml" })
    
    @Operation(summary = "Add a new animal to the store", description = "", tags={ "animal" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "405", description = "Invalid input")
         })
    Response addAnimal(@Parameter(description = "Animal object that needs to be added to the store" ,required=true) Animal body,@Context SecurityContext securityContext);

    @DELETE
    @Path("/{animalId}")
    
    
    @Operation(summary = "Deletes a animal", description = "", tags={ "animal" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid animal value")
         })
    Response deleteAnimal( @PathParam("animalId") Long animalId,@Parameter(description = "" )@HeaderParam("api_key") String apiKey,@Context SecurityContext securityContext);

    @GET
    @Path("/{animalId}")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Find animal by ID", description = "Returns a single animal", tags={ "animal" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Animal.class))),
                @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
                @ApiResponse(responseCode = "404", description = "Pet not found")
         })
    Response getAnimalById( @PathParam("animalId") Long animalId,@Context SecurityContext securityContext);

    @PUT
    
    @Consumes({ "application/json", "application/xml" })
    
    @Operation(summary = "Update an existing animal", description = "", tags={ "animal" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
                @ApiResponse(responseCode = "404", description = "Animal not found"),
                @ApiResponse(responseCode = "405", description = "Validation exception")
         })
    Response updateAnimal(@Parameter(description = "Animal object that needs to be added." ,required=true) Animal body,@Context SecurityContext securityContext);

    @POST
    @Path("/{animalId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    
    @Operation(summary = "Updates a animal", description = "", tags={ "animal" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "405", description = "Invalid input")
         })
    Response updateAnimalWithForm( @PathParam("animalId") Long animalId,@Parameter(description = "")@FormParam("name")  String name,@Parameter(description = "")@FormParam("status")  String status,@Context SecurityContext securityContext);

}
