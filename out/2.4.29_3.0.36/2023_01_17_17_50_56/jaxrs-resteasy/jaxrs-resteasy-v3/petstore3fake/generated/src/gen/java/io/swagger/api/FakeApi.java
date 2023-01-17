package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FakeApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.math.BigDecimal;
import io.swagger.model.Client;
import io.swagger.model.EnumFormBody;
import io.swagger.model.FakeBody;
import io.swagger.model.FakeBody1;
import io.swagger.model.FakeJsonFormDataBody;
import io.swagger.model.OuterComposite;

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


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-17T18:05:47.085Z[Etc/UTC]")public class FakeApi  {

    @Inject FakeApiService service;

    @POST
    @Path("/outer/boolean")
    @Consumes({ "*/*" })
    @Produces({ "*/*" })
    @Operation(summary = "", description = "Test serialization of outer boolean types", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Output boolean", content = @Content(mediaType = "*/*", schema = @Schema(implementation = Boolean.class))) })
    public Response fakeOuterBooleanSerialize(@Parameter(description = "Input boolean as post body" ) Boolean body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.fakeOuterBooleanSerialize(body,securityContext);
    }
    @POST
    @Path("/outer/composite")
    @Consumes({ "*/*" })
    @Produces({ "*/*" })
    @Operation(summary = "", description = "Test serialization of object with outer number type", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Output composite", content = @Content(mediaType = "*/*", schema = @Schema(implementation = OuterComposite.class))) })
    public Response fakeOuterCompositeSerialize(@Parameter(description = "Input composite as post body" ) OuterComposite body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.fakeOuterCompositeSerialize(body,securityContext);
    }
    @POST
    @Path("/outer/number")
    @Consumes({ "*/*" })
    @Produces({ "*/*" })
    @Operation(summary = "", description = "Test serialization of outer number types", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Output number", content = @Content(mediaType = "*/*", schema = @Schema(implementation = BigDecimal.class))) })
    public Response fakeOuterNumberSerialize(@Parameter(description = "Input number as post body" ) BigDecimal body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.fakeOuterNumberSerialize(body,securityContext);
    }
    @POST
    @Path("/outer/string")
    @Consumes({ "*/*" })
    @Produces({ "*/*" })
    @Operation(summary = "", description = "Test serialization of outer string types", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Output string", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))) })
    public Response fakeOuterStringSerialize(@Parameter(description = "Input string as post body" ) String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.fakeOuterStringSerialize(body,securityContext);
    }
    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "To test \"client\" model", description = "To test \"client\" model", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class))) })
    public Response testClientModel(@Parameter(description = "client model" ,required=true) Client body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testClientModel(body,securityContext);
    }
    @POST
    
    @Consumes({ "application/xml; charset=utf-8", "application/json; charset=utf-8" })
    
    @Operation(summary = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", description = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", security = {
        @SecurityRequirement(name = "http_basic_test")
    }, tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    public Response testEndpointParameters(@Parameter(description = "" ,required=true) FakeBody body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testEndpointParameters(body,securityContext);
    }
    @GET
    
    
    
    @Operation(summary = "To test enum parameters", description = "To test enum parameters", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid request"),
        
        @ApiResponse(responseCode = "404", description = "Not found") })
    public Response testEnumParameters(@Parameter(description = "Header parameter enum test (string array)" , schema=@Schema(allowableValues={ ">", "$" })
)@HeaderParam("enum_header_string_array") List<String> enumHeaderStringArray,@Parameter(description = "Header parameter enum test (string)" , schema=@Schema(allowableValues={ "_abc", "-efg", "(xyz)" })
, defaultValue="-efg")@HeaderParam("enum_header_string") String enumHeaderString,  @QueryParam("enum_query_string_array") List<String> enumQueryStringArray,  @DefaultValue("-efg") @QueryParam("enum_query_string") String enumQueryString,  @QueryParam("enum_query_integer") Integer enumQueryInteger,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testEnumParameters(enumHeaderStringArray,enumHeaderString,enumQueryStringArray,enumQueryString,enumQueryInteger,securityContext);
    }
    @POST
    @Path("/enum/form")
    @Consumes({ "*/*" })
    
    @Operation(summary = "To test enum parameters", description = "To test enum parameters", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid request"),
        
        @ApiResponse(responseCode = "404", description = "Not found") })
    public Response testEnumRequestBody(@Parameter(description = "" ) EnumFormBody body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testEnumRequestBody(body,securityContext);
    }
    @POST
    @Path("/inline-additionalProperties")
    @Consumes({ "application/json" })
    
    @Operation(summary = "test inline additionalProperties", description = "", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response testInlineAdditionalProperties(@Parameter(description = "request body" ,required=true) Map<String, String> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testInlineAdditionalProperties(body,securityContext);
    }
    @POST
    @Path("/jsonFormData")
    @Consumes({ "application/json" })
    
    @Operation(summary = "test json serialization of form data", description = "", tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response testJsonFormData(@Parameter(description = "" ,required=true) FakeJsonFormDataBody body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.testJsonFormData(body,securityContext);
    }
}
