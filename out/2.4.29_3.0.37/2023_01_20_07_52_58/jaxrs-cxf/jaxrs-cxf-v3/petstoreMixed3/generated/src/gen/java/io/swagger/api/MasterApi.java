package io.swagger.api;

import io.swagger.model.PartMaster;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Swagger Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 */
@Path("/")
public interface MasterApi  {

    @GET
    @Path("/master")
    @Produces({ "application/json" })
    @Operation(summary = "", tags={ "master" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "peticion realizada con exito", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = PartMaster.class)))) })
    public List<PartMaster> masterOperation();
}
