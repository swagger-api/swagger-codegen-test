package io.swagger.model;

import io.swagger.model.Cat;
import io.swagger.model.Dog;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Pup  implements Serializable {
  private @Valid Boolean bark = null;public enum BreedEnum {

    DINGO(String.valueOf("Dingo")), HUSKY(String.valueOf("Husky")), RETRIEVER(String.valueOf("Retriever")), SHEPHERD(String.valueOf("Shepherd"));


    private String value;

    BreedEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static BreedEnum fromValue(String v) {
        for (BreedEnum b : BreedEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid BreedEnum breed = null;  private @Valid Boolean hunts = null;  private @Valid Integer age = null;

  /**
   **/
  public Pup bark(Boolean bark) {
    this.bark = bark;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("bark")
  public Boolean isisBark() {
    return bark;
  }
  public void setBark(Boolean bark) {
    this.bark = bark;
  }

  /**
   **/
  public Pup breed(BreedEnum breed) {
    this.breed = breed;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("breed")
  public BreedEnum getBreed() {
    return breed;
  }
  public void setBreed(BreedEnum breed) {
    this.breed = breed;
  }

  /**
   **/
  public Pup hunts(Boolean hunts) {
    this.hunts = hunts;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("hunts")
  public Boolean isisHunts() {
    return hunts;
  }
  public void setHunts(Boolean hunts) {
    this.hunts = hunts;
  }

  /**
   **/
  public Pup age(Integer age) {
    this.age = age;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pup pup = (Pup) o;
    return Objects.equals(bark, pup.bark) &&
        Objects.equals(breed, pup.breed) &&
        Objects.equals(hunts, pup.hunts) &&
        Objects.equals(age, pup.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bark, breed, hunts, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pup {\n");
    
    sb.append("    bark: ").append(toIndentedString(bark)).append("\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
    sb.append("    hunts: ").append(toIndentedString(hunts)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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
