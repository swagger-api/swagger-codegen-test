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
 * FakeJsonFormDataBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-17T08:21:14.583Z[Etc/UTC]")


public class FakeJsonFormDataBody   {
  @JsonProperty("param")
  private String param = null;

  @JsonProperty("param2")
  private String param2 = null;

  public FakeJsonFormDataBody param(String param) {
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

  public FakeJsonFormDataBody param2(String param2) {
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
    FakeJsonFormDataBody fakeJsonFormDataBody = (FakeJsonFormDataBody) o;
    return Objects.equals(this.param, fakeJsonFormDataBody.param) &&
        Objects.equals(this.param2, fakeJsonFormDataBody.param2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(param, param2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FakeJsonFormDataBody {\n");
    
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
