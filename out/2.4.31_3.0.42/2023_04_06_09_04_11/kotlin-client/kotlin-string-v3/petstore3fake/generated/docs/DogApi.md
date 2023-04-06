# DogApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDog**](DogApi.md#addDog) | **POST** /dog | Add a new dog to the store
[**deleteDog**](DogApi.md#deleteDog) | **DELETE** /dog/{dogId} | Deletes a dog
[**getDogById**](DogApi.md#getDogById) | **GET** /dog/{dogId} | Find dog by ID
[**updateDog**](DogApi.md#updateDog) | **PUT** /dog | Update an existing dog
[**updateDogWithForm**](DogApi.md#updateDogWithForm) | **POST** /dog/{dogId} | Updates a dog

<a name="addDog"></a>
# **addDog**
> addDog(body)

Add a new dog to the store

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DogApi()
val body : Dog =  // Dog | Dog object that needs to be added to the store
try {
    apiInstance.addDog(body)
} catch (e: ClientException) {
    println("4xx response calling DogApi#addDog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogApi#addDog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dog**](Dog.md)| Dog object that needs to be added to the store |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="deleteDog"></a>
# **deleteDog**
> deleteDog(dogId, apiKey)

Deletes a dog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DogApi()
val dogId : kotlin.Long = 789 // kotlin.Long | Dog id to delete
val apiKey : kotlin.String = apiKey_example // kotlin.String | 
try {
    apiInstance.deleteDog(dogId, apiKey)
} catch (e: ClientException) {
    println("4xx response calling DogApi#deleteDog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogApi#deleteDog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dogId** | **kotlin.Long**| Dog id to delete |
 **apiKey** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDogById"></a>
# **getDogById**
> Dog getDogById(dogId)

Find dog by ID

Returns a single dog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DogApi()
val dogId : kotlin.Long = 789 // kotlin.Long | ID of dog to return
try {
    val result : Dog = apiInstance.getDogById(dogId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DogApi#getDogById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogApi#getDogById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dogId** | **kotlin.Long**| ID of dog to return |

### Return type

[**Dog**](Dog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="updateDog"></a>
# **updateDog**
> updateDog(body)

Update an existing dog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DogApi()
val body : Dog =  // Dog | Dog object that needs to be added.
try {
    apiInstance.updateDog(body)
} catch (e: ClientException) {
    println("4xx response calling DogApi#updateDog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogApi#updateDog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dog**](Dog.md)| Dog object that needs to be added. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<a name="updateDogWithForm"></a>
# **updateDogWithForm**
> updateDogWithForm(dogId, name, status)

Updates a dog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DogApi()
val dogId : kotlin.Long = 789 // kotlin.Long | ID of dog that needs to be updated
val name : kotlin.String = name_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
try {
    apiInstance.updateDogWithForm(dogId, name, status)
} catch (e: ClientException) {
    println("4xx response calling DogApi#updateDogWithForm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogApi#updateDogWithForm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dogId** | **kotlin.Long**| ID of dog that needs to be updated |
 **name** | **kotlin.String**|  | [optional]
 **status** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

