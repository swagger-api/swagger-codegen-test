package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MasterApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.PartMaster;

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
@Path("/master")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-20T08:15:07.961Z[Etc/UTC]")public class MasterApi  {

    @Inject MasterApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", security = {
        @SecurityRequirement(name = "http_bearer_test")
    }, tags={ "master" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "peticion realizada con exito", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = PartMaster.class)))) })
    public Response masterOperation(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.masterOperation(securityContext);
    }
}
