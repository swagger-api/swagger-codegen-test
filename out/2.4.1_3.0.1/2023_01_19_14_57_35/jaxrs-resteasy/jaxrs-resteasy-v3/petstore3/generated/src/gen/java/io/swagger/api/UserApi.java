package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.User;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/user")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-19T15:15:33.090Z[Etc/UTC]")public class UserApi  {
   private final UserApiService delegate;

   public UserApi(@Context ServletConfig servletContext) {
      UserApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UserApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UserApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UserApiServiceFactory.getUserApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = User.class))) })
    public Response createUser(@Parameter(description = "")  @FormParam("id")  Long id
,@Parameter(description = "")  @FormParam("username")  String username
,@Parameter(description = "")  @FormParam("firstName")  String firstName
,@Parameter(description = "")  @FormParam("lastName")  String lastName
,@Parameter(description = "")  @FormParam("email")  String email
,@Parameter(description = "")  @FormParam("password")  String password
,@Parameter(description = "")  @FormParam("phone")  String phone
,@Parameter(description = "")  @FormParam("userStatus")  Integer userStatus
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUser(id,username,firstName,lastName,email,password,phone,userStatus,securityContext);
    }
    @POST
    @Path("/createWithList")
    @Consumes({ "application/json" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Creates list of users with given input array", description = "Creates list of users with given input array", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response createUsersWithListInput(@Parameter(description = "" ) List<User> body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUsersWithListInput(body,securityContext);
    }
    @DELETE
    @Path("/{username}")
    
    
    @Operation(summary = "Delete user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    public Response deleteUser(@Parameter(description = "The name that needs to be deleted",required=true) @PathParam("username") String username
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUser(username,securityContext);
    }
    @GET
    @Path("/{username}")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Get user by user name", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    public Response getUserByName(@Parameter(description = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathParam("username") String username
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserByName(username,securityContext);
    }
    @GET
    @Path("/login")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Logs user into the system", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid username/password supplied") })
    public Response loginUser(@Parameter(description = "The user name for login") @QueryParam("username") String username
,@Parameter(description = "The password for login in clear text") @QueryParam("password") String password
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loginUser(username,password,securityContext);
    }
    @GET
    @Path("/logout")
    
    
    @Operation(summary = "Logs out current logged in user session", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response logoutUser(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.logoutUser(securityContext);
    }
    @PUT
    @Path("/{username}")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    
    @Operation(summary = "Update user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response updateUser(@Parameter(description = "name that need to be deleted",required=true) @PathParam("username") String username2
,@Parameter(description = "")  @FormParam("id")  Long id
,@Parameter(description = "")  @FormParam("username")  String username
,@Parameter(description = "")  @FormParam("firstName")  String firstName
,@Parameter(description = "")  @FormParam("lastName")  String lastName
,@Parameter(description = "")  @FormParam("email")  String email
,@Parameter(description = "")  @FormParam("password")  String password
,@Parameter(description = "")  @FormParam("phone")  String phone
,@Parameter(description = "")  @FormParam("userStatus")  Integer userStatus
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUser(username2,id,username,firstName,lastName,email,password,phone,userStatus,securityContext);
    }
}
