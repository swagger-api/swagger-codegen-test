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
 * List
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-06T09:19:54.170Z[Etc/UTC]")


public class List   {
  @JsonProperty("123-list")
  private String _123List = null;

  public List _123List(String _123List) {
    this._123List = _123List;
    return this;
  }

  /**
   * Get _123List
   * @return _123List
   **/
  @ApiModelProperty(value = "")
  
    public String get123List() {
    return _123List;
  }

  public void set123List(String _123List) {
    this._123List = _123List;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    List list = (List) o;
    return Objects.equals(this._123List, list._123List);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_123List);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class List {\n");
    
    sb.append("    _123List: ").append(toIndentedString(_123List)).append("\n");
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
