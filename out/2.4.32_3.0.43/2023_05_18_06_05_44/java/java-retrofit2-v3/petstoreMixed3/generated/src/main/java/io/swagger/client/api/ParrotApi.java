package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.ParrotBody;
import io.swagger.client.model.ParrotBody1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ParrotApi {
  /**
   * Add a new parrow to the store
   * 
   * @param body  (optional)
   * @return Call&lt;InlineResponse2001&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("parrot")
  Call<InlineResponse2001> addParrot(
    @retrofit2.http.Body ParrotBody1 body
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
    @retrofit2.http.Body ParrotBody body
  );

}
