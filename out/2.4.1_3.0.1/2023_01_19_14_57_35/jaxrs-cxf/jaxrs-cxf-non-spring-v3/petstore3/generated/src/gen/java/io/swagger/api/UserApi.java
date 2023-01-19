package io.swagger.api;

import io.swagger.model.User;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Swagger Petstore - OpenAPI 3.0
 *
 * <p>This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 */
@Path("/")
public interface UserApi  {

    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     */
    @POST
    @Path("/user")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Create user", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = User.class))) })
    public User createUser(@Multipart(value = "id", required = false)  Long id, @Multipart(value = "username", required = false)  String username, @Multipart(value = "firstName", required = false)  String firstName, @Multipart(value = "lastName", required = false)  String lastName, @Multipart(value = "email", required = false)  String email, @Multipart(value = "password", required = false)  String password, @Multipart(value = "phone", required = false)  String phone, @Multipart(value = "userStatus", required = false)  Integer userStatus);

    /**
     * Creates list of users with given input array
     *
     * Creates list of users with given input array
     *
     */
    @POST
    @Path("/user/createWithList")
    @Consumes({ "application/json" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Creates list of users with given input array", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(schema = @Schema(implementation = User.class))),
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public User createUsersWithListInput(@Valid List<User> body);

    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     */
    @DELETE
    @Path("/user/{username}")
    @Operation(summary = "Delete user", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        @ApiResponse(responseCode = "404", description = "User not found") })
    public void deleteUser(@PathParam("username") String username);

    /**
     * Get user by user name
     *
     */
    @GET
    @Path("/user/{username}")
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Get user by user name", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = User.class))),
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        @ApiResponse(responseCode = "404", description = "User not found") })
    public User getUserByName(@PathParam("username") String username);

    /**
     * Logs user into the system
     *
     */
    @GET
    @Path("/user/login")
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Logs user into the system", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Invalid username/password supplied") })
    public String loginUser(@QueryParam("username") String username, @QueryParam("password") String password);

    /**
     * Logs out current logged in user session
     *
     */
    @GET
    @Path("/user/logout")
    @Operation(summary = "Logs out current logged in user session", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public void logoutUser();

    /**
     * Update user
     *
     * This can only be done by the logged in user.
     *
     */
    @PUT
    @Path("/user/{username}")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Operation(summary = "Update user", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public void updateUser(@PathParam("username") String username2, @Multipart(value = "id", required = false)  Long id, @Multipart(value = "username", required = false)  String username, @Multipart(value = "firstName", required = false)  String firstName, @Multipart(value = "lastName", required = false)  String lastName, @Multipart(value = "email", required = false)  String email, @Multipart(value = "password", required = false)  String password, @Multipart(value = "phone", required = false)  String phone, @Multipart(value = "userStatus", required = false)  Integer userStatus);
}
