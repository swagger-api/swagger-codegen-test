package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit.Callback;
import retrofit.http.*;
import retrofit.mime.*;

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
   * Sync method
   * 
   * @param body  (optional)
   * @return InlineResponse2001
   */
  @POST("/parrot")
  InlineResponse2001 addParrot(
    @retrofit.http.Body ParrotBody1 body
  );

  /**
   * Add a new parrow to the store
   * Async method
   * @param body  (optional)
   * @param cb callback method
   */
  @POST("/parrot")
  void addParrot(
    @retrofit.http.Body ParrotBody1 body, Callback<InlineResponse2001> cb
  );
  /**
   * get Parrots
   * Sync method
   * 
   * @return List&lt;Object&gt;
   */
  @GET("/parrot")
  List<Object> getParrots();
    

  /**
   * get Parrots
   * Async method
   * @param cb callback method
   */
  @GET("/parrot")
  void getParrots(
    Callback<List<Object>> cb
  );
  /**
   * update parrots
   * Sync method
   * 
   * @param body  (optional)
   * @return InlineResponse200
   */
  @PUT("/parrot")
  InlineResponse200 updateParrots(
    @retrofit.http.Body ParrotBody body
  );

  /**
   * update parrots
   * Async method
   * @param body  (optional)
   * @param cb callback method
   */
  @PUT("/parrot")
  void updateParrots(
    @retrofit.http.Body ParrotBody body, Callback<InlineResponse200> cb
  );
}
