package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Animal
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-06T09:19:52.017Z[Etc/UTC]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "className", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = Dog.class, name = "Dog"),
        @JsonSubTypes.Type(value = Cat.class, name = "Cat"),
})


public class Animal   {
  @JsonTypeId
  private String className = null;

  @JsonProperty("color")
  private String color = "red";

  public Animal className(String className) {
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public Animal color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   **/
  @Schema(description = "")
  
    public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Animal animal = (Animal) o;
    return Objects.equals(this.className, animal.className) &&
        Objects.equals(this.color, animal.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Animal {\n");
    
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
