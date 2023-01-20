# SwaggerPetstore.FakeApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fakeOuterBooleanSerialize**](FakeApi.md#fakeOuterBooleanSerialize) | **POST** /fake/outer/boolean | 
[**fakeOuterCompositeSerialize**](FakeApi.md#fakeOuterCompositeSerialize) | **POST** /fake/outer/composite | 
[**fakeOuterNumberSerialize**](FakeApi.md#fakeOuterNumberSerialize) | **POST** /fake/outer/number | 
[**fakeOuterStringSerialize**](FakeApi.md#fakeOuterStringSerialize) | **POST** /fake/outer/string | 
[**testClientModel**](FakeApi.md#testClientModel) | **PATCH** /fake | To test \&quot;client\&quot; model
[**testEndpointParameters**](FakeApi.md#testEndpointParameters) | **POST** /fake | Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
[**testEnumParameters**](FakeApi.md#testEnumParameters) | **GET** /fake | To test enum parameters
[**testEnumRequestBody**](FakeApi.md#testEnumRequestBody) | **POST** /fake/enum/form | To test enum parameters
[**testInlineAdditionalProperties**](FakeApi.md#testInlineAdditionalProperties) | **POST** /fake/inline-additionalProperties | test inline additionalProperties
[**testJsonFormData**](FakeApi.md#testJsonFormData) | **POST** /fake/jsonFormData | test json serialization of form data

<a name="fakeOuterBooleanSerialize"></a>
# **fakeOuterBooleanSerialize**
> OuterBoolean fakeOuterBooleanSerialize(opts)



Test serialization of outer boolean types

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.FakeApi();
let opts = { 
  'body': true // Boolean | Input boolean as post body
};
apiInstance.fakeOuterBooleanSerialize(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Boolean**](Boolean.md)| Input boolean as post body | [optional] 

### Return type

[**OuterBoolean**](OuterBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="fakeOuterCompositeSerialize"></a>
# **fakeOuterCompositeSerialize**
> OuterComposite fakeOuterCompositeSerialize(opts)



Test serialization of object with outer number type

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.FakeApi();
let opts = { 
  'body': new SwaggerPetstore.OuterComposite() // OuterComposite | Input composite as post body
};
apiInstance.fakeOuterCompositeSerialize(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

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

<a name="fakeOuterNumberSerialize"></a>
# **fakeOuterNumberSerialize**
> OuterNumber fakeOuterNumberSerialize(opts)



Test serialization of outer number types

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.FakeApi();
let opts = { 
  'body': 3.4 // Number | Input number as post body
};
apiInstance.fakeOuterNumberSerialize(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Number**](Number.md)| Input number as post body | [optional] 

### Return type

[**OuterNumber**](OuterNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="fakeOuterStringSerialize"></a>
# **fakeOuterStringSerialize**
> OuterString fakeOuterStringSerialize(opts)



Test serialization of outer string types

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.FakeApi();
let opts = { 
  'body': "body_example" // String | Input string as post body
};
apiInstance.fakeOuterStringSerialize(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

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

<a name="testClientModel"></a>
# **testClientModel**
> Client testClientModel(body)

To test \&quot;client\&quot; model

To test \&quot;client\&quot; model

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.FakeApi();
let body = new SwaggerPetstore.Client(); // Client | client model

apiInstance.testClientModel(body).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

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

<a name="testEndpointParameters"></a>
# **testEndpointParameters**
> testEndpointParameters(body)

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;
// Configure HTTP basic authorization: http_basic_test
let http_basic_test = defaultClient.authentications['http_basic_test'];
http_basic_test.username = 'YOUR USERNAME';
http_basic_test.password = 'YOUR PASSWORD';

let apiInstance = new SwaggerPetstore.FakeApi();
let body = new SwaggerPetstore.FakeBody(); // FakeBody | 

apiInstance.testEndpointParameters(body).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FakeBody**](FakeBody.md)|  | 

### Return type

null (empty response body)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: application/xml; charset=utf-8, application/json; charset=utf-8
 - **Accept**: Not defined

<a name="testEnumParameters"></a>
# **testEnumParameters**
> testEnumParameters(opts)

To test enum parameters

To test enum parameters

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.FakeApi();
let opts = { 
  'enumHeaderStringArray': ["enumHeaderStringArray_example"], // [String] | Header parameter enum test (string array)
  'enumHeaderString': "-efg", // String | Header parameter enum test (string)
  'enumQueryStringArray': ["enumQueryStringArray_example"], // [String] | Query parameter enum test (string array)
  'enumQueryString': "-efg", // String | Query parameter enum test (string)
  'enumQueryInteger': 56 // Number | Query parameter enum test (double)
};
apiInstance.testEnumParameters(opts).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enumHeaderStringArray** | [**[String]**](String.md)| Header parameter enum test (string array) | [optional] 
 **enumHeaderString** | **String**| Header parameter enum test (string) | [optional] [default to -efg]
 **enumQueryStringArray** | [**[String]**](String.md)| Query parameter enum test (string array) | [optional] 
 **enumQueryString** | **String**| Query parameter enum test (string) | [optional] [default to -efg]
 **enumQueryInteger** | **Number**| Query parameter enum test (double) | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="testEnumRequestBody"></a>
# **testEnumRequestBody**
> testEnumRequestBody(opts)

To test enum parameters

To test enum parameters

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.FakeApi();
let opts = { 
  'body': new SwaggerPetstore.EnumFormBody() // EnumFormBody | 
};
apiInstance.testEnumRequestBody(opts).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnumFormBody**](EnumFormBody.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="testInlineAdditionalProperties"></a>
# **testInlineAdditionalProperties**
> testInlineAdditionalProperties(body)

test inline additionalProperties

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.FakeApi();
let body = null; // {String: String} | request body

apiInstance.testInlineAdditionalProperties(body).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**{String: String}**](Object.md)| request body | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="testJsonFormData"></a>
# **testJsonFormData**
> testJsonFormData(body)

test json serialization of form data

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.FakeApi();
let body = new SwaggerPetstore.FakeJsonFormDataBody(); // FakeJsonFormDataBody | 

apiInstance.testJsonFormData(body).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FakeJsonFormDataBody**](FakeJsonFormDataBody.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

