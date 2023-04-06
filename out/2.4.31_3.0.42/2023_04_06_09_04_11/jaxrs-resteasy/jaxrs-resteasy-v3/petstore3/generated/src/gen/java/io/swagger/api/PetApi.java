package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PetApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Category;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.Tag;

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
@Path("/pet")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-04-06T09:14:12.077Z[Etc/UTC]")public class PetApi  {

    @Inject PetApiService service;

    @POST
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Add a new pet to the store", description = "Add a new pet to the store", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response addPet(@Parameter(description = "Create a new pet in the store" ,required=true) Pet body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addPet(body,securityContext);
    }
    @POST
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Add a new pet to the store", description = "Add a new pet to the store", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response addPet(@Parameter(description = "", required=true)@FormParam("id")  Long id,@Parameter(description = "", required=true)@FormParam("name")  String name,@Parameter(description = "", required=true)@FormParam("category")  Category category,@Parameter(description = "", required=true)@FormParam("photoUrls")  List<String> photoUrls,@Parameter(description = "", required=true)@FormParam("tags")  List<Tag> tags,@Parameter(description = "", required=true, schema=@Schema(allowableValues={ "available", "pending", "sold" })
)@FormParam("status")  String status,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addPet(id,name,category,photoUrls,tags,status,securityContext);
    }
    @DELETE
    @Path("/{petId}")
    
    
    @Operation(summary = "Deletes a pet", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid pet value") })
    public Response deletePet( @PathParam("petId") Long petId,@Parameter(description = "" )@HeaderParam("api_key") String apiKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePet(petId,apiKey,securityContext);
    }
    @GET
    @Path("/findByStatus")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Finds Pets by status", description = "Multiple status values can be provided with comma separated strings", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Pet.class)))),
        
        @ApiResponse(responseCode = "400", description = "Invalid status value") })
    public Response findPetsByStatus(  @DefaultValue("available") @QueryParam("status") String status,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.findPetsByStatus(status,securityContext);
    }
    @GET
    @Path("/findByTags")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Finds Pets by tags", description = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Pet.class)))),
        
        @ApiResponse(responseCode = "400", description = "Invalid tag value") })
    public Response findPetsByTags(  @QueryParam("tags") List<String> tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.findPetsByTags(tags,securityContext);
    }
    @GET
    @Path("/{petId}")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Find pet by ID", description = "Returns a single pet", security = {
        @SecurityRequirement(name = "api_key"),
@SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Pet not found") })
    public Response getPetById( @PathParam("petId") Long petId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPetById(petId,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Update an existing pet", description = "Update an existing pet by Id", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Pet not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    public Response updatePet(@Parameter(description = "Update an existent pet in the store" ,required=true) Pet body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePet(body,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Update an existing pet", description = "Update an existing pet by Id", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Pet not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    public Response updatePet(@Parameter(description = "", required=true)@FormParam("id")  Long id,@Parameter(description = "", required=true)@FormParam("name")  String name,@Parameter(description = "", required=true)@FormParam("category")  Category category,@Parameter(description = "", required=true)@FormParam("photoUrls")  List<String> photoUrls,@Parameter(description = "", required=true)@FormParam("tags")  List<Tag> tags,@Parameter(description = "", required=true, schema=@Schema(allowableValues={ "available", "pending", "sold" })
)@FormParam("status")  String status,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePet(id,name,category,photoUrls,tags,status,securityContext);
    }
    @POST
    @Path("/{petId}")
    
    
    @Operation(summary = "Updates a pet in the store with form data", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response updatePetWithForm( @PathParam("petId") Long petId,  @QueryParam("name") String name,  @QueryParam("status") String status,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePetWithForm(petId,name,status,securityContext);
    }
    @POST
    @Path("/{petId}/uploadImage")
    @Consumes({ "application/octet-stream" })
    @Produces({ "application/json" })
    @Operation(summary = "uploads an image", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response uploadFile( @PathParam("petId") Long petId,@Parameter(description = "" ) Object body,  @QueryParam("additionalMetadata") String additionalMetadata,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.uploadFile(petId,body,additionalMetadata,securityContext);
    }
}
