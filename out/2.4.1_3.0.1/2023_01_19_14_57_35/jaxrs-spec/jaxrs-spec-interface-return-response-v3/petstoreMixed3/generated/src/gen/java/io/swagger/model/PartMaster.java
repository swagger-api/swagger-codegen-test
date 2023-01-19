package io.swagger.model;

import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PartMaster  implements Serializable {
  private @Valid Object destination = null;  private @Valid Object origin = null;

  /**
   **/
  public PartMaster destination(Object destination) {
    this.destination = destination;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("destination")
  public Object getDestination() {
    return destination;
  }
  public void setDestination(Object destination) {
    this.destination = destination;
  }

  /**
   **/
  public PartMaster origin(Object origin) {
    this.origin = origin;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("origin")
  public Object getOrigin() {
    return origin;
  }
  public void setOrigin(Object origin) {
    this.origin = origin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartMaster partMaster = (PartMaster) o;
    return Objects.equals(destination, partMaster.destination) &&
        Objects.equals(origin, partMaster.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, origin);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
