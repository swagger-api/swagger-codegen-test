# Swagger\Client\UserApi

All URIs are relative to *https://raw.githubusercontent.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createuser) | **POST** /user | Create user
[**createUsersWithListInput**](UserApi.md#createuserswithlistinput) | **POST** /user/createWithList | Creates list of users with given input array
[**deleteUser**](UserApi.md#deleteuser) | **DELETE** /user/{username} | Delete user
[**getUserByName**](UserApi.md#getuserbyname) | **GET** /user/{username} | Get user by user name
[**loginUser**](UserApi.md#loginuser) | **GET** /user/login | Logs user into the system
[**logoutUser**](UserApi.md#logoutuser) | **GET** /user/logout | Logs out current logged in user session
[**updateUser**](UserApi.md#updateuser) | **PUT** /user/{username} | Update user

# **createUser**
> \Swagger\Client\Model\User createUser($body)

Create user

This can only be done by the logged in user.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\User(); // \Swagger\Client\Model\User | Created user object

try {
    $result = $apiInstance->createUser($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->createUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\User**](../Model/User.md)| Created user object | [optional]

### Return type

[**\Swagger\Client\Model\User**](../Model/User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createUser**
> \Swagger\Client\Model\User createUser($id, $username, $first_name, $last_name, $email, $password, $phone, $user_status)

Create user

This can only be done by the logged in user.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 789; // int | 
$username = "username_example"; // string | 
$first_name = "first_name_example"; // string | 
$last_name = "last_name_example"; // string | 
$email = "email_example"; // string | 
$password = "password_example"; // string | 
$phone = "phone_example"; // string | 
$user_status = 56; // int | 

try {
    $result = $apiInstance->createUser($id, $username, $first_name, $last_name, $email, $password, $phone, $user_status);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->createUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | [optional]
 **username** | **string**|  | [optional]
 **first_name** | **string**|  | [optional]
 **last_name** | **string**|  | [optional]
 **email** | **string**|  | [optional]
 **password** | **string**|  | [optional]
 **phone** | **string**|  | [optional]
 **user_status** | **int**|  | [optional]

### Return type

[**\Swagger\Client\Model\User**](../Model/User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createUsersWithListInput**
> \Swagger\Client\Model\User createUsersWithListInput($body)

Creates list of users with given input array

Creates list of users with given input array

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = array(new \Swagger\Client\Model\User()); // \Swagger\Client\Model\User[] | 

try {
    $result = $apiInstance->createUsersWithListInput($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->createUsersWithListInput: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\User[]**](../Model/User.md)|  | [optional]

### Return type

[**\Swagger\Client\Model\User**](../Model/User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteUser**
> deleteUser($username)

Delete user

This can only be done by the logged in user.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$username = "username_example"; // string | The name that needs to be deleted

try {
    $apiInstance->deleteUser($username);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->deleteUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| The name that needs to be deleted |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getUserByName**
> \Swagger\Client\Model\User getUserByName($username)

Get user by user name

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$username = "username_example"; // string | The name that needs to be fetched. Use user1 for testing.

try {
    $result = $apiInstance->getUserByName($username);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->getUserByName: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| The name that needs to be fetched. Use user1 for testing. |

### Return type

[**\Swagger\Client\Model\User**](../Model/User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **loginUser**
> string loginUser($username, $password)

Logs user into the system

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$username = "username_example"; // string | The user name for login
$password = "password_example"; // string | The password for login in clear text

try {
    $result = $apiInstance->loginUser($username, $password);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->loginUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| The user name for login | [optional]
 **password** | **string**| The password for login in clear text | [optional]

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **logoutUser**
> logoutUser()

Logs out current logged in user session

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $apiInstance->logoutUser();
} catch (Exception $e) {
    echo 'Exception when calling UserApi->logoutUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateUser**
> updateUser($username, $body)

Update user

This can only be done by the logged in user.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$username = "username_example"; // string | name that need to be deleted
$body = new \Swagger\Client\Model\User(); // \Swagger\Client\Model\User | Update an existent user in the store

try {
    $apiInstance->updateUser($username, $body);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->updateUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| name that need to be deleted |
 **body** | [**\Swagger\Client\Model\User**](../Model/User.md)| Update an existent user in the store | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateUser**
> updateUser($username, $id, $username2, $first_name, $last_name, $email, $password, $phone, $user_status)

Update user

This can only be done by the logged in user.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$username = "username_example"; // string | name that need to be deleted
$id = 789; // int | 
$username2 = "username_example"; // string | 
$first_name = "first_name_example"; // string | 
$last_name = "last_name_example"; // string | 
$email = "email_example"; // string | 
$password = "password_example"; // string | 
$phone = "phone_example"; // string | 
$user_status = 56; // int | 

try {
    $apiInstance->updateUser($username, $id, $username2, $first_name, $last_name, $email, $password, $phone, $user_status);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->updateUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| name that need to be deleted |
 **id** | **int**|  | [optional]
 **username2** | **string**|  | [optional]
 **first_name** | **string**|  | [optional]
 **last_name** | **string**|  | [optional]
 **email** | **string**|  | [optional]
 **password** | **string**|  | [optional]
 **phone** | **string**|  | [optional]
 **user_status** | **int**|  | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

