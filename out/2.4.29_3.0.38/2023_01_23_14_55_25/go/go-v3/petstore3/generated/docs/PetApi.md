# {{classname}}

All URIs are relative to *https://raw.githubusercontent.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddPet**](PetApi.md#AddPet) | **Post** /pet | Add a new pet to the store
[**DeletePet**](PetApi.md#DeletePet) | **Delete** /pet/{petId} | Deletes a pet
[**FindPetsByStatus**](PetApi.md#FindPetsByStatus) | **Get** /pet/findByStatus | Finds Pets by status
[**FindPetsByTags**](PetApi.md#FindPetsByTags) | **Get** /pet/findByTags | Finds Pets by tags
[**GetPetById**](PetApi.md#GetPetById) | **Get** /pet/{petId} | Find pet by ID
[**UpdatePet**](PetApi.md#UpdatePet) | **Put** /pet | Update an existing pet
[**UpdatePetWithForm**](PetApi.md#UpdatePetWithForm) | **Post** /pet/{petId} | Updates a pet in the store with form data
[**UploadFile**](PetApi.md#UploadFile) | **Post** /pet/{petId}/uploadImage | uploads an image

# **AddPet**
> Pet AddPet(ctx, body, id, name, category, photoUrls, tags, status)
Add a new pet to the store

Add a new pet to the store

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Pet**](Pet.md)| Create a new pet in the store | 
  **id** | **int64**|  | 
  **name** | **string**|  | 
  **category** | [**Category**](.md)|  | 
  **photoUrls** | [**[]string**](string.md)|  | 
  **tags** | [**[]Tag**](Tag.md)|  | 
  **status** | **string**|  | 

### Return type

[**Pet**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

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

# **FindPetsByStatus**
> []Pet FindPetsByStatus(ctx, optional)
Finds Pets by status

Multiple status values can be provided with comma separated strings

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PetApiFindPetsByStatusOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PetApiFindPetsByStatusOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **optional.String**| Status values that need to be considered for filter | [default to available]

### Return type

[**[]Pet**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FindPetsByTags**
> []Pet FindPetsByTags(ctx, optional)
Finds Pets by tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PetApiFindPetsByTagsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PetApiFindPetsByTagsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**optional.Interface of []string**](string.md)| Tags to filter by | 

### Return type

[**[]Pet**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

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

[api_key](../README.md#api_key), [petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdatePet**
> Pet UpdatePet(ctx, body, id, name, category, photoUrls, tags, status)
Update an existing pet

Update an existing pet by Id

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Pet**](Pet.md)| Update an existent pet in the store | 
  **id** | **int64**|  | 
  **name** | **string**|  | 
  **category** | [**Category**](.md)|  | 
  **photoUrls** | [**[]string**](string.md)|  | 
  **tags** | [**[]Tag**](Tag.md)|  | 
  **status** | **string**|  | 

### Return type

[**Pet**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

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

 **name** | **optional.String**| Name of pet that needs to be updated | 
 **status** | **optional.String**| Status of pet that needs to be updated | 

### Return type

 (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
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

 **body** | [**optional.Interface of Object**](Object.md)|  | 
 **additionalMetadata** | **optional.**| Additional Metadata | 

### Return type

[**ModelApiResponse**](ApiResponse.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

