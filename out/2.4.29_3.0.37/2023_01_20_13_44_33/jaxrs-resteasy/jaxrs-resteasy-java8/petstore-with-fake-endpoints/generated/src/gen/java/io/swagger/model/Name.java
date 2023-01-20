package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Model for testing model name same as property name")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2023-01-20T13:58:13.709Z")
public class Name   {
  
  private Integer name = null;
  private Integer snakeCase = null;
  private String property = null;
  private Integer _123Number = null;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public Integer getName() {
    return name;
  }
  public void setName(Integer name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("snake_case")
  public Integer getSnakeCase() {
    return snakeCase;
  }
  public void setSnakeCase(Integer snakeCase) {
    this.snakeCase = snakeCase;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("123Number")
  public Integer get123Number() {
    return _123Number;
  }
  public void set123Number(Integer _123Number) {
    this._123Number = _123Number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(name, name.name) &&
        Objects.equals(snakeCase, name.snakeCase) &&
        Objects.equals(property, name.property) &&
        Objects.equals(_123Number, name._123Number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, snakeCase, property, _123Number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    _123Number: ").append(toIndentedString(_123Number)).append("\n");
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

