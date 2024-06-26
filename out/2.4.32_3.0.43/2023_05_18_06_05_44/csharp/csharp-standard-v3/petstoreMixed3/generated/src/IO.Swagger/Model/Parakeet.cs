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
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;
namespace IO.Swagger.Model
{
    /// <summary>
    /// Parakeet
    /// </summary>
    [DataContract]
        public partial class Parakeet :  IEquatable<Parakeet>, OneOfinlineResponse200ParrotsItems, InlineResponse2001, AnyOfparrotBodyParrotsItems, ParrotBody1 
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Parakeet" /> class.
        /// </summary>
        /// <param name="color">color.</param>
        /// <param name="soundRepeater">soundRepeater.</param>
        public Parakeet(string color = default(string), bool? soundRepeater = default(bool?))
        {
            this.Color = color;
            this.SoundRepeater = soundRepeater;
        }
        
        /// <summary>
        /// Gets or Sets Color
        /// </summary>
        [DataMember(Name="color", EmitDefaultValue=false)]
        public string Color { get; set; }

        /// <summary>
        /// Gets or Sets SoundRepeater
        /// </summary>
        [DataMember(Name="soundRepeater", EmitDefaultValue=false)]
        public bool? SoundRepeater { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Parakeet {\n");
            sb.Append("  Color: ").Append(Color).Append("\n");
            sb.Append("  SoundRepeater: ").Append(SoundRepeater).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Parakeet);
        }

        /// <summary>
        /// Returns true if Parakeet instances are equal
        /// </summary>
        /// <param name="input">Instance of Parakeet to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Parakeet input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Color == input.Color ||
                    (this.Color != null &&
                    this.Color.Equals(input.Color))
                ) && 
                (
                    this.SoundRepeater == input.SoundRepeater ||
                    (this.SoundRepeater != null &&
                    this.SoundRepeater.Equals(input.SoundRepeater))
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
                int hashCode = 41;
                if (this.Color != null)
                    hashCode = hashCode * 59 + this.Color.GetHashCode();
                if (this.SoundRepeater != null)
                    hashCode = hashCode * 59 + this.SoundRepeater.GetHashCode();
                return hashCode;
            }
        }
    }
}
