package io.swagger.client.model;

import io.swagger.client.model.Animal;
import java.util.*;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class MixedPropertiesAndAdditionalPropertiesClass  {
  
  @SerializedName("uuid")
  private UUID uuid = null;
  @SerializedName("dateTime")
  private Date dateTime = null;
  @SerializedName("map")
  private Map<String, Animal> map = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public UUID getUuid() {
    return uuid;
  }
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDateTime() {
    return dateTime;
  }
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Animal> getMap() {
    return map;
  }
  public void setMap(Map<String, Animal> map) {
    this.map = map;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MixedPropertiesAndAdditionalPropertiesClass mixedPropertiesAndAdditionalPropertiesClass = (MixedPropertiesAndAdditionalPropertiesClass) o;
    return (this.uuid == null ? mixedPropertiesAndAdditionalPropertiesClass.uuid == null : this.uuid.equals(mixedPropertiesAndAdditionalPropertiesClass.uuid)) &&
        (this.dateTime == null ? mixedPropertiesAndAdditionalPropertiesClass.dateTime == null : this.dateTime.equals(mixedPropertiesAndAdditionalPropertiesClass.dateTime)) &&
        (this.map == null ? mixedPropertiesAndAdditionalPropertiesClass.map == null : this.map.equals(mixedPropertiesAndAdditionalPropertiesClass.map));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.uuid == null ? 0: this.uuid.hashCode());
    result = 31 * result + (this.dateTime == null ? 0: this.dateTime.hashCode());
    result = 31 * result + (this.map == null ? 0: this.map.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
    
    sb.append("  uuid: ").append(uuid).append("\n");
    sb.append("  dateTime: ").append(dateTime).append("\n");
    sb.append("  map: ").append(map).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
