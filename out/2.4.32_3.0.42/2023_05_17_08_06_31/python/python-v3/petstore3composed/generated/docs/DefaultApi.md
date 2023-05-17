# swagger_client.DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**test_method**](DefaultApi.md#test_method) | **GET** /test | 

# **test_method**
> list[Test] test_method()



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint


# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))

try:
    api_response = api_instance.test_method()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->test_method: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Test]**](Test.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

