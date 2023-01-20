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
  public class MapTest {
    /// <summary>
    /// Gets or Sets MapMapOfString
    /// </summary>
    [DataMember(Name="map_map_of_string", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "map_map_of_string")]
    public Dictionary<string, Dictionary<string, string>> MapMapOfString { get; set; }

    /// <summary>
    /// Gets or Sets MapOfEnumString
    /// </summary>
    [DataMember(Name="map_of_enum_string", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "map_of_enum_string")]
    public Dictionary<string, string> MapOfEnumString { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MapTest {\n");
      sb.Append("  MapMapOfString: ").Append(MapMapOfString).Append("\n");
      sb.Append("  MapOfEnumString: ").Append(MapOfEnumString).Append("\n");
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
