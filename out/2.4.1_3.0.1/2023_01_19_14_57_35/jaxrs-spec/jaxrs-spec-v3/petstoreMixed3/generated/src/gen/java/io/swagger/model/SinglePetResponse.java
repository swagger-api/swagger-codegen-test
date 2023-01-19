package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SinglePetResponse   {
  private @Valid Object pet = null;

  /**
   **/
  public SinglePetResponse pet(Object pet) {
    this.pet = pet;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("pet")
  public Object getPet() {
    return pet;
  }
  public void setPet(Object pet) {
    this.pet = pet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SinglePetResponse singlePetResponse = (SinglePetResponse) o;
    return Objects.equals(pet, singlePetResponse.pet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SinglePetResponse {\n");
    
    sb.append("    pet: ").append(toIndentedString(pet)).append("\n");
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
