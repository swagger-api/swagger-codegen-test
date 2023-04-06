# SwaggerPetstore.DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testMethod**](DefaultApi.md#testMethod) | **GET** /test | 

<a name="testMethod"></a>
# **testMethod**
> [Test] testMethod()



### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;


let apiInstance = new SwaggerPetstore.DefaultApi();
apiInstance.testMethod((error, data, response) => {
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

[**[Test]**](Test.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

