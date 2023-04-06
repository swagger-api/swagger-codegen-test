# AnimalApi

All URIs are relative to *https://raw.githubusercontent.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAnimal**](AnimalApi.md#addAnimal) | **POST** /animal | Add a new animal to the store
[**deleteAnimal**](AnimalApi.md#deleteAnimal) | **DELETE** /animal/{animalId} | Deletes a animal
[**getAnimalById**](AnimalApi.md#getAnimalById) | **GET** /animal/{animalId} | Find animal by ID
[**updateAnimal**](AnimalApi.md#updateAnimal) | **PUT** /animal | Update an existing animal
[**updateAnimalWithForm**](AnimalApi.md#updateAnimalWithForm) | **POST** /animal/{animalId} | Updates a animal

<a name="addAnimal"></a>
# **addAnimal**
> addAnimal(body)

Add a new animal to the store

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnimalApi()
val body : Animal =  // Animal | Animal object that needs to be added to the store
try {
    apiInstance.addAnimal(body)
} catch (e: ClientException) {
    println("4xx response calling AnimalApi#addAnimal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnimalApi#addAnimal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Animal**](Animal.md)| Animal object that needs to be added to the store |

### Return type

null (empty response body)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="deleteAnimal"></a>
# **deleteAnimal**
> deleteAnimal(animalId, apiKey)

Deletes a animal

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnimalApi()
val animalId : kotlin.Long = 789 // kotlin.Long | Animal id to delete
val apiKey : kotlin.String = apiKey_example // kotlin.String | 
try {
    apiInstance.deleteAnimal(animalId, apiKey)
} catch (e: ClientException) {
    println("4xx response calling AnimalApi#deleteAnimal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnimalApi#deleteAnimal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animalId** | **kotlin.Long**| Animal id to delete |
 **apiKey** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAnimalById"></a>
# **getAnimalById**
> Animal getAnimalById(animalId)

Find animal by ID

Returns a single animal

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnimalApi()
val animalId : kotlin.Long = 789 // kotlin.Long | ID of pet to return
try {
    val result : Animal = apiInstance.getAnimalById(animalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnimalApi#getAnimalById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnimalApi#getAnimalById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animalId** | **kotlin.Long**| ID of pet to return |

### Return type

[**Animal**](Animal.md)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateAnimal"></a>
# **updateAnimal**
> updateAnimal(body)

Update an existing animal

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnimalApi()
val body : Animal =  // Animal | Animal object that needs to be added.
try {
    apiInstance.updateAnimal(body)
} catch (e: ClientException) {
    println("4xx response calling AnimalApi#updateAnimal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnimalApi#updateAnimal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Animal**](Animal.md)| Animal object that needs to be added. |

### Return type

null (empty response body)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="updateAnimalWithForm"></a>
# **updateAnimalWithForm**
> updateAnimalWithForm(animalId, name, status)

Updates a animal

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnimalApi()
val animalId : kotlin.Long = 789 // kotlin.Long | ID of animal that needs to be updated
val name : kotlin.String = name_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
try {
    apiInstance.updateAnimalWithForm(animalId, name, status)
} catch (e: ClientException) {
    println("4xx response calling AnimalApi#updateAnimalWithForm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnimalApi#updateAnimalWithForm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **animalId** | **kotlin.Long**| ID of animal that needs to be updated |
 **name** | **kotlin.String**|  | [optional]
 **status** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

