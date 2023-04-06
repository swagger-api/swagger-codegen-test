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
  public class ArrayTest {
    /// <summary>
    /// Gets or Sets ArrayOfString
    /// </summary>
    [DataMember(Name="array_of_string", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "array_of_string")]
    public List<string> ArrayOfString { get; set; }

    /// <summary>
    /// Gets or Sets ArrayArrayOfInteger
    /// </summary>
    [DataMember(Name="array_array_of_integer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "array_array_of_integer")]
    public List<List<long?>> ArrayArrayOfInteger { get; set; }

    /// <summary>
    /// Gets or Sets ArrayArrayOfModel
    /// </summary>
    [DataMember(Name="array_array_of_model", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "array_array_of_model")]
    public List<List<ReadOnlyFirst>> ArrayArrayOfModel { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ArrayTest {\n");
      sb.Append("  ArrayOfString: ").Append(ArrayOfString).Append("\n");
      sb.Append("  ArrayArrayOfInteger: ").Append(ArrayArrayOfInteger).Append("\n");
      sb.Append("  ArrayArrayOfModel: ").Append(ArrayArrayOfModel).Append("\n");
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
