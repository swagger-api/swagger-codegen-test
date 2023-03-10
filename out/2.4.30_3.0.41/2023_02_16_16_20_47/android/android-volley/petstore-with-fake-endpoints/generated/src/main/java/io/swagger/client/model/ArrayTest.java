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

import io.swagger.client.model.ReadOnlyFirst;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ArrayTest {
  
  @SerializedName("array_of_string")
  private List<String> arrayOfString = null;
  @SerializedName("array_array_of_integer")
  private List<List<Long>> arrayArrayOfInteger = null;
  @SerializedName("array_array_of_model")
  private List<List<ReadOnlyFirst>> arrayArrayOfModel = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getArrayOfString() {
    return arrayOfString;
  }
  public void setArrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }
  public void setArrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<List<ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }
  public void setArrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTest arrayTest = (ArrayTest) o;
    return (this.arrayOfString == null ? arrayTest.arrayOfString == null : this.arrayOfString.equals(arrayTest.arrayOfString)) &&
        (this.arrayArrayOfInteger == null ? arrayTest.arrayArrayOfInteger == null : this.arrayArrayOfInteger.equals(arrayTest.arrayArrayOfInteger)) &&
        (this.arrayArrayOfModel == null ? arrayTest.arrayArrayOfModel == null : this.arrayArrayOfModel.equals(arrayTest.arrayArrayOfModel));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.arrayOfString == null ? 0: this.arrayOfString.hashCode());
    result = 31 * result + (this.arrayArrayOfInteger == null ? 0: this.arrayArrayOfInteger.hashCode());
    result = 31 * result + (this.arrayArrayOfModel == null ? 0: this.arrayArrayOfModel.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTest {\n");
    
    sb.append("  arrayOfString: ").append(arrayOfString).append("\n");
    sb.append("  arrayArrayOfInteger: ").append(arrayArrayOfInteger).append("\n");
    sb.append("  arrayArrayOfModel: ").append(arrayArrayOfModel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
