# swagger.api.MasterApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**masterOperation**](MasterApi.md#masterOperation) | **GET** /master | 

# **masterOperation**
> List<PartMaster> masterOperation()



### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new MasterApi();

try {
    var result = api_instance.masterOperation();
    print(result);
} catch (e) {
    print("Exception when calling MasterApi->masterOperation: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<PartMaster>**](PartMaster.md)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

