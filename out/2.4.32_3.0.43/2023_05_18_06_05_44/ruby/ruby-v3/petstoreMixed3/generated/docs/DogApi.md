# SwaggerClient::DogApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_dog**](DogApi.md#add_dog) | **POST** /dog | Add a new dog to the store
[**delete_dog**](DogApi.md#delete_dog) | **DELETE** /dog/{dogId} | Deletes a dog
[**get_dog_by_id**](DogApi.md#get_dog_by_id) | **GET** /dog/{dogId} | Find dog by ID
[**update_dog**](DogApi.md#update_dog) | **PUT** /dog | Update an existing dog
[**update_dog_with_form**](DogApi.md#update_dog_with_form) | **POST** /dog/{dogId} | Updates a dog

# **add_dog**
> add_dog(body)

Add a new dog to the store

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
end

api_instance = SwaggerClient::DogApi.new
body = SwaggerClient::Dog.new # Dog | Dog object that needs to be added to the store


begin
  #Add a new dog to the store
  api_instance.add_dog(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DogApi->add_dog: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dog**](Dog.md)| Dog object that needs to be added to the store | 

### Return type

nil (empty response body)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined



# **delete_dog**
> delete_dog(dog_id, opts)

Deletes a dog

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
end

api_instance = SwaggerClient::DogApi.new
dog_id = 789 # Integer | Dog id to delete
opts = { 
  api_key: 'api_key_example' # String | 
}

begin
  #Deletes a dog
  api_instance.delete_dog(dog_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DogApi->delete_dog: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dog_id** | **Integer**| Dog id to delete | 
 **api_key** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_dog_by_id**
> Dog get_dog_by_id(dog_id)

Find dog by ID

Returns a single dog

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
end

api_instance = SwaggerClient::DogApi.new
dog_id = 789 # Integer | ID of dog to return


begin
  #Find dog by ID
  result = api_instance.get_dog_by_id(dog_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DogApi->get_dog_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dog_id** | **Integer**| ID of dog to return | 

### Return type

[**Dog**](Dog.md)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json



# **update_dog**
> update_dog(body)

Update an existing dog

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
end

api_instance = SwaggerClient::DogApi.new
body = SwaggerClient::Dog.new # Dog | Dog object that needs to be added.


begin
  #Update an existing dog
  api_instance.update_dog(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DogApi->update_dog: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dog**](Dog.md)| Dog object that needs to be added. | 

### Return type

nil (empty response body)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined



# **update_dog_with_form**
> update_dog_with_form(dog_id, opts)

Updates a dog

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
end

api_instance = SwaggerClient::DogApi.new
dog_id = 789 # Integer | ID of dog that needs to be updated
opts = { 
  name: 'name_example' # String | 
  status: 'status_example' # String | 
}

begin
  #Updates a dog
  api_instance.update_dog_with_form(dog_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DogApi->update_dog_with_form: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dog_id** | **Integer**| ID of dog that needs to be updated | 
 **name** | **String**|  | [optional] 
 **status** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined



