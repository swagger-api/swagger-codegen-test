# UserApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** user | Create user
[**createUsersWithArrayInput**](UserApi.md#createUsersWithArrayInput) | **POST** user/createWithArray | Creates list of users with given input array
[**createUsersWithListInput**](UserApi.md#createUsersWithListInput) | **POST** user/createWithList | Creates list of users with given input array
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** user/{username} | Delete user
[**getUserByName**](UserApi.md#getUserByName) | **GET** user/{username} | Get user by user name
[**loginUser**](UserApi.md#loginUser) | **GET** user/login | Logs user into the system
[**logoutUser**](UserApi.md#logoutUser) | **GET** user/logout | Logs out current logged in user session
[**updateUser**](UserApi.md#updateUser) | **PUT** user/{username} | Updated user

<a name="createUser"></a>
# **createUser**
> Void createUser(body)

Create user

This can only be done by the logged in user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
User body = new User(); // User | Created user object
try {
    Void result = apiInstance.createUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| Created user object |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="createUsersWithArrayInput"></a>
# **createUsersWithArrayInput**
> Void createUsersWithArrayInput(body)

Creates list of users with given input array

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
List<User> body = Arrays.asList(new User()); // List<User> | List of user object
try {
    Void result = apiInstance.createUsersWithArrayInput(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUsersWithArrayInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;User&gt;**](User.md)| List of user object |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="createUsersWithListInput"></a>
# **createUsersWithListInput**
> Void createUsersWithListInput(body)

Creates list of users with given input array

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
List<User> body = Arrays.asList(new User()); // List<User> | List of user object
try {
    Void result = apiInstance.createUsersWithListInput(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUsersWithListInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;User&gt;**](User.md)| List of user object |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="deleteUser"></a>
# **deleteUser**
> Void deleteUser(username)

Delete user

This can only be done by the logged in user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String username = "username_example"; // String | The name that needs to be deleted
try {
    Void result = apiInstance.deleteUser(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The name that needs to be deleted |

### Return type

[**Void**](.md)

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String username = "username_example"; // String | The name that needs to be fetched. Use user1 for testing. 
try {
    User result = apiInstance.getUserByName(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserByName");
    e.printStackTrace();
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

<a name="loginUser"></a>
# **loginUser**
> String loginUser(username, password)

Logs user into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String username = "username_example"; // String | The user name for login
String password = "password_example"; // String | The password for login in clear text
try {
    String result = apiInstance.loginUser(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#loginUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The user name for login |
 **password** | **String**| The password for login in clear text |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="logoutUser"></a>
# **logoutUser**
> Void logoutUser()

Logs out current logged in user session

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
try {
    Void result = apiInstance.logoutUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#logoutUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateUser"></a>
# **updateUser**
> Void updateUser(body, username)

Updated user

This can only be done by the logged in user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
User body = new User(); // User | Updated user object
String username = "username_example"; // String | name that need to be deleted
try {
    Void result = apiInstance.updateUser(body, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| Updated user object |
 **username** | **String**| name that need to be deleted |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

