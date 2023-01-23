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
  public class FakeJsonFormDataBody {
    /// <summary>
    /// field1
    /// </summary>
    /// <value>field1</value>
    [DataMember(Name="param", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "param")]
    public string Param { get; set; }

    /// <summary>
    /// field2
    /// </summary>
    /// <value>field2</value>
    [DataMember(Name="param2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "param2")]
    public string Param2 { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class FakeJsonFormDataBody {\n");
      sb.Append("  Param: ").Append(Param).Append("\n");
      sb.Append("  Param2: ").Append(Param2).Append("\n");
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
