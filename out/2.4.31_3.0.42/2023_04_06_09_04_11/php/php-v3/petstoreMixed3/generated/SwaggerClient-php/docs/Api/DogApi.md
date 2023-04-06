# Swagger\Client\DogApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDog**](DogApi.md#adddog) | **POST** /dog | Add a new dog to the store
[**deleteDog**](DogApi.md#deletedog) | **DELETE** /dog/{dogId} | Deletes a dog
[**getDogById**](DogApi.md#getdogbyid) | **GET** /dog/{dogId} | Find dog by ID
[**updateDog**](DogApi.md#updatedog) | **PUT** /dog | Update an existing dog
[**updateDogWithForm**](DogApi.md#updatedogwithform) | **POST** /dog/{dogId} | Updates a dog

# **addDog**
> addDog($body)

Add a new dog to the store

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
    // Configure HTTP bearer authorization: http_bearer_test
    $config = Swagger\Client\Configuration::getDefaultConfiguration()
    ->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new Swagger\Client\Api\DogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\Dog(); // \Swagger\Client\Model\Dog | Dog object that needs to be added to the store

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
 **body** | [**\Swagger\Client\Model\Dog**](../Model/Dog.md)| Dog object that needs to be added to the store |

### Return type

void (empty response body)

### Authorization

[http_bearer_test](../../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteDog**
> deleteDog($dog_id, $api_key)

Deletes a dog

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
    // Configure HTTP bearer authorization: http_bearer_test
    $config = Swagger\Client\Configuration::getDefaultConfiguration()
    ->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new Swagger\Client\Api\DogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
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

[http_bearer_test](../../README.md#http_bearer_test)

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
    // Configure HTTP bearer authorization: http_bearer_test
    $config = Swagger\Client\Configuration::getDefaultConfiguration()
    ->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new Swagger\Client\Api\DogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
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

[http_bearer_test](../../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateDog**
> updateDog($body)

Update an existing dog

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
    // Configure HTTP bearer authorization: http_bearer_test
    $config = Swagger\Client\Configuration::getDefaultConfiguration()
    ->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new Swagger\Client\Api\DogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\Dog(); // \Swagger\Client\Model\Dog | Dog object that needs to be added.

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
 **body** | [**\Swagger\Client\Model\Dog**](../Model/Dog.md)| Dog object that needs to be added. |

### Return type

void (empty response body)

### Authorization

[http_bearer_test](../../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateDogWithForm**
> updateDogWithForm($dog_id, $name, $status)

Updates a dog

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
    // Configure HTTP bearer authorization: http_bearer_test
    $config = Swagger\Client\Configuration::getDefaultConfiguration()
    ->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new Swagger\Client\Api\DogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
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

[http_bearer_test](../../README.md#http_bearer_test)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

