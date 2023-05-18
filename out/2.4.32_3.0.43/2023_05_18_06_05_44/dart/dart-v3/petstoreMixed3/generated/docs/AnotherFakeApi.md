# swagger.api.AnotherFakeApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testSpecialTags**](AnotherFakeApi.md#testSpecialTags) | **PATCH** /another-fake/dummy | To test special tags

# **testSpecialTags**
> Client testSpecialTags(body)

To test special tags

To test special tags

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new AnotherFakeApi();
var body = new Client(); // Client | client model

try {
    var result = api_instance.testSpecialTags(body);
    print(result);
} catch (e) {
    print("Exception when calling AnotherFakeApi->testSpecialTags: $e\n");
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

