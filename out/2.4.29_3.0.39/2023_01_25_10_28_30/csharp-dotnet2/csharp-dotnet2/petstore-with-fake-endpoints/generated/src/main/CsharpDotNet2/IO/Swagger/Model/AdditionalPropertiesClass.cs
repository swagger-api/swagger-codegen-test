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
  public class AdditionalPropertiesClass {
    /// <summary>
    /// Gets or Sets MapProperty
    /// </summary>
    [DataMember(Name="map_property", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "map_property")]
    public Dictionary<string, string> MapProperty { get; set; }

    /// <summary>
    /// Gets or Sets MapOfMapProperty
    /// </summary>
    [DataMember(Name="map_of_map_property", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "map_of_map_property")]
    public Dictionary<string, Dictionary<string, string>> MapOfMapProperty { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AdditionalPropertiesClass {\n");
      sb.Append("  MapProperty: ").Append(MapProperty).Append("\n");
      sb.Append("  MapOfMapProperty: ").Append(MapOfMapProperty).Append("\n");
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
