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
    /// 
    /// </summary>
    [DataContract]
    public partial class EnumFormBody : IEquatable<EnumFormBody>
    { 
        /// <summary>
        /// Gets or Sets EnumFormStringArray
        /// </summary>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EnumFormStringArrayEnum
        {
            /// <summary>
            /// Enum GreaterThan for >
            /// </summary>
            [EnumMember(Value = ">")]
            GreaterThan = 0,
            /// <summary>
            /// Enum Dollar for $
            /// </summary>
            [EnumMember(Value = "$")]
            Dollar = 1        }

        /// <summary>
        /// Form parameter enum test (string array)
        /// </summary>
        /// <value>Form parameter enum test (string array)</value>

        [DataMember(Name="enum_form_string_array")]
        public List<EnumFormStringArrayEnum> EnumFormStringArray { get; set; }

        /// <summary>
        /// Form parameter enum test (string)
        /// </summary>
        /// <value>Form parameter enum test (string)</value>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EnumFormStringEnum
        {
            /// <summary>
            /// Enum AbcEnum for _abc
            /// </summary>
            [EnumMember(Value = "_abc")]
            AbcEnum = 0,
            /// <summary>
            /// Enum EfgEnum for -efg
            /// </summary>
            [EnumMember(Value = "-efg")]
            EfgEnum = 1,
            /// <summary>
            /// Enum XyzEnum for (xyz)
            /// </summary>
            [EnumMember(Value = "(xyz)")]
            XyzEnum = 2        }

        /// <summary>
        /// Form parameter enum test (string)
        /// </summary>
        /// <value>Form parameter enum test (string)</value>

        [DataMember(Name="enum_form_string")]
        public EnumFormStringEnum? EnumFormString { get; set; }

        /// <summary>
        /// Query parameter enum test (double)
        /// </summary>
        /// <value>Query parameter enum test (double)</value>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EnumQueryDoubleEnum
        {
            /// <summary>
            /// Enum NUMBER_1_DOT_1 for 1.1
            /// </summary>
            [EnumMember(Value = "1.1")]
            NUMBER_1_DOT_1 = 0,
            /// <summary>
            /// Enum NUMBER_MINUS_1_DOT_2 for -1.2
            /// </summary>
            [EnumMember(Value = "-1.2")]
            NUMBER_MINUS_1_DOT_2 = 1        }

        /// <summary>
        /// Query parameter enum test (double)
        /// </summary>
        /// <value>Query parameter enum test (double)</value>

        [DataMember(Name="enum_query_double")]
        public EnumQueryDoubleEnum? EnumQueryDouble { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EnumFormBody {\n");
            sb.Append("  EnumFormStringArray: ").Append(EnumFormStringArray).Append("\n");
            sb.Append("  EnumFormString: ").Append(EnumFormString).Append("\n");
            sb.Append("  EnumQueryDouble: ").Append(EnumQueryDouble).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((EnumFormBody)obj);
        }

        /// <summary>
        /// Returns true if EnumFormBody instances are equal
        /// </summary>
        /// <param name="other">Instance of EnumFormBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EnumFormBody other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    EnumFormStringArray == other.EnumFormStringArray ||
                    EnumFormStringArray != null &&
                    EnumFormStringArray.SequenceEqual(other.EnumFormStringArray)
                ) && 
                (
                    EnumFormString == other.EnumFormString ||
                    EnumFormString != null &&
                    EnumFormString.Equals(other.EnumFormString)
                ) && 
                (
                    EnumQueryDouble == other.EnumQueryDouble ||
                    EnumQueryDouble != null &&
                    EnumQueryDouble.Equals(other.EnumQueryDouble)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (EnumFormStringArray != null)
                    hashCode = hashCode * 59 + EnumFormStringArray.GetHashCode();
                    if (EnumFormString != null)
                    hashCode = hashCode * 59 + EnumFormString.GetHashCode();
                    if (EnumQueryDouble != null)
                    hashCode = hashCode * 59 + EnumQueryDouble.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(EnumFormBody left, EnumFormBody right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(EnumFormBody left, EnumFormBody right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
