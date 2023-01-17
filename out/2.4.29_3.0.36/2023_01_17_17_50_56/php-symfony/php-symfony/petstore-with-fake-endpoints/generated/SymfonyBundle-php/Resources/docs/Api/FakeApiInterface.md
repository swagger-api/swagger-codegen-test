# Swagger\Server\Api\FakeApiInterface

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fakeOuterBooleanSerialize**](FakeApiInterface.md#fakeOuterBooleanSerialize) | **POST** /fake/outer/boolean | 
[**fakeOuterCompositeSerialize**](FakeApiInterface.md#fakeOuterCompositeSerialize) | **POST** /fake/outer/composite | 
[**fakeOuterNumberSerialize**](FakeApiInterface.md#fakeOuterNumberSerialize) | **POST** /fake/outer/number | 
[**fakeOuterStringSerialize**](FakeApiInterface.md#fakeOuterStringSerialize) | **POST** /fake/outer/string | 
[**testBodyWithQueryParams**](FakeApiInterface.md#testBodyWithQueryParams) | **PUT** /fake/body-with-query-params | 
[**testClientModel**](FakeApiInterface.md#testClientModel) | **PATCH** /fake | To test \&quot;client\&quot; model
[**testEndpointParameters**](FakeApiInterface.md#testEndpointParameters) | **POST** /fake | Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트
[**testEnumParameters**](FakeApiInterface.md#testEnumParameters) | **GET** /fake | To test enum parameters
[**testInlineAdditionalProperties**](FakeApiInterface.md#testInlineAdditionalProperties) | **POST** /fake/inline-additionalProperties | test inline additionalProperties
[**testJsonFormData**](FakeApiInterface.md#testJsonFormData) | **GET** /fake/jsonFormData | test json serialization of form data


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.fake:
        class: Acme\MyBundle\Api\FakeApi
        tags:
            - { name: "swagger_server.api", api: "fake" }
    # ...
```

## **fakeOuterBooleanSerialize**
> Swagger\Server\Model\OuterBoolean fakeOuterBooleanSerialize($body)



Test serialization of outer boolean types

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FakeApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\FakeApiInterface;

class FakeApi implements FakeApiInterface
{

    // ...

    /**
     * Implementation of FakeApiInterface#fakeOuterBooleanSerialize
     */
    public function fakeOuterBooleanSerialize(OuterBoolean $body = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Swagger\Server\Model\OuterBoolean**](../Model/OuterBoolean.md)| Input boolean as post body | [optional]

### Return type

[**Swagger\Server\Model\OuterBoolean**](../Model/OuterBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **fakeOuterCompositeSerialize**
> Swagger\Server\Model\OuterComposite fakeOuterCompositeSerialize($body)



Test serialization of object with outer number type

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FakeApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\FakeApiInterface;

class FakeApi implements FakeApiInterface
{

    // ...

    /**
     * Implementation of FakeApiInterface#fakeOuterCompositeSerialize
     */
    public function fakeOuterCompositeSerialize(OuterComposite $body = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Swagger\Server\Model\OuterComposite**](../Model/OuterComposite.md)| Input composite as post body | [optional]

### Return type

[**Swagger\Server\Model\OuterComposite**](../Model/OuterComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **fakeOuterNumberSerialize**
> Swagger\Server\Model\OuterNumber fakeOuterNumberSerialize($body)



Test serialization of outer number types

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FakeApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\FakeApiInterface;

class FakeApi implements FakeApiInterface
{

    // ...

    /**
     * Implementation of FakeApiInterface#fakeOuterNumberSerialize
     */
    public function fakeOuterNumberSerialize(OuterNumber $body = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Swagger\Server\Model\OuterNumber**](../Model/OuterNumber.md)| Input number as post body | [optional]

### Return type

[**Swagger\Server\Model\OuterNumber**](../Model/OuterNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **fakeOuterStringSerialize**
> Swagger\Server\Model\OuterString fakeOuterStringSerialize($body)



Test serialization of outer string types

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FakeApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\FakeApiInterface;

class FakeApi implements FakeApiInterface
{

    // ...

    /**
     * Implementation of FakeApiInterface#fakeOuterStringSerialize
     */
    public function fakeOuterStringSerialize(OuterString $body = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Swagger\Server\Model\OuterString**](../Model/OuterString.md)| Input string as post body | [optional]

### Return type

[**Swagger\Server\Model\OuterString**](../Model/OuterString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **testBodyWithQueryParams**
> testBodyWithQueryParams($body, $query)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FakeApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\FakeApiInterface;

class FakeApi implements FakeApiInterface
{

    // ...

    /**
     * Implementation of FakeApiInterface#testBodyWithQueryParams
     */
    public function testBodyWithQueryParams(User $body, $query)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Swagger\Server\Model\User**](../Model/User.md)|  |
 **query** | **string**|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **testClientModel**
> Swagger\Server\Model\Client testClientModel($body)

To test \"client\" model

To test \"client\" model

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FakeApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\FakeApiInterface;

class FakeApi implements FakeApiInterface
{

    // ...

    /**
     * Implementation of FakeApiInterface#testClientModel
     */
    public function testClientModel(Client $body)
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

## **testEndpointParameters**
> testEndpointParameters($number, $double, $patternWithoutDelimiter, $byte, $integer, $int32, $int64, $float, $string, $binary, $date, $dateTime, $password, $callback)

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FakeApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\FakeApiInterface;

class FakeApi implements FakeApiInterface
{

    // ...

    /**
     * Implementation of FakeApiInterface#testEndpointParameters
     */
    public function testEndpointParameters($number, $double, $patternWithoutDelimiter, $byte, $integer = null, $int32 = null, $int64 = null, $float = null, $string = null, $binary = null, \DateTime $date = null, \DateTime $dateTime = null, $password = null, $callback = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **float**| None |
 **double** | **double**| None |
 **patternWithoutDelimiter** | **string**| None |
 **byte** | **string**| None |
 **integer** | **int**| None | [optional]
 **int32** | **int**| None | [optional]
 **int64** | **int**| None | [optional]
 **float** | **float**| None | [optional]
 **string** | **string**| None | [optional]
 **binary** | **string**| None | [optional]
 **date** | **\DateTime**| None | [optional]
 **dateTime** | **\DateTime**| None | [optional]
 **password** | **string**| None | [optional]
 **callback** | **string**| None | [optional]

### Return type

void (empty response body)

### Authorization

[http_basic_test](../../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: application/xml; charset=utf-8, application/json; charset=utf-8
 - **Accept**: application/xml; charset=utf-8, application/json; charset=utf-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **testEnumParameters**
> testEnumParameters($enumFormStringArray, $enumFormString, $enumHeaderStringArray, $enumHeaderString, $enumQueryStringArray, $enumQueryString, $enumQueryInteger, $enumQueryDouble)

To test enum parameters

To test enum parameters

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FakeApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\FakeApiInterface;

class FakeApi implements FakeApiInterface
{

    // ...

    /**
     * Implementation of FakeApiInterface#testEnumParameters
     */
    public function testEnumParameters(array $enumFormStringArray = null, $enumFormString = ''-efg'', array $enumHeaderStringArray = null, $enumHeaderString = ''-efg'', array $enumQueryStringArray = null, $enumQueryString = ''-efg'', $enumQueryInteger = null, $enumQueryDouble = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enumFormStringArray** | [**string**](../Model/string.md)| Form parameter enum test (string array) | [optional]
 **enumFormString** | **string**| Form parameter enum test (string) | [optional] [default to &#39;-efg&#39;]
 **enumHeaderStringArray** | [**string**](../Model/string.md)| Header parameter enum test (string array) | [optional]
 **enumHeaderString** | **string**| Header parameter enum test (string) | [optional] [default to &#39;-efg&#39;]
 **enumQueryStringArray** | [**string**](../Model/string.md)| Query parameter enum test (string array) | [optional]
 **enumQueryString** | **string**| Query parameter enum test (string) | [optional] [default to &#39;-efg&#39;]
 **enumQueryInteger** | **int**| Query parameter enum test (double) | [optional]
 **enumQueryDouble** | **double**| Query parameter enum test (double) | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **testInlineAdditionalProperties**
> testInlineAdditionalProperties($param)

test inline additionalProperties



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FakeApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\FakeApiInterface;

class FakeApi implements FakeApiInterface
{

    // ...

    /**
     * Implementation of FakeApiInterface#testInlineAdditionalProperties
     */
    public function testInlineAdditionalProperties(array $param)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | **array**| request body |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **testJsonFormData**
> testJsonFormData($param, $param2)

test json serialization of form data



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FakeApiInterface.php

namespace Acme\MyBundle\Api;

use Swagger\Server\Api\FakeApiInterface;

class FakeApi implements FakeApiInterface
{

    // ...

    /**
     * Implementation of FakeApiInterface#testJsonFormData
     */
    public function testJsonFormData($param, $param2)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | **string**| field1 |
 **param2** | **string**| field2 |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

