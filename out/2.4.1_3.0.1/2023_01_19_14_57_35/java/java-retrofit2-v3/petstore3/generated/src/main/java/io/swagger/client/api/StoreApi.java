package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StoreApi {
  /**
   * Delete purchase order by ID
   * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
   * @param orderId ID of the order that needs to be deleted (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("store/order/{orderId}")
  Call<Void> deleteOrder(
            @retrofit2.http.Path("orderId") Long orderId            
  );

  /**
   * Returns pet inventories by status
   * Returns a map of status codes to quantities
   * @return Call&lt;Map&lt;String, Integer&gt;&gt;
   */
  @GET("store/inventory")
  Call<Map<String, Integer>> getInventory();
    

  /**
   * Find purchase order by ID
   * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
   * @param orderId ID of order that needs to be fetched (required)
   * @return Call&lt;Order&gt;
   */
  @GET("store/order/{orderId}")
  Call<Order> getOrderById(
            @retrofit2.http.Path("orderId") Long orderId            
  );

  /**
   * Place an order for a pet
   * Place a new order in the store
   * @param id  (optional)
   * @param petId  (optional)
   * @param quantity  (optional)
   * @param shipDate  (optional)
   * @param status  (optional)
   * @param complete  (optional)
   * @return Call&lt;Order&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("store/order")
  Call<Order> placeOrder(
                        @retrofit2.http.Field("id") Long id,                     @retrofit2.http.Field("petId") Long petId,                     @retrofit2.http.Field("quantity") Integer quantity,                     @retrofit2.http.Field("shipDate") OffsetDateTime shipDate,                     @retrofit2.http.Field("status") String status,                     @retrofit2.http.Field("complete") Boolean complete
  );

}
