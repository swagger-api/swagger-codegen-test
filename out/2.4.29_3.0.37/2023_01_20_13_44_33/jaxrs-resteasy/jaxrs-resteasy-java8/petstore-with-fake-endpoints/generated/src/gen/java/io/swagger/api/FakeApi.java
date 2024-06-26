package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FakeApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import io.swagger.model.Client;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import io.swagger.model.OuterComposite;
import io.swagger.model.User;

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

@Path("/fake")


@io.swagger.annotations.Api(description = "the fake API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2023-01-20T13:58:13.709Z")
public class FakeApi  {

    @Inject FakeApiService service;

    @POST
    @Path("/outer/boolean")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Test serialization of outer boolean types", response = Boolean.class, tags={ "fake", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Output boolean", response = Boolean.class) })
    public Response fakeOuterBooleanSerialize(@ApiParam(value = "Input boolean as post body" ) Boolean body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.fakeOuterBooleanSerialize(body,securityContext);
    }
    @POST
    @Path("/outer/composite")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Test serialization of object with outer number type", response = OuterComposite.class, tags={ "fake", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Output composite", response = OuterComposite.class) })
    public Response fakeOuterCompositeSerialize(@ApiParam(value = "Input composite as post body" ) OuterComposite body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.fakeOuterCompositeSerialize(body,securityContext);
    }
    @POST
    @Path("/outer/number")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Test serialization of outer number types", response = BigDecimal.class, tags={ "fake", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Output number", response = BigDecimal.class) })
    public Response fakeOuterNumberSerialize(@ApiParam(value = "Input number as post body" ) BigDecimal body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.fakeOuterNumberSerialize(body,securityContext);
    }
    @POST
    @Path("/outer/string")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Test serialization of outer string types", response = String.class, tags={ "fake", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Output string", response = String.class) })
    public Response fakeOuterStringSerialize(@ApiParam(value = "Input string as post body" ) String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.fakeOuterStringSerialize(body,securityContext);
    }
    @PUT
    @Path("/body-with-query-params")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "fake", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class) })
    public Response testBodyWithQueryParams(@ApiParam(value = "" ,required=true) User body, @NotNull  @QueryParam("query") String query,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testBodyWithQueryParams(body,query,securityContext);
    }
    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "To test \"client\" model", notes = "To test \"client\" model", response = Client.class, tags={ "fake", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    public Response testClientModel(@ApiParam(value = "client model" ,required=true) Client body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testClientModel(body,securityContext);
    }
    @POST
    
    @Consumes({ "application/xml; charset=utf-8", "application/json; charset=utf-8" })
    @Produces({ "application/xml; charset=utf-8", "application/json; charset=utf-8" })
    @io.swagger.annotations.ApiOperation(value = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", notes = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "http_basic_test")
    }, tags={ "fake", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response testEndpointParameters(@ApiParam(value = "None", required=true)@FormParam("number")  BigDecimal number,@ApiParam(value = "None", required=true)@FormParam("double")  Double _double,@ApiParam(value = "None", required=true)@FormParam("pattern_without_delimiter")  String patternWithoutDelimiter,@ApiParam(value = "None", required=true)@FormParam("byte")  byte[] _byte,@ApiParam(value = "None")@FormParam("integer")  Integer integer,@ApiParam(value = "None")@FormParam("int32")  Integer int32,@ApiParam(value = "None")@FormParam("int64")  Long int64,@ApiParam(value = "None")@FormParam("float")  Float _float,@ApiParam(value = "None")@FormParam("string")  String string,@ApiParam(value = "None")@FormParam("binary")  byte[] binary,@ApiParam(value = "None")@FormParam("date")  LocalDate date,@ApiParam(value = "None")@FormParam("dateTime")  OffsetDateTime dateTime,@ApiParam(value = "None")@FormParam("password")  String password,@ApiParam(value = "None")@FormParam("callback")  String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testEndpointParameters(number,_double,patternWithoutDelimiter,_byte,integer,int32,int64,_float,string,binary,date,dateTime,password,paramCallback,securityContext);
    }
    @GET
    
    @Consumes({ "*/*" })
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "To test enum parameters", notes = "To test enum parameters", response = Void.class, tags={ "fake", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not found", response = Void.class) })
    public Response testEnumParameters(@ApiParam(value = "Form parameter enum test (string array)", allowableValues=">, $")@FormParam("enum_form_string_array")  List<String> enumFormStringArray,@ApiParam(value = "Form parameter enum test (string)", allowableValues="_abc, -efg, (xyz)", defaultValue="-efg")@FormParam("enum_form_string")  String enumFormString,@ApiParam(value = "Header parameter enum test (string array)" , allowableValues=">, $")@HeaderParam("enum_header_string_array") List<String> enumHeaderStringArray,@ApiParam(value = "Header parameter enum test (string)" , allowableValues="_abc, -efg, (xyz)", defaultValue="-efg")@HeaderParam("enum_header_string") String enumHeaderString,  @QueryParam("enum_query_string_array") List<String> enumQueryStringArray,  @DefaultValue("-efg") @QueryParam("enum_query_string") String enumQueryString,  @QueryParam("enum_query_integer") Integer enumQueryInteger,@ApiParam(value = "Query parameter enum test (double)", allowableValues="1.1, -1.2")@FormParam("enum_query_double")  Double enumQueryDouble,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testEnumParameters(enumFormStringArray,enumFormString,enumHeaderStringArray,enumHeaderString,enumQueryStringArray,enumQueryString,enumQueryInteger,enumQueryDouble,securityContext);
    }
    @POST
    @Path("/inline-additionalProperties")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "test inline additionalProperties", notes = "", response = Void.class, tags={ "fake", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response testInlineAdditionalProperties(@ApiParam(value = "request body" ,required=true) Object param,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testInlineAdditionalProperties(param,securityContext);
    }
    @GET
    @Path("/jsonFormData")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "test json serialization of form data", notes = "", response = Void.class, tags={ "fake", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response testJsonFormData(@ApiParam(value = "field1", required=true)@FormParam("param")  String param,@ApiParam(value = "field2", required=true)@FormParam("param2")  String param2,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testJsonFormData(param,param2,securityContext);
    }
}
