# ParrotApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParrot**](ParrotApi.md#addParrot) | **POST** /parrot | Add a new parrow to the store
[**getParrots**](ParrotApi.md#getParrots) | **GET** /parrot | get Parrots
[**updateParrots**](ParrotApi.md#updateParrots) | **PUT** /parrot | update parrots

<a name="addParrot"></a>
# **addParrot**
> InlineResponse2001 addParrot(body)

Add a new parrow to the store

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ParrotApi()
val body : ParrotBody1 =  // ParrotBody1 | 
try {
    val result : InlineResponse2001 = apiInstance.addParrot(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParrotApi#addParrot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParrotApi#addParrot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParrotBody1**](ParrotBody1.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getParrots"></a>
# **getParrots**
> kotlin.Array&lt;kotlin.Any&gt; getParrots()

get Parrots

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ParrotApi()
try {
    val result : kotlin.Array<kotlin.Any> = apiInstance.getParrots()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParrotApi#getParrots")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParrotApi#getParrots")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.Any&gt;**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateParrots"></a>
# **updateParrots**
> InlineResponse200 updateParrots(body)

update parrots

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ParrotApi()
val body : ParrotBody =  // ParrotBody | 
try {
    val result : InlineResponse200 = apiInstance.updateParrots(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParrotApi#updateParrots")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParrotApi#updateParrots")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParrotBody**](ParrotBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

