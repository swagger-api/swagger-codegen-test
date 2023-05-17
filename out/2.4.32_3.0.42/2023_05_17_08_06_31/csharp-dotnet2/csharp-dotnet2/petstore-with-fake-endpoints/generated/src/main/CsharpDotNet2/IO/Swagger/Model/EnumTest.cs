using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class EnumTest {
    /// <summary>
    /// Gets or Sets EnumString
    /// </summary>
    [DataMember(Name="enum_string", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enum_string")]
    public string EnumString { get; set; }

    /// <summary>
    /// Gets or Sets EnumStringRequired
    /// </summary>
    [DataMember(Name="enum_string_required", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enum_string_required")]
    public string EnumStringRequired { get; set; }

    /// <summary>
    /// Gets or Sets EnumInteger
    /// </summary>
    [DataMember(Name="enum_integer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enum_integer")]
    public int? EnumInteger { get; set; }

    /// <summary>
    /// Gets or Sets EnumNumber
    /// </summary>
    [DataMember(Name="enum_number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enum_number")]
    public double? EnumNumber { get; set; }

    /// <summary>
    /// Gets or Sets OuterEnum
    /// </summary>
    [DataMember(Name="outerEnum", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outerEnum")]
    public OuterEnum OuterEnum { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EnumTest {\n");
      sb.Append("  EnumString: ").Append(EnumString).Append("\n");
      sb.Append("  EnumStringRequired: ").Append(EnumStringRequired).Append("\n");
      sb.Append("  EnumInteger: ").Append(EnumInteger).Append("\n");
      sb.Append("  EnumNumber: ").Append(EnumNumber).Append("\n");
      sb.Append("  OuterEnum: ").Append(OuterEnum).Append("\n");
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
