package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PartMaster
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:17:19.744Z[Etc/UTC]")

public class PartMaster   {
  @JsonProperty("destination")
  private Object destination = null;

  @JsonProperty("origin")
  private Object origin = null;

  public PartMaster destination(Object destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")


  public Object getDestination() {
    return destination;
  }

  public void setDestination(Object destination) {
    this.destination = destination;
  }

  public PartMaster origin(Object origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")


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
    return Objects.equals(this.destination, partMaster.destination) &&
        Objects.equals(this.origin, partMaster.origin);
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

