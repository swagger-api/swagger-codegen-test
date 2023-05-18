package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class HasOnlyReadOnly  {
  
  @SerializedName("bar")
  private String bar = null;
  @SerializedName("foo")
  private String foo = null;

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
  public String getFoo() {
    return foo;
  }
  public void setFoo(String foo) {
    this.foo = foo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HasOnlyReadOnly hasOnlyReadOnly = (HasOnlyReadOnly) o;
    return (this.bar == null ? hasOnlyReadOnly.bar == null : this.bar.equals(hasOnlyReadOnly.bar)) &&
        (this.foo == null ? hasOnlyReadOnly.foo == null : this.foo.equals(hasOnlyReadOnly.foo));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bar == null ? 0: this.bar.hashCode());
    result = 31 * result + (this.foo == null ? 0: this.foo.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HasOnlyReadOnly {\n");
    
    sb.append("  bar: ").append(bar).append("\n");
    sb.append("  foo: ").append(foo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
