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
  public class MixedPropertiesAndAdditionalPropertiesClass {
    /// <summary>
    /// Gets or Sets Uuid
    /// </summary>
    [DataMember(Name="uuid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "uuid")]
    public Guid? Uuid { get; set; }

    /// <summary>
    /// Gets or Sets DateTime
    /// </summary>
    [DataMember(Name="dateTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dateTime")]
    public DateTime? DateTime { get; set; }

    /// <summary>
    /// Gets or Sets Map
    /// </summary>
    [DataMember(Name="map", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "map")]
    public Dictionary<string, Animal> Map { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
      sb.Append("  Uuid: ").Append(Uuid).Append("\n");
      sb.Append("  DateTime: ").Append(DateTime).Append("\n");
      sb.Append("  Map: ").Append(Map).Append("\n");
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
