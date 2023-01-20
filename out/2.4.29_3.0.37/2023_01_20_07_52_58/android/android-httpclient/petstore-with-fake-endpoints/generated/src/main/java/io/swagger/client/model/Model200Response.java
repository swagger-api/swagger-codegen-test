package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Model for testing model name starting with number
 **/
@ApiModel(description = "Model for testing model name starting with number")
public class Model200Response  {
  
  @SerializedName("name")
  private Integer name = null;
  @SerializedName("class")
  private String _class = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getName() {
    return name;
  }
  public void setName(Integer name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClass() {
    return _class;
  }
  public void setClass(String _class) {
    this._class = _class;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model200Response _200Response = (Model200Response) o;
    return (this.name == null ? _200Response.name == null : this.name.equals(_200Response.name)) &&
        (this._class == null ? _200Response._class == null : this._class.equals(_200Response._class));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this._class == null ? 0: this._class.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model200Response {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  _class: ").append(_class).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
