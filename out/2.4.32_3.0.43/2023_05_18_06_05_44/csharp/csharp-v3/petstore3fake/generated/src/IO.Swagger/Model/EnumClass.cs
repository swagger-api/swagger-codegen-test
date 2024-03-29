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
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;
namespace IO.Swagger.Model
{
    /// <summary>
    /// Defines EnumClass
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum EnumClass
    {
        /// <summary>
        /// Enum Abc for value: _abc
        /// </summary>
        [EnumMember(Value = "_abc")]
        Abc = 1,
        /// <summary>
        /// Enum Efg for value: -efg
        /// </summary>
        [EnumMember(Value = "-efg")]
        Efg = 2,
        /// <summary>
        /// Enum Xyz for value: (xyz)
        /// </summary>
        [EnumMember(Value = "(xyz)")]
        Xyz = 3    }
}
