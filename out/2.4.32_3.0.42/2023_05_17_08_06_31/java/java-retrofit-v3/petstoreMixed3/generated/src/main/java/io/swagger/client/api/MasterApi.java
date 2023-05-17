package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit.Callback;
import retrofit.http.*;
import retrofit.mime.*;

import io.swagger.client.model.PartMaster;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MasterApi {
  /**
   * 
   * Sync method
   * 
   * @return List&lt;PartMaster&gt;
   */
  @GET("/master")
  List<PartMaster> masterOperation();
    

  /**
   * 
   * Async method
   * @param cb callback method
   */
  @GET("/master")
  void masterOperation(
    Callback<List<PartMaster>> cb
  );
}
