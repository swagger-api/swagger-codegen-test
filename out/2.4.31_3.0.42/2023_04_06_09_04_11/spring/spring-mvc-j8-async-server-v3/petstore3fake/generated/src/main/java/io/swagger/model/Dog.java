package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Animal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dog
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-06T09:08:59.128Z[Etc/UTC]")


public class Dog extends Animal implements OneOfAllPetsResponseItems, OneOfSinglePetResponsePet {
  @JsonProperty("breed")
  private String breed = null;

  public Dog breed(String breed) {
    this.breed = breed;
    return this;
  }

  /**
   * Get breed
   * @return breed
   **/
  @ApiModelProperty(value = "")
  
    public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dog dog = (Dog) o;
    return Objects.equals(this.breed, dog.breed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breed, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dog {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
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
