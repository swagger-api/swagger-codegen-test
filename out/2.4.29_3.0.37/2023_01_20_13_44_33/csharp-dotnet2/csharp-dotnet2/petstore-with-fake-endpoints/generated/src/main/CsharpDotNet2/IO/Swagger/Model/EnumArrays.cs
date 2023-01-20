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
  public class EnumArrays {
    /// <summary>
    /// Gets or Sets JustSymbol
    /// </summary>
    [DataMember(Name="just_symbol", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "just_symbol")]
    public string JustSymbol { get; set; }

    /// <summary>
    /// Gets or Sets ArrayEnum
    /// </summary>
    [DataMember(Name="array_enum", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "array_enum")]
    public List<string> ArrayEnum { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EnumArrays {\n");
      sb.Append("  JustSymbol: ").Append(JustSymbol).Append("\n");
      sb.Append("  ArrayEnum: ").Append(ArrayEnum).Append("\n");
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
