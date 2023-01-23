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

import io.swagger.model.AllPetsResponse;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/allPets")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-23T15:12:36.772Z[Etc/UTC]")public interface AllPetsApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", tags={ "pet" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "a single random pet", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AllPetsResponse.class)))
         })
    Response getAllPets(@Context SecurityContext securityContext);

}
