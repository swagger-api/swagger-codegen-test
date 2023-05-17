package io.swagger.api;

import io.swagger.model.Category;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.Tag;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Swagger Petstore - OpenAPI 3.0
 *
 * <p>This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 */
@Path("/")
public interface PetApi  {

    /**
     * Add a new pet to the store
     *
     * Add a new pet to the store
     *
     */
    @POST
    @Path("/pet")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Add a new pet to the store", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Pet addPet(Pet body);

    /**
     * Add a new pet to the store
     *
     * Add a new pet to the store
     *
     */
    @POST
    @Path("/pet")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Add a new pet to the store", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Pet addPet(@Multipart(value = "id")  Long id, @Multipart(value = "name")  String name, @Multipart(value = "category")  Category category, @Multipart(value = "photoUrls")  List<String> photoUrls, @Multipart(value = "tags")  List<Tag> tags, @Multipart(value = "status")  String status);

    /**
     * Deletes a pet
     *
     */
    @DELETE
    @Path("/pet/{petId}")
    @Operation(summary = "Deletes a pet", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid pet value") })
    public void deletePet(@PathParam("petId") Long petId, @HeaderParam("api_key") String apiKey);

    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     */
    @GET
    @Path("/pet/findByStatus")
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Finds Pets by status", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Pet.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid status value") })
    public List<Pet> findPetsByStatus(@QueryParam("status")@DefaultValue("available") String status);

    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     */
    @GET
    @Path("/pet/findByTags")
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Finds Pets by tags", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Pet.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid tag value") })
    public List<Pet> findPetsByTags(@QueryParam("tags")List<String> tags);

    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     */
    @GET
    @Path("/pet/{petId}")
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Find pet by ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found") })
    public Pet getPetById(@PathParam("petId") Long petId);

    /**
     * Update an existing pet
     *
     * Update an existing pet by Id
     *
     */
    @PUT
    @Path("/pet")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Update an existing pet", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found"),
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    public Pet updatePet(Pet body);

    /**
     * Update an existing pet
     *
     * Update an existing pet by Id
     *
     */
    @PUT
    @Path("/pet")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Update an existing pet", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found"),
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    public Pet updatePet(@Multipart(value = "id")  Long id, @Multipart(value = "name")  String name, @Multipart(value = "category")  Category category, @Multipart(value = "photoUrls")  List<String> photoUrls, @Multipart(value = "tags")  List<Tag> tags, @Multipart(value = "status")  String status);

    /**
     * Updates a pet in the store with form data
     *
     */
    @POST
    @Path("/pet/{petId}")
    @Operation(summary = "Updates a pet in the store with form data", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public void updatePetWithForm(@PathParam("petId") Long petId, @QueryParam("name")String name, @QueryParam("status")String status);

    /**
     * uploads an image
     *
     */
    @POST
    @Path("/pet/{petId}/uploadImage")
    @Consumes({ "application/octet-stream" })
    @Produces({ "application/json" })
    @Operation(summary = "uploads an image", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    public ModelApiResponse uploadFile(@PathParam("petId") Long petId, Object body, @QueryParam("additionalMetadata")String additionalMetadata);
}
