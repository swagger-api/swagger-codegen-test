# SwaggerPetstore.PetApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParrot**](PetApi.md#addParrot) | **POST** /parrot | Add a new parrow to the store
[**addPet**](PetApi.md#addPet) | **POST** /pet | Add a new pet to the store
[**deletePet**](PetApi.md#deletePet) | **DELETE** /pet/{petId} | Deletes a pet
[**doCategoryStuff**](PetApi.md#doCategoryStuff) | **POST** /pet/category | 
[**feedPet**](PetApi.md#feedPet) | **POST** /pet/feed/{petId} | Find pet by ID
[**findPetsByStatus**](PetApi.md#findPetsByStatus) | **GET** /pet/findByStatus | Finds Pets by status
[**findPetsByTags**](PetApi.md#findPetsByTags) | **GET** /pet/findByTags | Finds Pets by tags
[**getParrots**](PetApi.md#getParrots) | **GET** /parrot | get Parrots
[**getPetById**](PetApi.md#getPetById) | **GET** /pet/{petId} | Find pet by ID
[**updateParrots**](PetApi.md#updateParrots) | **PUT** /parrot | update parrots
[**updatePet**](PetApi.md#updatePet) | **PUT** /pet | Update an existing pet
[**updatePetWithForm**](PetApi.md#updatePetWithForm) | **POST** /pet/{petId} | Updates a pet in the store with form data
[**uploadFile**](PetApi.md#uploadFile) | **POST** /pet/{petId}/uploadImage | uploads an image

<a name="addParrot"></a>
# **addParrot**
> InlineResponse2001 addParrot(opts)

Add a new parrow to the store

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.PetApi();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPet"></a>
# **addPet**
> addPet(body)

Add a new pet to the store

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure OAuth2 access token for authorization: petstore_auth
let petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new SwaggerPetstore.PetApi();
let body = new SwaggerPetstore.Pet(); // Pet | Pet object that needs to be added to the store

apiInstance.addPet(body, (error, data, response) => {
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
 **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | 

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="deletePet"></a>
# **deletePet**
> deletePet(petId, opts)

Deletes a pet

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure OAuth2 access token for authorization: petstore_auth
let petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new SwaggerPetstore.PetApi();
let petId = 789; // Number | Pet id to delete
let opts = { 
  'apiKey': "apiKey_example" // String | 
};
apiInstance.deletePet(petId, opts, (error, data, response) => {
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
 **petId** | **Number**| Pet id to delete | 
 **apiKey** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="doCategoryStuff"></a>
# **doCategoryStuff**
> ApiResponse doCategoryStuff(opts)



### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.PetApi();
let opts = { 
  'body': new SwaggerPetstore.SubCategory() // SubCategory | 
};
apiInstance.doCategoryStuff(opts, (error, data, response) => {
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
 **body** | [**SubCategory**](SubCategory.md)|  | [optional] 

### Return type

[**ApiResponse**](ApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="feedPet"></a>
# **feedPet**
> feedPet(bodytokenpetTypestatuspetIdsessionId)

Find pet by ID

schedule pet feeding

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.PetApi();
let body = new SwaggerPetstore.Pet(); // Pet | Pet object that needs to be added to the store
let token = "token_example"; // String | status
let petType = "petType_example"; // String | type of food
let status = "status_example"; // String | status
let petId = 789; // Number | ID of pet to return
let sessionId = "sessionId_example"; // String | session id

apiInstance.feedPet(bodytokenpetTypestatuspetIdsessionId, (error, data, response) => {
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
 **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | 
 **token** | **String**| status | 
 **petType** | **String**| type of food | 
 **status** | **String**| status | 
 **petId** | **Number**| ID of pet to return | 
 **sessionId** | **String**| session id | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="findPetsByStatus"></a>
# **findPetsByStatus**
> [Pet] findPetsByStatus(status)

Finds Pets by status

Multiple status values can be provided with comma separated strings

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure OAuth2 access token for authorization: petstore_auth
let petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new SwaggerPetstore.PetApi();
let status = ["status_example"]; // [String] | Status values that need to be considered for filter

apiInstance.findPetsByStatus(status, (error, data, response) => {
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
 **status** | [**[String]**](String.md)| Status values that need to be considered for filter | 

### Return type

[**[Pet]**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="findPetsByTags"></a>
# **findPetsByTags**
> [Pet] findPetsByTags(tags)

Finds Pets by tags

Muliple tags can be provided with comma separated strings. Use\\ \\ tag1, tag2, tag3 for testing.

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure OAuth2 access token for authorization: petstore_auth
let petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new SwaggerPetstore.PetApi();
let tags = ["tags_example"]; // [String] | Tags to filter by

apiInstance.findPetsByTags(tags, (error, data, response) => {
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
 **tags** | [**[String]**](String.md)| Tags to filter by | 

### Return type

[**[Pet]**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getParrots"></a>
# **getParrots**
> [Object] getParrots()

get Parrots

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.PetApi();
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPetById"></a>
# **getPetById**
> Pet getPetById(petId)

Find pet by ID

Returns a single pet

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure API key authorization: api_key
let api_key = defaultClient.authentications['api_key'];
api_key.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.apiKeyPrefix = 'Token';

let apiInstance = new SwaggerPetstore.PetApi();
let petId = 789; // Number | ID of pet to return

apiInstance.getPetById(petId, (error, data, response) => {
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
 **petId** | **Number**| ID of pet to return | 

### Return type

[**Pet**](Pet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateParrots"></a>
# **updateParrots**
> InlineResponse200 updateParrots(opts)

update parrots

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.PetApi();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePet"></a>
# **updatePet**
> updatePet(body)

Update an existing pet

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure OAuth2 access token for authorization: petstore_auth
let petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new SwaggerPetstore.PetApi();
let body = new SwaggerPetstore.Pet(); // Pet | Pet object that needs to be added to the store

apiInstance.updatePet(body, (error, data, response) => {
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
 **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | 

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="updatePetWithForm"></a>
# **updatePetWithForm**
> updatePetWithForm(petId, opts)

Updates a pet in the store with form data

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure OAuth2 access token for authorization: petstore_auth
let petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new SwaggerPetstore.PetApi();
let petId = 789; // Number | ID of pet that needs to be updated
let opts = { 
  'name': "name_example" // String | 
  'status': "status_example" // String | 
};
apiInstance.updatePetWithForm(petId, opts, (error, data, response) => {
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
 **petId** | **Number**| ID of pet that needs to be updated | 
 **name** | **String**|  | [optional] 
 **status** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="uploadFile"></a>
# **uploadFile**
> ApiResponse uploadFile(petId, opts)

uploads an image

### Example
```javascript
import SwaggerPetstore from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure OAuth2 access token for authorization: petstore_auth
let petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new SwaggerPetstore.PetApi();
let petId = 789; // Number | ID of pet to update
let opts = { 
  'body': null // Object | 
};
apiInstance.uploadFile(petId, opts, (error, data, response) => {
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
 **petId** | **Number**| ID of pet to update | 
 **body** | [**Object**](Object.md)|  | [optional] 

### Return type

[**ApiResponse**](ApiResponse.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

