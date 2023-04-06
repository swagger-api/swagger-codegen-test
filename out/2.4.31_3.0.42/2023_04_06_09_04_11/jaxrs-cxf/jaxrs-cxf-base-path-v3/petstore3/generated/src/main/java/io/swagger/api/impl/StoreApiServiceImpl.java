package io.swagger.api.impl;

import io.swagger.api.*;
import java.util.Date;
import java.util.Map;
import io.swagger.model.Order;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Swagger Petstore - OpenAPI 3.0
 *
 * <p>This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 */
public class StoreApiServiceImpl implements StoreApi {
    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     */
    public void deleteOrder(Long orderId) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     */
    public Map<String, Integer> getInventory() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     */
    public Order getOrderById(Long orderId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Place an order for a pet
     *
     * Place a new order in the store
     *
     */
    public Order placeOrder(Order body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Place an order for a pet
     *
     * Place a new order in the store
     *
     */
    public Order placeOrder(Long id, Long petId, Integer quantity, Date shipDate, String status, Boolean complete) {
        // TODO: Implement...
        
        return null;
    }
    
}

