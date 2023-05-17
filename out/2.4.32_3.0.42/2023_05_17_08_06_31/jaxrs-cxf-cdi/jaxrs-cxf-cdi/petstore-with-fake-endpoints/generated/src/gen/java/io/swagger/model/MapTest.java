package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class MapTest   {
  
  private Map<String, Map<String, String>> mapMapOfString = new HashMap<String, Map<String, String>>();

@XmlType(name="Map&lt;String, InnerEnum&gt;")
@XmlEnum(Map&lt;String, String&gt;.class)
public enum Map&lt;String, InnerEnum&gt; {

    @XmlEnumValue("UPPER") UPPER(Map&lt;String, String&gt;.valueOf("UPPER")), @XmlEnumValue("lower") LOWER(Map&lt;String, String&gt;.valueOf("lower"));


    private Map&lt;String, String&gt; value;

    Map&lt;String, InnerEnum&gt; (Map&lt;String, String&gt; v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Map&lt;String, InnerEnum&gt; fromValue(String v) {
        for (Map<String, InnerEnum> b : Map<String, InnerEnum>.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}


@XmlType(name="InnerEnum")
@XmlEnum(String.class)
public enum InnerEnum {

    @XmlEnumValue("UPPER") UPPER(String.valueOf("UPPER")), @XmlEnumValue("lower") LOWER(String.valueOf("lower"));


    private String value;

    InnerEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static InnerEnum fromValue(String v) {
        for (InnerEnum b : InnerEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
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
  @Valid
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

