# swagger.api.ParrotApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParrot**](ParrotApi.md#addParrot) | **POST** /parrot | Add a new parrow to the store
[**getParrots**](ParrotApi.md#getParrots) | **GET** /parrot | get Parrots
[**updateParrots**](ParrotApi.md#updateParrots) | **PUT** /parrot | update parrots

# **addParrot**
> InlineResponse2001 addParrot(body)

Add a new parrow to the store

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new ParrotApi();
var body = new ParrotBody1(); // ParrotBody1 | 

try {
    var result = api_instance.addParrot(body);
    print(result);
} catch (e) {
    print("Exception when calling ParrotApi->addParrot: $e\n");
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getParrots**
> List<Object> getParrots()

get Parrots

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new ParrotApi();

try {
    var result = api_instance.getParrots();
    print(result);
} catch (e) {
    print("Exception when calling ParrotApi->getParrots: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Object>**](Object.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateParrots**
> InlineResponse200 updateParrots(body)

update parrots

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new ParrotApi();
var body = new ParrotBody(); // ParrotBody | 

try {
    var result = api_instance.updateParrots(body);
    print(result);
} catch (e) {
    print("Exception when calling ParrotApi->updateParrots: $e\n");
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

