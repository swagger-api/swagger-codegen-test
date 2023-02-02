package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;

import java.time.OffsetDateTime;
import io.swagger.client.model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-02T09:08:00.403Z[Etc/UTC]")public interface StoreApi extends ApiClient.Api {

  /**
   * Delete purchase order by ID
   * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
   * @param orderId ID of the order that needs to be deleted (required)
   */
  @RequestLine("DELETE /store/order/{orderId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteOrder(@Param("orderId") Long orderId);
  /**
   * Returns pet inventories by status
   * Returns a map of status codes to quantities
   * @return Map&lt;String, Integer&gt;
   */
  @RequestLine("GET /store/inventory")
  @Headers({
      "Accept: application/json",
  })
  Map<String, Integer> getInventory();
  /**
   * Find purchase order by ID
   * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
   * @param orderId ID of order that needs to be fetched (required)
   * @return Order
   */
  @RequestLine("GET /store/order/{orderId}")
  @Headers({
      "Accept: application/json",
  })
  Order getOrderById(@Param("orderId") Long orderId);
  /**
   * Place an order for a pet
   * Place a new order in the store
   * @param body  (optional)
   * @return Order
   */
  @RequestLine("POST /store/order")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Order placeOrder(Order body);
  /**
   * Place an order for a pet
   * Place a new order in the store
   * @param id  (optional)
   * @param petId  (optional)
   * @param quantity  (optional)
   * @param shipDate  (optional)
   * @param status  (optional)
   * @param complete  (optional)
   * @return Order
   */
  @RequestLine("POST /store/order")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Order placeOrder(@Param("id") Long id, @Param("petId") Long petId, @Param("quantity") Integer quantity, @Param("shipDate") OffsetDateTime shipDate, @Param("status") String status, @Param("complete") Boolean complete);
}
