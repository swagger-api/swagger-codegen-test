using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Model for testing model name same as property name
  /// </summary>
  [DataContract]
  public class Name {
    /// <summary>
    /// Gets or Sets _Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public int? _Name { get; set; }

    /// <summary>
    /// Gets or Sets SnakeCase
    /// </summary>
    [DataMember(Name="snake_case", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "snake_case")]
    public int? SnakeCase { get; set; }

    /// <summary>
    /// Gets or Sets Property
    /// </summary>
    [DataMember(Name="property", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "property")]
    public string Property { get; set; }

    /// <summary>
    /// Gets or Sets _123Number
    /// </summary>
    [DataMember(Name="123Number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "123Number")]
    public int? _123Number { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Name {\n");
      sb.Append("  _Name: ").Append(_Name).Append("\n");
      sb.Append("  SnakeCase: ").Append(SnakeCase).Append("\n");
      sb.Append("  Property: ").Append(Property).Append("\n");
      sb.Append("  _123Number: ").Append(_123Number).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
