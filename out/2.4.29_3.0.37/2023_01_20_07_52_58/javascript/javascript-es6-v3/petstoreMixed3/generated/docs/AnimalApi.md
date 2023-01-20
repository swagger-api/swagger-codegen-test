# SwaggerPetstore.AnimalApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAnimal**](AnimalApi.md#addAnimal) | **POST** /animal | Add a new animal to the store
[**deleteAnimal**](AnimalApi.md#deleteAnimal) | **DELETE** /animal/{animalId} | Deletes a animal
[**getAnimalById**](AnimalApi.md#getAnimalById) | **GET** /animal/{animalId} | Find animal by ID
[**updateAnimal**](AnimalApi.md#updateAnimal) | **PUT** /animal | Update an existing animal
[**updateAnimalWithForm**](AnimalApi.md#updateAnimalWithForm) | **POST** /animal/{animalId} | Updates a animal

<a name="addAnimal"></a>
# **addAnimal**
> addAnimal(body)

Add a new animal to the store

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure API key authorization: api_key_query
let api_key_query = defaultClient.authentications['api_key_query'];
api_key_query.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_query.apiKeyPrefix = 'Token';

let apiInstance = new SwaggerPetstore.AnimalApi();
let body = new SwaggerPetstore.Animal(); // Animal | Animal object that needs to be added to the store

apiInstance.addAnimal(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Animal**](Animal.md)| Animal object that needs to be added to the store | 

### Return type

null (empty response body)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="deleteAnimal"></a>
# **deleteAnimal**
> deleteAnimal(animalId, opts)

Deletes a animal

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure API key authorization: api_key_query
let api_key_query = defaultClient.authentications['api_key_query'];
api_key_query.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_query.apiKeyPrefix = 'Token';

let apiInstance = new SwaggerPetstore.AnimalApi();
let animalId = 789; // Number | Animal id to delete
let opts = { 
  'apiKey': "apiKey_example" // String | 
};
apiInstance.deleteAnimal(animalId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animalId** | **Number**| Animal id to delete | 
 **apiKey** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAnimalById"></a>
# **getAnimalById**
> Animal getAnimalById(animalId)

Find animal by ID

Returns a single animal

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure API key authorization: api_key_query
let api_key_query = defaultClient.authentications['api_key_query'];
api_key_query.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_query.apiKeyPrefix = 'Token';

let apiInstance = new SwaggerPetstore.AnimalApi();
let animalId = 789; // Number | ID of pet to return

apiInstance.getAnimalById(animalId, (error, data, response) => {
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
 **animalId** | **Number**| ID of pet to return | 

### Return type

[**Animal**](Animal.md)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateAnimal"></a>
# **updateAnimal**
> updateAnimal(body)

Update an existing animal

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure API key authorization: api_key_query
let api_key_query = defaultClient.authentications['api_key_query'];
api_key_query.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_query.apiKeyPrefix = 'Token';

let apiInstance = new SwaggerPetstore.AnimalApi();
let body = new SwaggerPetstore.Animal(); // Animal | Animal object that needs to be added.

apiInstance.updateAnimal(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Animal**](Animal.md)| Animal object that needs to be added. | 

### Return type

null (empty response body)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="updateAnimalWithForm"></a>
# **updateAnimalWithForm**
> updateAnimalWithForm(animalId, opts)

Updates a animal

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure API key authorization: api_key_query
let api_key_query = defaultClient.authentications['api_key_query'];
api_key_query.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_query.apiKeyPrefix = 'Token';

let apiInstance = new SwaggerPetstore.AnimalApi();
let animalId = 789; // Number | ID of animal that needs to be updated
let opts = { 
  'name': "name_example", // String | 
  'status': "status_example" // String | 
};
apiInstance.updateAnimalWithForm(animalId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animalId** | **Number**| ID of animal that needs to be updated | 
 **name** | **String**|  | [optional] 
 **status** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

