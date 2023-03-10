package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.io.File;
import java.math.BigDecimal;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class Body2   {
  private Integer integer = null;
  private Integer int32 = null;
  private Long int64 = null;
  private BigDecimal number = null;
  private Float _float = null;
  private Double _double = null;
  private String string = null;
  private String patternWithoutDelimiter = null;
  private byte[] _byte = null;
  private File binary = null;
  private LocalDate date = null;
  private java.util.Date dateTime = null;
  private String password = null;
  private String callback = null;

  /**
   * None
   * minimum: 10
   * maximum: 100
   **/
  public Body2 integer(Integer integer) {
    this.integer = integer;
    return this;
  }

  
  
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
  public Body2 int32(Integer int32) {
    this.int32 = int32;
    return this;
  }

  
  
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
  public Body2 int64(Long int64) {
    this.int64 = int64;
    return this;
  }

  
  
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
  public Body2 number(BigDecimal number) {
    this.number = number;
    return this;
  }

  
  
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
  public Body2 _float(Float _float) {
    this._float = _float;
    return this;
  }

  
  
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
  public Body2 _double(Double _double) {
    this._double = _double;
    return this;
  }

  
  
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
  public Body2 string(String string) {
    this.string = string;
    return this;
  }

  
  
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
  public Body2 patternWithoutDelimiter(String patternWithoutDelimiter) {
    this.patternWithoutDelimiter = patternWithoutDelimiter;
    return this;
  }

  
  
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
  public Body2 _byte(byte[] _byte) {
    this._byte = _byte;
    return this;
  }

  
  
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
  public Body2 binary(File binary) {
    this.binary = binary;
    return this;
  }

  
  
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
  public Body2 date(LocalDate date) {
    this.date = date;
    return this;
  }

  
  
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
  public Body2 dateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  
  
  @Schema(description = "None")
  @JsonProperty("dateTime")
  public java.util.Date getDateTime() {
    return dateTime;
  }
  public void setDateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
  }

  /**
   * None
   **/
  public Body2 password(String password) {
    this.password = password;
    return this;
  }

  
  
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
  public Body2 callback(String callback) {
    this.callback = callback;
    return this;
  }

  
  
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
    Body2 body2 = (Body2) o;
    return Objects.equals(integer, body2.integer) &&
        Objects.equals(int32, body2.int32) &&
        Objects.equals(int64, body2.int64) &&
        Objects.equals(number, body2.number) &&
        Objects.equals(_float, body2._float) &&
        Objects.equals(_double, body2._double) &&
        Objects.equals(string, body2.string) &&
        Objects.equals(patternWithoutDelimiter, body2.patternWithoutDelimiter) &&
        Objects.equals(_byte, body2._byte) &&
        Objects.equals(binary, body2.binary) &&
        Objects.equals(date, body2.date) &&
        Objects.equals(dateTime, body2.dateTime) &&
        Objects.equals(password, body2.password) &&
        Objects.equals(callback, body2.callback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer, int32, int64, number, _float, _double, string, patternWithoutDelimiter, _byte, binary, date, dateTime, password, callback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body2 {\n");
    
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
