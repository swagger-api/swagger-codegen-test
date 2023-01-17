package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Animal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.joda.time.DateTime;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-17T18:07:44.499Z[Etc/UTC]")public class MixedPropertiesAndAdditionalPropertiesClass   {
  private UUID uuid = null;  private DateTime dateTime = null;  private Map<String, Animal> map = new HashMap<String, Animal>();

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("dateTime")
  public DateTime getDateTime() {
    return dateTime;
  }
  public void setDateTime(DateTime dateTime) {
    this.dateTime = dateTime;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("map")
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
