package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import io.swagger.client.model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-06T09:16:58.926Z[Etc/UTC]")public class StoreApi {
  private ApiClient apiClient;

  public StoreApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StoreApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete purchase order by ID
   * For valid response try integer IDs with positive integer value.\\ \\ Negative or non-integer values will generate API errors
   * @param orderId ID of the order that needs to be deleted (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrder(Long orderId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling deleteOrder");
    }
    // create path and map variables
    String localVarPath = "/store/order/{orderId}"
      .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Returns pet inventories by status
   * Returns a map of status codes to quantities
   * @return Map&lt;String, Integer&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Integer> getInventory() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/store/inventory";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Map<String, Integer>> localVarReturnType = new GenericType<Map<String, Integer>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find purchase order by ID
   * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10.\\ \\ Other values will generated exceptions
   * @param orderId ID of pet that needs to be fetched (required)
   * @return Order
   * @throws ApiException if fails to make API call
   */
  public Order getOrderById(Long orderId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling getOrderById");
    }
    // create path and map variables
    String localVarPath = "/store/order/{orderId}"
      .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json", "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Order> localVarReturnType = new GenericType<Order>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Place an order for a pet
   * 
   * @param body order placed for purchasing the pet (required)
   * @return Order
   * @throws ApiException if fails to make API call
   */
  public Order placeOrder(Order body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling placeOrder");
    }
    // create path and map variables
    String localVarPath = "/store/order";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json", "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Order> localVarReturnType = new GenericType<Order>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
