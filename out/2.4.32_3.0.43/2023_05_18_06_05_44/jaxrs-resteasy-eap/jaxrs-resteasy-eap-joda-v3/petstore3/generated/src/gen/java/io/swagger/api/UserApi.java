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

import io.swagger.model.User;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/user")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-05-18T06:13:57.453Z[Etc/UTC]")
public interface UserApi  {
   
    @POST
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)))
         })
    Response createUser(@Parameter(description = "Created user object" ) User body,@Context SecurityContext securityContext);

    @POST
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)))
         })
    Response createUser(@Parameter(description = "")@FormParam("id")  Long id,@Parameter(description = "")@FormParam("username")  String username,@Parameter(description = "")@FormParam("firstName")  String firstName,@Parameter(description = "")@FormParam("lastName")  String lastName,@Parameter(description = "")@FormParam("email")  String email,@Parameter(description = "")@FormParam("password")  String password,@Parameter(description = "")@FormParam("phone")  String phone,@Parameter(description = "")@FormParam("userStatus")  Integer userStatus,@Context SecurityContext securityContext);

    @POST
    @Path("/createWithList")
    @Consumes({ "application/json" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Creates list of users with given input array", description = "Creates list of users with given input array", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))),
                @ApiResponse(responseCode = "200", description = "successful operation")
         })
    Response createUsersWithListInput(@Parameter(description = "" ) List<User> body,@Context SecurityContext securityContext);

    @DELETE
    @Path("/{username}")
    
    
    @Operation(summary = "Delete user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
                @ApiResponse(responseCode = "404", description = "User not found")
         })
    Response deleteUser( @PathParam("username") String username,@Context SecurityContext securityContext);

    @GET
    @Path("/{username}")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Get user by user name", description = "", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))),
                @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
                @ApiResponse(responseCode = "404", description = "User not found")
         })
    Response getUserByName( @PathParam("username") String username,@Context SecurityContext securityContext);

    @GET
    @Path("/login")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Logs user into the system", description = "", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Invalid username/password supplied")
         })
    Response loginUser( @QueryParam("username") String username, @QueryParam("password") String password,@Context SecurityContext securityContext);

    @GET
    @Path("/logout")
    
    
    @Operation(summary = "Logs out current logged in user session", description = "", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation")
         })
    Response logoutUser(@Context SecurityContext securityContext);

    @PUT
    @Path("/{username}")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    
    @Operation(summary = "Update user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation")
         })
    Response updateUser( @PathParam("username") String username,@Parameter(description = "Update an existent user in the store" ) User body,@Context SecurityContext securityContext);

    @PUT
    @Path("/{username}")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    
    @Operation(summary = "Update user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation")
         })
    Response updateUser( @PathParam("username") String username,@Parameter(description = "")@FormParam("id")  Long id,@Parameter(description = "")@FormParam("username")  String username2,@Parameter(description = "")@FormParam("firstName")  String firstName,@Parameter(description = "")@FormParam("lastName")  String lastName,@Parameter(description = "")@FormParam("email")  String email,@Parameter(description = "")@FormParam("password")  String password,@Parameter(description = "")@FormParam("phone")  String phone,@Parameter(description = "")@FormParam("userStatus")  Integer userStatus,@Context SecurityContext securityContext);

}
