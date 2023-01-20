package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OuterEnum;





@javax.annotation.Generated(value = "io.swagger.codegen.languages.UndertowCodegen", date = "2023-01-20T13:57:02.228Z")
public class EnumTest   {
  


  public enum EnumStringEnum {
    UPPER("UPPER"),
    LOWER("lower"),
    EMPTY("");

    private String value;

    EnumStringEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EnumStringEnum enumString = null;


  public enum EnumStringRequiredEnum {
    UPPER("UPPER"),
    LOWER("lower"),
    EMPTY("");

    private String value;

    EnumStringRequiredEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EnumStringRequiredEnum enumStringRequired = null;


  public enum EnumIntegerEnum {
    NUMBER_1(1),
    NUMBER_MINUS_1(-1);

    private String value;

    EnumIntegerEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EnumIntegerEnum enumInteger = null;


  public enum EnumNumberEnum {
    NUMBER_1_DOT_1(1.1),
    NUMBER_MINUS_1_DOT_2(-1.2);

    private String value;

    EnumNumberEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EnumNumberEnum enumNumber = null;
  private OuterEnum outerEnum = null;

  /**
   **/
  public EnumTest enumString(EnumStringEnum enumString) {
    this.enumString = enumString;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enum_string")
  public EnumStringEnum getEnumString() {
    return enumString;
  }
  public void setEnumString(EnumStringEnum enumString) {
    this.enumString = enumString;
  }

  /**
   **/
  public EnumTest enumStringRequired(EnumStringRequiredEnum enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("enum_string_required")
  public EnumStringRequiredEnum getEnumStringRequired() {
    return enumStringRequired;
  }
  public void setEnumStringRequired(EnumStringRequiredEnum enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
  }

  /**
   **/
  public EnumTest enumInteger(EnumIntegerEnum enumInteger) {
    this.enumInteger = enumInteger;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enum_integer")
  public EnumIntegerEnum getEnumInteger() {
    return enumInteger;
  }
  public void setEnumInteger(EnumIntegerEnum enumInteger) {
    this.enumInteger = enumInteger;
  }

  /**
   **/
  public EnumTest enumNumber(EnumNumberEnum enumNumber) {
    this.enumNumber = enumNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enum_number")
  public EnumNumberEnum getEnumNumber() {
    return enumNumber;
  }
  public void setEnumNumber(EnumNumberEnum enumNumber) {
    this.enumNumber = enumNumber;
  }

  /**
   **/
  public EnumTest outerEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("outerEnum")
  public OuterEnum getOuterEnum() {
    return outerEnum;
  }
  public void setOuterEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumTest enumTest = (EnumTest) o;
    return Objects.equals(enumString, enumTest.enumString) &&
        Objects.equals(enumStringRequired, enumTest.enumStringRequired) &&
        Objects.equals(enumInteger, enumTest.enumInteger) &&
        Objects.equals(enumNumber, enumTest.enumNumber) &&
        Objects.equals(outerEnum, enumTest.outerEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumString, enumStringRequired, enumInteger, enumNumber, outerEnum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumTest {\n");
    
    sb.append("    enumString: ").append(toIndentedString(enumString)).append("\n");
    sb.append("    enumStringRequired: ").append(toIndentedString(enumStringRequired)).append("\n");
    sb.append("    enumInteger: ").append(toIndentedString(enumInteger)).append("\n");
    sb.append("    enumNumber: ").append(toIndentedString(enumNumber)).append("\n");
    sb.append("    outerEnum: ").append(toIndentedString(outerEnum)).append("\n");
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

