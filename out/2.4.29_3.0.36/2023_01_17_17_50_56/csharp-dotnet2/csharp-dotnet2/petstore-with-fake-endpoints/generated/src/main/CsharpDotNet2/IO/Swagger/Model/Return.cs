using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Model for testing reserved words
  /// </summary>
  [DataContract]
  public class Return {
    /// <summary>
    /// Gets or Sets _Return
    /// </summary>
    [DataMember(Name="return", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "return")]
    public int? _Return { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Return {\n");
      sb.Append("  _Return: ").Append(_Return).Append("\n");
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
