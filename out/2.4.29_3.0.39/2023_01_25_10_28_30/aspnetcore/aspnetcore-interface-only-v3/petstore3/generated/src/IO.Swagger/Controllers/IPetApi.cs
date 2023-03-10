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
    public interface IPetApiController
    { 
        /// <summary>
        /// Add a new pet to the store
        /// </summary>
        /// <remarks>Add a new pet to the store</remarks>
        /// <param name="body">Create a new pet in the store</param>
        /// <response code="200">Successful operation</response>
        /// <response code="405">Invalid input</response>
        IActionResult AddPet([FromBody]Pet body);

        /// <summary>
        /// Deletes a pet
        /// </summary>
        
        /// <param name="petId">Pet id to delete</param>
        /// <param name="apiKey"></param>
        /// <response code="400">Invalid pet value</response>
        IActionResult DeletePet([FromRoute][Required]long? petId, [FromHeader]string apiKey);

        /// <summary>
        /// Finds Pets by status
        /// </summary>
        /// <remarks>Multiple status values can be provided with comma separated strings</remarks>
        /// <param name="status">Status values that need to be considered for filter</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid status value</response>
        IActionResult FindPetsByStatus([FromQuery]string status);

        /// <summary>
        /// Finds Pets by tags
        /// </summary>
        /// <remarks>Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.</remarks>
        /// <param name="tags">Tags to filter by</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid tag value</response>
        IActionResult FindPetsByTags([FromQuery]List<string> tags);

        /// <summary>
        /// Find pet by ID
        /// </summary>
        /// <remarks>Returns a single pet</remarks>
        /// <param name="petId">ID of pet to return</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid ID supplied</response>
        /// <response code="404">Pet not found</response>
        IActionResult GetPetById([FromRoute][Required]long? petId);

        /// <summary>
        /// Update an existing pet
        /// </summary>
        /// <remarks>Update an existing pet by Id</remarks>
        /// <param name="body">Update an existent pet in the store</param>
        /// <response code="200">Successful operation</response>
        /// <response code="400">Invalid ID supplied</response>
        /// <response code="404">Pet not found</response>
        /// <response code="405">Validation exception</response>
        IActionResult UpdatePet([FromBody]Pet body);

        /// <summary>
        /// Updates a pet in the store with form data
        /// </summary>
        
        /// <param name="petId">ID of pet that needs to be updated</param>
        /// <param name="name">Name of pet that needs to be updated</param>
        /// <param name="status">Status of pet that needs to be updated</param>
        /// <response code="405">Invalid input</response>
        IActionResult UpdatePetWithForm([FromRoute][Required]long? petId, [FromQuery]string name, [FromQuery]string status);

        /// <summary>
        /// uploads an image
        /// </summary>
        
        /// <param name="petId">ID of pet to update</param>
        /// <param name="body"></param>
        /// <param name="additionalMetadata">Additional Metadata</param>
        /// <response code="200">successful operation</response>
        IActionResult UploadFile([FromRoute][Required]long? petId, [FromBody]Object body, [FromQuery]string additionalMetadata);
    }
}
