package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;

import io.swagger.client.model.PartMaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-02T09:13:13.760Z[Etc/UTC]")public interface MasterApi extends ApiClient.Api {

  /**
   * 
   * 
   * @return List&lt;PartMaster&gt;
   */
  @RequestLine("GET /master")
  @Headers({
      "Accept: application/json",
  })
  List<PartMaster> masterOperation();
}
