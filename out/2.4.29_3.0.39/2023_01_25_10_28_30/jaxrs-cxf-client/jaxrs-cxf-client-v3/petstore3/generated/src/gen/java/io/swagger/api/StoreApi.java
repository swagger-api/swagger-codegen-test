package io.swagger.api;

import java.util.Date;
import io.swagger.model.Order;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Swagger Petstore - OpenAPI 3.0
 *
 * <p>This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 */
@Path("/")
public interface StoreApi  {

    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     */
    @DELETE
    @Path("/store/order/{orderId}")
    @Operation(summary = "Delete purchase order by ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Order not found") })
    public void deleteOrder(@PathParam("orderId") Long orderId);

    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     */
    @GET
    @Path("/store/inventory")
    @Produces({ "application/json" })
    @Operation(summary = "Returns pet inventories by status", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))) })
    public Map<String, Integer> getInventory();

    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     */
    @GET
    @Path("/store/order/{orderId}")
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Find purchase order by ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Order.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Order not found") })
    public Order getOrderById(@PathParam("orderId") Long orderId);

    /**
     * Place an order for a pet
     *
     * Place a new order in the store
     *
     */
    @POST
    @Path("/store/order")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @Operation(summary = "Place an order for a pet", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Order placeOrder(Order body);

    /**
     * Place an order for a pet
     *
     * Place a new order in the store
     *
     */
    @POST
    @Path("/store/order")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @Operation(summary = "Place an order for a pet", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))),
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    public Order placeOrder(@Multipart(value = "id", required = false)  Long id, @Multipart(value = "petId", required = false)  Long petId, @Multipart(value = "quantity", required = false)  Integer quantity, @Multipart(value = "shipDate", required = false)  Date shipDate, @Multipart(value = "status", required = false)  String status, @Multipart(value = "complete", required = false)  Boolean complete);
}
