# swagger
This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.

This Dart package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.5
- Build date: 2023-05-17T08:07:44.223Z
- Build package: io.swagger.codegen.languages.DartJaguarClientCodegen

## Requirements

Dart 2 or later OR Flutter 0.7.0 or later.

Once your code is generated, you need to run the build_runner command to let Jaguar implement your API:

```sh
flutter packages pub run build_runner build
or
pub run build_runner build
```

## Installation & Usage

### Github
If this Dart package is published to Github, please include the following in pubspec.yaml
```
name: swagger
version: 1.0.0
description: Swagger API client
dependencies:
  swagger:
    git: https://github.com/GIT_USER_ID/GIT_REPO_ID.git
      version: 'any'
```

### Local
To use the package in your local drive, please include the following in pubspec.yaml
```
dependencies:
  swagger:
    path: /path/to/swagger
```

## Tests

TODO

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```dart
import 'package:swagger/api.dart';

// TODO Configure OAuth2 access token for authorization: petstore_auth
//swagger.api.Configuration.accessToken = 'YOUR_ACCESS_TOKEN';

final swaggerGen = SwaggerGen();
var api_instance = swaggerGen.getPetApi();
var body = new Pet(); // Pet | Pet object that needs to be added to the store

try {
    api_instance.addPet(body);
} catch (e) {
    print("Exception when calling PetApi->addPet: $e\n");
}

```

## Documentation for API Endpoints

All URIs are relative to *https://petstore.swagger.io/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PetApi* | [**addPet**](docs//PetApi.md#addpet) | **Post** /pet | Add a new pet to the store
*PetApi* | [**deletePet**](docs//PetApi.md#deletepet) | **Delete** /pet/:petId | Deletes a pet
*PetApi* | [**findPetsByStatus**](docs//PetApi.md#findpetsbystatus) | **Get** /pet/findByStatus | Finds Pets by status
*PetApi* | [**findPetsByTags**](docs//PetApi.md#findpetsbytags) | **Get** /pet/findByTags | Finds Pets by tags
*PetApi* | [**getPetById**](docs//PetApi.md#getpetbyid) | **Get** /pet/:petId | Find pet by ID
*PetApi* | [**updatePet**](docs//PetApi.md#updatepet) | **Put** /pet | Update an existing pet
*PetApi* | [**updatePetWithForm**](docs//PetApi.md#updatepetwithform) | **Post** /pet/:petId | Updates a pet in the store with form data
*PetApi* | [**uploadFile**](docs//PetApi.md#uploadfile) | **Post** /pet/:petId/uploadImage | uploads an image
*StoreApi* | [**deleteOrder**](docs//StoreApi.md#deleteorder) | **Delete** /store/order/:orderId | Delete purchase order by ID
*StoreApi* | [**getInventory**](docs//StoreApi.md#getinventory) | **Get** /store/inventory | Returns pet inventories by status
*StoreApi* | [**getOrderById**](docs//StoreApi.md#getorderbyid) | **Get** /store/order/:orderId | Find purchase order by ID
*StoreApi* | [**placeOrder**](docs//StoreApi.md#placeorder) | **Post** /store/order | Place an order for a pet
*UserApi* | [**createUser**](docs//UserApi.md#createuser) | **Post** /user | Create user
*UserApi* | [**createUsersWithArrayInput**](docs//UserApi.md#createuserswitharrayinput) | **Post** /user/createWithArray | Creates list of users with given input array
*UserApi* | [**createUsersWithListInput**](docs//UserApi.md#createuserswithlistinput) | **Post** /user/createWithList | Creates list of users with given input array
*UserApi* | [**deleteUser**](docs//UserApi.md#deleteuser) | **Delete** /user/:username | Delete user
*UserApi* | [**getUserByName**](docs//UserApi.md#getuserbyname) | **Get** /user/:username | Get user by user name
*UserApi* | [**loginUser**](docs//UserApi.md#loginuser) | **Get** /user/login | Logs user into the system
*UserApi* | [**logoutUser**](docs//UserApi.md#logoutuser) | **Get** /user/logout | Logs out current logged in user session
*UserApi* | [**updateUser**](docs//UserApi.md#updateuser) | **Put** /user/:username | Updated user


## Documentation For Models

 - [ApiResponse](docs//ApiResponse.md)
 - [Category](docs//Category.md)
 - [Order](docs//Order.md)
 - [Pet](docs//Pet.md)
 - [Tag](docs//Tag.md)
 - [User](docs//User.md)


## Documentation For Authorization


## api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header

## petstore_auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://petstore.swagger.io/oauth/authorize
- **Scopes**: 
 - **read:pets**: read your pets
 - **write:pets**: modify pets in your account


## Author

apiteam@swagger.io


