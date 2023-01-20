package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-20T08:15:08.672Z[Etc/UTC]")public class List   {
  private String _123List = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("123-list")
  public String get123List() {
    return _123List;
  }
  public void set123List(String _123List) {
    this._123List = _123List;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    List list = (List) o;
    return Objects.equals(_123List, list._123List);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
