package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Model for testing reserved words
 **/
@ApiModel(description = "Model for testing reserved words")
public class ModelReturn  {
  
  @SerializedName("return")
  private Integer _return = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getReturn() {
    return _return;
  }
  public void setReturn(Integer _return) {
    this._return = _return;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelReturn _return = (ModelReturn) o;
    return (this._return == null ? _return._return == null : this._return.equals(_return._return));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._return == null ? 0: this._return.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelReturn {\n");
    
    sb.append("  _return: ").append(_return).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
