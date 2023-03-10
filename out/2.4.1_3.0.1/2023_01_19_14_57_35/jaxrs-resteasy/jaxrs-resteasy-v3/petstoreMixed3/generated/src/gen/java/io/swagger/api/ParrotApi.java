package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ParrotApiService;
import io.swagger.api.factories.ParrotApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Body8;
import io.swagger.model.InlineResponse200;

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

@Path("/parrot")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-19T15:18:00.002Z[Etc/UTC]")public class ParrotApi  {
   private final ParrotApiService delegate;

   public ParrotApi(@Context ServletConfig servletContext) {
      ParrotApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ParrotApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ParrotApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ParrotApiServiceFactory.getParrotApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Add a new parrow to the store", description = "", security = {
        @SecurityRequirement(name = "jwt")    }, tags={ "parrot" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input"),
        
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Object.class))) })
    public Response addParrot(@Parameter(description = "" ) Object body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addParrot(body,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "get Parrots", description = "", security = {
        @SecurityRequirement(name = "jwt")    }, tags={ "parrot" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Object.class)))) })
    public Response getParrots(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getParrots(securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "update parrots", description = "", security = {
        @SecurityRequirement(name = "jwt")    }, tags={ "parrot" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input"),
        
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = InlineResponse200.class))) })
    public Response updateParrots(@Parameter(description = "" ) Body8 body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateParrots(body,securityContext);
    }
}
