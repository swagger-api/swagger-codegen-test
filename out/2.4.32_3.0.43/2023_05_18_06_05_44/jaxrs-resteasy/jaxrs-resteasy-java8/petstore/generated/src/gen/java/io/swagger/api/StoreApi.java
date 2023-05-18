package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.StoreApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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


@io.swagger.annotations.Api(description = "the store API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2023-05-18T06:08:39.900Z")
public class StoreApi  {

    @Inject StoreApiService service;

    @DELETE
    @Path("/order/{orderId}")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Delete purchase order by ID", notes = "For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors", response = Void.class, tags={ "store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Order not found", response = Void.class) })
    public Response deleteOrder( @Min(1L) @PathParam("orderId") Long orderId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOrder(orderId,securityContext);
    }
    @GET
    @Path("/inventory")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns pet inventories by status", notes = "Returns a map of status codes to quantities", response = Integer.class, responseContainer = "Map", authorizations = {
        @io.swagger.annotations.Authorization(value = "api_key")
    }, tags={ "store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "Map") })
    public Response getInventory(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getInventory(securityContext);
    }
    @GET
    @Path("/order/{orderId}")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Find purchase order by ID", notes = "For valid response try integer IDs with value >= 1 and <= 10. Other values will generated exceptions", response = Order.class, tags={ "store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Order not found", response = Void.class) })
    public Response getOrderById( @Min(1L) @Max(10L) @PathParam("orderId") Long orderId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOrderById(orderId,securityContext);
    }
    @POST
    @Path("/order")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Place an order for a pet", notes = "", response = Order.class, tags={ "store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid Order", response = Void.class) })
    public Response placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true) Order body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.placeOrder(body,securityContext);
    }
}
