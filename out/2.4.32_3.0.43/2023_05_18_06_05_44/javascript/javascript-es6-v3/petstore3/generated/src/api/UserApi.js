/*
 * Swagger Petstore - OpenAPI 3.0
 * This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.43
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from "../ApiClient";
import {User} from '../model/User';

/**
* User service.
* @module api/UserApi
* @version 1.0.5
*/
export class UserApi {

    /**
    * Constructs a new UserApi. 
    * @alias module:api/UserApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the createUser operation.
     * @callback moduleapi/UserApi~createUserCallback
     * @param {String} error Error message, if any.
     * @param {module:model/User{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create user
     * This can only be done by the logged in user.
     * @param {Object} opts Optional parameters
     * @param {module:model/User} opts.body Created user object
     * @param {Number} opts.id 
     * @param {String} opts.username 
     * @param {String} opts.firstName 
     * @param {String} opts.lastName 
     * @param {String} opts.email 
     * @param {String} opts.password 
     * @param {String} opts.phone 
     * @param {Number} opts.userStatus 
     * @param {module:api/UserApi~createUserCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    createUser(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        'id': opts['id'],'username': opts['username'],'firstName': opts['firstName'],'lastName': opts['lastName'],'email': opts['email'],'password': opts['password'],'phone': opts['phone'],'userStatus': opts['userStatus']
      };

      let authNames = [];
      let contentTypes = ['application/json', 'application/xml', 'application/x-www-form-urlencoded'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = User;

      return this.apiClient.callApi(
        '/user', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the createUsersWithListInput operation.
     * @callback moduleapi/UserApi~createUsersWithListInputCallback
     * @param {String} error Error message, if any.
     * @param {module:model/User{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates list of users with given input array
     * Creates list of users with given input array
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/User>} opts.body 
     * @param {module:api/UserApi~createUsersWithListInputCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    createUsersWithListInput(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/xml', 'application/json'];
      let returnType = User;

      return this.apiClient.callApi(
        '/user/createWithList', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteUser operation.
     * @callback moduleapi/UserApi~deleteUserCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete user
     * This can only be done by the logged in user.
     * @param {String} username The name that needs to be deleted
     * @param {module:api/UserApi~deleteUserCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteUser(username, callback) {
      
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling deleteUser");
      }

      let pathParams = {
        'username': username
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/user/{username}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUserByName operation.
     * @callback moduleapi/UserApi~getUserByNameCallback
     * @param {String} error Error message, if any.
     * @param {module:model/User{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get user by user name
     * @param {String} username The name that needs to be fetched. Use user1 for testing. 
     * @param {module:api/UserApi~getUserByNameCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    getUserByName(username, callback) {
      
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling getUserByName");
      }

      let pathParams = {
        'username': username
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/xml', 'application/json'];
      let returnType = User;

      return this.apiClient.callApi(
        '/user/{username}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the loginUser operation.
     * @callback moduleapi/UserApi~loginUserCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Logs user into the system
     * @param {Object} opts Optional parameters
     * @param {String} opts.username The user name for login
     * @param {String} opts.password The password for login in clear text
     * @param {module:api/UserApi~loginUserCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    loginUser(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        'username': opts['username'],'password': opts['password']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/xml', 'application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/user/login', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the logoutUser operation.
     * @callback moduleapi/UserApi~logoutUserCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Logs out current logged in user session
     * @param {module:api/UserApi~logoutUserCallback} callback The callback function, accepting three arguments: error, data, response
     */
    logoutUser(callback) {
      
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/user/logout', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the updateUser operation.
     * @callback moduleapi/UserApi~updateUserCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update user
     * This can only be done by the logged in user.
     * @param {String} username name that need to be deleted
     * @param {Object} opts Optional parameters
     * @param {module:model/User} opts.body Update an existent user in the store
     * @param {Number} opts.id 
     * @param {String} opts.username 
     * @param {String} opts.firstName 
     * @param {String} opts.lastName 
     * @param {String} opts.email 
     * @param {String} opts.password 
     * @param {String} opts.phone 
     * @param {Number} opts.userStatus 
     * @param {module:api/UserApi~updateUserCallback} callback The callback function, accepting three arguments: error, data, response
     */
    updateUser(username, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling updateUser");
      }

      let pathParams = {
        'username': username
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        'id': opts['id'],'username': opts['username'],'firstName': opts['firstName'],'lastName': opts['lastName'],'email': opts['email'],'password': opts['password'],'phone': opts['phone'],'userStatus': opts['userStatus']
      };

      let authNames = [];
      let contentTypes = ['application/json', 'application/xml', 'application/x-www-form-urlencoded'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/user/{username}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}