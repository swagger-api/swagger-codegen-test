# AnotherFakeApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testSpecialTags**](AnotherFakeApi.md#testSpecialTags) | **PATCH** /another-fake/dummy | To test special tags

<a name="testSpecialTags"></a>
# **testSpecialTags**
> Client testSpecialTags(body)

To test special tags

To test special tags

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnotherFakeApi()
val body : Client =  // Client | client model
try {
    val result : Client = apiInstance.testSpecialTags(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnotherFakeApi#testSpecialTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnotherFakeApi#testSpecialTags")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Client**](Client.md)| client model |

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

