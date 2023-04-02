# SwaggerClient::FakeApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fake_outer_boolean_serialize**](FakeApi.md#fake_outer_boolean_serialize) | **POST** /fake/outer/boolean | 
[**fake_outer_composite_serialize**](FakeApi.md#fake_outer_composite_serialize) | **POST** /fake/outer/composite | 
[**fake_outer_number_serialize**](FakeApi.md#fake_outer_number_serialize) | **POST** /fake/outer/number | 
[**fake_outer_string_serialize**](FakeApi.md#fake_outer_string_serialize) | **POST** /fake/outer/string | 
[**test_client_model**](FakeApi.md#test_client_model) | **PATCH** /fake | To test \&quot;client\&quot; model
[**test_endpoint_parameters**](FakeApi.md#test_endpoint_parameters) | **POST** /fake | Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
[**test_enum_parameters**](FakeApi.md#test_enum_parameters) | **GET** /fake | To test enum parameters
[**test_enum_request_body**](FakeApi.md#test_enum_request_body) | **POST** /fake/enum/form | To test enum parameters
[**test_inline_additional_properties**](FakeApi.md#test_inline_additional_properties) | **POST** /fake/inline-additionalProperties | test inline additionalProperties
[**test_json_form_data**](FakeApi.md#test_json_form_data) | **POST** /fake/jsonFormData | test json serialization of form data

# **fake_outer_boolean_serialize**
> OuterBoolean fake_outer_boolean_serialize(opts)



Test serialization of outer boolean types

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::FakeApi.new
opts = { 
  body: true # BOOLEAN | Input boolean as post body
}

begin
  result = api_instance.fake_outer_boolean_serialize(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling FakeApi->fake_outer_boolean_serialize: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BOOLEAN**](BOOLEAN.md)| Input boolean as post body | [optional] 

### Return type

[**OuterBoolean**](OuterBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*



# **fake_outer_composite_serialize**
> OuterComposite fake_outer_composite_serialize(opts)



Test serialization of object with outer number type

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::FakeApi.new
opts = { 
  body: SwaggerClient::OuterComposite.new # OuterComposite | Input composite as post body
}

begin
  result = api_instance.fake_outer_composite_serialize(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling FakeApi->fake_outer_composite_serialize: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OuterComposite**](OuterComposite.md)| Input composite as post body | [optional] 

### Return type

[**OuterComposite**](OuterComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*



# **fake_outer_number_serialize**
> OuterNumber fake_outer_number_serialize(opts)



Test serialization of outer number types

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::FakeApi.new
opts = { 
  body: SwaggerClient::BigDecimal.new # BigDecimal | Input number as post body
}

begin
  result = api_instance.fake_outer_number_serialize(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling FakeApi->fake_outer_number_serialize: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BigDecimal**](BigDecimal.md)| Input number as post body | [optional] 

### Return type

[**OuterNumber**](OuterNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*



# **fake_outer_string_serialize**
> OuterString fake_outer_string_serialize(opts)



Test serialization of outer string types

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::FakeApi.new
opts = { 
  body: 'body_example' # String | Input string as post body
}

begin
  result = api_instance.fake_outer_string_serialize(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling FakeApi->fake_outer_string_serialize: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Input string as post body | [optional] 

### Return type

[**OuterString**](OuterString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*



# **test_client_model**
> Client test_client_model(body)

To test \"client\" model

To test \"client\" model

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::FakeApi.new
body = SwaggerClient::Client.new # Client | client model


begin
  #To test \"client\" model
  result = api_instance.test_client_model(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling FakeApi->test_client_model: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Client**](Client.md)| client model | 

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **test_endpoint_parameters**
> test_endpoint_parameters(body)

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

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

api_instance = SwaggerClient::FakeApi.new
body = SwaggerClient::FakeBody.new # FakeBody | 


begin
  #Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
  api_instance.test_endpoint_parameters(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling FakeApi->test_endpoint_parameters: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FakeBody**](FakeBody.md)|  | 

### Return type

nil (empty response body)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: application/xml; charset=utf-8, application/json; charset=utf-8
 - **Accept**: Not defined



# **test_enum_parameters**
> test_enum_parameters(opts)

To test enum parameters

To test enum parameters

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::FakeApi.new
opts = { 
  enum_header_string_array: ['enum_header_string_array_example'], # Array<String> | Header parameter enum test (string array)
  enum_header_string: '-efg', # String | Header parameter enum test (string)
  enum_query_string_array: ['enum_query_string_array_example'], # Array<String> | Query parameter enum test (string array)
  enum_query_string: '-efg', # String | Query parameter enum test (string)
  enum_query_integer: 56 # Integer | Query parameter enum test (double)
}

begin
  #To test enum parameters
  api_instance.test_enum_parameters(opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling FakeApi->test_enum_parameters: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enum_header_string_array** | [**Array&lt;String&gt;**](String.md)| Header parameter enum test (string array) | [optional] 
 **enum_header_string** | **String**| Header parameter enum test (string) | [optional] [default to -efg]
 **enum_query_string_array** | [**Array&lt;String&gt;**](String.md)| Query parameter enum test (string array) | [optional] 
 **enum_query_string** | **String**| Query parameter enum test (string) | [optional] [default to -efg]
 **enum_query_integer** | **Integer**| Query parameter enum test (double) | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **test_enum_request_body**
> test_enum_request_body(opts)

To test enum parameters

To test enum parameters

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::FakeApi.new
opts = { 
  body: SwaggerClient::EnumFormBody.new # EnumFormBody | 
}

begin
  #To test enum parameters
  api_instance.test_enum_request_body(opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling FakeApi->test_enum_request_body: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnumFormBody**](EnumFormBody.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined



# **test_inline_additional_properties**
> test_inline_additional_properties(body)

test inline additionalProperties

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::FakeApi.new
body = nil # Hash<String, String> | request body


begin
  #test inline additionalProperties
  api_instance.test_inline_additional_properties(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling FakeApi->test_inline_additional_properties: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Hash&lt;String, String&gt;**](Hash.md)| request body | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



# **test_json_form_data**
> test_json_form_data(body)

test json serialization of form data

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::FakeApi.new
body = SwaggerClient::FakeJsonFormDataBody.new # FakeJsonFormDataBody | 


begin
  #test json serialization of form data
  api_instance.test_json_form_data(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling FakeApi->test_json_form_data: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FakeJsonFormDataBody**](FakeJsonFormDataBody.md)|  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined



