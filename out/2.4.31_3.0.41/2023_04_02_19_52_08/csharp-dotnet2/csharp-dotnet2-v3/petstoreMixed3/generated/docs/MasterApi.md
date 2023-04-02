# IO.Swagger.Api.MasterApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MasterOperation**](MasterApi.md#masteroperation) | **GET** /master | 

<a name="masteroperation"></a>
# **MasterOperation**
> List<PartMaster> MasterOperation ()



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class MasterOperationExample
    {
        public void main()
        {


            var apiInstance = new MasterApi();

            try
            {
                List&lt;PartMaster&gt; result = apiInstance.MasterOperation();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MasterApi.MasterOperation: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<PartMaster>**](PartMaster.md)

### Authorization

[http_bearer_test](../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

