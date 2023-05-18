package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AnotherFakeApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Client;

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
@Path("/another-fake")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-05-18T06:18:43.268Z[Etc/UTC]")
public class AnotherFakeApi  {

    @Inject AnotherFakeApiService service;

    @PATCH
    @Path("/dummy")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "To test special tags", description = "To test special tags", tags={ "$another-fake?" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class))) })
    public Response testSpecialTags(
@Parameter(description = "client model" ,required=true) Client body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testSpecialTags(body,securityContext);
    }
}
