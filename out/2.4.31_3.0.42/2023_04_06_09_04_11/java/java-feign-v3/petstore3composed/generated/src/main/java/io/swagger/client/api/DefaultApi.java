package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-06T09:17:04.289Z[Etc/UTC]")public interface DefaultApi extends ApiClient.Api {

  /**
   * 
   * 
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /test")
  @Headers({
      "Accept: application/json",
  })
  List<String> testMethod();
}
