# UserApi

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

<a name="createUser"></a>
# **createUser**
> User createUser(body)

Create user

This can only be done by the logged in user.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val body : User =  // User | Created user object
try {
    val result : User = apiInstance.createUser(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#createUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#createUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| Created user object | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="createUser"></a>
# **createUser**
> User createUser(id, username, firstName, lastName, email, password, phone, userStatus)

Create user

This can only be done by the logged in user.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val username : kotlin.String = username_example // kotlin.String | 
val firstName : kotlin.String = firstName_example // kotlin.String | 
val lastName : kotlin.String = lastName_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val password : kotlin.String = password_example // kotlin.String | 
val phone : kotlin.String = phone_example // kotlin.String | 
val userStatus : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : User = apiInstance.createUser(id, username, firstName, lastName, email, password, phone, userStatus)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#createUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#createUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  | [optional]
 **username** | **kotlin.String**|  | [optional]
 **firstName** | **kotlin.String**|  | [optional]
 **lastName** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **password** | **kotlin.String**|  | [optional]
 **phone** | **kotlin.String**|  | [optional]
 **userStatus** | **kotlin.Int**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="createUsersWithListInput"></a>
# **createUsersWithListInput**
> User createUsersWithListInput(body)

Creates list of users with given input array

Creates list of users with given input array

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val body : kotlin.Array<User> =  // kotlin.Array<User> | 
try {
    val result : User = apiInstance.createUsersWithListInput(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#createUsersWithListInput")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#createUsersWithListInput")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Array&lt;User&gt;**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(username)

Delete user

This can only be done by the logged in user.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val username : kotlin.String = username_example // kotlin.String | The name that needs to be deleted
try {
    apiInstance.deleteUser(username)
} catch (e: ClientException) {
    println("4xx response calling UserApi#deleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#deleteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The name that needs to be deleted |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUserByName"></a>
# **getUserByName**
> User getUserByName(username)

Get user by user name

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val username : kotlin.String = username_example // kotlin.String | The name that needs to be fetched. Use user1 for testing. 
try {
    val result : User = apiInstance.getUserByName(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getUserByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getUserByName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The name that needs to be fetched. Use user1 for testing.  |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="loginUser"></a>
# **loginUser**
> kotlin.String loginUser(username, password)

Logs user into the system

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val username : kotlin.String = username_example // kotlin.String | The user name for login
val password : kotlin.String = password_example // kotlin.String | The password for login in clear text
try {
    val result : kotlin.String = apiInstance.loginUser(username, password)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#loginUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#loginUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The user name for login | [optional]
 **password** | **kotlin.String**| The password for login in clear text | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="logoutUser"></a>
# **logoutUser**
> logoutUser()

Logs out current logged in user session

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
try {
    apiInstance.logoutUser()
} catch (e: ClientException) {
    println("4xx response calling UserApi#logoutUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#logoutUser")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateUser"></a>
# **updateUser**
> updateUser(username, body)

Update user

This can only be done by the logged in user.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val username : kotlin.String = username_example // kotlin.String | name that need to be deleted
val body : User =  // User | Update an existent user in the store
try {
    apiInstance.updateUser(username, body)
} catch (e: ClientException) {
    println("4xx response calling UserApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| name that need to be deleted |
 **body** | [**User**](User.md)| Update an existent user in the store | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="updateUser"></a>
# **updateUser**
> updateUser(username, id, username2, firstName, lastName, email, password, phone, userStatus)

Update user

This can only be done by the logged in user.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val username : kotlin.String = username_example // kotlin.String | name that need to be deleted
val id : kotlin.Long = 789 // kotlin.Long | 
val username2 : kotlin.String = username_example // kotlin.String | 
val firstName : kotlin.String = firstName_example // kotlin.String | 
val lastName : kotlin.String = lastName_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val password : kotlin.String = password_example // kotlin.String | 
val phone : kotlin.String = phone_example // kotlin.String | 
val userStatus : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.updateUser(username, id, username2, firstName, lastName, email, password, phone, userStatus)
} catch (e: ClientException) {
    println("4xx response calling UserApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| name that need to be deleted |
 **id** | **kotlin.Long**|  | [optional]
 **username2** | **kotlin.String**|  | [optional]
 **firstName** | **kotlin.String**|  | [optional]
 **lastName** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **password** | **kotlin.String**|  | [optional]
 **phone** | **kotlin.String**|  | [optional]
 **userStatus** | **kotlin.Int**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

