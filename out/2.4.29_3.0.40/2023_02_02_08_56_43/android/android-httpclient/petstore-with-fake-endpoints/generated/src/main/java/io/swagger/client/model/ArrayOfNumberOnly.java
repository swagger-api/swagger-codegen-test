package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ArrayOfNumberOnly  {
  
  @SerializedName("ArrayNumber")
  private List<BigDecimal> arrayNumber = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getArrayNumber() {
    return arrayNumber;
  }
  public void setArrayNumber(List<BigDecimal> arrayNumber) {
    this.arrayNumber = arrayNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayOfNumberOnly arrayOfNumberOnly = (ArrayOfNumberOnly) o;
    return (this.arrayNumber == null ? arrayOfNumberOnly.arrayNumber == null : this.arrayNumber.equals(arrayOfNumberOnly.arrayNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.arrayNumber == null ? 0: this.arrayNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayOfNumberOnly {\n");
    
    sb.append("  arrayNumber: ").append(arrayNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
