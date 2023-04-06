package io.swagger.client.model;

import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class MapTest  {
  
  @SerializedName("map_map_of_string")
  private Map<String, Map<String, String>> mapMapOfString = null;
  public enum Map&lt;String, InnerEnum&gt; {
     UPPER,  lower, 
  };
  @SerializedName("map_of_enum_string")
  private Map<String, InnerEnum> mapOfEnumString = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Map<String, String>> getMapMapOfString() {
    return mapMapOfString;
  }
  public void setMapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.mapMapOfString == null ? mapTest.mapMapOfString == null : this.mapMapOfString.equals(mapTest.mapMapOfString)) &&
        (this.mapOfEnumString == null ? mapTest.mapOfEnumString == null : this.mapOfEnumString.equals(mapTest.mapOfEnumString));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mapMapOfString == null ? 0: this.mapMapOfString.hashCode());
    result = 31 * result + (this.mapOfEnumString == null ? 0: this.mapOfEnumString.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapTest {\n");
    
    sb.append("  mapMapOfString: ").append(mapMapOfString).append("\n");
    sb.append("  mapOfEnumString: ").append(mapOfEnumString).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
