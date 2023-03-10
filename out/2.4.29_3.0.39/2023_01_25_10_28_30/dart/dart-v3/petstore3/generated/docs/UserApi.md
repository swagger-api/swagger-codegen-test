# swagger.api.UserApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://raw.githubusercontent.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /user | Create user
[**createUsersWithListInput**](UserApi.md#createUsersWithListInput) | **POST** /user/createWithList | Creates list of users with given input array
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /user/{username} | Delete user
[**getUserByName**](UserApi.md#getUserByName) | **GET** /user/{username} | Get user by user name
[**loginUser**](UserApi.md#loginUser) | **GET** /user/login | Logs user into the system
[**logoutUser**](UserApi.md#logoutUser) | **GET** /user/logout | Logs out current logged in user session
[**updateUser**](UserApi.md#updateUser) | **PUT** /user/{username} | Update user

# **createUser**
> User createUser(body, id, username, firstName, lastName, email, password, phone, userStatus)

Create user

This can only be done by the logged in user.

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new UserApi();
var body = new User(); // User | Created user object
var id = 789; // int | 
var username = username_example; // String | 
var firstName = firstName_example; // String | 
var lastName = lastName_example; // String | 
var email = email_example; // String | 
var password = password_example; // String | 
var phone = phone_example; // String | 
var userStatus = 56; // int | 

try {
    var result = api_instance.createUser(body, id, username, firstName, lastName, email, password, phone, userStatus);
    print(result);
} catch (e) {
    print("Exception when calling UserApi->createUser: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| Created user object | [optional] 
 **id** | **int**|  | [optional] 
 **username** | **String**|  | [optional] 
 **firstName** | **String**|  | [optional] 
 **lastName** | **String**|  | [optional] 
 **email** | **String**|  | [optional] 
 **password** | **String**|  | [optional] 
 **phone** | **String**|  | [optional] 
 **userStatus** | **int**|  | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createUsersWithListInput**
> User createUsersWithListInput(body)

Creates list of users with given input array

Creates list of users with given input array

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new UserApi();
var body = [new List&lt;User&gt;()]; // List<User> | 

try {
    var result = api_instance.createUsersWithListInput(body);
    print(result);
} catch (e) {
    print("Exception when calling UserApi->createUsersWithListInput: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;User&gt;**](User.md)|  | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteUser**
> deleteUser(username)

Delete user

This can only be done by the logged in user.

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new UserApi();
var username = username_example; // String | The name that needs to be deleted

try {
    api_instance.deleteUser(username);
} catch (e) {
    print("Exception when calling UserApi->deleteUser: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The name that needs to be deleted | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserByName**
> User getUserByName(username)

Get user by user name

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new UserApi();
var username = username_example; // String | The name that needs to be fetched. Use user1 for testing. 

try {
    var result = api_instance.getUserByName(username);
    print(result);
} catch (e) {
    print("Exception when calling UserApi->getUserByName: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The name that needs to be fetched. Use user1 for testing.  | 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **loginUser**
> String loginUser(username, password)

Logs user into the system

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new UserApi();
var username = username_example; // String | The user name for login
var password = password_example; // String | The password for login in clear text

try {
    var result = api_instance.loginUser(username, password);
    print(result);
} catch (e) {
    print("Exception when calling UserApi->loginUser: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The user name for login | [optional] 
 **password** | **String**| The password for login in clear text | [optional] 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **logoutUser**
> logoutUser()

Logs out current logged in user session

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new UserApi();

try {
    api_instance.logoutUser();
} catch (e) {
    print("Exception when calling UserApi->logoutUser: $e\n");
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateUser**
> updateUser(username, body, id, username, firstName, lastName, email, password, phone, userStatus)

Update user

This can only be done by the logged in user.

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new UserApi();
var username = username_example; // String | name that need to be deleted
var body = new User(); // User | Update an existent user in the store
var id = 789; // int | 
var username = username_example; // String | 
var firstName = firstName_example; // String | 
var lastName = lastName_example; // String | 
var email = email_example; // String | 
var password = password_example; // String | 
var phone = phone_example; // String | 
var userStatus = 56; // int | 

try {
    api_instance.updateUser(username, body, id, username, firstName, lastName, email, password, phone, userStatus);
} catch (e) {
    print("Exception when calling UserApi->updateUser: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| name that need to be deleted | 
 **body** | [**User**](User.md)| Update an existent user in the store | [optional] 
 **id** | **int**|  | [optional] 
 **username** | **String**|  | [optional] 
 **firstName** | **String**|  | [optional] 
 **lastName** | **String**|  | [optional] 
 **email** | **String**|  | [optional] 
 **password** | **String**|  | [optional] 
 **phone** | **String**|  | [optional] 
 **userStatus** | **int**|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

