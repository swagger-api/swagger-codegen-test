# FakeApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fakeOuterBooleanSerialize**](FakeApi.md#fakeOuterBooleanSerialize) | **POST** /fake/outer/boolean | 
[**fakeOuterCompositeSerialize**](FakeApi.md#fakeOuterCompositeSerialize) | **POST** /fake/outer/composite | 
[**fakeOuterNumberSerialize**](FakeApi.md#fakeOuterNumberSerialize) | **POST** /fake/outer/number | 
[**fakeOuterStringSerialize**](FakeApi.md#fakeOuterStringSerialize) | **POST** /fake/outer/string | 
[**testBodyWithQueryParams**](FakeApi.md#testBodyWithQueryParams) | **PUT** /fake/body-with-query-params | 
[**testClientModel**](FakeApi.md#testClientModel) | **PATCH** /fake | To test \&quot;client\&quot; model
[**testEndpointParameters**](FakeApi.md#testEndpointParameters) | **POST** /fake | Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
[**testEnumParameters**](FakeApi.md#testEnumParameters) | **GET** /fake | To test enum parameters
[**testInlineAdditionalProperties**](FakeApi.md#testInlineAdditionalProperties) | **POST** /fake/inline-additionalProperties | test inline additionalProperties
[**testJsonFormData**](FakeApi.md#testJsonFormData) | **GET** /fake/jsonFormData | test json serialization of form data


<a name="fakeOuterBooleanSerialize"></a>
# **fakeOuterBooleanSerialize**
> OuterBoolean fakeOuterBooleanSerialize(body)



Test serialization of outer boolean types

### Example
```java
// Import classes:
//import io.swagger.client.api.FakeApi;

FakeApi apiInstance = new FakeApi();
OuterBoolean body = new OuterBoolean(); // OuterBoolean | Input boolean as post body
try {
    OuterBoolean result = apiInstance.fakeOuterBooleanSerialize(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FakeApi#fakeOuterBooleanSerialize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OuterBoolean**](OuterBoolean.md)| Input boolean as post body | [optional]

### Return type

[**OuterBoolean**](OuterBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fakeOuterCompositeSerialize"></a>
# **fakeOuterCompositeSerialize**
> OuterComposite fakeOuterCompositeSerialize(body)



Test serialization of object with outer number type

### Example
```java
// Import classes:
//import io.swagger.client.api.FakeApi;

FakeApi apiInstance = new FakeApi();
OuterComposite body = new OuterComposite(); // OuterComposite | Input composite as post body
try {
    OuterComposite result = apiInstance.fakeOuterCompositeSerialize(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FakeApi#fakeOuterCompositeSerialize");
    e.printStackTrace();
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fakeOuterNumberSerialize"></a>
# **fakeOuterNumberSerialize**
> OuterNumber fakeOuterNumberSerialize(body)



Test serialization of outer number types

### Example
```java
// Import classes:
//import io.swagger.client.api.FakeApi;

FakeApi apiInstance = new FakeApi();
OuterNumber body = new OuterNumber(); // OuterNumber | Input number as post body
try {
    OuterNumber result = apiInstance.fakeOuterNumberSerialize(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FakeApi#fakeOuterNumberSerialize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OuterNumber**](OuterNumber.md)| Input number as post body | [optional]

### Return type

[**OuterNumber**](OuterNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fakeOuterStringSerialize"></a>
# **fakeOuterStringSerialize**
> OuterString fakeOuterStringSerialize(body)



Test serialization of outer string types

### Example
```java
// Import classes:
//import io.swagger.client.api.FakeApi;

FakeApi apiInstance = new FakeApi();
OuterString body = new OuterString(); // OuterString | Input string as post body
try {
    OuterString result = apiInstance.fakeOuterStringSerialize(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FakeApi#fakeOuterStringSerialize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OuterString**](OuterString.md)| Input string as post body | [optional]

### Return type

[**OuterString**](OuterString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="testBodyWithQueryParams"></a>
# **testBodyWithQueryParams**
> testBodyWithQueryParams(body, query)



### Example
```java
// Import classes:
//import io.swagger.client.api.FakeApi;

FakeApi apiInstance = new FakeApi();
User body = new User(); // User | 
String query = "query_example"; // String | 
try {
    apiInstance.testBodyWithQueryParams(body, query);
} catch (ApiException e) {
    System.err.println("Exception when calling FakeApi#testBodyWithQueryParams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)|  |
 **query** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="testClientModel"></a>
# **testClientModel**
> Client testClientModel(body)

To test \&quot;client\&quot; model

To test \&quot;client\&quot; model

### Example
```java
// Import classes:
//import io.swagger.client.api.FakeApi;

FakeApi apiInstance = new FakeApi();
Client body = new Client(); // Client | client model
try {
    Client result = apiInstance.testClientModel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FakeApi#testClientModel");
    e.printStackTrace();
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
> testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, callback)

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

### Example
```java
// Import classes:
//import io.swagger.client.api.FakeApi;

FakeApi apiInstance = new FakeApi();
BigDecimal number = new BigDecimal(); // BigDecimal | None
Double _double = 3.4D; // Double | None
String patternWithoutDelimiter = "patternWithoutDelimiter_example"; // String | None
byte[] _byte = B; // byte[] | None
Integer integer = 56; // Integer | None
Integer int32 = 56; // Integer | None
Long int64 = 789L; // Long | None
Float _float = 3.4F; // Float | None
String string = "string_example"; // String | None
byte[] binary = B; // byte[] | None
Date date = new Date(); // Date | None
Date dateTime = new Date(); // Date | None
String password = "password_example"; // String | None
String callback = "callback_example"; // String | None
try {
    apiInstance.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, callback);
} catch (ApiException e) {
    System.err.println("Exception when calling FakeApi#testEndpointParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **BigDecimal**| None |
 **_double** | **Double**| None |
 **patternWithoutDelimiter** | **String**| None |
 **_byte** | **byte[]**| None |
 **integer** | **Integer**| None | [optional]
 **int32** | **Integer**| None | [optional]
 **int64** | **Long**| None | [optional]
 **_float** | **Float**| None | [optional]
 **string** | **String**| None | [optional]
 **binary** | **byte[]**| None | [optional]
 **date** | **Date**| None | [optional]
 **dateTime** | **Date**| None | [optional]
 **password** | **String**| None | [optional]
 **callback** | **String**| None | [optional]

### Return type

null (empty response body)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: application/xml; charset=utf-8, application/json; charset=utf-8
 - **Accept**: application/xml; charset=utf-8, application/json; charset=utf-8

<a name="testEnumParameters"></a>
# **testEnumParameters**
> testEnumParameters(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble)

To test enum parameters

To test enum parameters

### Example
```java
// Import classes:
//import io.swagger.client.api.FakeApi;

FakeApi apiInstance = new FakeApi();
List<String> enumFormStringArray = Arrays.asList("enumFormStringArray_example"); // List<String> | Form parameter enum test (string array)
String enumFormString = "-efg"; // String | Form parameter enum test (string)
List<String> enumHeaderStringArray = Arrays.asList("enumHeaderStringArray_example"); // List<String> | Header parameter enum test (string array)
String enumHeaderString = "-efg"; // String | Header parameter enum test (string)
List<String> enumQueryStringArray = Arrays.asList("enumQueryStringArray_example"); // List<String> | Query parameter enum test (string array)
String enumQueryString = "-efg"; // String | Query parameter enum test (string)
Integer enumQueryInteger = 56; // Integer | Query parameter enum test (double)
Double enumQueryDouble = 3.4D; // Double | Query parameter enum test (double)
try {
    apiInstance.testEnumParameters(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble);
} catch (ApiException e) {
    System.err.println("Exception when calling FakeApi#testEnumParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enumFormStringArray** | [**List&lt;String&gt;**](String.md)| Form parameter enum test (string array) | [optional] [enum: >, $]
 **enumFormString** | **String**| Form parameter enum test (string) | [optional] [default to -efg] [enum: _abc, -efg, (xyz)]
 **enumHeaderStringArray** | [**List&lt;String&gt;**](String.md)| Header parameter enum test (string array) | [optional] [enum: >, $]
 **enumHeaderString** | **String**| Header parameter enum test (string) | [optional] [default to -efg] [enum: _abc, -efg, (xyz)]
 **enumQueryStringArray** | [**List&lt;String&gt;**](String.md)| Query parameter enum test (string array) | [optional] [enum: >, $]
 **enumQueryString** | **String**| Query parameter enum test (string) | [optional] [default to -efg] [enum: _abc, -efg, (xyz)]
 **enumQueryInteger** | **Integer**| Query parameter enum test (double) | [optional] [enum: 1, -2]
 **enumQueryDouble** | **Double**| Query parameter enum test (double) | [optional] [enum: 1.1, -1.2]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="testInlineAdditionalProperties"></a>
# **testInlineAdditionalProperties**
> testInlineAdditionalProperties(param)

test inline additionalProperties



### Example
```java
// Import classes:
//import io.swagger.client.api.FakeApi;

FakeApi apiInstance = new FakeApi();
Object param = null; // Object | request body
try {
    apiInstance.testInlineAdditionalProperties(param);
} catch (ApiException e) {
    System.err.println("Exception when calling FakeApi#testInlineAdditionalProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | **Object**| request body |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="testJsonFormData"></a>
# **testJsonFormData**
> testJsonFormData(param, param2)

test json serialization of form data



### Example
```java
// Import classes:
//import io.swagger.client.api.FakeApi;

FakeApi apiInstance = new FakeApi();
String param = "param_example"; // String | field1
String param2 = "param2_example"; // String | field2
try {
    apiInstance.testJsonFormData(param, param2);
} catch (ApiException e) {
    System.err.println("Exception when calling FakeApi#testJsonFormData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | **String**| field1 |
 **param2** | **String**| field2 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

