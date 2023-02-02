# SwaggerClient::DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**test_method**](DefaultApi.md#test_method) | **GET** /test | 

# **test_method**
> Array&lt;Test&gt; test_method



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
end

api_instance = SwaggerClient::DefaultApi.new

begin
  result = api_instance.test_method
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DefaultApi->test_method: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;Test&gt;**](Test.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



