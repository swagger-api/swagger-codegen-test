package io.swagger.api;

import io.swagger.model.Category;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.Tag;
import io.swagger.api.PetApiService;

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
@Path("/pet")
@RequestScoped




@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-05-18T06:13:58.445Z[Etc/UTC]")

public class PetApi  {

  @Context SecurityContext securityContext;

  @Inject PetApiService delegate;


    @POST
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Add a new pet to the store", description = "Add a new pet to the store", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response addPet(
@Parameter(description = "Create a new pet in the store" ,required=true) Pet body
) {
        return delegate.addPet(body, securityContext);
    }

    @POST
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Add a new pet to the store", description = "Add a new pet to the store", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response addPet(@Multipart(value = "id")  Long id, @Multipart(value = "name")  String name, @Multipart(value = "category")  Category category, @Multipart(value = "photoUrls")  List<String> photoUrls, @Multipart(value = "tags")  List<Tag> tags, @Multipart(value = "status")  String status) {
        return delegate.addPet(id, name, category, photoUrls, tags, status, securityContext);
    }

    @DELETE
    @Path("/{petId}")
    
    
    @Operation(summary = "Deletes a pet", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid pet value") })
    public Response deletePet(
@Parameter(description = "Pet id to delete",required=true) @PathParam("petId") Long petId
, 
@Parameter(description = "" )@HeaderParam("api_key") String apiKey
) {
        return delegate.deletePet(petId, apiKey, securityContext);
    }

    @GET
    @Path("/findByStatus")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Finds Pets by status", description = "Multiple status values can be provided with comma separated strings", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Pet.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid status value") })
    public Response findPetsByStatus( 
@Parameter(description = "Status values that need to be considered for filter", schema=@Schema(allowableValues={ "available", "pending", "sold" })
) @DefaultValue("available") @QueryParam("status") String status
) {
        return delegate.findPetsByStatus(status, securityContext);
    }

    @GET
    @Path("/findByTags")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Finds Pets by tags", description = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Pet.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid tag value") })
    public Response findPetsByTags( 
@Parameter(description = "Tags to filter by")  @QueryParam("tags") List<String> tags
) {
        return delegate.findPetsByTags(tags, securityContext);
    }

    @GET
    @Path("/{petId}")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Find pet by ID", description = "Returns a single pet", security = {
        @SecurityRequirement(name = "api_key"),
@SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found") })
    public Response getPetById(
@Parameter(description = "ID of pet to return",required=true) @PathParam("petId") Long petId
) {
        return delegate.getPetById(petId, securityContext);
    }

    @PUT
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Update an existing pet", description = "Update an existing pet by Id", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found"),
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    public Response updatePet(
@Parameter(description = "Update an existent pet in the store" ,required=true) Pet body
) {
        return delegate.updatePet(body, securityContext);
    }

    @PUT
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Update an existing pet", description = "Update an existing pet by Id", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found"),
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    public Response updatePet(@Multipart(value = "id")  Long id, @Multipart(value = "name")  String name, @Multipart(value = "category")  Category category, @Multipart(value = "photoUrls")  List<String> photoUrls, @Multipart(value = "tags")  List<Tag> tags, @Multipart(value = "status")  String status) {
        return delegate.updatePet(id, name, category, photoUrls, tags, status, securityContext);
    }

    @POST
    @Path("/{petId}")
    
    
    @Operation(summary = "Updates a pet in the store with form data", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response updatePetWithForm(
@Parameter(description = "ID of pet that needs to be updated",required=true) @PathParam("petId") Long petId
,  
@Parameter(description = "Name of pet that needs to be updated")  @QueryParam("name") String name
,  
@Parameter(description = "Status of pet that needs to be updated")  @QueryParam("status") String status
) {
        return delegate.updatePetWithForm(petId, name, status, securityContext);
    }

    @POST
    @Path("/{petId}/uploadImage")
    @Consumes({ "application/octet-stream" })
    @Produces({ "application/json" })
    @Operation(summary = "uploads an image", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public Response uploadFile(
@Parameter(description = "ID of pet to update",required=true) @PathParam("petId") Long petId
, 
@Parameter(description = "" ) Object body
,  
@Parameter(description = "Additional Metadata")  @QueryParam("additionalMetadata") String additionalMetadata
) {
        return delegate.uploadFile(petId, body, additionalMetadata, securityContext);
    }
}
