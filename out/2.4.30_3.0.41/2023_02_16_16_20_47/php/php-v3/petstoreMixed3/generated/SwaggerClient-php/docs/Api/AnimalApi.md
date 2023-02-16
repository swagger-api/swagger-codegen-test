# Swagger\Client\AnimalApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAnimal**](AnimalApi.md#addanimal) | **POST** /animal | Add a new animal to the store
[**deleteAnimal**](AnimalApi.md#deleteanimal) | **DELETE** /animal/{animalId} | Deletes a animal
[**getAnimalById**](AnimalApi.md#getanimalbyid) | **GET** /animal/{animalId} | Find animal by ID
[**updateAnimal**](AnimalApi.md#updateanimal) | **PUT** /animal | Update an existing animal
[**updateAnimalWithForm**](AnimalApi.md#updateanimalwithform) | **POST** /animal/{animalId} | Updates a animal

# **addAnimal**
> addAnimal($body)

Add a new animal to the store

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: api_key_query
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api_key_query', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api_key_query', 'Bearer');

$apiInstance = new Swagger\Client\Api\AnimalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\Animal(); // \Swagger\Client\Model\Animal | Animal object that needs to be added to the store

try {
    $apiInstance->addAnimal($body);
} catch (Exception $e) {
    echo 'Exception when calling AnimalApi->addAnimal: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Animal**](../Model/Animal.md)| Animal object that needs to be added to the store |

### Return type

void (empty response body)

### Authorization

[api_key_query](../../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAnimal**
> deleteAnimal($animal_id, $api_key)

Deletes a animal

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: api_key_query
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api_key_query', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api_key_query', 'Bearer');

$apiInstance = new Swagger\Client\Api\AnimalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$animal_id = 789; // int | Animal id to delete
$api_key = "api_key_example"; // string | 

try {
    $apiInstance->deleteAnimal($animal_id, $api_key);
} catch (Exception $e) {
    echo 'Exception when calling AnimalApi->deleteAnimal: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animal_id** | **int**| Animal id to delete |
 **api_key** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[api_key_query](../../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAnimalById**
> \Swagger\Client\Model\Animal getAnimalById($animal_id)

Find animal by ID

Returns a single animal

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: api_key_query
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api_key_query', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api_key_query', 'Bearer');

$apiInstance = new Swagger\Client\Api\AnimalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$animal_id = 789; // int | ID of pet to return

try {
    $result = $apiInstance->getAnimalById($animal_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnimalApi->getAnimalById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animal_id** | **int**| ID of pet to return |

### Return type

[**\Swagger\Client\Model\Animal**](../Model/Animal.md)

### Authorization

[api_key_query](../../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAnimal**
> updateAnimal($body)

Update an existing animal

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: api_key_query
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api_key_query', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api_key_query', 'Bearer');

$apiInstance = new Swagger\Client\Api\AnimalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\Animal(); // \Swagger\Client\Model\Animal | Animal object that needs to be added.

try {
    $apiInstance->updateAnimal($body);
} catch (Exception $e) {
    echo 'Exception when calling AnimalApi->updateAnimal: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Animal**](../Model/Animal.md)| Animal object that needs to be added. |

### Return type

void (empty response body)

### Authorization

[api_key_query](../../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAnimalWithForm**
> updateAnimalWithForm($animal_id, $name, $status)

Updates a animal

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: api_key_query
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api_key_query', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api_key_query', 'Bearer');

$apiInstance = new Swagger\Client\Api\AnimalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$animal_id = 789; // int | ID of animal that needs to be updated
$name = "name_example"; // string | 
$status = "status_example"; // string | 

try {
    $apiInstance->updateAnimalWithForm($animal_id, $name, $status);
} catch (Exception $e) {
    echo 'Exception when calling AnimalApi->updateAnimalWithForm: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animal_id** | **int**| ID of animal that needs to be updated |
 **name** | **string**|  | [optional]
 **status** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[api_key_query](../../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

