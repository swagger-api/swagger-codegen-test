# ParrotApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParrot**](ParrotApi.md#addParrot) | **POST** parrot | Add a new parrow to the store
[**getParrots**](ParrotApi.md#getParrots) | **GET** parrot | get Parrots
[**updateParrots**](ParrotApi.md#updateParrots) | **PUT** parrot | update parrots

<a name="addParrot"></a>
# **addParrot**
> Object addParrot(body)

Add a new parrow to the store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ParrotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ParrotApi apiInstance = new ParrotApi();
Object body = null; // Object | 
try {
    Object result = apiInstance.addParrot(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParrotApi#addParrot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**Object**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getParrots"></a>
# **getParrots**
> List&lt;Object&gt; getParrots()

get Parrots

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ParrotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ParrotApi apiInstance = new ParrotApi();
try {
    List<Object> result = apiInstance.getParrots();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParrotApi#getParrots");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateParrots"></a>
# **updateParrots**
> InlineResponse200 updateParrots(body)

update parrots

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ParrotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ParrotApi apiInstance = new ParrotApi();
Body8 body = new Body8(); // Body8 | 
try {
    InlineResponse200 result = apiInstance.updateParrots(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParrotApi#updateParrots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body8**](Body8.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

