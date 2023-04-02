package io.swagger.model;

import io.swagger.model.Category;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

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

public class Pup  implements OneOfPup  {
  
  @Schema(description = "")
  private Long id = null;
  
  @Schema(description = "")
  private Category category2 = null;
  
  @Schema(description = "")
  private List<AllOfPupPetsItems> pets = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Pup id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get category2
   * @return category2
  **/
  @JsonProperty("category2")
  public Category getCategory2() {
    return category2;
  }

  public void setCategory2(Category category2) {
    this.category2 = category2;
  }

  public Pup category2(Category category2) {
    this.category2 = category2;
    return this;
  }

 /**
   * Get pets
   * @return pets
  **/
  @JsonProperty("pets")
  public List<AllOfPupPetsItems> getPets() {
    return pets;
  }

  public void setPets(List<AllOfPupPetsItems> pets) {
    this.pets = pets;
  }

  public Pup pets(List<AllOfPupPetsItems> pets) {
    this.pets = pets;
    return this;
  }

  public Pup addPetsItem(AllOfPupPetsItems petsItem) {
    this.pets.add(petsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category2: ").append(toIndentedString(category2)).append("\n");
    sb.append("    pets: ").append(toIndentedString(pets)).append("\n");
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
