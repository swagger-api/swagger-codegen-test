# swagger.api.FakeClassnameTags123Api

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testClassname**](FakeClassnameTags123Api.md#testClassname) | **Patch** /fake_classname_test | To test class name in snake case


# **testClassname**
> Client testClassname(body)

To test class name in snake case

To test class name in snake case

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: api_key_query
//swagger.api.Configuration.apiKey{'api_key_query'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'api_key_query'} = "Bearer";

var api_instance = new FakeClassnameTags123Api();
var body = new Client(); // Client | client model

try { 
    var result = api_instance.testClassname(body);
    print(result);
} catch (e) {
    print("Exception when calling FakeClassnameTags123Api->testClassname: $e\n");
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

