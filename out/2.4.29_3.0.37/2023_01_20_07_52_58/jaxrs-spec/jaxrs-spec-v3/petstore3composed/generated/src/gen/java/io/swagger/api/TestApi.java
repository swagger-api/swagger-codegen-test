package io.swagger.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/test")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2023-01-20T08:13:20.431Z[Etc/UTC]")
public class TestApi {

    @GET
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", security = {
        @SecurityRequirement(name = "bearer")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "peticion realizada con exito", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class))))
    })
    public Response testMethod() {
        return Response.ok().entity("magic!").build();
    }}
