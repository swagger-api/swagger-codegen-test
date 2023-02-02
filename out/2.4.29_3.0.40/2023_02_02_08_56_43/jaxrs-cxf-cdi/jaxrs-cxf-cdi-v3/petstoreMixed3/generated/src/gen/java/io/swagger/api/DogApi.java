package io.swagger.api;

import io.swagger.model.Dog;
import io.swagger.api.DogApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/dog")
@RequestScoped




@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-02-02T09:13:37.517Z[Etc/UTC]")
public class DogApi  {

  @Context SecurityContext securityContext;

  @Inject DogApiService delegate;


    @POST
    
    @Consumes({ "application/json", "application/xml" })
    
    @Operation(summary = "Add a new dog to the store", description = "", security = {
        @SecurityRequirement(name = "http_bearer_test")    }, tags={ "dog" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response addDog(
@Parameter(description = "Dog object that needs to be added to the store" ,required=true) Dog body
) {
        return delegate.addDog(body, securityContext);
    }

    @DELETE
    @Path("/{dogId}")
    
    
    @Operation(summary = "Deletes a dog", description = "", security = {
        @SecurityRequirement(name = "http_bearer_test")    }, tags={ "dog" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid dog value") })
    public Response deleteDog(
@Parameter(description = "Dog id to delete",required=true) @PathParam("dogId") Long dogId
, 
@Parameter(description = "" )@HeaderParam("api_key") String apiKey
) {
        return delegate.deleteDog(dogId, apiKey, securityContext);
    }

    @GET
    @Path("/{dogId}")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Find dog by ID", description = "Returns a single dog", security = {
        @SecurityRequirement(name = "http_bearer_test")    }, tags={ "dog" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Dog.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found") })
    public Response getDogById(
@Parameter(description = "ID of dog to return",required=true) @PathParam("dogId") Long dogId
) {
        return delegate.getDogById(dogId, securityContext);
    }

    @PUT
    
    @Consumes({ "application/json", "application/xml" })
    
    @Operation(summary = "Update an existing dog", description = "", security = {
        @SecurityRequirement(name = "http_bearer_test")    }, tags={ "dog" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Animal not found"),
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    public Response updateDog(
@Parameter(description = "Dog object that needs to be added." ,required=true) Dog body
) {
        return delegate.updateDog(body, securityContext);
    }

    @POST
    @Path("/{dogId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    
    @Operation(summary = "Updates a dog", description = "", security = {
        @SecurityRequirement(name = "http_bearer_test")    }, tags={ "dog" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response updateDogWithForm(
@Parameter(description = "ID of dog that needs to be updated",required=true) @PathParam("dogId") Long dogId
, @Multipart(value = "name", required = false)  String name, @Multipart(value = "status", required = false)  String status) {
        return delegate.updateDogWithForm(dogId, name, status, securityContext);
    }
}
