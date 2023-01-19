package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Body8  implements Serializable {
  private @Valid List<Object> parrots = new ArrayList<Object>();

  /**
   **/
  public Body8 parrots(List<Object> parrots) {
    this.parrots = parrots;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("parrots")
  public List<Object> getParrots() {
    return parrots;
  }
  public void setParrots(List<Object> parrots) {
    this.parrots = parrots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body8 body8 = (Body8) o;
    return Objects.equals(parrots, body8.parrots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parrots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body8 {\n");
    
    sb.append("    parrots: ").append(toIndentedString(parrots)).append("\n");
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
