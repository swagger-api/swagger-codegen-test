# SwaggerClient::ParrotApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_parrot**](ParrotApi.md#add_parrot) | **POST** /parrot | Add a new parrow to the store
[**get_parrots**](ParrotApi.md#get_parrots) | **GET** /parrot | get Parrots
[**update_parrots**](ParrotApi.md#update_parrots) | **PUT** /parrot | update parrots

# **add_parrot**
> InlineResponse2001 add_parrot(opts)

Add a new parrow to the store

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
end

api_instance = SwaggerClient::ParrotApi.new
opts = { 
  body: SwaggerClient::ParrotBody1.new # ParrotBody1 | 
}

begin
  #Add a new parrow to the store
  result = api_instance.add_parrot(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ParrotApi->add_parrot: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParrotBody1**](ParrotBody1.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_parrots**
> Array&lt;null&gt; get_parrots

get Parrots

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
end

api_instance = SwaggerClient::ParrotApi.new

begin
  #get Parrots
  result = api_instance.get_parrots
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ParrotApi->get_parrots: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Array&lt;null&gt;**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_parrots**
> InlineResponse200 update_parrots(opts)

update parrots

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
end

api_instance = SwaggerClient::ParrotApi.new
opts = { 
  body: SwaggerClient::ParrotBody.new # ParrotBody | 
}

begin
  #update parrots
  result = api_instance.update_parrots(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ParrotApi->update_parrots: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParrotBody**](ParrotBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



