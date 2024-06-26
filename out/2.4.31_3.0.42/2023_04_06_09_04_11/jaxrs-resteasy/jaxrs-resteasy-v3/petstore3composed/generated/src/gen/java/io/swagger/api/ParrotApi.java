package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ParrotApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.ParrotBody;
import io.swagger.model.ParrotBody1;

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
@Path("/parrot")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-04-06T09:18:12.216Z[Etc/UTC]")public class ParrotApi  {

    @Inject ParrotApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Add a new parrow to the store", description = "", tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input"),
        
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class))) })
    public Response addParrot(@Parameter(description = "" ) ParrotBody1 body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addParrot(body,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "get Parrots", description = "", tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Object.class)))) })
    public Response getParrots(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getParrots(securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "update parrots", description = "", tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input"),
        
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse200.class))) })
    public Response updateParrots(@Parameter(description = "" ) ParrotBody body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateParrots(body,securityContext);
    }
}
