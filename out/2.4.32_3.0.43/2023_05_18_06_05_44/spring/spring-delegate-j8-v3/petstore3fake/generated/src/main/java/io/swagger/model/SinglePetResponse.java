package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SinglePetResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-18T06:17:42.371Z[Etc/UTC]")


public class SinglePetResponse   {
  @JsonProperty("pet")
  private OneOfSinglePetResponsePet pet = null;

  public SinglePetResponse pet(OneOfSinglePetResponsePet pet) {
    this.pet = pet;
    return this;
  }

  /**
   * Get pet
   * @return pet
   **/
  @Schema(description = "")
  
    public OneOfSinglePetResponsePet getPet() {
    return pet;
  }

  public void setPet(OneOfSinglePetResponsePet pet) {
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
    return Objects.equals(this.pet, singlePetResponse.pet);
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
