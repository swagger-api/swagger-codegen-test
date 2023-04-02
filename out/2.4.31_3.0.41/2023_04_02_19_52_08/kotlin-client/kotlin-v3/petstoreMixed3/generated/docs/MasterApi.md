# MasterApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**masterOperation**](MasterApi.md#masterOperation) | **GET** /master | 

<a name="masterOperation"></a>
# **masterOperation**
> kotlin.Array&lt;PartMaster&gt; masterOperation()



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MasterApi()
try {
    val result : kotlin.Array<PartMaster> = apiInstance.masterOperation()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MasterApi#masterOperation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MasterApi#masterOperation")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;PartMaster&gt;**](PartMaster.md)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

