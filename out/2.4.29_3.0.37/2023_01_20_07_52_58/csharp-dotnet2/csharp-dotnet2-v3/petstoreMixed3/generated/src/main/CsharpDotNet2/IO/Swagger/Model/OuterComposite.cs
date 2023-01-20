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
  public class OuterComposite {
    /// <summary>
    /// Gets or Sets MyNumber
    /// </summary>
    [DataMember(Name="my_number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "my_number")]
    public decimal? MyNumber { get; set; }

    /// <summary>
    /// Gets or Sets MyString
    /// </summary>
    [DataMember(Name="my_string", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "my_string")]
    public string MyString { get; set; }

    /// <summary>
    /// Gets or Sets MyBoolean
    /// </summary>
    [DataMember(Name="my_boolean", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "my_boolean")]
    public bool? MyBoolean { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OuterComposite {\n");
      sb.Append("  MyNumber: ").Append(MyNumber).Append("\n");
      sb.Append("  MyString: ").Append(MyString).Append("\n");
      sb.Append("  MyBoolean: ").Append(MyBoolean).Append("\n");
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
