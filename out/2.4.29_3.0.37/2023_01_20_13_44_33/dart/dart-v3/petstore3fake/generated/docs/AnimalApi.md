# swagger.api.AnimalApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAnimal**](AnimalApi.md#addAnimal) | **POST** /animal | Add a new animal to the store
[**deleteAnimal**](AnimalApi.md#deleteAnimal) | **DELETE** /animal/{animalId} | Deletes a animal
[**getAnimalById**](AnimalApi.md#getAnimalById) | **GET** /animal/{animalId} | Find animal by ID
[**updateAnimal**](AnimalApi.md#updateAnimal) | **PUT** /animal | Update an existing animal
[**updateAnimalWithForm**](AnimalApi.md#updateAnimalWithForm) | **POST** /animal/{animalId} | Updates a animal

# **addAnimal**
> addAnimal(body)

Add a new animal to the store

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new AnimalApi();
var body = new Animal(); // Animal | Animal object that needs to be added to the store

try {
    api_instance.addAnimal(body);
} catch (e) {
    print("Exception when calling AnimalApi->addAnimal: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Animal**](Animal.md)| Animal object that needs to be added to the store | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteAnimal**
> deleteAnimal(animalId, apiKey)

Deletes a animal

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new AnimalApi();
var animalId = 789; // int | Animal id to delete
var apiKey = apiKey_example; // String | 

try {
    api_instance.deleteAnimal(animalId, apiKey);
} catch (e) {
    print("Exception when calling AnimalApi->deleteAnimal: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animalId** | **int**| Animal id to delete | 
 **apiKey** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAnimalById**
> Animal getAnimalById(animalId)

Find animal by ID

Returns a single animal

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new AnimalApi();
var animalId = 789; // int | ID of pet to return

try {
    var result = api_instance.getAnimalById(animalId);
    print(result);
} catch (e) {
    print("Exception when calling AnimalApi->getAnimalById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animalId** | **int**| ID of pet to return | 

### Return type

[**Animal**](Animal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateAnimal**
> updateAnimal(body)

Update an existing animal

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new AnimalApi();
var body = new Animal(); // Animal | Animal object that needs to be added.

try {
    api_instance.updateAnimal(body);
} catch (e) {
    print("Exception when calling AnimalApi->updateAnimal: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Animal**](Animal.md)| Animal object that needs to be added. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateAnimalWithForm**
> updateAnimalWithForm(animalId, name, status)

Updates a animal

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new AnimalApi();
var animalId = 789; // int | ID of animal that needs to be updated
var name = name_example; // String | 
var status = status_example; // String | 

try {
    api_instance.updateAnimalWithForm(animalId, name, status);
} catch (e) {
    print("Exception when calling AnimalApi->updateAnimalWithForm: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animalId** | **int**| ID of animal that needs to be updated | 
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

