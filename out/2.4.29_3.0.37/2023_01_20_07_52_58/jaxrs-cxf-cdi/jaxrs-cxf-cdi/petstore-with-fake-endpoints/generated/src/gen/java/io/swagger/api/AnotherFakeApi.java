package io.swagger.api;

import io.swagger.model.Client;
import io.swagger.api.AnotherFakeApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/another-fake")
@RequestScoped

@Api(description = "the another-fake API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-20T08:06:35.349Z")

public class AnotherFakeApi  {

  @Context SecurityContext securityContext;

  @Inject AnotherFakeApiService delegate;


    @PATCH
    @Path("/dummy")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "To test special tags", notes = "To test special tags", response = Client.class, tags={ "$another-fake?" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    public Response testSpecialTags(@ApiParam(value = "client model" ,required=true) Client body) {
        return delegate.testSpecialTags(body, securityContext);
    }
}
