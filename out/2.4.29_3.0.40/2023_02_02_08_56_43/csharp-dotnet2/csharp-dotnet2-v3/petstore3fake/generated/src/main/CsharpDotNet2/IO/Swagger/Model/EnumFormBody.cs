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
  public class EnumFormBody {
    /// <summary>
    /// Form parameter enum test (string array)
    /// </summary>
    /// <value>Form parameter enum test (string array)</value>
    [DataMember(Name="enum_form_string_array", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enum_form_string_array")]
    public List<string> EnumFormStringArray { get; set; }

    /// <summary>
    /// Form parameter enum test (string)
    /// </summary>
    /// <value>Form parameter enum test (string)</value>
    [DataMember(Name="enum_form_string", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enum_form_string")]
    public string EnumFormString { get; set; }

    /// <summary>
    /// Query parameter enum test (double)
    /// </summary>
    /// <value>Query parameter enum test (double)</value>
    [DataMember(Name="enum_query_double", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enum_query_double")]
    public double? EnumQueryDouble { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EnumFormBody {\n");
      sb.Append("  EnumFormStringArray: ").Append(EnumFormStringArray).Append("\n");
      sb.Append("  EnumFormString: ").Append(EnumFormString).Append("\n");
      sb.Append("  EnumQueryDouble: ").Append(EnumQueryDouble).Append("\n");
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
