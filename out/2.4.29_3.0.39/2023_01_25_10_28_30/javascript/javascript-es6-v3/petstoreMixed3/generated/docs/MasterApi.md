# SwaggerPetstore.MasterApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**masterOperation**](MasterApi.md#masterOperation) | **GET** /master | 

<a name="masterOperation"></a>
# **masterOperation**
> [PartMaster] masterOperation()



### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;


let apiInstance = new SwaggerPetstore.MasterApi();
apiInstance.masterOperation((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[PartMaster]**](PartMaster.md)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

