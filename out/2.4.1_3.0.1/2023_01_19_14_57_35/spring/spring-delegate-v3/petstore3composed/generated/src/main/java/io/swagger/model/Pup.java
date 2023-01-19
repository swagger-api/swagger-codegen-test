package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cat;
import io.swagger.model.Dog;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:17:12.553Z[Etc/UTC]")

public class Pup   {
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

  @JsonProperty("hunts")
  private Boolean hunts = null;

  @JsonProperty("age")
  private Integer age = null;

  public Pup bark(Boolean bark) {
    this.bark = bark;
    return this;
  }

  /**
   * Get bark
   * @return bark
  **/
  @ApiModelProperty(value = "")


  public Boolean isBark() {
    return bark;
  }

  public void setBark(Boolean bark) {
    this.bark = bark;
  }

  public Pup breed(BreedEnum breed) {
    this.breed = breed;
    return this;
  }

  /**
   * Get breed
   * @return breed
  **/
  @ApiModelProperty(value = "")


  public BreedEnum getBreed() {
    return breed;
  }

  public void setBreed(BreedEnum breed) {
    this.breed = breed;
  }

  public Pup hunts(Boolean hunts) {
    this.hunts = hunts;
    return this;
  }

  /**
   * Get hunts
   * @return hunts
  **/
  @ApiModelProperty(value = "")


  public Boolean isHunts() {
    return hunts;
  }

  public void setHunts(Boolean hunts) {
    this.hunts = hunts;
  }

  public Pup age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(value = "")


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
    return Objects.equals(this.bark, pup.bark) &&
        Objects.equals(this.breed, pup.breed) &&
        Objects.equals(this.hunts, pup.hunts) &&
        Objects.equals(this.age, pup.age);
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

