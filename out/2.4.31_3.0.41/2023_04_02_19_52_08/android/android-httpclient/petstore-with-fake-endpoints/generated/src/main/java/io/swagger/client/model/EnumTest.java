package io.swagger.client.model;

import io.swagger.client.model.OuterEnum;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class EnumTest  {
  
  public enum EnumStringEnum {
     UPPER,  lower,  , 
  };
  @SerializedName("enum_string")
  private EnumStringEnum enumString = null;
  public enum EnumStringRequiredEnum {
     UPPER,  lower,  , 
  };
  @SerializedName("enum_string_required")
  private EnumStringRequiredEnum enumStringRequired = null;
  public enum EnumIntegerEnum {
     1,  -1, 
  };
  @SerializedName("enum_integer")
  private EnumIntegerEnum enumInteger = null;
  public enum EnumNumberEnum {
     1.1,  -1.2, 
  };
  @SerializedName("enum_number")
  private EnumNumberEnum enumNumber = null;
  @SerializedName("outerEnum")
  private OuterEnum outerEnum = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EnumStringEnum getEnumString() {
    return enumString;
  }
  public void setEnumString(EnumStringEnum enumString) {
    this.enumString = enumString;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EnumStringRequiredEnum getEnumStringRequired() {
    return enumStringRequired;
  }
  public void setEnumStringRequired(EnumStringRequiredEnum enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EnumIntegerEnum getEnumInteger() {
    return enumInteger;
  }
  public void setEnumInteger(EnumIntegerEnum enumInteger) {
    this.enumInteger = enumInteger;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EnumNumberEnum getEnumNumber() {
    return enumNumber;
  }
  public void setEnumNumber(EnumNumberEnum enumNumber) {
    this.enumNumber = enumNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OuterEnum getOuterEnum() {
    return outerEnum;
  }
  public void setOuterEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumTest enumTest = (EnumTest) o;
    return (this.enumString == null ? enumTest.enumString == null : this.enumString.equals(enumTest.enumString)) &&
        (this.enumStringRequired == null ? enumTest.enumStringRequired == null : this.enumStringRequired.equals(enumTest.enumStringRequired)) &&
        (this.enumInteger == null ? enumTest.enumInteger == null : this.enumInteger.equals(enumTest.enumInteger)) &&
        (this.enumNumber == null ? enumTest.enumNumber == null : this.enumNumber.equals(enumTest.enumNumber)) &&
        (this.outerEnum == null ? enumTest.outerEnum == null : this.outerEnum.equals(enumTest.outerEnum));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.enumString == null ? 0: this.enumString.hashCode());
    result = 31 * result + (this.enumStringRequired == null ? 0: this.enumStringRequired.hashCode());
    result = 31 * result + (this.enumInteger == null ? 0: this.enumInteger.hashCode());
    result = 31 * result + (this.enumNumber == null ? 0: this.enumNumber.hashCode());
    result = 31 * result + (this.outerEnum == null ? 0: this.outerEnum.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumTest {\n");
    
    sb.append("  enumString: ").append(enumString).append("\n");
    sb.append("  enumStringRequired: ").append(enumStringRequired).append("\n");
    sb.append("  enumInteger: ").append(enumInteger).append("\n");
    sb.append("  enumNumber: ").append(enumNumber).append("\n");
    sb.append("  outerEnum: ").append(outerEnum).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
