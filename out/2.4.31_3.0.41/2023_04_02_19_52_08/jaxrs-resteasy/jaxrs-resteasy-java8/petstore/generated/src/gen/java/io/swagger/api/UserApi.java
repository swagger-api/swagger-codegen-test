package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.List;
import io.swagger.model.User;

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

@Path("/user")


@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2023-04-02T19:56:25.475Z")
public class UserApi  {

    @Inject UserApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createUser(@ApiParam(value = "Created user object" ,required=true) User body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createUser(body,securityContext);
    }
    @POST
    @Path("/createWithArray")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true) List<User> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createUsersWithArrayInput(body,securityContext);
    }
    @POST
    @Path("/createWithList")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true) List<User> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createUsersWithListInput(body,securityContext);
    }
    @DELETE
    @Path("/{username}")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Delete user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response deleteUser( @PathParam("username") String username,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteUser(username,securityContext);
    }
    @GET
    @Path("/{username}")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Get user by user name", notes = "", response = User.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response getUserByName( @PathParam("username") String username,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserByName(username,securityContext);
    }
    @GET
    @Path("/login")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Logs user into the system", notes = "", response = String.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username/password supplied", response = Void.class) })
    public Response loginUser( @NotNull  @QueryParam("username") String username, @NotNull  @QueryParam("password") String password,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.loginUser(username,password,securityContext);
    }
    @GET
    @Path("/logout")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Logs out current logged in user session", notes = "", response = Void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response logoutUser(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.logoutUser(securityContext);
    }
    @PUT
    @Path("/{username}")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Updated user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid user supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response updateUser( @PathParam("username") String username,@ApiParam(value = "Updated user object" ,required=true) User body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateUser(username,body,securityContext);
    }
}
