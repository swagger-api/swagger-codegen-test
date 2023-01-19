package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Cat;
import io.swagger.model.Dog;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-19T15:17:02.948Z[Etc/UTC]")public class Pup   {
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
  }
  private BreedEnum breed = null;
  private Boolean hunts = null;
  private Integer age = null;

  /**
   **/
  
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
  
  @Schema(description = "")
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
