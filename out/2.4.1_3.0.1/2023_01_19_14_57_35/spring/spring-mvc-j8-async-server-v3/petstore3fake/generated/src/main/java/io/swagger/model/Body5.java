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
 * Body5
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:07:36.139Z[Etc/UTC]")

public class Body5   {
  @JsonProperty("param")
  private String param = null;

  @JsonProperty("param2")
  private String param2 = null;

  public Body5 param(String param) {
    this.param = param;
    return this;
  }

  /**
   * field1
   * @return param
  **/
  @ApiModelProperty(required = true, value = "field1")
  @NotNull


  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  public Body5 param2(String param2) {
    this.param2 = param2;
    return this;
  }

  /**
   * field2
   * @return param2
  **/
  @ApiModelProperty(required = true, value = "field2")
  @NotNull


  public String getParam2() {
    return param2;
  }

  public void setParam2(String param2) {
    this.param2 = param2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body5 body5 = (Body5) o;
    return Objects.equals(this.param, body5.param) &&
        Objects.equals(this.param2, body5.param2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(param, param2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body5 {\n");
    
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    param2: ").append(toIndentedString(param2)).append("\n");
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

