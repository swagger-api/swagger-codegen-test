package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Cat;
import io.swagger.model.Dog;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class Pup   {
  private String breed = null;
  private Boolean declawed = null;

  /**
   **/
  public Pup breed(String breed) {
    this.breed = breed;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("breed")
  public String getBreed() {
    return breed;
  }
  public void setBreed(String breed) {
    this.breed = breed;
  }

  /**
   **/
  public Pup declawed(Boolean declawed) {
    this.declawed = declawed;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("declawed")
  public Boolean isisDeclawed() {
    return declawed;
  }
  public void setDeclawed(Boolean declawed) {
    this.declawed = declawed;
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
    return Objects.equals(breed, pup.breed) &&
        Objects.equals(declawed, pup.declawed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breed, declawed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pup {\n");
    
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
    sb.append("    declawed: ").append(toIndentedString(declawed)).append("\n");
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
