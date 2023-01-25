package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-25T10:48:53.273Z[Etc/UTC]")public class FakeBody   {
  private Integer integer = null;  private Integer int32 = null;  private Long int64 = null;  private BigDecimal number = null;  private Float _float = null;  private Double _double = null;  private String string = null;  private String patternWithoutDelimiter = null;  private byte[] _byte = null;  private File binary = null;  private LocalDate date = null;  private OffsetDateTime dateTime = null;  private String password = null;  private String callback = null;

  /**
   * None
   * minimum: 10
   * maximum: 100
   **/
  
  @Schema(description = "None")
  @JsonProperty("integer")
 @Min(10) @Max(100)  public Integer getInteger() {
    return integer;
  }
  public void setInteger(Integer integer) {
    this.integer = integer;
  }

  /**
   * None
   * minimum: 20
   * maximum: 200
   **/
  
  @Schema(description = "None")
  @JsonProperty("int32")
 @Min(20) @Max(200)  public Integer getInt32() {
    return int32;
  }
  public void setInt32(Integer int32) {
    this.int32 = int32;
  }

  /**
   * None
   **/
  
  @Schema(description = "None")
  @JsonProperty("int64")
  public Long getInt64() {
    return int64;
  }
  public void setInt64(Long int64) {
    this.int64 = int64;
  }

  /**
   * None
   * minimum: 32
   * maximum: 543
   **/
  
  @Schema(required = true, description = "None")
  @JsonProperty("number")
  @NotNull
 @DecimalMin("32") @DecimalMax("543")  public BigDecimal getNumber() {
    return number;
  }
  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  /**
   * None
   * maximum: 987
   **/
  
  @Schema(description = "None")
  @JsonProperty("float")
 @DecimalMax("987")  public Float getFloat() {
    return _float;
  }
  public void setFloat(Float _float) {
    this._float = _float;
  }

  /**
   * None
   * minimum: 67
   * maximum: 123
   **/
  
  @Schema(required = true, description = "None")
  @JsonProperty("double")
  @NotNull
 @DecimalMin("67") @DecimalMax("123")  public Double getDouble() {
    return _double;
  }
  public void setDouble(Double _double) {
    this._double = _double;
  }

  /**
   * None
   **/
  
  @Schema(description = "None")
  @JsonProperty("string")
 @Pattern(regexp="/[a-z]/i")  public String getString() {
    return string;
  }
  public void setString(String string) {
    this.string = string;
  }

  /**
   * None
   **/
  
  @Schema(required = true, description = "None")
  @JsonProperty("pattern_without_delimiter")
  @NotNull
 @Pattern(regexp="^[A-Z].*")  public String getPatternWithoutDelimiter() {
    return patternWithoutDelimiter;
  }
  public void setPatternWithoutDelimiter(String patternWithoutDelimiter) {
    this.patternWithoutDelimiter = patternWithoutDelimiter;
  }

  /**
   * None
   **/
  
  @Schema(required = true, description = "None")
  @JsonProperty("byte")
  @NotNull
  public byte[] getByte() {
    return _byte;
  }
  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }

  /**
   * None
   **/
  
  @Schema(description = "None")
  @JsonProperty("binary")
  public File getBinary() {
    return binary;
  }
  public void setBinary(File binary) {
    this.binary = binary;
  }

  /**
   * None
   **/
  
  @Schema(description = "None")
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }

  /**
   * None
   **/
  
  @Schema(description = "None")
  @JsonProperty("dateTime")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }
  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  /**
   * None
   **/
  
  @Schema(description = "None")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * None
   **/
  
  @Schema(description = "None")
  @JsonProperty("callback")
  public String getCallback() {
    return callback;
  }
  public void setCallback(String callback) {
    this.callback = callback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FakeBody fakeBody = (FakeBody) o;
    return Objects.equals(integer, fakeBody.integer) &&
        Objects.equals(int32, fakeBody.int32) &&
        Objects.equals(int64, fakeBody.int64) &&
        Objects.equals(number, fakeBody.number) &&
        Objects.equals(_float, fakeBody._float) &&
        Objects.equals(_double, fakeBody._double) &&
        Objects.equals(string, fakeBody.string) &&
        Objects.equals(patternWithoutDelimiter, fakeBody.patternWithoutDelimiter) &&
        Objects.equals(_byte, fakeBody._byte) &&
        Objects.equals(binary, fakeBody.binary) &&
        Objects.equals(date, fakeBody.date) &&
        Objects.equals(dateTime, fakeBody.dateTime) &&
        Objects.equals(password, fakeBody.password) &&
        Objects.equals(callback, fakeBody.callback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer, int32, int64, number, _float, _double, string, patternWithoutDelimiter, _byte, binary, date, dateTime, password, callback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FakeBody {\n");
    
    sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    patternWithoutDelimiter: ").append(toIndentedString(patternWithoutDelimiter)).append("\n");
    sb.append("    _byte: ").append(toIndentedString(_byte)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
