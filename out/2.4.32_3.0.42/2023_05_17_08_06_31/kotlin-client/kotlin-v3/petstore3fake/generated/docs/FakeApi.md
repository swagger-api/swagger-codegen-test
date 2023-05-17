# FakeApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fakeOuterBooleanSerialize**](FakeApi.md#fakeOuterBooleanSerialize) | **POST** /fake/outer/boolean | 
[**fakeOuterCompositeSerialize**](FakeApi.md#fakeOuterCompositeSerialize) | **POST** /fake/outer/composite | 
[**fakeOuterNumberSerialize**](FakeApi.md#fakeOuterNumberSerialize) | **POST** /fake/outer/number | 
[**fakeOuterStringSerialize**](FakeApi.md#fakeOuterStringSerialize) | **POST** /fake/outer/string | 
[**testClientModel**](FakeApi.md#testClientModel) | **PATCH** /fake | To test \&quot;client\&quot; model
[**testEndpointParameters**](FakeApi.md#testEndpointParameters) | **POST** /fake | Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
[**testEnumParameters**](FakeApi.md#testEnumParameters) | **GET** /fake | To test enum parameters
[**testEnumRequestBody**](FakeApi.md#testEnumRequestBody) | **POST** /fake/enum/form | To test enum parameters
[**testInlineAdditionalProperties**](FakeApi.md#testInlineAdditionalProperties) | **POST** /fake/inline-additionalProperties | test inline additionalProperties
[**testJsonFormData**](FakeApi.md#testJsonFormData) | **POST** /fake/jsonFormData | test json serialization of form data

<a name="fakeOuterBooleanSerialize"></a>
# **fakeOuterBooleanSerialize**
> OuterBoolean fakeOuterBooleanSerialize(body)



Test serialization of outer boolean types

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FakeApi()
val body : kotlin.Boolean =  // kotlin.Boolean | Input boolean as post body
try {
    val result : OuterBoolean = apiInstance.fakeOuterBooleanSerialize(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#fakeOuterBooleanSerialize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#fakeOuterBooleanSerialize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Boolean**](kotlin.Boolean.md)| Input boolean as post body | [optional]

### Return type

[**OuterBoolean**](OuterBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="fakeOuterCompositeSerialize"></a>
# **fakeOuterCompositeSerialize**
> OuterComposite fakeOuterCompositeSerialize(body)



Test serialization of object with outer number type

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FakeApi()
val body : OuterComposite =  // OuterComposite | Input composite as post body
try {
    val result : OuterComposite = apiInstance.fakeOuterCompositeSerialize(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#fakeOuterCompositeSerialize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#fakeOuterCompositeSerialize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OuterComposite**](OuterComposite.md)| Input composite as post body | [optional]

### Return type

[**OuterComposite**](OuterComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="fakeOuterNumberSerialize"></a>
# **fakeOuterNumberSerialize**
> OuterNumber fakeOuterNumberSerialize(body)



Test serialization of outer number types

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FakeApi()
val body : java.math.BigDecimal =  // java.math.BigDecimal | Input number as post body
try {
    val result : OuterNumber = apiInstance.fakeOuterNumberSerialize(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#fakeOuterNumberSerialize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#fakeOuterNumberSerialize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**java.math.BigDecimal**](java.math.BigDecimal.md)| Input number as post body | [optional]

### Return type

[**OuterNumber**](OuterNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="fakeOuterStringSerialize"></a>
# **fakeOuterStringSerialize**
> OuterString fakeOuterStringSerialize(body)



Test serialization of outer string types

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FakeApi()
val body : kotlin.String =  // kotlin.String | Input string as post body
try {
    val result : OuterString = apiInstance.fakeOuterStringSerialize(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#fakeOuterStringSerialize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#fakeOuterStringSerialize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.String**](kotlin.String.md)| Input string as post body | [optional]

### Return type

[**OuterString**](OuterString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="testClientModel"></a>
# **testClientModel**
> Client testClientModel(body)

To test \&quot;client\&quot; model

To test \&quot;client\&quot; model

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FakeApi()
val body : Client =  // Client | client model
try {
    val result : Client = apiInstance.testClientModel(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testClientModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testClientModel")
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

<a name="testEndpointParameters"></a>
# **testEndpointParameters**
> testEndpointParameters(body)

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FakeApi()
val body : FakeBody =  // FakeBody | 
try {
    apiInstance.testEndpointParameters(body)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testEndpointParameters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testEndpointParameters")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FakeBody**](FakeBody.md)|  |

### Return type

null (empty response body)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: application/xml; charset=utf-8, application/json; charset=utf-8
 - **Accept**: Not defined

<a name="testEnumParameters"></a>
# **testEnumParameters**
> testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger)

To test enum parameters

To test enum parameters

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FakeApi()
val enumHeaderStringArray : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Header parameter enum test (string array)
val enumHeaderString : kotlin.String = enumHeaderString_example // kotlin.String | Header parameter enum test (string)
val enumQueryStringArray : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Query parameter enum test (string array)
val enumQueryString : kotlin.String = enumQueryString_example // kotlin.String | Query parameter enum test (string)
val enumQueryInteger : kotlin.Int = 56 // kotlin.Int | Query parameter enum test (double)
try {
    apiInstance.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testEnumParameters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testEnumParameters")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enumHeaderStringArray** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Header parameter enum test (string array) | [optional] [enum: >, $]
 **enumHeaderString** | **kotlin.String**| Header parameter enum test (string) | [optional] [default to -efg] [enum: _abc, -efg, (xyz)]
 **enumQueryStringArray** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Query parameter enum test (string array) | [optional] [enum: >, $]
 **enumQueryString** | **kotlin.String**| Query parameter enum test (string) | [optional] [default to -efg] [enum: _abc, -efg, (xyz)]
 **enumQueryInteger** | **kotlin.Int**| Query parameter enum test (double) | [optional] [enum: 1, -2]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="testEnumRequestBody"></a>
# **testEnumRequestBody**
> testEnumRequestBody(body)

To test enum parameters

To test enum parameters

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FakeApi()
val body : EnumFormBody =  // EnumFormBody | 
try {
    apiInstance.testEnumRequestBody(body)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testEnumRequestBody")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testEnumRequestBody")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnumFormBody**](EnumFormBody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="testInlineAdditionalProperties"></a>
# **testInlineAdditionalProperties**
> testInlineAdditionalProperties(body)

test inline additionalProperties

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FakeApi()
val body : kotlin.collections.Map<kotlin.String, kotlin.String> =  // kotlin.collections.Map<kotlin.String, kotlin.String> | request body
try {
    apiInstance.testInlineAdditionalProperties(body)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testInlineAdditionalProperties")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testInlineAdditionalProperties")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](kotlin.collections.Map.md)| request body |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="testJsonFormData"></a>
# **testJsonFormData**
> testJsonFormData(body)

test json serialization of form data

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FakeApi()
val body : FakeJsonFormDataBody =  // FakeJsonFormDataBody | 
try {
    apiInstance.testJsonFormData(body)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testJsonFormData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testJsonFormData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FakeJsonFormDataBody**](FakeJsonFormDataBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

