package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;

import io.swagger.client.model.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-02T09:13:13.760Z[Etc/UTC]")public interface AnotherFakeApi extends ApiClient.Api {

  /**
   * To test special tags
   * To test special tags
   * @param body client model (required)
   * @return Client
   */
  @RequestLine("PATCH /another-fake/dummy")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Client testSpecialTags(Client body);
}
