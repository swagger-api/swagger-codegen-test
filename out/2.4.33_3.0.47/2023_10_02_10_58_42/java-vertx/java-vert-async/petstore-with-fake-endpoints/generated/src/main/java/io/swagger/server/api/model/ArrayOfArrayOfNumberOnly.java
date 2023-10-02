package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ArrayOfArrayOfNumberOnly   {
  
  private List<List<BigDecimal>> arrayArrayNumber = new ArrayList<>();

  public ArrayOfArrayOfNumberOnly () {

  }

  public ArrayOfArrayOfNumberOnly (List<List<BigDecimal>> arrayArrayNumber) {
    this.arrayArrayNumber = arrayArrayNumber;
  }

    
  @JsonProperty("ArrayArrayNumber")
  public List<List<BigDecimal>> getArrayArrayNumber() {
    return arrayArrayNumber;
  }
  public void setArrayArrayNumber(List<List<BigDecimal>> arrayArrayNumber) {
    this.arrayArrayNumber = arrayArrayNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly = (ArrayOfArrayOfNumberOnly) o;
    return Objects.equals(arrayArrayNumber, arrayOfArrayOfNumberOnly.arrayArrayNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayArrayNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayOfArrayOfNumberOnly {\n");
    
    sb.append("    arrayArrayNumber: ").append(toIndentedString(arrayArrayNumber)).append("\n");
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
