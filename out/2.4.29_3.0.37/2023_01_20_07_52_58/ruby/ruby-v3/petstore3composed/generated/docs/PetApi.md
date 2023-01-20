# SwaggerClient::PetApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_parrot**](PetApi.md#add_parrot) | **POST** /parrot | Add a new parrow to the store
[**add_pet**](PetApi.md#add_pet) | **POST** /pet | Add a new pet to the store
[**delete_pet**](PetApi.md#delete_pet) | **DELETE** /pet/{petId} | Deletes a pet
[**do_category_stuff**](PetApi.md#do_category_stuff) | **POST** /pet/category | 
[**feed_pet**](PetApi.md#feed_pet) | **POST** /pet/feed/{petId} | Find pet by ID
[**find_pets_by_status**](PetApi.md#find_pets_by_status) | **GET** /pet/findByStatus | Finds Pets by status
[**find_pets_by_tags**](PetApi.md#find_pets_by_tags) | **GET** /pet/findByTags | Finds Pets by tags
[**get_parrots**](PetApi.md#get_parrots) | **GET** /parrot | get Parrots
[**get_pet_by_id**](PetApi.md#get_pet_by_id) | **GET** /pet/{petId} | Find pet by ID
[**update_parrots**](PetApi.md#update_parrots) | **PUT** /parrot | update parrots
[**update_pet**](PetApi.md#update_pet) | **PUT** /pet | Update an existing pet
[**update_pet_with_form**](PetApi.md#update_pet_with_form) | **POST** /pet/{petId} | Updates a pet in the store with form data
[**upload_file**](PetApi.md#upload_file) | **POST** /pet/{petId}/uploadImage | uploads an image

# **add_parrot**
> InlineResponse2001 add_parrot(opts)

Add a new parrow to the store

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PetApi.new
opts = { 
  body: SwaggerClient::ParrotBody1.new # ParrotBody1 | 
}

begin
  #Add a new parrow to the store
  result = api_instance.add_parrot(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->add_parrot: #{e}"
end
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **feed_pet**
> feed_pet(bodytokenpet_typestatuspet_idsession_id)

Find pet by ID

schedule pet feeding

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PetApi.new
body = SwaggerClient::Pet.new # Pet | Pet object that needs to be added to the store
token = 'token_example' # String | status
pet_type = 'pet_type_example' # String | type of food
status = 'status_example' # String | status
pet_id = 789 # Integer | ID of pet to return
session_id = 'session_id_example' # String | session id


begin
  #Find pet by ID
  api_instance.feed_pet(bodytokenpet_typestatuspet_idsession_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->feed_pet: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | 
 **token** | **String**| status | 
 **pet_type** | **String**| type of food | 
 **status** | **String**| status | 
 **pet_id** | **Integer**| ID of pet to return | 
 **session_id** | **String**| session id | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined



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
 - **Accept**: application/json, application/xml



# **find_pets_by_tags**
> Array&lt;Pet&gt; find_pets_by_tags(tags)

Finds Pets by tags

Muliple tags can be provided with comma separated strings. Use\\ \\ tag1, tag2, tag3 for testing.

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
 - **Accept**: application/json, application/xml



# **get_parrots**
> Array&lt;null&gt; get_parrots

get Parrots

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PetApi.new

begin
  #get Parrots
  result = api_instance.get_parrots
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->get_parrots: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Array&lt;null&gt;**

### Authorization

No authorization required

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
 - **Accept**: application/json, application/xml



# **update_parrots**
> InlineResponse200 update_parrots(opts)

update parrots

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PetApi.new
opts = { 
  body: SwaggerClient::ParrotBody.new # ParrotBody | 
}

begin
  #update parrots
  result = api_instance.update_parrots(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PetApi->update_parrots: #{e}"
end
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
  body: nil # Object | 
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
 **body** | [**Object**](Object.md)|  | [optional] 

### Return type

[**ApiResponse**](ApiResponse.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json



