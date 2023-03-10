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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Models
{ 
        /// <summary>
        /// True or False indicator
        /// </summary>
        /// <value>True or False indicator</value>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum Boolean
        {
            
            /// <summary>
            /// Enum TrueEnum for true
            /// </summary>
            [EnumMember(Value = "true")]
            TrueEnum = 1,
            
            /// <summary>
            /// Enum FalseEnum for false
            /// </summary>
            [EnumMember(Value = "false")]
            FalseEnum = 2
        }
}
