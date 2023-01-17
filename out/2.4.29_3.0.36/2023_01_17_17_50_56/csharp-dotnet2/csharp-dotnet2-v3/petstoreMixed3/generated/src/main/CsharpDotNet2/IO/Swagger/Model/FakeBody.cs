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
  public class FakeBody {
    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="integer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "integer")]
    public int? Integer { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="int32", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "int32")]
    public int? Int32 { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="int64", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "int64")]
    public long? Int64 { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "number")]
    public decimal? Number { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="float", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "float")]
    public float? _Float { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="double", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "double")]
    public double? _Double { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="string", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "string")]
    public string _String { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="pattern_without_delimiter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pattern_without_delimiter")]
    public string PatternWithoutDelimiter { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="byte", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "byte")]
    public byte[] _Byte { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="binary", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "binary")]
    public byte[] Binary { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date")]
    public DateTime? Date { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="dateTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dateTime")]
    public DateTime? DateTime { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "password")]
    public string Password { get; set; }

    /// <summary>
    /// None
    /// </summary>
    /// <value>None</value>
    [DataMember(Name="callback", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "callback")]
    public string Callback { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class FakeBody {\n");
      sb.Append("  Integer: ").Append(Integer).Append("\n");
      sb.Append("  Int32: ").Append(Int32).Append("\n");
      sb.Append("  Int64: ").Append(Int64).Append("\n");
      sb.Append("  Number: ").Append(Number).Append("\n");
      sb.Append("  _Float: ").Append(_Float).Append("\n");
      sb.Append("  _Double: ").Append(_Double).Append("\n");
      sb.Append("  _String: ").Append(_String).Append("\n");
      sb.Append("  PatternWithoutDelimiter: ").Append(PatternWithoutDelimiter).Append("\n");
      sb.Append("  _Byte: ").Append(_Byte).Append("\n");
      sb.Append("  Binary: ").Append(Binary).Append("\n");
      sb.Append("  Date: ").Append(Date).Append("\n");
      sb.Append("  DateTime: ").Append(DateTime).Append("\n");
      sb.Append("  Password: ").Append(Password).Append("\n");
      sb.Append("  Callback: ").Append(Callback).Append("\n");
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
