package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;

import io.swagger.client.model.Body8;
import io.swagger.client.model.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:12:24.070Z[Etc/UTC]")public interface ParrotApi extends ApiClient.Api {

  /**
   * Add a new parrow to the store
   * 
   * @param body  (optional)
   * @return Object
   */
  @RequestLine("POST /parrot")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Object addParrot(Object body);
  /**
   * get Parrots
   * 
   * @return List&lt;Object&gt;
   */
  @RequestLine("GET /parrot")
  @Headers({
      "Accept: application/json",
  })
  List<Object> getParrots();
  /**
   * update parrots
   * 
   * @param body  (optional)
   * @return InlineResponse200
   */
  @RequestLine("PUT /parrot")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  InlineResponse200 updateParrots(Body8 body);
}
