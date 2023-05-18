# swagger.api.FakeApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

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

# **fakeOuterBooleanSerialize**
> OuterBoolean fakeOuterBooleanSerialize(body)



Test serialization of outer boolean types

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new bool(); // bool | Input boolean as post body

try {
    var result = api_instance.fakeOuterBooleanSerialize(body);
    print(result);
} catch (e) {
    print("Exception when calling FakeApi->fakeOuterBooleanSerialize: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**bool**](bool.md)| Input boolean as post body | [optional] 

### Return type

[**OuterBoolean**](OuterBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fakeOuterCompositeSerialize**
> OuterComposite fakeOuterCompositeSerialize(body)



Test serialization of object with outer number type

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new OuterComposite(); // OuterComposite | Input composite as post body

try {
    var result = api_instance.fakeOuterCompositeSerialize(body);
    print(result);
} catch (e) {
    print("Exception when calling FakeApi->fakeOuterCompositeSerialize: $e\n");
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fakeOuterNumberSerialize**
> OuterNumber fakeOuterNumberSerialize(body)



Test serialization of outer number types

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new double(); // double | Input number as post body

try {
    var result = api_instance.fakeOuterNumberSerialize(body);
    print(result);
} catch (e) {
    print("Exception when calling FakeApi->fakeOuterNumberSerialize: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**double**](double.md)| Input number as post body | [optional] 

### Return type

[**OuterNumber**](OuterNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fakeOuterStringSerialize**
> OuterString fakeOuterStringSerialize(body)



Test serialization of outer string types

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new String(); // String | Input string as post body

try {
    var result = api_instance.fakeOuterStringSerialize(body);
    print(result);
} catch (e) {
    print("Exception when calling FakeApi->fakeOuterStringSerialize: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Input string as post body | [optional] 

### Return type

[**OuterString**](OuterString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **testClientModel**
> Client testClientModel(body)

To test \"client\" model

To test \"client\" model

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new Client(); // Client | client model

try {
    var result = api_instance.testClientModel(body);
    print(result);
} catch (e) {
    print("Exception when calling FakeApi->testClientModel: $e\n");
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **testEndpointParameters**
> testEndpointParameters(body)

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure HTTP basic authorization: http_basic_test
//swagger.api.Configuration.username = 'YOUR_USERNAME';
//swagger.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new FakeApi();
var body = new FakeBody(); // FakeBody | 

try {
    api_instance.testEndpointParameters(body);
} catch (e) {
    print("Exception when calling FakeApi->testEndpointParameters: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FakeBody**](FakeBody.md)|  | 

### Return type

void (empty response body)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: application/xml; charset=utf-8, application/json; charset=utf-8
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **testEnumParameters**
> testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger)

To test enum parameters

To test enum parameters

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var enumHeaderStringArray = []; // List<String> | Header parameter enum test (string array)
var enumHeaderString = enumHeaderString_example; // String | Header parameter enum test (string)
var enumQueryStringArray = []; // List<String> | Query parameter enum test (string array)
var enumQueryString = enumQueryString_example; // String | Query parameter enum test (string)
var enumQueryInteger = 56; // int | Query parameter enum test (double)

try {
    api_instance.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger);
} catch (e) {
    print("Exception when calling FakeApi->testEnumParameters: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enumHeaderStringArray** | [**List&lt;String&gt;**](String.md)| Header parameter enum test (string array) | [optional] 
 **enumHeaderString** | **String**| Header parameter enum test (string) | [optional] [default to -efg]
 **enumQueryStringArray** | [**List&lt;String&gt;**](String.md)| Query parameter enum test (string array) | [optional] 
 **enumQueryString** | **String**| Query parameter enum test (string) | [optional] [default to -efg]
 **enumQueryInteger** | **int**| Query parameter enum test (double) | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **testEnumRequestBody**
> testEnumRequestBody(body)

To test enum parameters

To test enum parameters

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new EnumFormBody(); // EnumFormBody | 

try {
    api_instance.testEnumRequestBody(body);
} catch (e) {
    print("Exception when calling FakeApi->testEnumRequestBody: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnumFormBody**](EnumFormBody.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **testInlineAdditionalProperties**
> testInlineAdditionalProperties(body)

test inline additionalProperties

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new Map&lt;String, String&gt;(); // Map<String, String> | request body

try {
    api_instance.testInlineAdditionalProperties(body);
} catch (e) {
    print("Exception when calling FakeApi->testInlineAdditionalProperties: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, String&gt;**](Map.md)| request body | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **testJsonFormData**
> testJsonFormData(body)

test json serialization of form data

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new FakeJsonFormDataBody(); // FakeJsonFormDataBody | 

try {
    api_instance.testJsonFormData(body);
} catch (e) {
    print("Exception when calling FakeApi->testJsonFormData: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FakeJsonFormDataBody**](FakeJsonFormDataBody.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

