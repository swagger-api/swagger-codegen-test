package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Pet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dog
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-17T08:19:34.650Z[Etc/UTC]")


public class Dog extends Pet implements OneOfAllPetsResponseItems, OneOfPetPartItems, OneOfPup {
  @JsonProperty("bark")
  private Boolean bark = null;

  /**
   * Gets or Sets breed
   */
  public enum BreedEnum {
    DINGO("Dingo"),
    
    HUSKY("Husky"),
    
    RETRIEVER("Retriever"),
    
    SHEPHERD("Shepherd");

    private String value;

    BreedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BreedEnum fromValue(String text) {
      for (BreedEnum b : BreedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("breed")
  private BreedEnum breed = null;

  public Dog bark(Boolean bark) {
    this.bark = bark;
    return this;
  }

  /**
   * Get bark
   * @return bark
   **/
  @Schema(description = "")
  
    public Boolean isBark() {
    return bark;
  }

  public void setBark(Boolean bark) {
    this.bark = bark;
  }

  public Dog breed(BreedEnum breed) {
    this.breed = breed;
    return this;
  }

  /**
   * Get breed
   * @return breed
   **/
  @Schema(description = "")
  
    public BreedEnum getBreed() {
    return breed;
  }

  public void setBreed(BreedEnum breed) {
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
    return Objects.equals(this.bark, dog.bark) &&
        Objects.equals(this.breed, dog.breed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bark, breed, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dog {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bark: ").append(toIndentedString(bark)).append("\n");
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
