package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Animal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class MixedPropertiesAndAdditionalPropertiesClass   {
  
  private UUID uuid = null;
  private java.util.Date dateTime = null;
  private Map<String, Animal> map = new HashMap<String, Animal>();

  /**
   **/
  public MixedPropertiesAndAdditionalPropertiesClass uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("uuid")
  @Valid
  public UUID getUuid() {
    return uuid;
  }
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  public MixedPropertiesAndAdditionalPropertiesClass dateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dateTime")
  @Valid
  public java.util.Date getDateTime() {
    return dateTime;
  }
  public void setDateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
  }

  /**
   **/
  public MixedPropertiesAndAdditionalPropertiesClass map(Map<String, Animal> map) {
    this.map = map;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("map")
  @Valid
  public Map<String, Animal> getMap() {
    return map;
  }
  public void setMap(Map<String, Animal> map) {
    this.map = map;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MixedPropertiesAndAdditionalPropertiesClass mixedPropertiesAndAdditionalPropertiesClass = (MixedPropertiesAndAdditionalPropertiesClass) o;
    return Objects.equals(uuid, mixedPropertiesAndAdditionalPropertiesClass.uuid) &&
        Objects.equals(dateTime, mixedPropertiesAndAdditionalPropertiesClass.dateTime) &&
        Objects.equals(map, mixedPropertiesAndAdditionalPropertiesClass.map);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, dateTime, map);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
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

