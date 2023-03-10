# SwaggerClient::PetApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_pet**](PetApi.md#add_pet) | **POST** /pet | Add a new pet to the store
[**delete_pet**](PetApi.md#delete_pet) | **DELETE** /pet/{petId} | Deletes a pet
[**do_category_stuff**](PetApi.md#do_category_stuff) | **POST** /pet/category | 
[**find_pets_by_status**](PetApi.md#find_pets_by_status) | **GET** /pet/findByStatus | Finds Pets by status
[**find_pets_by_tags**](PetApi.md#find_pets_by_tags) | **GET** /pet/findByTags | Finds Pets by tags
[**get_all_pets**](PetApi.md#get_all_pets) | **GET** /allPets | 
[**get_pet_by_id**](PetApi.md#get_pet_by_id) | **GET** /pet/{petId} | Find pet by ID
[**get_random_pet**](PetApi.md#get_random_pet) | **GET** /randomPet | 
[**update_pet**](PetApi.md#update_pet) | **PUT** /pet | Update an existing pet
[**update_pet_with_form**](PetApi.md#update_pet_with_form) | **POST** /pet/{petId} | Updates a pet in the store with form data
[**upload_file**](PetApi.md#upload_file) | **POST** /pet/{petId}/uploadImage | uploads an image

# **add_pet**
> add_pet(body)

Add a new pet to the store

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: petstore_auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PetApi.new
body = SwaggerClient::Pet.new # Pet | Pet object that needs to be added to the store


begin
  #Add a new pet to the store
  api_instance.add_pet(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->add_pet: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | 

### Return type

nil (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined



# **delete_pet**
> delete_pet(pet_id, opts)

Deletes a pet

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: petstore_auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PetApi.new
pet_id = 789 # Integer | Pet id to delete
opts = { 
  api_key: 'api_key_example' # String | 
}

begin
  #Deletes a pet
  api_instance.delete_pet(pet_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->delete_pet: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pet_id** | **Integer**| Pet id to delete | 
 **api_key** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **do_category_stuff**
> ApiResponse do_category_stuff(opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: http_basic_test
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::PetApi.new
opts = { 
  body: SwaggerClient::SubCategory.new # SubCategory | 
}

begin
  result = api_instance.do_category_stuff(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->do_category_stuff: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubCategory**](SubCategory.md)|  | [optional] 

### Return type

[**ApiResponse**](ApiResponse.md)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **find_pets_by_status**
> Array&lt;Pet&gt; find_pets_by_status(status)

Finds Pets by status

Multiple status values can be provided with comma separated strings

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: petstore_auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PetApi.new
status = ['status_example'] # Array<String> | Status values that need to be considered for filter


begin
  #Finds Pets by status
  result = api_instance.find_pets_by_status(status)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->find_pets_by_status: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**Array&lt;String&gt;**](String.md)| Status values that need to be considered for filter | 

### Return type

[**Array&lt;Pet&gt;**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json



# **find_pets_by_tags**
> Array&lt;Pet&gt; find_pets_by_tags(tags)

Finds Pets by tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: petstore_auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PetApi.new
tags = ['tags_example'] # Array<String> | Tags to filter by


begin
  #Finds Pets by tags
  result = api_instance.find_pets_by_tags(tags)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->find_pets_by_tags: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**Array&lt;String&gt;**](String.md)| Tags to filter by | 

### Return type

[**Array&lt;Pet&gt;**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json



# **get_all_pets**
> AllPetsResponse get_all_pets



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: http_basic_test
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::PetApi.new

begin
  result = api_instance.get_all_pets
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->get_all_pets: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AllPetsResponse**](AllPetsResponse.md)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_pet_by_id**
> Pet get_pet_by_id(pet_id)

Find pet by ID

Returns a single pet

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: api_key
  config.api_key['api_key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api_key'] = 'Bearer'
end

api_instance = SwaggerClient::PetApi.new
pet_id = 789 # Integer | ID of pet to return


begin
  #Find pet by ID
  result = api_instance.get_pet_by_id(pet_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->get_pet_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pet_id** | **Integer**| ID of pet to return | 

### Return type

[**Pet**](Pet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json



# **get_random_pet**
> SinglePetResponse get_random_pet



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: http_basic_test
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = SwaggerClient::PetApi.new

begin
  result = api_instance.get_random_pet
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->get_random_pet: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SinglePetResponse**](SinglePetResponse.md)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_pet**
> update_pet(body)

Update an existing pet

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: petstore_auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PetApi.new
body = SwaggerClient::Pet.new # Pet | Pet object that needs to be added to the store


begin
  #Update an existing pet
  api_instance.update_pet(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->update_pet: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | 

### Return type

nil (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined



# **update_pet_with_form**
> update_pet_with_form(pet_id, opts)

Updates a pet in the store with form data

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: petstore_auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PetApi.new
pet_id = 789 # Integer | ID of pet that needs to be updated
opts = { 
  name: 'name_example' # String | 
  status: 'status_example' # String | 
}

begin
  #Updates a pet in the store with form data
  api_instance.update_pet_with_form(pet_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->update_pet_with_form: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pet_id** | **Integer**| ID of pet that needs to be updated | 
 **name** | **String**|  | [optional] 
 **status** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined



# **upload_file**
> ApiResponse upload_file(pet_id, opts)

uploads an image

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: petstore_auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PetApi.new
pet_id = 789 # Integer | ID of pet to update
opts = { 
  additional_metadata: 'additional_metadata_example' # String | 
  file: 'file_example' # String | 
}

begin
  #uploads an image
  result = api_instance.upload_file(pet_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->upload_file: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pet_id** | **Integer**| ID of pet to update | 
 **additional_metadata** | **String**|  | [optional] 
 **file** | **String**|  | [optional] 

### Return type

[**ApiResponse**](ApiResponse.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json



