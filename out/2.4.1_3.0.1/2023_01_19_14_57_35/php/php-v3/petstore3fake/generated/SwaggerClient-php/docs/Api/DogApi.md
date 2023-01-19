# Swagger\Client\DogApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDog**](DogApi.md#addDog) | **POST** /dog | Add a new dog to the store
[**deleteDog**](DogApi.md#deleteDog) | **DELETE** /dog/{dogId} | Deletes a dog
[**getDogById**](DogApi.md#getDogById) | **GET** /dog/{dogId} | Find dog by ID
[**updateDog**](DogApi.md#updateDog) | **PUT** /dog | Update an existing dog
[**updateDogWithForm**](DogApi.md#updateDogWithForm) | **POST** /dog/{dogId} | Updates a dog

# **addDog**
> addDog($body)

Add a new dog to the store

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\null(); //  | Dog object that needs to be added to the store

try {
    $apiInstance->addDog($body);
} catch (Exception $e) {
    echo 'Exception when calling DogApi->addDog: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [****](../Model/.md)| Dog object that needs to be added to the store |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/jsonapplication/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteDog**
> deleteDog($dog_id, $api_key)

Deletes a dog

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$dog_id = 789; // int | Dog id to delete
$api_key = "api_key_example"; // string | 

try {
    $apiInstance->deleteDog($dog_id, $api_key);
} catch (Exception $e) {
    echo 'Exception when calling DogApi->deleteDog: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dog_id** | **int**| Dog id to delete |
 **api_key** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDogById**
> \Swagger\Client\Model\Dog getDogById($dog_id)

Find dog by ID

Returns a single dog

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$dog_id = 789; // int | ID of dog to return

try {
    $result = $apiInstance->getDogById($dog_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DogApi->getDogById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dog_id** | **int**| ID of dog to return |

### Return type

[**\Swagger\Client\Model\Dog**](../Model/Dog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xmlapplication/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateDog**
> updateDog($body)

Update an existing dog

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\null(); //  | Dog object that needs to be added.

try {
    $apiInstance->updateDog($body);
} catch (Exception $e) {
    echo 'Exception when calling DogApi->updateDog: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [****](../Model/.md)| Dog object that needs to be added. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/jsonapplication/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateDogWithForm**
> updateDogWithForm($dog_id, $name, $status)

Updates a dog

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$dog_id = 789; // int | ID of dog that needs to be updated
$name = "name_example"; // string | 
$status = "status_example"; // string | 

try {
    $apiInstance->updateDogWithForm($dog_id, $name, $status);
} catch (Exception $e) {
    echo 'Exception when calling DogApi->updateDogWithForm: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dog_id** | **int**| ID of dog that needs to be updated |
 **name** | **string**|  | [optional]
 **status** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

