# SwaggerClient::AnimalApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_animal**](AnimalApi.md#add_animal) | **POST** /animal | Add a new animal to the store
[**delete_animal**](AnimalApi.md#delete_animal) | **DELETE** /animal/{animalId} | Deletes a animal
[**get_animal_by_id**](AnimalApi.md#get_animal_by_id) | **GET** /animal/{animalId} | Find animal by ID
[**update_animal**](AnimalApi.md#update_animal) | **PUT** /animal | Update an existing animal
[**update_animal_with_form**](AnimalApi.md#update_animal_with_form) | **POST** /animal/{animalId} | Updates a animal

# **add_animal**
> add_animal(body)

Add a new animal to the store

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AnimalApi.new
body = SwaggerClient::Animal.new # Animal | Animal object that needs to be added to the store


begin
  #Add a new animal to the store
  api_instance.add_animal(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AnimalApi->add_animal: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Animal**](Animal.md)| Animal object that needs to be added to the store | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined



# **delete_animal**
> delete_animal(animal_id, opts)

Deletes a animal

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AnimalApi.new
animal_id = 789 # Integer | Animal id to delete
opts = { 
  api_key: 'api_key_example' # String | 
}

begin
  #Deletes a animal
  api_instance.delete_animal(animal_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AnimalApi->delete_animal: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animal_id** | **Integer**| Animal id to delete | 
 **api_key** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_animal_by_id**
> Animal get_animal_by_id(animal_id)

Find animal by ID

Returns a single animal

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AnimalApi.new
animal_id = 789 # Integer | ID of pet to return


begin
  #Find animal by ID
  result = api_instance.get_animal_by_id(animal_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AnimalApi->get_animal_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animal_id** | **Integer**| ID of pet to return | 

### Return type

[**Animal**](Animal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json



# **update_animal**
> update_animal(body)

Update an existing animal

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AnimalApi.new
body = SwaggerClient::Animal.new # Animal | Animal object that needs to be added.


begin
  #Update an existing animal
  api_instance.update_animal(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AnimalApi->update_animal: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Animal**](Animal.md)| Animal object that needs to be added. | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined



# **update_animal_with_form**
> update_animal_with_form(animal_id, opts)

Updates a animal

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AnimalApi.new
animal_id = 789 # Integer | ID of animal that needs to be updated
opts = { 
  name: 'name_example' # String | 
  status: 'status_example' # String | 
}

begin
  #Updates a animal
  api_instance.update_animal_with_form(animal_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AnimalApi->update_animal_with_form: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animal_id** | **Integer**| ID of animal that needs to be updated | 
 **name** | **String**|  | [optional] 
 **status** | **String**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined



