package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ArrayOfArrayOfNumberOnly  {
  
  @SerializedName("ArrayArrayNumber")
  private List<List<BigDecimal>> arrayArrayNumber = null;

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.arrayArrayNumber == null ? arrayOfArrayOfNumberOnly.arrayArrayNumber == null : this.arrayArrayNumber.equals(arrayOfArrayOfNumberOnly.arrayArrayNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.arrayArrayNumber == null ? 0: this.arrayArrayNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayOfArrayOfNumberOnly {\n");
    
    sb.append("  arrayArrayNumber: ").append(arrayArrayNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
