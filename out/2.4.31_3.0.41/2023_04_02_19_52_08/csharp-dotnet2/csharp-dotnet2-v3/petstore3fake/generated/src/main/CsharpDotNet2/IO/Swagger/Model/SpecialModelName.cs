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
  public class SpecialModelName {
    /// <summary>
    /// Gets or Sets SpecialPropertyName
    /// </summary>
    [DataMember(Name="$special[property.name]", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "$special[property.name]")]
    public long? SpecialPropertyName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SpecialModelName {\n");
      sb.Append("  SpecialPropertyName: ").Append(SpecialPropertyName).Append("\n");
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
