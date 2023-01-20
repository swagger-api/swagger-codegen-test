package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.StoreApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Date;
import java.util.Map;
import io.swagger.model.Order;

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
@Path("/store")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-20T08:10:25.883Z[Etc/UTC]")public class StoreApi  {

    @Inject StoreApiService service;

    @DELETE
    @Path("/order/{orderId}")
    
    
    @Operation(summary = "Delete purchase order by ID", description = "For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Order not found") })
    public Response deleteOrder( @PathParam("orderId") Long orderId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOrder(orderId,securityContext);
    }
    @GET
    @Path("/inventory")
    
    @Produces({ "application/json" })
    @Operation(summary = "Returns pet inventories by status", description = "Returns a map of status codes to quantities", security = {
        @SecurityRequirement(name = "api_key")
    }, tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))) })
    public Response getInventory(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getInventory(securityContext);
    }
    @GET
    @Path("/order/{orderId}")
    
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Find purchase order by ID", description = "For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Order.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Order not found") })
    public Response getOrderById( @PathParam("orderId") Long orderId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOrderById(orderId,securityContext);
    }
    @POST
    @Path("/order")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @Operation(summary = "Place an order for a pet", description = "Place a new order in the store", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response placeOrder(@Parameter(description = "" ) Order body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.placeOrder(body,securityContext);
    }
    @POST
    @Path("/order")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @Operation(summary = "Place an order for a pet", description = "Place a new order in the store", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Response placeOrder(@Parameter(description = "")@FormParam("id")  Long id,@Parameter(description = "")@FormParam("petId")  Long petId,@Parameter(description = "")@FormParam("quantity")  Integer quantity,@Parameter(description = "")@FormParam("shipDate")  Date shipDate,@Parameter(description = "", schema=@Schema(allowableValues={ "placed", "approved", "delivered" })
)@FormParam("status")  String status,@Parameter(description = "")@FormParam("complete")  Boolean complete,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.placeOrder(id,petId,quantity,shipDate,status,complete,securityContext);
    }
}
