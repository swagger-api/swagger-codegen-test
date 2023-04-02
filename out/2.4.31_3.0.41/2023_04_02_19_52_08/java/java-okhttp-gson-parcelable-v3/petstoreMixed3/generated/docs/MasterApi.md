# MasterApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**masterOperation**](MasterApi.md#masterOperation) | **GET** /master | 

<a name="masterOperation"></a>
# **masterOperation**
> List&lt;PartMaster&gt; masterOperation()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MasterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MasterApi apiInstance = new MasterApi();
try {
    List<PartMaster> result = apiInstance.masterOperation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterApi#masterOperation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PartMaster&gt;**](PartMaster.md)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

