# swagger_client.MasterApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**master_operation**](MasterApi.md#master_operation) | **GET** /master | 

# **master_operation**
> list[PartMaster] master_operation()



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint


# create an instance of the API class
api_instance = swagger_client.MasterApi(swagger_client.ApiClient(configuration))

try:
    api_response = api_instance.master_operation()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MasterApi->master_operation: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[PartMaster]**](PartMaster.md)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

