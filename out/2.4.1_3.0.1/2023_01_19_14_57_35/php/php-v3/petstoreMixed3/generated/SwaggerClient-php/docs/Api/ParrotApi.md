# Swagger\Client\ParrotApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParrot**](ParrotApi.md#addParrot) | **POST** /parrot | Add a new parrow to the store
[**getParrots**](ParrotApi.md#getParrots) | **GET** /parrot | get Parrots
[**updateParrots**](ParrotApi.md#updateParrots) | **PUT** /parrot | update parrots

# **addParrot**
> addParrot($body)

Add a new parrow to the store

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Swagger\Client\Api\ParrotApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\null(); //  | 

try {
    $apiInstance->addParrot($body);
} catch (Exception $e) {
    echo 'Exception when calling ParrotApi->addParrot: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [****](../Model/.md)|  | [optional]

### Return type

void (empty response body)

### Authorization

[jwt](../../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getParrots**
> null[] getParrots()

get Parrots

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Swagger\Client\Api\ParrotApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->getParrots();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ParrotApi->getParrots: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

**null[]**

### Authorization

[jwt](../../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateParrots**
> \Swagger\Client\Model\InlineResponse200 updateParrots($body)

update parrots

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Swagger\Client\Api\ParrotApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\Body8(); // \Swagger\Client\Model\Body8 | 

try {
    $result = $apiInstance->updateParrots($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ParrotApi->updateParrots: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Body8**](../Model/Body8.md)|  | [optional]

### Return type

[**\Swagger\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

[jwt](../../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

