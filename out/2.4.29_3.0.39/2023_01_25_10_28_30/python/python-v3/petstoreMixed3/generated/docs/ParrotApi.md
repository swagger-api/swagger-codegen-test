# swagger_client.ParrotApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_parrot**](ParrotApi.md#add_parrot) | **POST** /parrot | Add a new parrow to the store
[**get_parrots**](ParrotApi.md#get_parrots) | **GET** /parrot | get Parrots
[**update_parrots**](ParrotApi.md#update_parrots) | **PUT** /parrot | update parrots

# **add_parrot**
> InlineResponse2001 add_parrot(body=body)

Add a new parrow to the store

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint


# create an instance of the API class
api_instance = swagger_client.ParrotApi(swagger_client.ApiClient(configuration))
body = swagger_client.ParrotBody1() # ParrotBody1 |  (optional)

try:
    # Add a new parrow to the store
    api_response = api_instance.add_parrot(body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParrotApi->add_parrot: %s\n" % e)
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

# **get_parrots**
> list[object] get_parrots()

get Parrots

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint


# create an instance of the API class
api_instance = swagger_client.ParrotApi(swagger_client.ApiClient(configuration))

try:
    # get Parrots
    api_response = api_instance.get_parrots()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParrotApi->get_parrots: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**list[object]**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_parrots**
> InlineResponse200 update_parrots(body=body)

update parrots

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint


# create an instance of the API class
api_instance = swagger_client.ParrotApi(swagger_client.ApiClient(configuration))
body = swagger_client.ParrotBody() # ParrotBody |  (optional)

try:
    # update parrots
    api_response = api_instance.update_parrots(body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParrotApi->update_parrots: %s\n" % e)
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

