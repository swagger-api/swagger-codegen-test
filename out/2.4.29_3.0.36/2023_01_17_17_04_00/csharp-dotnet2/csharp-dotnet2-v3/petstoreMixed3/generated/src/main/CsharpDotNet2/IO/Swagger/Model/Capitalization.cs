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
  public class Capitalization {
    /// <summary>
    /// Gets or Sets SmallCamel
    /// </summary>
    [DataMember(Name="smallCamel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "smallCamel")]
    public string SmallCamel { get; set; }

    /// <summary>
    /// Gets or Sets CapitalCamel
    /// </summary>
    [DataMember(Name="CapitalCamel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CapitalCamel")]
    public string CapitalCamel { get; set; }

    /// <summary>
    /// Gets or Sets SmallSnake
    /// </summary>
    [DataMember(Name="small_Snake", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "small_Snake")]
    public string SmallSnake { get; set; }

    /// <summary>
    /// Gets or Sets CapitalSnake
    /// </summary>
    [DataMember(Name="Capital_Snake", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Capital_Snake")]
    public string CapitalSnake { get; set; }

    /// <summary>
    /// Gets or Sets SCAETHFlowPoints
    /// </summary>
    [DataMember(Name="SCA_ETH_Flow_Points", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "SCA_ETH_Flow_Points")]
    public string SCAETHFlowPoints { get; set; }

    /// <summary>
    /// Name of the pet 
    /// </summary>
    /// <value>Name of the pet </value>
    [DataMember(Name="ATT_NAME", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ATT_NAME")]
    public string ATT_NAME { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Capitalization {\n");
      sb.Append("  SmallCamel: ").Append(SmallCamel).Append("\n");
      sb.Append("  CapitalCamel: ").Append(CapitalCamel).Append("\n");
      sb.Append("  SmallSnake: ").Append(SmallSnake).Append("\n");
      sb.Append("  CapitalSnake: ").Append(CapitalSnake).Append("\n");
      sb.Append("  SCAETHFlowPoints: ").Append(SCAETHFlowPoints).Append("\n");
      sb.Append("  ATT_NAME: ").Append(ATT_NAME).Append("\n");
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
