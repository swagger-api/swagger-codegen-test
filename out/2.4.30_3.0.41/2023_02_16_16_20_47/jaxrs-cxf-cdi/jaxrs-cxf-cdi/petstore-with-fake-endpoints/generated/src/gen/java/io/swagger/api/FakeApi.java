package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Client;
import org.joda.time.LocalDate;
import io.swagger.model.OuterComposite;
import io.swagger.model.User;
import io.swagger.api.FakeApiService;

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
@Path("/fake")
@RequestScoped

@Api(description = "the fake API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2023-02-16T16:36:26.803Z")

public class FakeApi  {

  @Context SecurityContext securityContext;

  @Inject FakeApiService delegate;


    @POST
    @Path("/outer/boolean")
    
    
    @ApiOperation(value = "", notes = "Test serialization of outer boolean types", response = Boolean.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output boolean", response = Boolean.class) })
    public Response fakeOuterBooleanSerialize(@ApiParam(value = "Input boolean as post body" ) Boolean body) {
        return delegate.fakeOuterBooleanSerialize(body, securityContext);
    }

    @POST
    @Path("/outer/composite")
    
    
    @ApiOperation(value = "", notes = "Test serialization of object with outer number type", response = OuterComposite.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output composite", response = OuterComposite.class) })
    public Response fakeOuterCompositeSerialize(@ApiParam(value = "Input composite as post body" ) OuterComposite body) {
        return delegate.fakeOuterCompositeSerialize(body, securityContext);
    }

    @POST
    @Path("/outer/number")
    
    
    @ApiOperation(value = "", notes = "Test serialization of outer number types", response = BigDecimal.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output number", response = BigDecimal.class) })
    public Response fakeOuterNumberSerialize(@ApiParam(value = "Input number as post body" ) BigDecimal body) {
        return delegate.fakeOuterNumberSerialize(body, securityContext);
    }

    @POST
    @Path("/outer/string")
    
    
    @ApiOperation(value = "", notes = "Test serialization of outer string types", response = String.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output string", response = String.class) })
    public Response fakeOuterStringSerialize(@ApiParam(value = "Input string as post body" ) String body) {
        return delegate.fakeOuterStringSerialize(body, securityContext);
    }

    @PUT
    @Path("/body-with-query-params")
    @Consumes({ "application/json" })
    
    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class) })
    public Response testBodyWithQueryParams(@ApiParam(value = "" ,required=true) User body,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("query") String query) {
        return delegate.testBodyWithQueryParams(body, query, securityContext);
    }

    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "To test \"client\" model", notes = "To test \"client\" model", response = Client.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    public Response testClientModel(@ApiParam(value = "client model" ,required=true) Client body) {
        return delegate.testClientModel(body, securityContext);
    }

    @POST
    
    @Consumes({ "application/xml; charset=utf-8", "application/json; charset=utf-8" })
    @Produces({ "application/xml; charset=utf-8", "application/json; charset=utf-8" })
    @ApiOperation(value = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", notes = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", response = Void.class, authorizations = {
        @Authorization(value = "http_basic_test")
    }, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        @ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response testEndpointParameters(@Multipart(value = "number")  BigDecimal number, @Multipart(value = "double")  Double _double, @Multipart(value = "pattern_without_delimiter")  String patternWithoutDelimiter, @Multipart(value = "byte")  byte[] _byte, @Multipart(value = "integer", required = false)  Integer integer, @Multipart(value = "int32", required = false)  Integer int32, @Multipart(value = "int64", required = false)  Long int64, @Multipart(value = "float", required = false)  Float _float, @Multipart(value = "string", required = false)  String string, @Multipart(value = "binary", required = false)  byte[] binary, @Multipart(value = "date", required = false)  LocalDate date, @Multipart(value = "dateTime", required = false)  java.util.Date dateTime, @Multipart(value = "password", required = false)  String password, @Multipart(value = "callback", required = false)  String paramCallback) {
        return delegate.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback, securityContext);
    }

    @GET
    
    @Consumes({ "*/*" })
    @Produces({ "*/*" })
    @ApiOperation(value = "To test enum parameters", notes = "To test enum parameters", response = Void.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid request", response = Void.class),
        @ApiResponse(code = 404, message = "Not found", response = Void.class) })
    public Response testEnumParameters(@Multipart(value = "enum_form_string_array", required = false)  List<String> enumFormStringArray, @Multipart(value = "enum_form_string", required = false)  String enumFormString, @ApiParam(value = "Header parameter enum test (string array)" , allowableValues=">, $")@HeaderParam("enum_header_string_array") List<String> enumHeaderStringArray, @ApiParam(value = "Header parameter enum test (string)" , allowableValues="_abc, -efg, (xyz)", defaultValue="-efg")@HeaderParam("enum_header_string") String enumHeaderString,  @ApiParam(value = "Query parameter enum test (string array)", allowableValues=">, $")  @QueryParam("enum_query_string_array") List<String> enumQueryStringArray,  @ApiParam(value = "Query parameter enum test (string)", allowableValues="_abc, -efg, (xyz)", defaultValue="-efg") @DefaultValue("-efg") @QueryParam("enum_query_string") String enumQueryString,  @ApiParam(value = "Query parameter enum test (double)", allowableValues="1, -2")  @QueryParam("enum_query_integer") Integer enumQueryInteger, @Multipart(value = "enum_query_double", required = false)  Double enumQueryDouble) {
        return delegate.testEnumParameters(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, securityContext);
    }

    @POST
    @Path("/inline-additionalProperties")
    @Consumes({ "application/json" })
    
    @ApiOperation(value = "test inline additionalProperties", notes = "", response = Void.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response testInlineAdditionalProperties(@ApiParam(value = "request body" ,required=true) Object param) {
        return delegate.testInlineAdditionalProperties(param, securityContext);
    }

    @GET
    @Path("/jsonFormData")
    @Consumes({ "application/json" })
    
    @ApiOperation(value = "test json serialization of form data", notes = "", response = Void.class, tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response testJsonFormData(@Multipart(value = "param")  String param, @Multipart(value = "param2")  String param2) {
        return delegate.testJsonFormData(param, param2, securityContext);
    }
}
