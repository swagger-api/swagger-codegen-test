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
    /// Business Term: Scheme Members Definition: Information about the Members of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.
    /// </summary>
    [DataContract]
        public partial class ValMembers :  IEquatable<ValMembers>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ValMembers" /> class.
        /// </summary>
        /// <param name="valMember">Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due. (required).</param>
        public ValMembers(List<OneOfvalMembersValMemberItems> valMember = default(List<OneOfvalMembersValMemberItems>))
        {
            // to ensure "valMember" is required (not null)
            if (valMember == null)
            {
                throw new InvalidDataException("valMember is a required property for ValMembers and cannot be null");
            }
            else
            {
                this.ValMember = valMember;
            }
        }
        
        /// <summary>
        /// Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.
        /// </summary>
        /// <value>Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.</value>
        [DataMember(Name="val_member", EmitDefaultValue=false)]
        public List<OneOfvalMembersValMemberItems> ValMember { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ValMembers {\n");
            sb.Append("  ValMember: ").Append(ValMember).Append("\n");
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
            return this.Equals(input as ValMembers);
        }

        /// <summary>
        /// Returns true if ValMembers instances are equal
        /// </summary>
        /// <param name="input">Instance of ValMembers to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ValMembers input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ValMember == input.ValMember ||
                    this.ValMember != null &&
                    input.ValMember != null &&
                    this.ValMember.SequenceEqual(input.ValMember)
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
                if (this.ValMember != null)
                    hashCode = hashCode * 59 + this.ValMember.GetHashCode();
                return hashCode;
            }
        }

    }
}
