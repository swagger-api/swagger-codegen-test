# Swagger\Client\PetApi

All URIs are relative to *https://raw.githubusercontent.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPet**](PetApi.md#addpet) | **POST** /pet | Add a new pet to the store
[**deletePet**](PetApi.md#deletepet) | **DELETE** /pet/{petId} | Deletes a pet
[**findPetsByStatus**](PetApi.md#findpetsbystatus) | **GET** /pet/findByStatus | Finds Pets by status
[**findPetsByTags**](PetApi.md#findpetsbytags) | **GET** /pet/findByTags | Finds Pets by tags
[**getPetById**](PetApi.md#getpetbyid) | **GET** /pet/{petId} | Find pet by ID
[**updatePet**](PetApi.md#updatepet) | **PUT** /pet | Update an existing pet
[**updatePetWithForm**](PetApi.md#updatepetwithform) | **POST** /pet/{petId} | Updates a pet in the store with form data
[**uploadFile**](PetApi.md#uploadfile) | **POST** /pet/{petId}/uploadImage | uploads an image

# **addPet**
> \Swagger\Client\Model\Pet addPet($body)

Add a new pet to the store

Add a new pet to the store

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: petstore_auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Swagger\Client\Api\PetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\Pet(); // \Swagger\Client\Model\Pet | Create a new pet in the store

try {
    $result = $apiInstance->addPet($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PetApi->addPet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Pet**](../Model/Pet.md)| Create a new pet in the store |

### Return type

[**\Swagger\Client\Model\Pet**](../Model/Pet.md)

### Authorization

[petstore_auth](../../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **addPet**
> \Swagger\Client\Model\Pet addPet($id, $name, $category, $photo_urls, $tags, $status)

Add a new pet to the store

Add a new pet to the store

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: petstore_auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Swagger\Client\Api\PetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 789; // int | 
$name = "name_example"; // string | 
$category = new \Swagger\Client\Model\Category(); // \Swagger\Client\Model\Category | 
$photo_urls = array("photo_urls_example"); // string[] | 
$tags = array(new \Swagger\Client\Model\Tag()); // \Swagger\Client\Model\Tag[] | 
$status = "status_example"; // string | 

try {
    $result = $apiInstance->addPet($id, $name, $category, $photo_urls, $tags, $status);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PetApi->addPet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  |
 **name** | **string**|  |
 **category** | [**\Swagger\Client\Model\Category**](../Model/.md)|  |
 **photo_urls** | [**string[]**](../Model/string.md)|  |
 **tags** | [**\Swagger\Client\Model\Tag[]**](../Model/\Swagger\Client\Model\Tag.md)|  |
 **status** | **string**|  |

### Return type

[**\Swagger\Client\Model\Pet**](../Model/Pet.md)

### Authorization

[petstore_auth](../../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deletePet**
> deletePet($pet_id, $api_key)

Deletes a pet

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: petstore_auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Swagger\Client\Api\PetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$pet_id = 789; // int | Pet id to delete
$api_key = "api_key_example"; // string | 

try {
    $apiInstance->deletePet($pet_id, $api_key);
} catch (Exception $e) {
    echo 'Exception when calling PetApi->deletePet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pet_id** | **int**| Pet id to delete |
 **api_key** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[petstore_auth](../../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **findPetsByStatus**
> \Swagger\Client\Model\Pet[] findPetsByStatus($status)

Finds Pets by status

Multiple status values can be provided with comma separated strings

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: petstore_auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Swagger\Client\Api\PetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$status = "available"; // string | Status values that need to be considered for filter

try {
    $result = $apiInstance->findPetsByStatus($status);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PetApi->findPetsByStatus: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **string**| Status values that need to be considered for filter | [optional] [default to available]

### Return type

[**\Swagger\Client\Model\Pet[]**](../Model/Pet.md)

### Authorization

[petstore_auth](../../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **findPetsByTags**
> \Swagger\Client\Model\Pet[] findPetsByTags($tags)

Finds Pets by tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: petstore_auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Swagger\Client\Api\PetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tags = array("tags_example"); // string[] | Tags to filter by

try {
    $result = $apiInstance->findPetsByTags($tags);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PetApi->findPetsByTags: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**string[]**](../Model/string.md)| Tags to filter by | [optional]

### Return type

[**\Swagger\Client\Model\Pet[]**](../Model/Pet.md)

### Authorization

[petstore_auth](../../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPetById**
> \Swagger\Client\Model\Pet getPetById($pet_id)

Find pet by ID

Returns a single pet

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: api_key
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api_key', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api_key', 'Bearer');
// Configure OAuth2 access token for authorization: petstore_auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Swagger\Client\Api\PetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$pet_id = 789; // int | ID of pet to return

try {
    $result = $apiInstance->getPetById($pet_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PetApi->getPetById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pet_id** | **int**| ID of pet to return |

### Return type

[**\Swagger\Client\Model\Pet**](../Model/Pet.md)

### Authorization

[api_key](../../README.md#api_key), [petstore_auth](../../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updatePet**
> \Swagger\Client\Model\Pet updatePet($body)

Update an existing pet

Update an existing pet by Id

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: petstore_auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Swagger\Client\Api\PetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\Pet(); // \Swagger\Client\Model\Pet | Update an existent pet in the store

try {
    $result = $apiInstance->updatePet($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PetApi->updatePet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Pet**](../Model/Pet.md)| Update an existent pet in the store |

### Return type

[**\Swagger\Client\Model\Pet**](../Model/Pet.md)

### Authorization

[petstore_auth](../../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updatePet**
> \Swagger\Client\Model\Pet updatePet($id, $name, $category, $photo_urls, $tags, $status)

Update an existing pet

Update an existing pet by Id

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: petstore_auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Swagger\Client\Api\PetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 789; // int | 
$name = "name_example"; // string | 
$category = new \Swagger\Client\Model\Category(); // \Swagger\Client\Model\Category | 
$photo_urls = array("photo_urls_example"); // string[] | 
$tags = array(new \Swagger\Client\Model\Tag()); // \Swagger\Client\Model\Tag[] | 
$status = "status_example"; // string | 

try {
    $result = $apiInstance->updatePet($id, $name, $category, $photo_urls, $tags, $status);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PetApi->updatePet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  |
 **name** | **string**|  |
 **category** | [**\Swagger\Client\Model\Category**](../Model/.md)|  |
 **photo_urls** | [**string[]**](../Model/string.md)|  |
 **tags** | [**\Swagger\Client\Model\Tag[]**](../Model/\Swagger\Client\Model\Tag.md)|  |
 **status** | **string**|  |

### Return type

[**\Swagger\Client\Model\Pet**](../Model/Pet.md)

### Authorization

[petstore_auth](../../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updatePetWithForm**
> updatePetWithForm($pet_id, $name, $status)

Updates a pet in the store with form data

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: petstore_auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Swagger\Client\Api\PetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$pet_id = 789; // int | ID of pet that needs to be updated
$name = "name_example"; // string | Name of pet that needs to be updated
$status = "status_example"; // string | Status of pet that needs to be updated

try {
    $apiInstance->updatePetWithForm($pet_id, $name, $status);
} catch (Exception $e) {
    echo 'Exception when calling PetApi->updatePetWithForm: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pet_id** | **int**| ID of pet that needs to be updated |
 **name** | **string**| Name of pet that needs to be updated | [optional]
 **status** | **string**| Status of pet that needs to be updated | [optional]

### Return type

void (empty response body)

### Authorization

[petstore_auth](../../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **uploadFile**
> \Swagger\Client\Model\ApiResponse uploadFile($pet_id, $body, $additional_metadata)

uploads an image

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: petstore_auth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Swagger\Client\Api\PetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$pet_id = 789; // int | ID of pet to update
$body = new \Swagger\Client\Model\Object(); // Object | 
$additional_metadata = "additional_metadata_example"; // string | Additional Metadata

try {
    $result = $apiInstance->uploadFile($pet_id, $body, $additional_metadata);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PetApi->uploadFile: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pet_id** | **int**| ID of pet to update |
 **body** | **Object**|  | [optional]
 **additional_metadata** | **string**| Additional Metadata | [optional]

### Return type

[**\Swagger\Client\Model\ApiResponse**](../Model/ApiResponse.md)

### Authorization

[petstore_auth](../../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

