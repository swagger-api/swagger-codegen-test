package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit.Callback;
import retrofit.http.*;
import retrofit.mime.*;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.Order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StoreApi {
  /**
   * Delete purchase order by ID
   * Sync method
   * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
   * @param orderId ID of the order that needs to be deleted (required)
   * @return Void
   */
  @DELETE("/store/order/{orderId}")
  Void deleteOrder(
    @retrofit.http.Path("orderId") Long orderId
  );

  /**
   * Delete purchase order by ID
   * Async method
   * @param orderId ID of the order that needs to be deleted (required)
   * @param cb callback method
   */
  @DELETE("/store/order/{orderId}")
  void deleteOrder(
    @retrofit.http.Path("orderId") Long orderId, Callback<Void> cb
  );
  /**
   * Returns pet inventories by status
   * Sync method
   * Returns a map of status codes to quantities
   * @return Map&lt;String, Integer&gt;
   */
  @GET("/store/inventory")
  Map<String, Integer> getInventory();
    

  /**
   * Returns pet inventories by status
   * Async method
   * @param cb callback method
   */
  @GET("/store/inventory")
  void getInventory(
    Callback<Map<String, Integer>> cb
  );
  /**
   * Find purchase order by ID
   * Sync method
   * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
   * @param orderId ID of order that needs to be fetched (required)
   * @return Order
   */
  @GET("/store/order/{orderId}")
  Order getOrderById(
    @retrofit.http.Path("orderId") Long orderId
  );

  /**
   * Find purchase order by ID
   * Async method
   * @param orderId ID of order that needs to be fetched (required)
   * @param cb callback method
   */
  @GET("/store/order/{orderId}")
  void getOrderById(
    @retrofit.http.Path("orderId") Long orderId, Callback<Order> cb
  );
  /**
   * Place an order for a pet
   * Sync method
   * Place a new order in the store
   * @param id  (optional)
   * @param petId  (optional)
   * @param quantity  (optional)
   * @param shipDate  (optional)
   * @param status  (optional)
   * @param complete  (optional)
   * @return Order
   */
  @retrofit.http.FormUrlEncoded
  @POST("/store/order")
  Order placeOrder(
    @retrofit.http.Field("id") Long id, @retrofit.http.Field("petId") Long petId, @retrofit.http.Field("quantity") Integer quantity, @retrofit.http.Field("shipDate") OffsetDateTime shipDate, @retrofit.http.Field("status") String status, @retrofit.http.Field("complete") Boolean complete
  );

  /**
   * Place an order for a pet
   * Async method
   * @param id  (optional)
   * @param petId  (optional)
   * @param quantity  (optional)
   * @param shipDate  (optional)
   * @param status  (optional)
   * @param complete  (optional)
   * @param cb callback method
   */
  @retrofit.http.FormUrlEncoded
  @POST("/store/order")
  void placeOrder(
    @retrofit.http.Field("id") Long id, @retrofit.http.Field("petId") Long petId, @retrofit.http.Field("quantity") Integer quantity, @retrofit.http.Field("shipDate") OffsetDateTime shipDate, @retrofit.http.Field("status") String status, @retrofit.http.Field("complete") Boolean complete, Callback<Order> cb
  );
}
