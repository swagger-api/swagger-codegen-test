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
  public class FormatTest {
    /// <summary>
    /// Gets or Sets Integer
    /// </summary>
    [DataMember(Name="integer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "integer")]
    public int? Integer { get; set; }

    /// <summary>
    /// Gets or Sets Int32
    /// </summary>
    [DataMember(Name="int32", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "int32")]
    public int? Int32 { get; set; }

    /// <summary>
    /// Gets or Sets Int64
    /// </summary>
    [DataMember(Name="int64", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "int64")]
    public long? Int64 { get; set; }

    /// <summary>
    /// Gets or Sets Number
    /// </summary>
    [DataMember(Name="number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "number")]
    public decimal? Number { get; set; }

    /// <summary>
    /// Gets or Sets Float
    /// </summary>
    [DataMember(Name="float", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "float")]
    public float? Float { get; set; }

    /// <summary>
    /// Gets or Sets Double
    /// </summary>
    [DataMember(Name="double", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "double")]
    public double? Double { get; set; }

    /// <summary>
    /// Gets or Sets String
    /// </summary>
    [DataMember(Name="string", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "string")]
    public string String { get; set; }

    /// <summary>
    /// Gets or Sets Byte
    /// </summary>
    [DataMember(Name="byte", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "byte")]
    public byte[] Byte { get; set; }

    /// <summary>
    /// Gets or Sets Binary
    /// </summary>
    [DataMember(Name="binary", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "binary")]
    public byte[] Binary { get; set; }

    /// <summary>
    /// Gets or Sets Date
    /// </summary>
    [DataMember(Name="date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date")]
    public DateTime? Date { get; set; }

    /// <summary>
    /// Gets or Sets DateTime
    /// </summary>
    [DataMember(Name="dateTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dateTime")]
    public DateTime? DateTime { get; set; }

    /// <summary>
    /// Gets or Sets Uuid
    /// </summary>
    [DataMember(Name="uuid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "uuid")]
    public Guid? Uuid { get; set; }

    /// <summary>
    /// Gets or Sets Password
    /// </summary>
    [DataMember(Name="password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "password")]
    public string Password { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class FormatTest {\n");
      sb.Append("  Integer: ").Append(Integer).Append("\n");
      sb.Append("  Int32: ").Append(Int32).Append("\n");
      sb.Append("  Int64: ").Append(Int64).Append("\n");
      sb.Append("  Number: ").Append(Number).Append("\n");
      sb.Append("  Float: ").Append(Float).Append("\n");
      sb.Append("  Double: ").Append(Double).Append("\n");
      sb.Append("  String: ").Append(String).Append("\n");
      sb.Append("  Byte: ").Append(Byte).Append("\n");
      sb.Append("  Binary: ").Append(Binary).Append("\n");
      sb.Append("  Date: ").Append(Date).Append("\n");
      sb.Append("  DateTime: ").Append(DateTime).Append("\n");
      sb.Append("  Uuid: ").Append(Uuid).Append("\n");
      sb.Append("  Password: ").Append(Password).Append("\n");
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
