package io.swagger.api;

import io.swagger.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Client;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/fake_classname_test")


@io.swagger.annotations.Api(description = "the fake_classname_test API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2023-10-02T11:05:51.653Z")
public interface FakeClassnameTestApi  {
   
    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "To test class name in snake case", notes = "To test class name in snake case", response = Client.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "api_key_query")
    }, tags={ "fake_classname_tags 123#$%^", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    public Response testClassname(@ApiParam(value = "client model" ,required=true) Client body,@Context SecurityContext securityContext);
}
