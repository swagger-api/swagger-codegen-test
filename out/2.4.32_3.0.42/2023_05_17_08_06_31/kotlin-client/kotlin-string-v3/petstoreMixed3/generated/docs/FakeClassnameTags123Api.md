# FakeClassnameTags123Api

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testClassname**](FakeClassnameTags123Api.md#testClassname) | **PATCH** /fake_classname_test | To test class name in snake case

<a name="testClassname"></a>
# **testClassname**
> Client testClassname(body)

To test class name in snake case

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FakeClassnameTags123Api()
val body : Client =  // Client | client model
try {
    val result : Client = apiInstance.testClassname(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FakeClassnameTags123Api#testClassname")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeClassnameTags123Api#testClassname")
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

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

