# StoreApi

All URIs are relative to *https://raw.githubusercontent.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrder**](StoreApi.md#deleteOrder) | **DELETE** /store/order/{orderId} | Delete purchase order by ID
[**getInventory**](StoreApi.md#getInventory) | **GET** /store/inventory | Returns pet inventories by status
[**getOrderById**](StoreApi.md#getOrderById) | **GET** /store/order/{orderId} | Find purchase order by ID
[**placeOrder**](StoreApi.md#placeOrder) | **POST** /store/order | Place an order for a pet

<a name="deleteOrder"></a>
# **deleteOrder**
> deleteOrder(orderId)

Delete purchase order by ID

For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = StoreApi()
val orderId : kotlin.Long = 789 // kotlin.Long | ID of the order that needs to be deleted
try {
    apiInstance.deleteOrder(orderId)
} catch (e: ClientException) {
    println("4xx response calling StoreApi#deleteOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoreApi#deleteOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **kotlin.Long**| ID of the order that needs to be deleted |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInventory"></a>
# **getInventory**
> kotlin.collections.Map&lt;kotlin.String, kotlin.Int&gt; getInventory()

Returns pet inventories by status

Returns a map of status codes to quantities

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = StoreApi()
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.Int> = apiInstance.getInventory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoreApi#getInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoreApi#getInventory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.Int&gt;**

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
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = StoreApi()
val orderId : kotlin.Long = 789 // kotlin.Long | ID of order that needs to be fetched
try {
    val result : Order = apiInstance.getOrderById(orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoreApi#getOrderById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoreApi#getOrderById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **kotlin.Long**| ID of order that needs to be fetched |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="placeOrder"></a>
# **placeOrder**
> Order placeOrder(body)

Place an order for a pet

Place a new order in the store

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = StoreApi()
val body : Order =  // Order | 
try {
    val result : Order = apiInstance.placeOrder(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoreApi#placeOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoreApi#placeOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)|  | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="placeOrder"></a>
# **placeOrder**
> Order placeOrder(id, petId, quantity, shipDate, status, complete)

Place an order for a pet

Place a new order in the store

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = StoreApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val petId : kotlin.Long = 789 // kotlin.Long | 
val quantity : kotlin.Int = 56 // kotlin.Int | 
val shipDate : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val status : kotlin.String = status_example // kotlin.String | 
val complete : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Order = apiInstance.placeOrder(id, petId, quantity, shipDate, status, complete)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoreApi#placeOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoreApi#placeOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  | [optional]
 **petId** | **kotlin.Long**|  | [optional]
 **quantity** | **kotlin.Int**|  | [optional]
 **shipDate** | **java.time.LocalDateTime**|  | [optional]
 **status** | **kotlin.String**|  | [optional] [enum: placed, approved, delivered]
 **complete** | **kotlin.Boolean**|  | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

