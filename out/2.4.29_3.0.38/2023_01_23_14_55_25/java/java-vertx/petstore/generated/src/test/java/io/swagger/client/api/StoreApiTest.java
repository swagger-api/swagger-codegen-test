/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.Order;

import io.swagger.client.Configuration;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.runner.RunWith;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.Async;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreApi
 */
@RunWith(VertxUnitRunner.class)
@Ignore
public class StoreApiTest {

    private StoreApi api;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @BeforeClass
    public void setupApiClient() {
        JsonObject config = new JsonObject();
        Vertx vertx = rule.vertx();
        Configuration.setupDefaultApiClient(vertx, config);

        api = new StoreApiImpl();
    }
    
    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void deleteOrderTest(TestContext context) {
        Async async = context.async();
        Long orderId = null;
        api.deleteOrder(orderId, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getInventoryTest(TestContext context) {
        Async async = context.async();
        api.getInventory(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getOrderByIdTest(TestContext context) {
        Async async = context.async();
        Long orderId = null;
        api.getOrderById(orderId, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Place an order for a pet
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void placeOrderTest(TestContext context) {
        Async async = context.async();
        Order body = null;
        api.placeOrder(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
}