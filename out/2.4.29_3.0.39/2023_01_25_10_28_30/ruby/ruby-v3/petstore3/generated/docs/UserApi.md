# SwaggerClient::UserApi

All URIs are relative to *https://raw.githubusercontent.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_user**](UserApi.md#create_user) | **POST** /user | Create user
[**create_user**](UserApi.md#create_user) | **POST** /user | Create user
[**create_users_with_list_input**](UserApi.md#create_users_with_list_input) | **POST** /user/createWithList | Creates list of users with given input array
[**delete_user**](UserApi.md#delete_user) | **DELETE** /user/{username} | Delete user
[**get_user_by_name**](UserApi.md#get_user_by_name) | **GET** /user/{username} | Get user by user name
[**login_user**](UserApi.md#login_user) | **GET** /user/login | Logs user into the system
[**logout_user**](UserApi.md#logout_user) | **GET** /user/logout | Logs out current logged in user session
[**update_user**](UserApi.md#update_user) | **PUT** /user/{username} | Update user
[**update_user**](UserApi.md#update_user) | **PUT** /user/{username} | Update user

# **create_user**
> User create_user(opts)

Create user

This can only be done by the logged in user.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new
opts = { 
  body: SwaggerClient::User.new # User | Created user object
}

begin
  #Create user
  result = api_instance.create_user(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->create_user: #{e}"
end
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



# **create_user**
> User create_user(opts)

Create user

This can only be done by the logged in user.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new
opts = { 
  id: 789 # Integer | 
  username: 'username_example' # String | 
  first_name: 'first_name_example' # String | 
  last_name: 'last_name_example' # String | 
  email: 'email_example' # String | 
  password: 'password_example' # String | 
  phone: 'phone_example' # String | 
  user_status: 56 # Integer | 
}

begin
  #Create user
  result = api_instance.create_user(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->create_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  | [optional] 
 **username** | **String**|  | [optional] 
 **first_name** | **String**|  | [optional] 
 **last_name** | **String**|  | [optional] 
 **email** | **String**|  | [optional] 
 **password** | **String**|  | [optional] 
 **phone** | **String**|  | [optional] 
 **user_status** | **Integer**|  | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml



# **create_users_with_list_input**
> User create_users_with_list_input(opts)

Creates list of users with given input array

Creates list of users with given input array

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new
opts = { 
  body: [SwaggerClient::User.new] # Array<User> | 
}

begin
  #Creates list of users with given input array
  result = api_instance.create_users_with_list_input(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->create_users_with_list_input: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Array&lt;User&gt;**](User.md)|  | [optional] 

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json



# **delete_user**
> delete_user(username)

Delete user

This can only be done by the logged in user.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new
username = 'username_example' # String | The name that needs to be deleted


begin
  #Delete user
  api_instance.delete_user(username)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->delete_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The name that needs to be deleted | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_user_by_name**
> User get_user_by_name(username)

Get user by user name

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new
username = 'username_example' # String | The name that needs to be fetched. Use user1 for testing. 


begin
  #Get user by user name
  result = api_instance.get_user_by_name(username)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->get_user_by_name: #{e}"
end
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



# **login_user**
> String login_user(opts)

Logs user into the system

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new
opts = { 
  username: 'username_example', # String | The user name for login
  password: 'password_example' # String | The password for login in clear text
}

begin
  #Logs user into the system
  result = api_instance.login_user(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->login_user: #{e}"
end
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



# **logout_user**
> logout_user

Logs out current logged in user session

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

begin
  #Logs out current logged in user session
  api_instance.logout_user
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->logout_user: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update_user**
> update_user(username, opts)

Update user

This can only be done by the logged in user.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new
username = 'username_example' # String | name that need to be deleted
opts = { 
  body: SwaggerClient::User.new # User | Update an existent user in the store
}

begin
  #Update user
  api_instance.update_user(username, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->update_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| name that need to be deleted | 
 **body** | [**User**](User.md)| Update an existent user in the store | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined



# **update_user**
> update_user(username, opts)

Update user

This can only be done by the logged in user.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new
username = 'username_example' # String | name that need to be deleted
opts = { 
  id: 789 # Integer | 
  username2: 'username_example' # String | 
  first_name: 'first_name_example' # String | 
  last_name: 'last_name_example' # String | 
  email: 'email_example' # String | 
  password: 'password_example' # String | 
  phone: 'phone_example' # String | 
  user_status: 56 # Integer | 
}

begin
  #Update user
  api_instance.update_user(username, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->update_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| name that need to be deleted | 
 **id** | **Integer**|  | [optional] 
 **username2** | **String**|  | [optional] 
 **first_name** | **String**|  | [optional] 
 **last_name** | **String**|  | [optional] 
 **email** | **String**|  | [optional] 
 **password** | **String**|  | [optional] 
 **phone** | **String**|  | [optional] 
 **user_status** | **Integer**|  | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined



