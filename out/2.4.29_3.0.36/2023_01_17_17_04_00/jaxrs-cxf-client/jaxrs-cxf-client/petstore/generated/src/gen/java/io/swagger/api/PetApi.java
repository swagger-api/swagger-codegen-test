package io.swagger.api;

import java.io.File;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Swagger Petstore
 *
 * <p>This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface PetApi  {

    /**
     * Add a new pet to the store
     *
     * 
     *
     */
    @POST
    @Path("/pet")
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Add a new pet to the store", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    public void addPet(Pet body);

    /**
     * Deletes a pet
     *
     * 
     *
     */
    @DELETE
    @Path("/pet/{petId}")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Deletes a pet", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found") })
    public void deletePet(@PathParam("petId") Long petId, @HeaderParam("api_key") String apiKey);

    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     */
    @GET
    @Path("/pet/findByStatus")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Finds Pets by status", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value") })
    public List<Pet> findPetsByStatus(@QueryParam("status")List<String> status);

    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     */
    @GET
    @Path("/pet/findByTags")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Finds Pets by tags", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid tag value") })
    public List<Pet> findPetsByTags(@QueryParam("tags")List<String> tags);

    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     */
    @GET
    @Path("/pet/{petId}")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Find pet by ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found") })
    public Pet getPetById(@PathParam("petId") Long petId);

    /**
     * Update an existing pet
     *
     * 
     *
     */
    @PUT
    @Path("/pet")
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Update an existing pet", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    public void updatePet(Pet body);

    /**
     * Updates a pet in the store with form data
     *
     * 
     *
     */
    @POST
    @Path("/pet/{petId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Updates a pet in the store with form data", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    public void updatePetWithForm(@PathParam("petId") Long petId, @Multipart(value = "name", required = false)  String name, @Multipart(value = "status", required = false)  String status);

    /**
     * uploads an image
     *
     * 
     *
     */
    @POST
    @Path("/pet/{petId}/uploadImage")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "uploads an image", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class) })
    public ModelApiResponse uploadFile(@PathParam("petId") Long petId, @Multipart(value = "additionalMetadata", required = false)  String additionalMetadata,  @Multipart(value = "file" , required = false) Attachment fileDetail);
}

