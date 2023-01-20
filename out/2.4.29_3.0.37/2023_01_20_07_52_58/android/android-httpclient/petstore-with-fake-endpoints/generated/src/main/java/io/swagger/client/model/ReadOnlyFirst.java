package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ReadOnlyFirst  {
  
  @SerializedName("bar")
  private String bar = null;
  @SerializedName("baz")
  private String baz = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBar() {
    return bar;
  }
  public void setBar(String bar) {
    this.bar = bar;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBaz() {
    return baz;
  }
  public void setBaz(String baz) {
    this.baz = baz;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadOnlyFirst readOnlyFirst = (ReadOnlyFirst) o;
    return (this.bar == null ? readOnlyFirst.bar == null : this.bar.equals(readOnlyFirst.bar)) &&
        (this.baz == null ? readOnlyFirst.baz == null : this.baz.equals(readOnlyFirst.baz));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bar == null ? 0: this.bar.hashCode());
    result = 31 * result + (this.baz == null ? 0: this.baz.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadOnlyFirst {\n");
    
    sb.append("  bar: ").append(bar).append("\n");
    sb.append("  baz: ").append(baz).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
