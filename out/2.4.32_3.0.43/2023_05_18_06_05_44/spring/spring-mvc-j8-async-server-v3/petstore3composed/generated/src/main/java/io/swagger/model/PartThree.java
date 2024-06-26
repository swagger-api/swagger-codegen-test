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
 * PartThree
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-18T06:18:35.103Z[Etc/UTC]")


public class PartThree  implements OneOfPartMasterOrigin {
  @JsonProperty("otherId")
  private String otherId = null;

  public PartThree otherId(String otherId) {
    this.otherId = otherId;
    return this;
  }

  /**
   * Get otherId
   * @return otherId
   **/
  @ApiModelProperty(value = "")
  
    public String getOtherId() {
    return otherId;
  }

  public void setOtherId(String otherId) {
    this.otherId = otherId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartThree partThree = (PartThree) o;
    return Objects.equals(this.otherId, partThree.otherId);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
