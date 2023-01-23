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
[**testBodyWithQueryParams**](FakeApi.md#testBodyWithQueryParams) | **PUT** /fake/body-with-query-params | 
[**testClientModel**](FakeApi.md#testClientModel) | **PATCH** /fake | To test \&quot;client\&quot; model
[**testEndpointParameters**](FakeApi.md#testEndpointParameters) | **POST** /fake | Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
[**testEnumParameters**](FakeApi.md#testEnumParameters) | **GET** /fake | To test enum parameters
[**testInlineAdditionalProperties**](FakeApi.md#testInlineAdditionalProperties) | **POST** /fake/inline-additionalProperties | test inline additionalProperties
[**testJsonFormData**](FakeApi.md#testJsonFormData) | **GET** /fake/jsonFormData | test json serialization of form data


# **fakeOuterBooleanSerialize**
> OuterBoolean fakeOuterBooleanSerialize(body)



Test serialization of outer boolean types

### Example 
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new OuterBoolean(); // OuterBoolean | Input boolean as post body

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
 **body** | [**OuterBoolean**](OuterBoolean.md)| Input boolean as post body | [optional] 

### Return type

[**OuterBoolean**](OuterBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fakeOuterNumberSerialize**
> OuterNumber fakeOuterNumberSerialize(body)



Test serialization of outer number types

### Example 
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new OuterNumber(); // OuterNumber | Input number as post body

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
 **body** | [**OuterNumber**](OuterNumber.md)| Input number as post body | [optional] 

### Return type

[**OuterNumber**](OuterNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fakeOuterStringSerialize**
> OuterString fakeOuterStringSerialize(body)



Test serialization of outer string types

### Example 
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new OuterString(); // OuterString | Input string as post body

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
 **body** | [**OuterString**](OuterString.md)| Input string as post body | [optional] 

### Return type

[**OuterString**](OuterString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **testBodyWithQueryParams**
> testBodyWithQueryParams(body, query)



### Example 
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var body = new User(); // User | 
var query = query_example; // String | 

try { 
    api_instance.testBodyWithQueryParams(body, query);
} catch (e) {
    print("Exception when calling FakeApi->testBodyWithQueryParams: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)|  | 
 **query** | **String**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
> testEndpointParameters(number, double, patternWithoutDelimiter, byte, integer, int32, int64, float, string, binary, date, dateTime, password, callback)

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure HTTP basic authorization: http_basic_test
//swagger.api.Configuration.username = 'YOUR_USERNAME';
//swagger.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new FakeApi();
var number = 8.14; // num | None
var double = 1.2; // double | None
var patternWithoutDelimiter = patternWithoutDelimiter_example; // String | None
var byte = B; // String | None
var integer = 56; // int | None
var int32 = 56; // int | None
var int64 = 789; // int | None
var float = 3.4; // double | None
var string = string_example; // String | None
var binary = B; // String | None
var date = 2013-10-20; // DateTime | None
var dateTime = 2013-10-20T19:20:30+01:00; // DateTime | None
var password = password_example; // String | None
var callback = callback_example; // String | None

try { 
    api_instance.testEndpointParameters(number, double, patternWithoutDelimiter, byte, integer, int32, int64, float, string, binary, date, dateTime, password, callback);
} catch (e) {
    print("Exception when calling FakeApi->testEndpointParameters: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **num**| None | 
 **double** | **double**| None | 
 **patternWithoutDelimiter** | **String**| None | 
 **byte** | **String**| None | 
 **integer** | **int**| None | [optional] 
 **int32** | **int**| None | [optional] 
 **int64** | **int**| None | [optional] 
 **float** | **double**| None | [optional] 
 **string** | **String**| None | [optional] 
 **binary** | **String**| None | [optional] 
 **date** | **DateTime**| None | [optional] 
 **dateTime** | **DateTime**| None | [optional] 
 **password** | **String**| None | [optional] 
 **callback** | **String**| None | [optional] 

### Return type

void (empty response body)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: application/xml; charset=utf-8, application/json; charset=utf-8
 - **Accept**: application/xml; charset=utf-8, application/json; charset=utf-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **testEnumParameters**
> testEnumParameters(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble)

To test enum parameters

To test enum parameters

### Example 
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var enumFormStringArray = []; // List<String> | Form parameter enum test (string array)
var enumFormString = enumFormString_example; // String | Form parameter enum test (string)
var enumHeaderStringArray = []; // List<String> | Header parameter enum test (string array)
var enumHeaderString = enumHeaderString_example; // String | Header parameter enum test (string)
var enumQueryStringArray = []; // List<String> | Query parameter enum test (string array)
var enumQueryString = enumQueryString_example; // String | Query parameter enum test (string)
var enumQueryInteger = 56; // int | Query parameter enum test (double)
var enumQueryDouble = 1.2; // double | Query parameter enum test (double)

try { 
    api_instance.testEnumParameters(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble);
} catch (e) {
    print("Exception when calling FakeApi->testEnumParameters: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enumFormStringArray** | [**List&lt;String&gt;**](String.md)| Form parameter enum test (string array) | [optional] 
 **enumFormString** | **String**| Form parameter enum test (string) | [optional] [default to -efg]
 **enumHeaderStringArray** | [**List&lt;String&gt;**](String.md)| Header parameter enum test (string array) | [optional] 
 **enumHeaderString** | **String**| Header parameter enum test (string) | [optional] [default to -efg]
 **enumQueryStringArray** | [**List&lt;String&gt;**](String.md)| Query parameter enum test (string array) | [optional] 
 **enumQueryString** | **String**| Query parameter enum test (string) | [optional] [default to -efg]
 **enumQueryInteger** | **int**| Query parameter enum test (double) | [optional] 
 **enumQueryDouble** | **double**| Query parameter enum test (double) | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **testInlineAdditionalProperties**
> testInlineAdditionalProperties(param)

test inline additionalProperties



### Example 
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var param = new Object(); // Object | request body

try { 
    api_instance.testInlineAdditionalProperties(param);
} catch (e) {
    print("Exception when calling FakeApi->testInlineAdditionalProperties: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | [**Object**](Object.md)| request body | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **testJsonFormData**
> testJsonFormData(param, param2)

test json serialization of form data



### Example 
```dart
import 'package:swagger/api.dart';

var api_instance = new FakeApi();
var param = param_example; // String | field1
var param2 = param2_example; // String | field2

try { 
    api_instance.testJsonFormData(param, param2);
} catch (e) {
    print("Exception when calling FakeApi->testJsonFormData: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | **String**| field1 | 
 **param2** | **String**| field2 | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

