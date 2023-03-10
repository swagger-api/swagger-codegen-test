/*
 * Swagger Petstore - OpenAPI 3.0
 *
 * This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using IO.Swagger.Models;

namespace IO.Swagger.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    public interface IUserApiController
    { 
        /// <summary>
        /// Create user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="body">Created user object</param>
        /// <response code="0">successful operation</response>
        IActionResult CreateUser([FromBody]User body);

        /// <summary>
        /// Creates list of users with given input array
        /// </summary>
        /// <remarks>Creates list of users with given input array</remarks>
        /// <param name="body"></param>
        /// <response code="200">Successful operation</response>
        /// <response code="0">successful operation</response>
        IActionResult CreateUsersWithListInput([FromBody]List<User> body);

        /// <summary>
        /// Delete user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="username">The name that needs to be deleted</param>
        /// <response code="400">Invalid username supplied</response>
        /// <response code="404">User not found</response>
        IActionResult DeleteUser([FromRoute][Required]string username);

        /// <summary>
        /// Get user by user name
        /// </summary>
        
        /// <param name="username">The name that needs to be fetched. Use user1 for testing. </param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid username supplied</response>
        /// <response code="404">User not found</response>
        IActionResult GetUserByName([FromRoute][Required]string username);

        /// <summary>
        /// Logs user into the system
        /// </summary>
        
        /// <param name="username">The user name for login</param>
        /// <param name="password">The password for login in clear text</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid username/password supplied</response>
        IActionResult LoginUser([FromQuery]string username, [FromQuery]string password);

        /// <summary>
        /// Logs out current logged in user session
        /// </summary>
        
        /// <response code="0">successful operation</response>
        IActionResult LogoutUser();

        /// <summary>
        /// Update user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="username">name that need to be deleted</param>
        /// <param name="body">Update an existent user in the store</param>
        /// <response code="0">successful operation</response>
        IActionResult UpdateUser([FromRoute][Required]string username, [FromBody]User body);
    }
}
