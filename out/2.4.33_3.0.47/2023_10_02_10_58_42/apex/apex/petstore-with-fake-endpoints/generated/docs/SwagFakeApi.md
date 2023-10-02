# SwagFakeApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fakeOuterBooleanSerialize**](SwagFakeApi.md#fakeOuterBooleanSerialize) | **POST** /fake/outer/boolean | 
[**fakeOuterCompositeSerialize**](SwagFakeApi.md#fakeOuterCompositeSerialize) | **POST** /fake/outer/composite | 
[**fakeOuterNumberSerialize**](SwagFakeApi.md#fakeOuterNumberSerialize) | **POST** /fake/outer/number | 
[**fakeOuterStringSerialize**](SwagFakeApi.md#fakeOuterStringSerialize) | **POST** /fake/outer/string | 
[**testBodyWithQueryParams**](SwagFakeApi.md#testBodyWithQueryParams) | **PUT** /fake/body-with-query-params | 
[**testClientModel**](SwagFakeApi.md#testClientModel) | **PATCH** /fake | To test &quot;client&quot; model
[**testEndpointParameters**](SwagFakeApi.md#testEndpointParameters) | **POST** /fake | Fake endpoint for testing various parameters\n假端點\n偽のエンドポイント\n가짜 엔드 포인트\n
[**testEnumParameters**](SwagFakeApi.md#testEnumParameters) | **GET** /fake | To test enum parameters
[**testInlineAdditionalProperties**](SwagFakeApi.md#testInlineAdditionalProperties) | **POST** /fake/inline-additionalProperties | test inline additionalProperties
[**testJsonFormData**](SwagFakeApi.md#testJsonFormData) | **GET** /fake/jsonFormData | test json serialization of form data


<a name="fakeOuterBooleanSerialize"></a>
# **fakeOuterBooleanSerialize**
> Boolean fakeOuterBooleanSerialize(body)



Test serialization of outer boolean types

### Example
```java
SwagFakeApi api = new SwagFakeApi();

Map<String, Object> params = new Map<String, Object>{
    'body' => Boolean.getExample()
};

try {
    // cross your fingers
    Boolean result = api.fakeOuterBooleanSerialize(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Boolean**](Boolean.md)| Input boolean as post body | [optional]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fakeOuterCompositeSerialize"></a>
# **fakeOuterCompositeSerialize**
> SwagOuterComposite fakeOuterCompositeSerialize(body)



Test serialization of object with outer number type

### Example
```java
SwagFakeApi api = new SwagFakeApi();

Map<String, Object> params = new Map<String, Object>{
    'body' => SwagOuterComposite.getExample()
};

try {
    // cross your fingers
    SwagOuterComposite result = api.fakeOuterCompositeSerialize(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SwagOuterComposite**](SwagOuterComposite.md)| Input composite as post body | [optional]

### Return type

[**SwagOuterComposite**](SwagOuterComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fakeOuterNumberSerialize"></a>
# **fakeOuterNumberSerialize**
> Double fakeOuterNumberSerialize(body)



Test serialization of outer number types

### Example
```java
SwagFakeApi api = new SwagFakeApi();

Map<String, Object> params = new Map<String, Object>{
    'body' => Double.getExample()
};

try {
    // cross your fingers
    Double result = api.fakeOuterNumberSerialize(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Double**](Double.md)| Input number as post body | [optional]

### Return type

**Double**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fakeOuterStringSerialize"></a>
# **fakeOuterStringSerialize**
> String fakeOuterStringSerialize(body)



Test serialization of outer string types

### Example
```java
SwagFakeApi api = new SwagFakeApi();

Map<String, Object> params = new Map<String, Object>{
    'body' => String.getExample()
};

try {
    // cross your fingers
    String result = api.fakeOuterStringSerialize(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Input string as post body | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testBodyWithQueryParams"></a>
# **testBodyWithQueryParams**
> testBodyWithQueryParams(body, query)



### Example
```java
SwagFakeApi api = new SwagFakeApi();

Map<String, Object> params = new Map<String, Object>{
    'body' => SwagUser.getExample(),
    'query' => 'query_example'
};

try {
    // cross your fingers
    api.testBodyWithQueryParams(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SwagUser**](SwagUser.md)|  |
 **query** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testClientModel"></a>
# **testClientModel**
> SwagClient testClientModel(body)

To test &quot;client&quot; model

To test &quot;client&quot; model

### Example
```java
SwagFakeApi api = new SwagFakeApi();

Map<String, Object> params = new Map<String, Object>{
    'body' => SwagClient.getExample()
};

try {
    // cross your fingers
    SwagClient result = api.testClientModel(params);
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

<a name="testEndpointParameters"></a>
# **testEndpointParameters**
> testEndpointParameters(r_number, double, patternWithoutDelimiter, r_byte, integer, int32, int64, r_float, string, binary, r_date, dateTime, password, paramCallback)

Fake endpoint for testing various parameters\n假端點\n偽のエンドポイント\n가짜 엔드 포인트\n

Fake endpoint for testing various parameters\n假端點\n偽のエンドポイント\n가짜 엔드 포인트\n

### Example
```java
SwagFakeApi api = new SwagFakeApi();
SwagClient client = api.getClient();

// Configure HTTP basic authorization: http_basic_test
HttpBasicAuth http_basic_test = (HttpBasicAuth) client.getAuthentication('http_basic_test');
http_basic_test.setUsername('YOUR USERNAME');
http_basic_test.setPassword('YOUR PASSWORD');

// You can also set your username and password in one line
http_basic_test.setCredentials('YOUR USERNAME', 'YOUR PASSWORD');

Map<String, Object> params = new Map<String, Object>{
    'r_number' => 8.14,
    'double' => 1.2,
    'patternWithoutDelimiter' => 'patternWithoutDelimiter_example',
    'r_byte' => B,
    'integer' => 56,
    'int32' => 56,
    'int64' => 2147483648L,
    'r_float' => 3.4,
    'string' => 'string_example',
    'binary' => B,
    'r_date' => Date.newInstance(1960, 2, 17),
    'dateTime' => Datetime.newInstanceGmt(2013, 11, 12, 3, 3, 3),
    'password' => 'password_example',
    'paramCallback' => 'paramCallback_example'
};

try {
    // cross your fingers
    api.testEndpointParameters(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r_number** | **Double**| None |
 **double** | **Double**| None |
 **patternWithoutDelimiter** | **String**| None |
 **r_byte** | **Blob**| None |
 **integer** | **Integer**| None | [optional]
 **int32** | **Integer**| None | [optional]
 **int64** | **Long**| None | [optional]
 **r_float** | **Double**| None | [optional]
 **string** | **String**| None | [optional]
 **binary** | **String**| None | [optional]
 **r_date** | **Date**| None | [optional]
 **dateTime** | **Datetime**| None | [optional]
 **password** | **String**| None | [optional]
 **paramCallback** | **String**| None | [optional]

### Return type

null (empty response body)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="testEnumParameters"></a>
# **testEnumParameters**
> testEnumParameters(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble)

To test enum parameters

To test enum parameters

### Example
```java
SwagFakeApi api = new SwagFakeApi();

Map<String, Object> params = new Map<String, Object>{
    'enumFormStringArray' => new List<String>{'>'},
    'enumFormString' => 'enumFormString_example',
    'enumHeaderStringArray' => new List<String>{'>'},
    'enumHeaderString' => 'enumHeaderString_example',
    'enumQueryStringArray' => new List<String>{'>'},
    'enumQueryString' => 'enumQueryString_example',
    'enumQueryInteger' => 56,
    'enumQueryDouble' => 1.2
};

try {
    // cross your fingers
    api.testEnumParameters(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enumFormStringArray** | [**List&lt;String&gt;**](String.md)| Form parameter enum test (string array) | [optional] [enum: >, $]
 **enumFormString** | **String**| Form parameter enum test (string) | [optional] [default to -efg] [enum: _abc, -efg, (xyz)]
 **enumHeaderStringArray** | [**List&lt;String&gt;**](String.md)| Header parameter enum test (string array) | [optional] [enum: >, $]
 **enumHeaderString** | **String**| Header parameter enum test (string) | [optional] [default to -efg] [enum: _abc, -efg, (xyz)]
 **enumQueryStringArray** | [**List&lt;String&gt;**](String.md)| Query parameter enum test (string array) | [optional] [enum: >, $]
 **enumQueryString** | **String**| Query parameter enum test (string) | [optional] [default to -efg] [enum: _abc, -efg, (xyz)]
 **enumQueryInteger** | **Integer**| Query parameter enum test (double) | [optional] [enum: 1, -2]
 **enumQueryDouble** | **Double**| Query parameter enum test (double) | [optional] [enum: 1.1, -1.2]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="testInlineAdditionalProperties"></a>
# **testInlineAdditionalProperties**
> testInlineAdditionalProperties(param)

test inline additionalProperties



### Example
```java
SwagFakeApi api = new SwagFakeApi();

Map<String, Object> params = new Map<String, Object>{
    'param' => Object.getExample()
};

try {
    // cross your fingers
    api.testInlineAdditionalProperties(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | **Object**| request body |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testJsonFormData"></a>
# **testJsonFormData**
> testJsonFormData(param, param2)

test json serialization of form data



### Example
```java
SwagFakeApi api = new SwagFakeApi();

Map<String, Object> params = new Map<String, Object>{
    'param' => 'param_example',
    'param2' => 'param2_example'
};

try {
    // cross your fingers
    api.testJsonFormData(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | **String**| field1 |
 **param2** | **String**| field2 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

