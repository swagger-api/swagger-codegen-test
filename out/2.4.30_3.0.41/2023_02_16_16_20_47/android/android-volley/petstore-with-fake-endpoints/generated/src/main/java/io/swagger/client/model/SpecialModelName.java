/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SpecialModelName {
  
  @SerializedName("$special[property.name]")
  private Long specialPropertyName = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getSpecialPropertyName() {
    return specialPropertyName;
  }
  public void setSpecialPropertyName(Long specialPropertyName) {
    this.specialPropertyName = specialPropertyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialModelName specialModelName = (SpecialModelName) o;
    return (this.specialPropertyName == null ? specialModelName.specialPropertyName == null : this.specialPropertyName.equals(specialModelName.specialPropertyName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.specialPropertyName == null ? 0: this.specialPropertyName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialModelName {\n");
    
    sb.append("  specialPropertyName: ").append(specialPropertyName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
