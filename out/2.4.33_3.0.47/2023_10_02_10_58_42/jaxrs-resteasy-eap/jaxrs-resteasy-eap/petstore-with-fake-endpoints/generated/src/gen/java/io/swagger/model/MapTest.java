package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2023-10-02T11:06:05.927Z")
public class MapTest   {
  
  private Map<String, Map<String, String>> mapMapOfString = new HashMap<String, Map<String, String>>();

  /**
   * Gets or Sets mapOfEnumString
   */
  public enum Map&lt;String, InnerEnum&gt; {
    UPPER("UPPER"),

        LOWER("lower");
    private Map&lt;String, String&gt; value;

    Map&lt;String, InnerEnum&gt;(Map&lt;String, String&gt; value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }


  /**
   * Gets or Sets inner
   */
  public enum InnerEnum {
    UPPER("UPPER"),

        LOWER("lower");
    private String value;

    InnerEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private Map<String, InnerEnum> mapOfEnumString = new HashMap<String, InnerEnum>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("map_map_of_string")
  public Map<String, Map<String, String>> getMapMapOfString() {
    return mapMapOfString;
  }
  public void setMapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("map_of_enum_string")
  public Map<String, InnerEnum> getMapOfEnumString() {
    return mapOfEnumString;
  }
  public void setMapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapTest mapTest = (MapTest) o;
    return Objects.equals(mapMapOfString, mapTest.mapMapOfString) &&
        Objects.equals(mapOfEnumString, mapTest.mapOfEnumString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapMapOfString, mapOfEnumString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapTest {\n");
    
    sb.append("    mapMapOfString: ").append(toIndentedString(mapMapOfString)).append("\n");
    sb.append("    mapOfEnumString: ").append(toIndentedString(mapOfEnumString)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

