# SwaggerClient::MasterApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**master_operation**](MasterApi.md#master_operation) | **GET** /master | 

# **master_operation**
> Array&lt;PartMaster&gt; master_operation



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
end

api_instance = SwaggerClient::MasterApi.new

begin
  result = api_instance.master_operation
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling MasterApi->master_operation: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;PartMaster&gt;**](PartMaster.md)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



