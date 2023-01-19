package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Body8;
import io.swagger.client.model.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ParrotApi {
  /**
   * Add a new parrow to the store
   * 
   * @param body  (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("parrot")
  Call<Object> addParrot(
                    @retrofit2.http.Body Object body    
  );

  /**
   * get Parrots
   * 
   * @return Call&lt;List&lt;Object&gt;&gt;
   */
  @GET("parrot")
  Call<List<Object>> getParrots();
    

  /**
   * update parrots
   * 
   * @param body  (optional)
   * @return Call&lt;InlineResponse200&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("parrot")
  Call<InlineResponse200> updateParrots(
                    @retrofit2.http.Body Body8 body    
  );

}
