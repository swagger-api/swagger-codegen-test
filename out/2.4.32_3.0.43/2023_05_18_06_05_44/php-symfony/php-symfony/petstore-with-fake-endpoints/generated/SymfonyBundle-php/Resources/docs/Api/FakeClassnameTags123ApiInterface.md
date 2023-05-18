# Swagger\Server\Api\FakeClassnameTags123ApiInterface

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testClassname**](FakeClassnameTags123ApiInterface.md#testClassname) | **PATCH** /fake_classname_test | To test class name in snake case


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.fakeClassnameTags123:
        class: Acme\MyBundle\Api\FakeClassnameTags123Api
        tags:
            - { name: "swagger_server.api", api: "fakeClassnameTags123" }
    # ...
```

## **testClassname**
> Swagger\Server\Model\Client testClassname($body)

To test class name in snake case

To test class name in snake case

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FakeClassnameTags123ApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\FakeClassnameTags123ApiInterface;

class FakeClassnameTags123Api implements FakeClassnameTags123ApiInterface
{

    /**
     * Configure API key authorization: api_key_query
     */
    public function setapi_key_query($apiKey)
    {
        // Retrieve logged in user from $apiKey ...
    }

    // ...

    /**
     * Implementation of FakeClassnameTags123ApiInterface#testClassname
     */
    public function testClassname(Client $body)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Swagger\Server\Model\Client**](../Model/Client.md)| client model |

### Return type

[**Swagger\Server\Model\Client**](../Model/Client.md)

### Authorization

[api_key_query](../../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

