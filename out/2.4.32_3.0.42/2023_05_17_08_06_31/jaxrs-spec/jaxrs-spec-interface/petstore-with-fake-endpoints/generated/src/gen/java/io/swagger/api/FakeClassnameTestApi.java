package io.swagger.api;

import io.swagger.model.Client;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/fake_classname_test")
@Api(description = "the fake_classname_test API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-17T08:14:41.976Z")
public interface FakeClassnameTestApi {

    @PATCH
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "To test class name in snake case", notes = "To test class name in snake case", authorizations = {
        @Authorization(value = "api_key_query")
    }, tags={ "fake_classname_tags 123#$%^" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    Client testClassname(@Valid Client body);
}
