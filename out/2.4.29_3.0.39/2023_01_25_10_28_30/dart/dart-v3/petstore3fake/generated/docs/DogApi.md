# swagger.api.DogApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDog**](DogApi.md#addDog) | **POST** /dog | Add a new dog to the store
[**deleteDog**](DogApi.md#deleteDog) | **DELETE** /dog/{dogId} | Deletes a dog
[**getDogById**](DogApi.md#getDogById) | **GET** /dog/{dogId} | Find dog by ID
[**updateDog**](DogApi.md#updateDog) | **PUT** /dog | Update an existing dog
[**updateDogWithForm**](DogApi.md#updateDogWithForm) | **POST** /dog/{dogId} | Updates a dog

# **addDog**
> addDog(body)

Add a new dog to the store

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DogApi();
var body = new Dog(); // Dog | Dog object that needs to be added to the store

try {
    api_instance.addDog(body);
} catch (e) {
    print("Exception when calling DogApi->addDog: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dog**](Dog.md)| Dog object that needs to be added to the store | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteDog**
> deleteDog(dogId, apiKey)

Deletes a dog

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DogApi();
var dogId = 789; // int | Dog id to delete
var apiKey = apiKey_example; // String | 

try {
    api_instance.deleteDog(dogId, apiKey);
} catch (e) {
    print("Exception when calling DogApi->deleteDog: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dogId** | **int**| Dog id to delete | 
 **apiKey** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDogById**
> Dog getDogById(dogId)

Find dog by ID

Returns a single dog

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DogApi();
var dogId = 789; // int | ID of dog to return

try {
    var result = api_instance.getDogById(dogId);
    print(result);
} catch (e) {
    print("Exception when calling DogApi->getDogById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dogId** | **int**| ID of dog to return | 

### Return type

[**Dog**](Dog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateDog**
> updateDog(body)

Update an existing dog

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DogApi();
var body = new Dog(); // Dog | Dog object that needs to be added.

try {
    api_instance.updateDog(body);
} catch (e) {
    print("Exception when calling DogApi->updateDog: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dog**](Dog.md)| Dog object that needs to be added. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateDogWithForm**
> updateDogWithForm(dogId, name, status)

Updates a dog

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DogApi();
var dogId = 789; // int | ID of dog that needs to be updated
var name = name_example; // String | 
var status = status_example; // String | 

try {
    api_instance.updateDogWithForm(dogId, name, status);
} catch (e) {
    print("Exception when calling DogApi->updateDogWithForm: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dogId** | **int**| ID of dog that needs to be updated | 
 **name** | **String**|  | [optional] 
 **status** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

