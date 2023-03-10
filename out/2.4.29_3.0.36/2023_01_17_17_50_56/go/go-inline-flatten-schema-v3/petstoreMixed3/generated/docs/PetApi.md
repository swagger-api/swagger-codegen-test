# {{classname}}

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddPet**](PetApi.md#AddPet) | **Post** /pet | Add a new pet to the store
[**DeletePet**](PetApi.md#DeletePet) | **Delete** /pet/{petId} | Deletes a pet
[**DoCategoryStuff**](PetApi.md#DoCategoryStuff) | **Post** /pet/category | 
[**FindPetsByStatus**](PetApi.md#FindPetsByStatus) | **Get** /pet/findByStatus | Finds Pets by status
[**FindPetsByTags**](PetApi.md#FindPetsByTags) | **Get** /pet/findByTags | Finds Pets by tags
[**GetAllPets**](PetApi.md#GetAllPets) | **Get** /allPets | 
[**GetPetById**](PetApi.md#GetPetById) | **Get** /pet/{petId} | Find pet by ID
[**GetRandomPet**](PetApi.md#GetRandomPet) | **Get** /randomPet | 
[**UpdatePet**](PetApi.md#UpdatePet) | **Put** /pet | Update an existing pet
[**UpdatePetWithForm**](PetApi.md#UpdatePetWithForm) | **Post** /pet/{petId} | Updates a pet in the store with form data
[**UploadFile**](PetApi.md#UploadFile) | **Post** /pet/{petId}/uploadImage | uploads an image

# **AddPet**
> AddPet(ctx, body)
Add a new pet to the store

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | 

### Return type

 (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeletePet**
> DeletePet(ctx, petId, optional)
Deletes a pet

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **petId** | **int64**| Pet id to delete | 
 **optional** | ***PetApiDeletePetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PetApiDeletePetOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apiKey** | **optional.String**|  | 

### Return type

 (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DoCategoryStuff**
> ModelApiResponse DoCategoryStuff(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PetApiDoCategoryStuffOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PetApiDoCategoryStuffOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**optional.Interface of SubCategory**](SubCategory.md)|  | 

### Return type

[**ModelApiResponse**](ApiResponse.md)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FindPetsByStatus**
> []Pet FindPetsByStatus(ctx, status)
Finds Pets by status

Multiple status values can be provided with comma separated strings

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **status** | [**[]string**](string.md)| Status values that need to be considered for filter | 

### Return type

[**[]Pet**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FindPetsByTags**
> []Pet FindPetsByTags(ctx, tags)
Finds Pets by tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **tags** | [**[]string**](string.md)| Tags to filter by | 

### Return type

[**[]Pet**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAllPets**
> []InlineArrayItemsAllPetsResponse GetAllPets(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]InlineArrayItemsAllPetsResponse**](array.md)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetPetById**
> Pet GetPetById(ctx, petId)
Find pet by ID

Returns a single pet

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **petId** | **int64**| ID of pet to return | 

### Return type

[**Pet**](Pet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetRandomPet**
> SinglePetResponse GetRandomPet(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**SinglePetResponse**](SinglePetResponse.md)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdatePet**
> UpdatePet(ctx, body)
Update an existing pet

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | 

### Return type

 (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdatePetWithForm**
> UpdatePetWithForm(ctx, petId, optional)
Updates a pet in the store with form data

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **petId** | **int64**| ID of pet that needs to be updated | 
 **optional** | ***PetApiUpdatePetWithFormOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PetApiUpdatePetWithFormOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **name** | **optional.**|  | 
 **status** | **optional.**|  | 

### Return type

 (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UploadFile**
> ModelApiResponse UploadFile(ctx, petId, optional)
uploads an image

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **petId** | **int64**| ID of pet to update | 
 **optional** | ***PetApiUploadFileOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PetApiUploadFileOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **additionalMetadata** | **optional.**|  | 
 **file** | **optional.Interface of *os.File****optional.**|  | 

### Return type

[**ModelApiResponse**](ApiResponse.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

