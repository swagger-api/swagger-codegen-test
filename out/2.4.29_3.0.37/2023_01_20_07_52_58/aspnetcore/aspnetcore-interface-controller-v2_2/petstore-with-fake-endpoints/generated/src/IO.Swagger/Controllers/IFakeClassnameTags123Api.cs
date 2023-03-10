/*
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
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
    public interface IFakeClassnameTags123ApiController
    { 
        /// <summary>
        /// To test class name in snake case
        /// </summary>
        /// <remarks>To test class name in snake case</remarks>
        /// <param name="body">client model</param>
        /// <response code="200">successful operation</response>
        IActionResult TestClassname([FromBody]ModelClient body);
    }
}
