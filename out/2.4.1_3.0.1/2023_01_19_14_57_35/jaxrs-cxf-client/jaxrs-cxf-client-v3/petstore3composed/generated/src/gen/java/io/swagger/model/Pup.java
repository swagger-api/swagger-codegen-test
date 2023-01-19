package io.swagger.model;

import io.swagger.model.Cat;
import io.swagger.model.Dog;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class Pup  {
  
  @Schema(description = "")
  private Boolean bark = null;
  public enum BreedEnum {
    DINGO("Dingo"),
    HUSKY("Husky"),
    RETRIEVER("Retriever"),
    SHEPHERD("Shepherd");

    private String value;

    BreedEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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
  @Schema(description = "")
  private BreedEnum breed = null;
  
  @Schema(description = "")
  private Boolean hunts = null;
  
  @Schema(description = "")
  private Integer age = null;
 /**
   * Get bark
   * @return bark
  **/
  @JsonProperty("bark")
  public Boolean isisBark() {
    return bark;
  }

  public void setBark(Boolean bark) {
    this.bark = bark;
  }

  public Pup bark(Boolean bark) {
    this.bark = bark;
    return this;
  }

 /**
   * Get breed
   * @return breed
  **/
  @JsonProperty("breed")
  public String getBreed() {
    if (breed == null) {
      return null;
    }
    return breed.getValue();
  }

  public void setBreed(BreedEnum breed) {
    this.breed = breed;
  }

  public Pup breed(BreedEnum breed) {
    this.breed = breed;
    return this;
  }

 /**
   * Get hunts
   * @return hunts
  **/
  @JsonProperty("hunts")
  public Boolean isisHunts() {
    return hunts;
  }

  public void setHunts(Boolean hunts) {
    this.hunts = hunts;
  }

  public Pup hunts(Boolean hunts) {
    this.hunts = hunts;
    return this;
  }

 /**
   * Get age
   * @return age
  **/
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Pup age(Integer age) {
    this.age = age;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
