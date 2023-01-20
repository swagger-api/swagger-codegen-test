# SwagAnotherFakeApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testSpecialTags**](SwagAnotherFakeApi.md#testSpecialTags) | **PATCH** /another-fake/dummy | To test special tags


<a name="testSpecialTags"></a>
# **testSpecialTags**
> SwagClient testSpecialTags(body)

To test special tags

To test special tags

### Example
```java
SwagAnotherFakeApi api = new SwagAnotherFakeApi();

Map<String, Object> params = new Map<String, Object>{
    'body' => SwagClient.getExample()
};

try {
    // cross your fingers
    SwagClient result = api.testSpecialTags(params);
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

