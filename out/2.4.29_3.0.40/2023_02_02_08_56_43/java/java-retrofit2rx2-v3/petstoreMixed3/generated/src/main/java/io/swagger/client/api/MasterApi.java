package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.PartMaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MasterApi {
  /**
   * 
   * 
   * @return Call&lt;List&lt;PartMaster&gt;&gt;
   */
  @GET("master")
  Call<List<PartMaster>> masterOperation();
    

}
