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
    public partial class MapTest : IEquatable<MapTest>
    { 
        /// <summary>
        /// Gets or Sets MapMapOfString
        /// </summary>

        [DataMember(Name="map_map_of_string")]
        public Dictionary<string, Dictionary<string, string>> MapMapOfString { get; set; }

        /// <summary>
        /// Gets or Sets Inner
        /// </summary>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum InnerEnum
        {
            /// <summary>
            /// Enum UPPEREnum for UPPER
            /// </summary>
            [EnumMember(Value = "UPPER")]
            UPPEREnum = 0,
            /// <summary>
            /// Enum LowerEnum for lower
            /// </summary>
            [EnumMember(Value = "lower")]
            LowerEnum = 1        }

        /// <summary>
        /// Gets or Sets MapOfEnumString
        /// </summary>

        [DataMember(Name="map_of_enum_string")]
        public Dictionary<string, InnerEnum> MapOfEnumString { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MapTest {\n");
            sb.Append("  MapMapOfString: ").Append(MapMapOfString).Append("\n");
            sb.Append("  MapOfEnumString: ").Append(MapOfEnumString).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MapTest)obj);
        }

        /// <summary>
        /// Returns true if MapTest instances are equal
        /// </summary>
        /// <param name="other">Instance of MapTest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MapTest other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    MapMapOfString == other.MapMapOfString ||
                    MapMapOfString != null &&
                    MapMapOfString.SequenceEqual(other.MapMapOfString)
                ) && 
                (
                    MapOfEnumString == other.MapOfEnumString ||
                    MapOfEnumString != null &&
                    MapOfEnumString.SequenceEqual(other.MapOfEnumString)
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
                    if (MapMapOfString != null)
                    hashCode = hashCode * 59 + MapMapOfString.GetHashCode();
                    if (MapOfEnumString != null)
                    hashCode = hashCode * 59 + MapOfEnumString.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MapTest left, MapTest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MapTest left, MapTest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
