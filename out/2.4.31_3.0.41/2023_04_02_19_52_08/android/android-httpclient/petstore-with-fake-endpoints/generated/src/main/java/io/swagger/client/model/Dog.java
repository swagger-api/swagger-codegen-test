package io.swagger.client.model;

import io.swagger.client.model.Animal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Dog extends Animal {
  
  @SerializedName("className")
  private String className = null;
  @SerializedName("color")
  private String color = null;
  @SerializedName("breed")
  private String breed = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getClassName() {
    return className;
  }
  public void setClassName(String className) {
    this.className = className;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBreed() {
    return breed;
  }
  public void setBreed(String breed) {
    this.breed = breed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dog dog = (Dog) o;
    return (this.className == null ? dog.className == null : this.className.equals(dog.className)) &&
        (this.color == null ? dog.color == null : this.color.equals(dog.color)) &&
        (this.breed == null ? dog.breed == null : this.breed.equals(dog.breed));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.className == null ? 0: this.className.hashCode());
    result = 31 * result + (this.color == null ? 0: this.color.hashCode());
    result = 31 * result + (this.breed == null ? 0: this.breed.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dog {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  className: ").append(className).append("\n");
    sb.append("  color: ").append(color).append("\n");
    sb.append("  breed: ").append(breed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
