package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class OuterNumber  {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterNumber outerNumber = (OuterNumber) o;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 17;
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterNumber {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
