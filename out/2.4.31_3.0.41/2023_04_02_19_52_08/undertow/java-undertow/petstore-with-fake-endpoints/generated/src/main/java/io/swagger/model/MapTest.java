package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "io.swagger.codegen.languages.UndertowCodegen", date = "2023-04-02T19:54:41.658Z")
public class MapTest   {
  
  private Map<String, Map<String, String>> mapMapOfString = new HashMap<String, Map<String, String>>();


  public enum Map<String, InnerEnum> {
    UPPER("UPPER"),
    LOWER("lower");

    private String value;

    Map<String, InnerEnum>(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }



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
      return value;
    }
  }

  private Map<String, InnerEnum> mapOfEnumString = new HashMap<String, InnerEnum>();

  /**
   **/
  public MapTest mapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
    return this;
  }

  
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
  public MapTest mapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("map_of_enum_string")
  public Map<String, InnerEnum> getMapOfEnumString() {
    return mapOfEnumString;
  }
  public void setMapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

