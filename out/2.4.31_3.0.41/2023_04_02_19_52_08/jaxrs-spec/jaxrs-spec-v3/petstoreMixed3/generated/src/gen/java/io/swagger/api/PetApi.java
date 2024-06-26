package io.swagger.api;

import java.io.File;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.SubCategory;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pet")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2023-04-02T20:06:08.990Z[Etc/UTC]")
public class PetApi {

    @POST
    @Consumes({ "application/json", "application/xml" })
    @Operation(summary = "Add a new pet to the store", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input")
    })
    public Response addPet(@Valid Pet body) {
        return Response.ok().entity("magic!").build();
    }
    @DELETE
    @Path("/{petId}")
    @Operation(summary = "Deletes a pet", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid pet value")
    })
    public Response deletePet( @PathParam("petId")

 @Parameter(description = "Pet id to delete") Long petId
,  @HeaderParam("api_key") 

 String apiKey
) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/category")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", security = {
        @SecurityRequirement(name = "http_basic_test")    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class)))
    })
    public Response doCategoryStuff(@Valid SubCategory body) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(responseCode = "400", description = "Invalid status value")
    })
    public Response findPetsByStatus( @NotNull  @QueryParam("status") 

 @Parameter(description = "Status values that need to be considered for filter")  List<String> status
) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(responseCode = "400", description = "Invalid tag value")
    })
    public Response findPetsByTags( @NotNull  @QueryParam("tags") 

 @Parameter(description = "Tags to filter by")  List<String> tags
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/{petId}")
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Find pet by ID", description = "Returns a single pet", security = {
        @SecurityRequirement(name = "api_key")    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found")
    })
    public Response getPetById( @PathParam("petId")

 @Parameter(description = "ID of pet to return") Long petId
) {
        return Response.ok().entity("magic!").build();
    }
    @PUT
    @Consumes({ "application/json", "application/xml" })
    @Operation(summary = "Update an existing pet", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found"),
        @ApiResponse(responseCode = "405", description = "Validation exception")
    })
    public Response updatePet(@Valid Pet body) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/{petId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Operation(summary = "Updates a pet in the store with form data", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input")
    })
    public Response updatePetWithForm( @PathParam("petId")

 @Parameter(description = "ID of pet that needs to be updated") Long petId
,@FormParam(value = "name")  String name,@FormParam(value = "status")  String status) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/{petId}/uploadImage")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @Operation(summary = "uploads an image", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class)))
    })
    public Response uploadFile( @PathParam("petId")

 @Parameter(description = "ID of pet to update") Long petId
,@FormParam(value = "additionalMetadata")  String additionalMetadata, @FormParam(value = "file") InputStream fileInputStream,
   @FormParam(value = "file") Attachment fileDetail) {
        return Response.ok().entity("magic!").build();
    }}
