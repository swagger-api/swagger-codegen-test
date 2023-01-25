# IO.Swagger.Api.ParrotApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddParrot**](ParrotApi.md#addparrot) | **POST** /parrot | Add a new parrow to the store
[**GetParrots**](ParrotApi.md#getparrots) | **GET** /parrot | get Parrots
[**UpdateParrots**](ParrotApi.md#updateparrots) | **PUT** /parrot | update parrots

<a name="addparrot"></a>
# **AddParrot**
> InlineResponse2001 AddParrot (ParrotBody1 body)

Add a new parrow to the store

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AddParrotExample
    {
        public void main()
        {


            var apiInstance = new ParrotApi();
            var body = new ParrotBody1(); // ParrotBody1 |  (optional) 

            try
            {
                // Add a new parrow to the store
                InlineResponse2001 result = apiInstance.AddParrot(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ParrotApi.AddParrot: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParrotBody1**](ParrotBody1.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getparrots"></a>
# **GetParrots**
> List<Object> GetParrots ()

get Parrots

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetParrotsExample
    {
        public void main()
        {


            var apiInstance = new ParrotApi();

            try
            {
                // get Parrots
                List&lt;Object&gt; result = apiInstance.GetParrots();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ParrotApi.GetParrots: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List<Object>**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateparrots"></a>
# **UpdateParrots**
> InlineResponse200 UpdateParrots (ParrotBody body)

update parrots

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateParrotsExample
    {
        public void main()
        {


            var apiInstance = new ParrotApi();
            var body = new ParrotBody(); // ParrotBody |  (optional) 

            try
            {
                // update parrots
                InlineResponse200 result = apiInstance.UpdateParrots(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ParrotApi.UpdateParrots: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParrotBody**](ParrotBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

