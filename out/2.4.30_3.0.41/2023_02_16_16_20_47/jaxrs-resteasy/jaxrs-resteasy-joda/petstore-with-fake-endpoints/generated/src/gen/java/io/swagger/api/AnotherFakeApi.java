package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AnotherFakeApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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


@io.swagger.annotations.Api(description = "the another-fake API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2023-02-16T16:36:33.353Z")
public class AnotherFakeApi  {

    @Inject AnotherFakeApiService service;

    @PATCH
    @Path("/dummy")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "To test special tags", notes = "To test special tags", response = Client.class, tags={ "$another-fake?", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    public Response testSpecialTags(@ApiParam(value = "client model" ,required=true) Client body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testSpecialTags(body,securityContext);
    }
}
