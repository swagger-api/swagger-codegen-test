# SwaggerPetstore.ParrotApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParrot**](ParrotApi.md#addParrot) | **POST** /parrot | Add a new parrow to the store
[**getParrots**](ParrotApi.md#getParrots) | **GET** /parrot | get Parrots
[**updateParrots**](ParrotApi.md#updateParrots) | **PUT** /parrot | update parrots

<a name="addParrot"></a>
# **addParrot**
> InlineResponse2001 addParrot(opts)

Add a new parrow to the store

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;


let apiInstance = new SwaggerPetstore.ParrotApi();
let opts = { 
  'body': new SwaggerPetstore.ParrotBody1() // ParrotBody1 | 
};
apiInstance.addParrot(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

<a name="getParrots"></a>
# **getParrots**
> [Object] getParrots()

get Parrots

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;


let apiInstance = new SwaggerPetstore.ParrotApi();
apiInstance.getParrots((error, data, response) => {
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

**[Object]**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateParrots"></a>
# **updateParrots**
> InlineResponse200 updateParrots(opts)

update parrots

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;


let apiInstance = new SwaggerPetstore.ParrotApi();
let opts = { 
  'body': new SwaggerPetstore.ParrotBody() // ParrotBody | 
};
apiInstance.updateParrots(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

