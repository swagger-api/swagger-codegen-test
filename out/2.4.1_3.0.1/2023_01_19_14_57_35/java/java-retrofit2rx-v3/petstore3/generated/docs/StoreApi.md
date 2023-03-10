# StoreApi

All URIs are relative to *https://raw.githubusercontent.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrder**](StoreApi.md#deleteOrder) | **DELETE** store/order/{orderId} | Delete purchase order by ID
[**getInventory**](StoreApi.md#getInventory) | **GET** store/inventory | Returns pet inventories by status
[**getOrderById**](StoreApi.md#getOrderById) | **GET** store/order/{orderId} | Find purchase order by ID
[**placeOrder**](StoreApi.md#placeOrder) | **POST** store/order | Place an order for a pet

<a name="deleteOrder"></a>
# **deleteOrder**
> Void deleteOrder(orderId)

Delete purchase order by ID

For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreApi;


StoreApi apiInstance = new StoreApi();
Long orderId = 789L; // Long | ID of the order that needs to be deleted
try {
    Void result = apiInstance.deleteOrder(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#deleteOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| ID of the order that needs to be deleted |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInventory"></a>
# **getInventory**
> Map&lt;String, Integer&gt; getInventory()

Returns pet inventories by status

Returns a map of status codes to quantities

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StoreApi apiInstance = new StoreApi();
try {
    Map<String, Integer> result = apiInstance.getInventory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getInventory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, Integer&gt;**](Map.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderById"></a>
# **getOrderById**
> Order getOrderById(orderId)

Find purchase order by ID

For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreApi;


StoreApi apiInstance = new StoreApi();
Long orderId = 789L; // Long | ID of order that needs to be fetched
try {
    Order result = apiInstance.getOrderById(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| ID of order that needs to be fetched |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="placeOrder"></a>
# **placeOrder**
> Order placeOrder(id, petId, quantity, shipDate, status, complete)

Place an order for a pet

Place a new order in the store

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreApi;


StoreApi apiInstance = new StoreApi();
Long id = 789L; // Long | 
Long petId = 789L; // Long | 
Integer quantity = 56; // Integer | 
OffsetDateTime shipDate = new OffsetDateTime(); // OffsetDateTime | 
String status = "status_example"; // String | 
Boolean complete = true; // Boolean | 
try {
    Order result = apiInstance.placeOrder(id, petId, quantity, shipDate, status, complete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#placeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  | [optional]
 **petId** | **Long**|  | [optional]
 **quantity** | **Integer**|  | [optional]
 **shipDate** | **OffsetDateTime**|  | [optional]
 **status** | **String**|  | [optional] [enum: placed, approved, delivered]
 **complete** | **Boolean**|  | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

