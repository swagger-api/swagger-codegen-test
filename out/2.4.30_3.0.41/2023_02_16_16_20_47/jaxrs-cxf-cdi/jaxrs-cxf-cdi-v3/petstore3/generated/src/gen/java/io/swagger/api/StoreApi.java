package io.swagger.api;

import java.util.Map;
import io.swagger.model.Order;
import io.swagger.api.StoreApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/store")
@RequestScoped




@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-02-16T16:37:45.294Z[Etc/UTC]")
public class StoreApi  {

  @Context SecurityContext securityContext;

  @Inject StoreApiService delegate;


    @DELETE
    @Path("/order/{orderId}")
    
    
    @Operation(summary = "Delete purchase order by ID", description = "For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Order not found") })
    public Response deleteOrder(
@Parameter(description = "ID of the order that needs to be deleted",required=true) @PathParam("orderId") Long orderId
) {
        return delegate.deleteOrder(orderId, securityContext);
    }

    @GET
    @Path("/inventory")
    
    @Produces({ "application/json" })
    @Operation(summary = "Returns pet inventories by status", description = "Returns a map of status codes to quantities", security = {
        @SecurityRequirement(name = "api_key")    }, tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))) })
    public Response getInventory() {
        return delegate.getInventory(securityContext);
    }

    @GET
    @Path("/order/{orderId}")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Find purchase order by ID", description = "For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Order.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Order not found") })
    public Response getOrderById(
@Parameter(description = "ID of order that needs to be fetched",required=true) @PathParam("orderId") Long orderId
) {
        return delegate.getOrderById(orderId, securityContext);
    }

    @POST
    @Path("/order")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @Operation(summary = "Place an order for a pet", description = "Place a new order in the store", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response placeOrder(
@Parameter(description = "" ) Order body
) {
        return delegate.placeOrder(body, securityContext);
    }

    @POST
    @Path("/order")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @Operation(summary = "Place an order for a pet", description = "Place a new order in the store", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response placeOrder(@Multipart(value = "id", required = false)  Long id, @Multipart(value = "petId", required = false)  Long petId, @Multipart(value = "quantity", required = false)  Integer quantity, @Multipart(value = "shipDate", required = false)  java.util.Date shipDate, @Multipart(value = "status", required = false)  String status, @Multipart(value = "complete", required = false)  Boolean complete) {
        return delegate.placeOrder(id, petId, quantity, shipDate, status, complete, securityContext);
    }
}
