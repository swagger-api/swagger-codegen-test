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

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/store")
@RequestScoped

@Api(description = "the store API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2023-05-17T08:10:19.663Z")

public class StoreApi  {

  @Context SecurityContext securityContext;

  @Inject StoreApiService delegate;


    @DELETE
    @Path("/order/{orderId}")
    
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Delete purchase order by ID", notes = "For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors", response = Void.class, tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Order not found", response = Void.class) })
    public Response deleteOrder( @Min(1L)@ApiParam(value = "ID of the order that needs to be deleted",required=true) @PathParam("orderId") Long orderId) {
        return delegate.deleteOrder(orderId, securityContext);
    }

    @GET
    @Path("/inventory")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns pet inventories by status", notes = "Returns a map of status codes to quantities", response = Integer.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "Map") })
    public Response getInventory() {
        return delegate.getInventory(securityContext);
    }

    @GET
    @Path("/order/{orderId}")
    
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Find purchase order by ID", notes = "For valid response try integer IDs with value >= 1 and <= 10. Other values will generated exceptions", response = Order.class, tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Order not found", response = Void.class) })
    public Response getOrderById( @Min(1L) @Max(10L)@ApiParam(value = "ID of pet that needs to be fetched",required=true) @PathParam("orderId") Long orderId) {
        return delegate.getOrderById(orderId, securityContext);
    }

    @POST
    @Path("/order")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Place an order for a pet", notes = "", response = Order.class, tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid Order", response = Void.class) })
    public Response placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true) Order body) {
        return delegate.placeOrder(body, securityContext);
    }
}
