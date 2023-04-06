# Swagger\Server\Api\AnotherFakeApiInterface

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testSpecialTags**](AnotherFakeApiInterface.md#testSpecialTags) | **PATCH** /another-fake/dummy | To test special tags


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.anotherFake:
        class: Acme\MyBundle\Api\AnotherFakeApi
        tags:
            - { name: "swagger_server.api", api: "anotherFake" }
    # ...
```

## **testSpecialTags**
> Swagger\Server\Model\Client testSpecialTags($body)

To test special tags

To test special tags

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AnotherFakeApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\AnotherFakeApiInterface;

class AnotherFakeApi implements AnotherFakeApiInterface
{

    // ...

    /**
     * Implementation of AnotherFakeApiInterface#testSpecialTags
     */
    public function testSpecialTags(Client $body)
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

