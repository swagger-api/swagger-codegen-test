package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-05-18T06:18:36.983Z[Etc/UTC]")
public class PartThree  implements OneOfPartMasterOrigin  {
  private String otherId = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("otherId")
  public String getOtherId() {
    return otherId;
  }
  public void setOtherId(String otherId) {
    this.otherId = otherId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartThree partThree = (PartThree) o;
    return Objects.equals(otherId, partThree.otherId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartThree {\n");
    
    sb.append("    otherId: ").append(toIndentedString(otherId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
