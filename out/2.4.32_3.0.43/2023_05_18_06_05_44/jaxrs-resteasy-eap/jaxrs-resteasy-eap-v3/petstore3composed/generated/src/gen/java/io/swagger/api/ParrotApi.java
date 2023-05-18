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

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.ParrotBody;
import io.swagger.model.ParrotBody1;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/parrot")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-05-18T06:09:37.812Z[Etc/UTC]")
public interface ParrotApi  {
   
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Add a new parrow to the store", description = "", tags={ "pet" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "405", description = "Invalid input"),
                @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class)))
         })
    Response addParrot(@Parameter(description = "" ) ParrotBody1 body,@Context SecurityContext securityContext);

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "get Parrots", description = "", tags={ "pet" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Object.class))))
         })
    Response getParrots(@Context SecurityContext securityContext);

    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "update parrots", description = "", tags={ "pet" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "405", description = "Invalid input"),
                @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse200.class)))
         })
    Response updateParrots(@Parameter(description = "" ) ParrotBody body,@Context SecurityContext securityContext);

}
