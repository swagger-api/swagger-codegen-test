# SwaggerPetstore.StoreApi

All URIs are relative to *https://petstore.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrder**](StoreApi.md#deleteOrder) | **DELETE** /store/order/{orderId} | Delete purchase order by ID
[**getInventory**](StoreApi.md#getInventory) | **GET** /store/inventory | Returns pet inventories by status
[**getOrderById**](StoreApi.md#getOrderById) | **GET** /store/order/{orderId} | Find purchase order by ID
[**placeOrder**](StoreApi.md#placeOrder) | **POST** /store/order | Place an order for a pet


<a name="deleteOrder"></a>
# **deleteOrder**
> deleteOrder(orderId)

Delete purchase order by ID

For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.StoreApi();

let orderId = 789; // Number | ID of the order that needs to be deleted

apiInstance.deleteOrder(orderId).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Number**| ID of the order that needs to be deleted | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getInventory"></a>
# **getInventory**
> {'String': 'Number'} getInventory()

Returns pet inventories by status

Returns a map of status codes to quantities

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';
let defaultClient = SwaggerPetstore.ApiClient.instance;

// Configure API key authorization: api_key
let api_key = defaultClient.authentications['api_key'];
api_key.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.apiKeyPrefix = 'Token';

let apiInstance = new SwaggerPetstore.StoreApi();
apiInstance.getInventory().then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

**{'String': 'Number'}**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderById"></a>
# **getOrderById**
> Order getOrderById(orderId)

Find purchase order by ID

For valid response try integer IDs with value >= 1 and <= 10. Other values will generated exceptions

### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.StoreApi();

let orderId = 789; // Number | ID of pet that needs to be fetched

apiInstance.getOrderById(orderId).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Number**| ID of pet that needs to be fetched | 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="placeOrder"></a>
# **placeOrder**
> Order placeOrder(body)

Place an order for a pet



### Example
```javascript
import {SwaggerPetstore} from 'swagger_petstore';

let apiInstance = new SwaggerPetstore.StoreApi();

let body = new SwaggerPetstore.Order(); // Order | order placed for purchasing the pet

apiInstance.placeOrder(body).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| order placed for purchasing the pet | 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

