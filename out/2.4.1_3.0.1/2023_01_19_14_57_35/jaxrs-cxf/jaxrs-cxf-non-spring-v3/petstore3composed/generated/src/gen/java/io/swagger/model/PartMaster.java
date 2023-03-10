package io.swagger.model;

import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class PartMaster  {
  
  @Schema(description = "")
  private Object destination = null;
  
  @Schema(description = "")
  private Object origin = null;
 /**
   * Get destination
   * @return destination
  **/
  @JsonProperty("destination")
  public Object getDestination() {
    return destination;
  }

  public void setDestination(Object destination) {
    this.destination = destination;
  }

  public PartMaster destination(Object destination) {
    this.destination = destination;
    return this;
  }

 /**
   * Get origin
   * @return origin
  **/
  @JsonProperty("origin")
  public Object getOrigin() {
    return origin;
  }

  public void setOrigin(Object origin) {
    this.origin = origin;
  }

  public PartMaster origin(Object origin) {
    this.origin = origin;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartMaster {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
