# SwagFakeClassnameTags123Api

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testClassname**](SwagFakeClassnameTags123Api.md#testClassname) | **PATCH** /fake_classname_test | To test class name in snake case


<a name="testClassname"></a>
# **testClassname**
> SwagClient testClassname(body)

To test class name in snake case

To test class name in snake case

### Example
```java
SwagFakeClassnameTags123Api api = new SwagFakeClassnameTags123Api();
SwagClient client = api.getClient();

// Configure API key authorization: api_key_query
ApiKeyAuth api_key_query = (ApiKeyAuth) client.getAuthentication('api_key_query');
api_key_query.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'body' => SwagClient.getExample()
};

try {
    // cross your fingers
    SwagClient result = api.testClassname(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SwagClient**](SwagClient.md)| client model |

### Return type

[**SwagClient**](SwagClient.md)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

