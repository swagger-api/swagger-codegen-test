package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FakeClassnameTestApiService;

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
@Path("/fake_classname_test")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-20T14:02:21.939Z[Etc/UTC]")public class FakeClassnameTestApi  {

    @Inject FakeClassnameTestApiService service;

    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "To test class name in snake case", description = "", security = {
        @SecurityRequirement(name = "api_key_query")
    }, tags={ "fake_classname_tags 123#$%^" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class))) })
    public Response testClassname(@Parameter(description = "client model" ,required=true) Client body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testClassname(body,securityContext);
    }
}
