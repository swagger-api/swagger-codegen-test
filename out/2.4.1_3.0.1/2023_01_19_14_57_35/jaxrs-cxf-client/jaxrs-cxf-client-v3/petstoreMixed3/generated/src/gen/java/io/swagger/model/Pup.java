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
  private String breed = null;
  
  @Schema(description = "")
  private Boolean declawed = null;
 /**
   * Get breed
   * @return breed
  **/
  @JsonProperty("breed")
  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public Pup breed(String breed) {
    this.breed = breed;
    return this;
  }

 /**
   * Get declawed
   * @return declawed
  **/
  @JsonProperty("declawed")
  public Boolean isisDeclawed() {
    return declawed;
  }

  public void setDeclawed(Boolean declawed) {
    this.declawed = declawed;
  }

  public Pup declawed(Boolean declawed) {
    this.declawed = declawed;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
