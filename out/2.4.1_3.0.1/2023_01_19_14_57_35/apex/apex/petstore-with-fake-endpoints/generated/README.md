# Swagger Petstore API Client

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: " \

## Requirements

- [Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- [Apache Ant](http://ant.apache.org/) version 1.6 or later
- [Force.com Migration Tool](https://developer.salesforce.com/docs/atlas.en-us.daas.meta/daas/forcemigrationtool_install.htm)
  - The `ant-salesforce.jar` file included with the Force.com Migration Tool must be placed in the root directory of this project (in the same directory as this README and `build.xml`)
- `ANT_HOME` and `JAVA_HOME` environment variables must be set accordingly
  - On Windows, `JAVA_HOME` will probably look something like this:

    ```
    JAVA_HOME = C:\Program Files\Java\jdk1.8.0_121
    ```

- The `bin` directory from Ant must be on your `PATH`

If everything is set correctly:

- Running `java -version` in a command prompt should output something like:

  ```bash
  java version "1.8.0_121"
  Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
  Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)
  ```

- Running `ant -version` should output something like:

  ```bash
  Apache Ant(TM) version 1.10.1 compiled on February 2 2017
  ```

For more information, see <https://developer.salesforce.com/docs/atlas.en-us.daas.meta/daas/forcemigrationtool_prereq.htm>

## Installation


1. Clone the repo from GitHub

    ```bash
    $ git clone git@github.com:GIT_USER_ID/GIT_REPO_ID.git
    ```

    Or, [download](https://github.com/GIT_USER_ID/GIT_REPO_ID/archive/master.zip) the repo as a ZIP and extract it to `GIT_REPO_ID`

1. Set the `SF_USERNAME` and `SF_PASSWORD` environment variables to your Salesforce username and password. Alternatively, they may be set in `build.properties`. Environment variables will override the values in `build.properties` if set.

    `SF_SESSIONID` may also be set instead of `SF_USERNAME` and `SF_PASSWORD` (more info in `build.properties`)

2. Open up a command prompt in the root project directory `GIT_REPO_ID` (the same directory as this README and `build.xml`)
3. Deploy to your Salesforce org

    ```bash
    $ ant deploy
    ```

    This command will:

    - deploy all classes in the `deploy/classes` directory to your Salesforce org
    - create a new [unmanaged package](https://help.salesforce.com/articleView?id=sharing_apps.htm) called **Swagger Petstore API Client**
    - execute all of the unit tests included in this package (at least 75% code coverage required)
    - create a new [remote site](https://help.salesforce.com/articleView?id=configuring_remoteproxy.htm) called **** configured for the endpoint: <http://petstore.swagger.io:80/v2>
    - rolls back any changes upon any error

    A successful deployment will look like this:

    ```bash
    [sf:deploy] Request Status: Succeeded
    [sf:deploy] *********** DEPLOYMENT SUCCEEDED ***********
    [sf:deploy] Finished request 0Af7A00000Ebd5oSAB successfully.

    BUILD SUCCESSFUL
    Total time: 34 seconds
    ```

### Test deployment only

To perform a test deployment without committing changes:

```bash
$ ant deployCheckOnly
```

All of the included tests will run as if it were a real deployment. Tests and other validations will report back while leaving your org untouched, allowing you to verify that a deployment will succeed without affecting anything in the org.

### Uninstallation

```bash
$ ant undeploy
```

Removes all classes and the Remote Site created by this package.

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
SwagAnotherFakeApi api = new SwagAnotherFakeApi();

Map<String, Object> params = new Map<String, Object>{
    'body' => SwagClient.getExample()
};

try {
    // cross your fingers
    SwagClient result = api.testSpecialTags(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *http://petstore.swagger.io:80/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SwagAnotherFakeApi* | [**testSpecialTags**](docs/SwagAnotherFakeApi.md#testSpecialTags) | **PATCH** /another-fake/dummy | To test special tags
*SwagFakeApi* | [**fakeOuterBooleanSerialize**](docs/SwagFakeApi.md#fakeOuterBooleanSerialize) | **POST** /fake/outer/boolean | 
*SwagFakeApi* | [**fakeOuterCompositeSerialize**](docs/SwagFakeApi.md#fakeOuterCompositeSerialize) | **POST** /fake/outer/composite | 
*SwagFakeApi* | [**fakeOuterNumberSerialize**](docs/SwagFakeApi.md#fakeOuterNumberSerialize) | **POST** /fake/outer/number | 
*SwagFakeApi* | [**fakeOuterStringSerialize**](docs/SwagFakeApi.md#fakeOuterStringSerialize) | **POST** /fake/outer/string | 
*SwagFakeApi* | [**testBodyWithQueryParams**](docs/SwagFakeApi.md#testBodyWithQueryParams) | **PUT** /fake/body-with-query-params | 
*SwagFakeApi* | [**testClientModel**](docs/SwagFakeApi.md#testClientModel) | **PATCH** /fake | To test &quot;client&quot; model
*SwagFakeApi* | [**testEndpointParameters**](docs/SwagFakeApi.md#testEndpointParameters) | **POST** /fake | Fake endpoint for testing various parameters\n假端點\n偽のエンドポイント\n가짜 엔드 포인트\n
*SwagFakeApi* | [**testEnumParameters**](docs/SwagFakeApi.md#testEnumParameters) | **GET** /fake | To test enum parameters
*SwagFakeApi* | [**testInlineAdditionalProperties**](docs/SwagFakeApi.md#testInlineAdditionalProperties) | **POST** /fake/inline-additionalProperties | test inline additionalProperties
*SwagFakeApi* | [**testJsonFormData**](docs/SwagFakeApi.md#testJsonFormData) | **GET** /fake/jsonFormData | test json serialization of form data
*SwagFakeClassnameTags123Api* | [**testClassname**](docs/SwagFakeClassnameTags123Api.md#testClassname) | **PATCH** /fake_classname_test | To test class name in snake case
*SwagPetApi* | [**addPet**](docs/SwagPetApi.md#addPet) | **POST** /pet | Add a new pet to the store
*SwagPetApi* | [**deletePet**](docs/SwagPetApi.md#deletePet) | **DELETE** /pet/{petId} | Deletes a pet
*SwagPetApi* | [**findPetsByStatus**](docs/SwagPetApi.md#findPetsByStatus) | **GET** /pet/findByStatus | Finds Pets by status
*SwagPetApi* | [**findPetsByTags**](docs/SwagPetApi.md#findPetsByTags) | **GET** /pet/findByTags | Finds Pets by tags
*SwagPetApi* | [**getPetById**](docs/SwagPetApi.md#getPetById) | **GET** /pet/{petId} | Find pet by ID
*SwagPetApi* | [**updatePet**](docs/SwagPetApi.md#updatePet) | **PUT** /pet | Update an existing pet
*SwagPetApi* | [**updatePetWithForm**](docs/SwagPetApi.md#updatePetWithForm) | **POST** /pet/{petId} | Updates a pet in the store with form data
*SwagPetApi* | [**uploadFile**](docs/SwagPetApi.md#uploadFile) | **POST** /pet/{petId}/uploadImage | uploads an image
*SwagStoreApi* | [**deleteOrder**](docs/SwagStoreApi.md#deleteOrder) | **DELETE** /store/order/{order_id} | Delete purchase order by ID
*SwagStoreApi* | [**getInventory**](docs/SwagStoreApi.md#getInventory) | **GET** /store/inventory | Returns pet inventories by status
*SwagStoreApi* | [**getOrderById**](docs/SwagStoreApi.md#getOrderById) | **GET** /store/order/{order_id} | Find purchase order by ID
*SwagStoreApi* | [**placeOrder**](docs/SwagStoreApi.md#placeOrder) | **POST** /store/order | Place an order for a pet
*SwagUserApi* | [**createUser**](docs/SwagUserApi.md#createUser) | **POST** /user | Create user
*SwagUserApi* | [**createUsersWithArrayInput**](docs/SwagUserApi.md#createUsersWithArrayInput) | **POST** /user/createWithArray | Creates list of users with given input array
*SwagUserApi* | [**createUsersWithListInput**](docs/SwagUserApi.md#createUsersWithListInput) | **POST** /user/createWithList | Creates list of users with given input array
*SwagUserApi* | [**deleteUser**](docs/SwagUserApi.md#deleteUser) | **DELETE** /user/{username} | Delete user
*SwagUserApi* | [**getUserByName**](docs/SwagUserApi.md#getUserByName) | **GET** /user/{username} | Get user by user name
*SwagUserApi* | [**loginUser**](docs/SwagUserApi.md#loginUser) | **GET** /user/login | Logs user into the system
*SwagUserApi* | [**logoutUser**](docs/SwagUserApi.md#logoutUser) | **GET** /user/logout | Logs out current logged in user session
*SwagUserApi* | [**updateUser**](docs/SwagUserApi.md#updateUser) | **PUT** /user/{username} | Updated user


## Documentation for Models

 - [Swag200Response](docs/Swag200Response.md)
 - [SwagAdditionalPropertiesClass](docs/SwagAdditionalPropertiesClass.md)
 - [SwagAnimal](docs/SwagAnimal.md)
 - [SwagAnimalFarm](docs/SwagAnimalFarm.md)
 - [SwagApiResponse](docs/SwagApiResponse.md)
 - [SwagArrayOfArrayOfNumberOnly](docs/SwagArrayOfArrayOfNumberOnly.md)
 - [SwagArrayOfNumberOnly](docs/SwagArrayOfNumberOnly.md)
 - [SwagArrayTest](docs/SwagArrayTest.md)
 - [SwagBoolean](docs/SwagBoolean.md)
 - [SwagCapitalization](docs/SwagCapitalization.md)
 - [SwagCategory](docs/SwagCategory.md)
 - [SwagClassModel](docs/SwagClassModel.md)
 - [SwagClient](docs/SwagClient.md)
 - [SwagEnumArrays](docs/SwagEnumArrays.md)
 - [SwagEnumClass](docs/SwagEnumClass.md)
 - [SwagEnumTest](docs/SwagEnumTest.md)
 - [SwagFormatTest](docs/SwagFormatTest.md)
 - [SwagHasOnlyReadOnly](docs/SwagHasOnlyReadOnly.md)
 - [SwagInts](docs/SwagInts.md)
 - [SwagMapTest](docs/SwagMapTest.md)
 - [SwagMixedPropertiesAndAdditionalProp](docs/SwagMixedPropertiesAndAdditionalProp.md)
 - [SwagName](docs/SwagName.md)
 - [SwagNumberOnly](docs/SwagNumberOnly.md)
 - [SwagNumbers](docs/SwagNumbers.md)
 - [SwagOrder](docs/SwagOrder.md)
 - [SwagOuterComposite](docs/SwagOuterComposite.md)
 - [SwagOuterEnum](docs/SwagOuterEnum.md)
 - [SwagPet](docs/SwagPet.md)
 - [SwagReadOnlyFirst](docs/SwagReadOnlyFirst.md)
 - [SwagReturn](docs/SwagReturn.md)
 - [SwagSpecialModelName](docs/SwagSpecialModelName.md)
 - [SwagTag](docs/SwagTag.md)
 - [SwagUser](docs/SwagUser.md)
 - [SwagCat](docs/SwagCat.md)
 - [SwagDog](docs/SwagDog.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header

### api_key_query

- **Type**: API key
- **API key parameter name**: api_key_query
- **Location**: URL query string

### http_basic_test

- **Type**: HTTP basic authentication

### petstore_auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorizatoin URL**: http://petstore.swagger.io/api/oauth/dialog
- **Scopes**: 
  - write:pets: modify pets in your account
  - read:pets: read your pets


## Author

apiteam@swagger.io

