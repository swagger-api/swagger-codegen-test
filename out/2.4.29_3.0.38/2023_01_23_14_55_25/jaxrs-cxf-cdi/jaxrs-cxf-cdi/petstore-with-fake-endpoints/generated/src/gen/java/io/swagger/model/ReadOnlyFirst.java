package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ReadOnlyFirst   {
  
  private String bar = null;
  private String baz = null;

  /**
   **/
  public ReadOnlyFirst bar(String bar) {
    this.bar = bar;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bar")
  public String getBar() {
    return bar;
  }
  public void setBar(String bar) {
    this.bar = bar;
  }

  /**
   **/
  public ReadOnlyFirst baz(String baz) {
    this.baz = baz;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("baz")
  public String getBaz() {
    return baz;
  }
  public void setBaz(String baz) {
    this.baz = baz;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadOnlyFirst readOnlyFirst = (ReadOnlyFirst) o;
    return Objects.equals(bar, readOnlyFirst.bar) &&
        Objects.equals(baz, readOnlyFirst.baz);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bar, baz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadOnlyFirst {\n");
    
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("    baz: ").append(toIndentedString(baz)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

