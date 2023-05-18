# PetApi

All URIs are relative to *https://raw.githubusercontent.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPet**](PetApi.md#addPet) | **POST** pet | Add a new pet to the store
[**deletePet**](PetApi.md#deletePet) | **DELETE** pet/{petId} | Deletes a pet
[**findPetsByStatus**](PetApi.md#findPetsByStatus) | **GET** pet/findByStatus | Finds Pets by status
[**findPetsByTags**](PetApi.md#findPetsByTags) | **GET** pet/findByTags | Finds Pets by tags
[**getPetById**](PetApi.md#getPetById) | **GET** pet/{petId} | Find pet by ID
[**updatePet**](PetApi.md#updatePet) | **PUT** pet | Update an existing pet
[**updatePetWithForm**](PetApi.md#updatePetWithForm) | **POST** pet/{petId} | Updates a pet in the store with form data
[**uploadFile**](PetApi.md#uploadFile) | **POST** pet/{petId}/uploadImage | uploads an image

<a name="addPet"></a>
# **addPet**
> Pet addPet(body)

Add a new pet to the store

Add a new pet to the store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

PetApi apiInstance = new PetApi();
Pet body = new Pet(); // Pet | Create a new pet in the store
try {
    Pet result = apiInstance.addPet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#addPet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pet**](Pet.md)| Create a new pet in the store |

### Return type

[**Pet**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="addPet"></a>
# **addPet**
> Pet addPet(id, name, category, photoUrls, tags, status)

Add a new pet to the store

Add a new pet to the store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

PetApi apiInstance = new PetApi();
Long id = 789L; // Long | 
String name = "name_example"; // String | 
Category category = new Category(); // Category | 
List<String> photoUrls = Arrays.asList("photoUrls_example"); // List<String> | 
List<Tag> tags = Arrays.asList(new Tag()); // List<Tag> | 
String status = "status_example"; // String | 
try {
    Pet result = apiInstance.addPet(id, name, category, photoUrls, tags, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#addPet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **name** | **String**|  |
 **category** | [**Category**](.md)|  |
 **photoUrls** | [**List&lt;String&gt;**](String.md)|  |
 **tags** | [**List&lt;Tag&gt;**](Tag.md)|  |
 **status** | **String**|  | [enum: available, pending, sold]

### Return type

[**Pet**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="deletePet"></a>
# **deletePet**
> Void deletePet(petId, apiKey)

Deletes a pet

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

PetApi apiInstance = new PetApi();
Long petId = 789L; // Long | Pet id to delete
String apiKey = "apiKey_example"; // String | 
try {
    Void result = apiInstance.deletePet(petId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#deletePet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **Long**| Pet id to delete |
 **apiKey** | **String**|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findPetsByStatus"></a>
# **findPetsByStatus**
> List&lt;Pet&gt; findPetsByStatus(status)

Finds Pets by status

Multiple status values can be provided with comma separated strings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

PetApi apiInstance = new PetApi();
String status = "available"; // String | Status values that need to be considered for filter
try {
    List<Pet> result = apiInstance.findPetsByStatus(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#findPetsByStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| Status values that need to be considered for filter | [optional] [default to available] [enum: available, pending, sold]

### Return type

[**List&lt;Pet&gt;**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="findPetsByTags"></a>
# **findPetsByTags**
> List&lt;Pet&gt; findPetsByTags(tags)

Finds Pets by tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

PetApi apiInstance = new PetApi();
List<String> tags = Arrays.asList("tags_example"); // List<String> | Tags to filter by
try {
    List<Pet> result = apiInstance.findPetsByTags(tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#findPetsByTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| Tags to filter by | [optional]

### Return type

[**List&lt;Pet&gt;**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getPetById"></a>
# **getPetById**
> Pet getPetById(petId)

Find pet by ID

Returns a single pet

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

PetApi apiInstance = new PetApi();
Long petId = 789L; // Long | ID of pet to return
try {
    Pet result = apiInstance.getPetById(petId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#getPetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **Long**| ID of pet to return |

### Return type

[**Pet**](Pet.md)

### Authorization

[api_key](../README.md#api_key)[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updatePet"></a>
# **updatePet**
> Pet updatePet(body)

Update an existing pet

Update an existing pet by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

PetApi apiInstance = new PetApi();
Pet body = new Pet(); // Pet | Update an existent pet in the store
try {
    Pet result = apiInstance.updatePet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#updatePet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pet**](Pet.md)| Update an existent pet in the store |

### Return type

[**Pet**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="updatePet"></a>
# **updatePet**
> Pet updatePet(id, name, category, photoUrls, tags, status)

Update an existing pet

Update an existing pet by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

PetApi apiInstance = new PetApi();
Long id = 789L; // Long | 
String name = "name_example"; // String | 
Category category = new Category(); // Category | 
List<String> photoUrls = Arrays.asList("photoUrls_example"); // List<String> | 
List<Tag> tags = Arrays.asList(new Tag()); // List<Tag> | 
String status = "status_example"; // String | 
try {
    Pet result = apiInstance.updatePet(id, name, category, photoUrls, tags, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#updatePet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **name** | **String**|  |
 **category** | [**Category**](.md)|  |
 **photoUrls** | [**List&lt;String&gt;**](String.md)|  |
 **tags** | [**List&lt;Tag&gt;**](Tag.md)|  |
 **status** | **String**|  | [enum: available, pending, sold]

### Return type

[**Pet**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

<a name="updatePetWithForm"></a>
# **updatePetWithForm**
> Void updatePetWithForm(petId, name, status)

Updates a pet in the store with form data

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

PetApi apiInstance = new PetApi();
Long petId = 789L; // Long | ID of pet that needs to be updated
String name = "name_example"; // String | Name of pet that needs to be updated
String status = "status_example"; // String | Status of pet that needs to be updated
try {
    Void result = apiInstance.updatePetWithForm(petId, name, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#updatePetWithForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **Long**| ID of pet that needs to be updated |
 **name** | **String**| Name of pet that needs to be updated | [optional]
 **status** | **String**| Status of pet that needs to be updated | [optional]

### Return type

[**Void**](.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="uploadFile"></a>
# **uploadFile**
> ModelApiResponse uploadFile(petId, body, additionalMetadata)

uploads an image

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

PetApi apiInstance = new PetApi();
Long petId = 789L; // Long | ID of pet to update
Object body = null; // Object | 
String additionalMetadata = "additionalMetadata_example"; // String | Additional Metadata
try {
    ModelApiResponse result = apiInstance.uploadFile(petId, body, additionalMetadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **Long**| ID of pet to update |
 **body** | **Object**|  | [optional]
 **additionalMetadata** | **String**| Additional Metadata | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

