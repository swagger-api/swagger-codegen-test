package io.swagger.api;

import io.swagger.model.Body8;
import io.swagger.model.InlineResponse200;
import io.swagger.api.ParrotApiService;

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
@Path("/parrot")
@RequestScoped




@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-19T15:18:01.081Z[Etc/UTC]")
public class ParrotApi  {

  @Context SecurityContext securityContext;

  @Inject ParrotApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Add a new parrow to the store", description = "", security = {
        @SecurityRequirement(name = "jwt")    }, tags={ "parrot" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input"),
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Object.class))) })
    public Response addParrot(
@Parameter(description = "" ) Object body
) {
        return delegate.addParrot(body, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "get Parrots", description = "", security = {
        @SecurityRequirement(name = "jwt")    }, tags={ "parrot" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Object.class)))) })
    public Response getParrots() {
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
    public Response updateParrots(
@Parameter(description = "" ) Body8 body
) {
        return delegate.updateParrots(body, securityContext);
    }
}
