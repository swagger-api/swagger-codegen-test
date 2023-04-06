package io.swagger.api;

import io.swagger.model.User;
import io.swagger.api.UserApiService;

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
@Path("/user")
@RequestScoped




@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-04-06T09:14:21.882Z[Etc/UTC]")
public class UserApi  {

  @Context SecurityContext securityContext;

  @Inject UserApiService delegate;


    @POST
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))) })
    public Response createUser(
@Parameter(description = "Created user object" ) User body
) {
        return delegate.createUser(body, securityContext);
    }

    @POST
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))) })
    public Response createUser(@Multipart(value = "id", required = false)  Long id, @Multipart(value = "username", required = false)  String username, @Multipart(value = "firstName", required = false)  String firstName, @Multipart(value = "lastName", required = false)  String lastName, @Multipart(value = "email", required = false)  String email, @Multipart(value = "password", required = false)  String password, @Multipart(value = "phone", required = false)  String phone, @Multipart(value = "userStatus", required = false)  Integer userStatus) {
        return delegate.createUser(id, username, firstName, lastName, email, password, phone, userStatus, securityContext);
    }

    @POST
    @Path("/createWithList")
    @Consumes({ "application/json" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Creates list of users with given input array", description = "Creates list of users with given input array", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))),
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response createUsersWithListInput(
@Parameter(description = "" ) List<User> body
) {
        return delegate.createUsersWithListInput(body, securityContext);
    }

    @DELETE
    @Path("/{username}")
    
    
    @Operation(summary = "Delete user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        @ApiResponse(responseCode = "404", description = "User not found") })
    public Response deleteUser(
@Parameter(description = "The name that needs to be deleted",required=true) @PathParam("username") String username
) {
        return delegate.deleteUser(username, securityContext);
    }

    @GET
    @Path("/{username}")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Get user by user name", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))),
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        @ApiResponse(responseCode = "404", description = "User not found") })
    public Response getUserByName(
@Parameter(description = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathParam("username") String username
) {
        return delegate.getUserByName(username, securityContext);
    }

    @GET
    @Path("/login")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Logs user into the system", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Invalid username/password supplied") })
    public Response loginUser( 
@Parameter(description = "The user name for login")  @QueryParam("username") String username
,  
@Parameter(description = "The password for login in clear text")  @QueryParam("password") String password
) {
        return delegate.loginUser(username, password, securityContext);
    }

    @GET
    @Path("/logout")
    
    
    @Operation(summary = "Logs out current logged in user session", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response logoutUser() {
        return delegate.logoutUser(securityContext);
    }

    @PUT
    @Path("/{username}")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    
    @Operation(summary = "Update user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response updateUser(
@Parameter(description = "name that need to be deleted",required=true) @PathParam("username") String username
, 
@Parameter(description = "Update an existent user in the store" ) User body
) {
        return delegate.updateUser(username, body, securityContext);
    }

    @PUT
    @Path("/{username}")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    
    @Operation(summary = "Update user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response updateUser(
@Parameter(description = "name that need to be deleted",required=true) @PathParam("username") String username
, @Multipart(value = "id", required = false)  Long id, @Multipart(value = "username", required = false)  String username2, @Multipart(value = "firstName", required = false)  String firstName, @Multipart(value = "lastName", required = false)  String lastName, @Multipart(value = "email", required = false)  String email, @Multipart(value = "password", required = false)  String password, @Multipart(value = "phone", required = false)  String phone, @Multipart(value = "userStatus", required = false)  Integer userStatus) {
        return delegate.updateUser(username, id, username2, firstName, lastName, email, password, phone, userStatus, securityContext);
    }
}
