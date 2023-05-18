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

import java.math.BigDecimal;
import io.swagger.model.Client;
import io.swagger.model.EnumFormBody;
import io.swagger.model.FakeBody;
import io.swagger.model.FakeBody1;
import io.swagger.model.FakeJsonFormDataBody;
import io.swagger.model.OuterComposite;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/fake")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-05-18T06:18:40.365Z[Etc/UTC]")
public interface FakeApi  {
   
    @POST
    @Path("/outer/boolean")
    @Consumes({ "*/*" })
    @Produces({ "*/*" })
    @Operation(summary = "", description = "Test serialization of outer boolean types", tags={ "fake" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Output boolean", content = @Content(mediaType = "*/*", schema = @Schema(implementation = Boolean.class)))
         })
    Response fakeOuterBooleanSerialize(@Parameter(description = "Input boolean as post body" ) Boolean body,@Context SecurityContext securityContext);

    @POST
    @Path("/outer/composite")
    @Consumes({ "*/*" })
    @Produces({ "*/*" })
    @Operation(summary = "", description = "Test serialization of object with outer number type", tags={ "fake" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Output composite", content = @Content(mediaType = "*/*", schema = @Schema(implementation = OuterComposite.class)))
         })
    Response fakeOuterCompositeSerialize(@Parameter(description = "Input composite as post body" ) OuterComposite body,@Context SecurityContext securityContext);

    @POST
    @Path("/outer/number")
    @Consumes({ "*/*" })
    @Produces({ "*/*" })
    @Operation(summary = "", description = "Test serialization of outer number types", tags={ "fake" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Output number", content = @Content(mediaType = "*/*", schema = @Schema(implementation = BigDecimal.class)))
         })
    Response fakeOuterNumberSerialize(@Parameter(description = "Input number as post body" ) BigDecimal body,@Context SecurityContext securityContext);

    @POST
    @Path("/outer/string")
    @Consumes({ "*/*" })
    @Produces({ "*/*" })
    @Operation(summary = "", description = "Test serialization of outer string types", tags={ "fake" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Output string", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class)))
         })
    Response fakeOuterStringSerialize(@Parameter(description = "Input string as post body" ) String body,@Context SecurityContext securityContext);

    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "To test \"client\" model", description = "To test \"client\" model", tags={ "fake" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class)))
         })
    Response testClientModel(@Parameter(description = "client model" ,required=true) Client body,@Context SecurityContext securityContext);

    @POST
    
    @Consumes({ "application/xml; charset=utf-8", "application/json; charset=utf-8" })
    
    @Operation(summary = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", description = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", security = {
        @SecurityRequirement(name = "http_basic_test")    }, tags={ "fake" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
                @ApiResponse(responseCode = "404", description = "User not found")
         })
    Response testEndpointParameters(@Parameter(description = "" ,required=true) FakeBody body,@Context SecurityContext securityContext);

    @GET
    
    
    
    @Operation(summary = "To test enum parameters", description = "To test enum parameters", tags={ "fake" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid request"),
                @ApiResponse(responseCode = "404", description = "Not found")
         })
    Response testEnumParameters(@Parameter(description = "Header parameter enum test (string array)" , schema=@Schema(allowableValues={ ">", "$" })
)@HeaderParam("enum_header_string_array") List<String> enumHeaderStringArray,@Parameter(description = "Header parameter enum test (string)" , schema=@Schema(allowableValues={ "_abc", "-efg", "(xyz)" })
)@HeaderParam("enum_header_string") String enumHeaderString, @QueryParam("enum_query_string_array") List<String> enumQueryStringArray, @QueryParam("enum_query_string") String enumQueryString, @QueryParam("enum_query_integer") Integer enumQueryInteger,@Context SecurityContext securityContext);

    @POST
    @Path("/enum/form")
    @Consumes({ "*/*" })
    
    @Operation(summary = "To test enum parameters", description = "To test enum parameters", tags={ "fake" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid request"),
                @ApiResponse(responseCode = "404", description = "Not found")
         })
    Response testEnumRequestBody(@Parameter(description = "" ) EnumFormBody body,@Context SecurityContext securityContext);

    @POST
    @Path("/inline-additionalProperties")
    @Consumes({ "application/json" })
    
    @Operation(summary = "test inline additionalProperties", description = "", tags={ "fake" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation")
         })
    Response testInlineAdditionalProperties(@Parameter(description = "request body" ,required=true) Map<String, String> body,@Context SecurityContext securityContext);

    @POST
    @Path("/jsonFormData")
    @Consumes({ "application/json" })
    
    @Operation(summary = "test json serialization of form data", description = "", tags={ "fake" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation")
         })
    Response testJsonFormData(@Parameter(description = "" ,required=true) FakeJsonFormDataBody body,@Context SecurityContext securityContext);

}
