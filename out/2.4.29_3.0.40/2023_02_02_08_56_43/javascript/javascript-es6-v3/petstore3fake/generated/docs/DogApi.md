# SwaggerPetstore.DogApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDog**](DogApi.md#addDog) | **POST** /dog | Add a new dog to the store
[**deleteDog**](DogApi.md#deleteDog) | **DELETE** /dog/{dogId} | Deletes a dog
[**getDogById**](DogApi.md#getDogById) | **GET** /dog/{dogId} | Find dog by ID
[**updateDog**](DogApi.md#updateDog) | **PUT** /dog | Update an existing dog
[**updateDogWithForm**](DogApi.md#updateDogWithForm) | **POST** /dog/{dogId} | Updates a dog

<a name="addDog"></a>
# **addDog**
> addDog(body)

Add a new dog to the store

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.DogApi();
let body = new SwaggerPetstore.Dog(); // Dog | Dog object that needs to be added to the store

apiInstance.addDog(body, (error, data, response) => {
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
 **body** | [**Dog**](Dog.md)| Dog object that needs to be added to the store | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="deleteDog"></a>
# **deleteDog**
> deleteDog(dogId, opts)

Deletes a dog

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.DogApi();
let dogId = 789; // Number | Dog id to delete
let opts = { 
  'apiKey': "apiKey_example" // String | 
};
apiInstance.deleteDog(dogId, opts, (error, data, response) => {
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
 **dogId** | **Number**| Dog id to delete | 
 **apiKey** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDogById"></a>
# **getDogById**
> Dog getDogById(dogId)

Find dog by ID

Returns a single dog

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.DogApi();
let dogId = 789; // Number | ID of dog to return

apiInstance.getDogById(dogId, (error, data, response) => {
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
 **dogId** | **Number**| ID of dog to return | 

### Return type

[**Dog**](Dog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateDog"></a>
# **updateDog**
> updateDog(body)

Update an existing dog

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.DogApi();
let body = new SwaggerPetstore.Dog(); // Dog | Dog object that needs to be added.

apiInstance.updateDog(body, (error, data, response) => {
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
 **body** | [**Dog**](Dog.md)| Dog object that needs to be added. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="updateDogWithForm"></a>
# **updateDogWithForm**
> updateDogWithForm(dogId, opts)

Updates a dog

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.DogApi();
let dogId = 789; // Number | ID of dog that needs to be updated
let opts = { 
  'name': "name_example", // String | 
  'status': "status_example" // String | 
};
apiInstance.updateDogWithForm(dogId, opts, (error, data, response) => {
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
 **dogId** | **Number**| ID of dog that needs to be updated | 
 **name** | **String**|  | [optional] 
 **status** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

