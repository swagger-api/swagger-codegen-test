package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * True or False indicator
 **/
@ApiModel(description = "True or False indicator")
public class ModelBoolean  {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelBoolean _boolean = (ModelBoolean) o;
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
    sb.append("class ModelBoolean {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
