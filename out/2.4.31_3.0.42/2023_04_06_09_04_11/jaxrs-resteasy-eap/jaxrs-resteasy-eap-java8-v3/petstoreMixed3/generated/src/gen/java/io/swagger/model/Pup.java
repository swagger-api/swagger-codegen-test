package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Category;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-04-06T09:19:52.270Z[Etc/UTC]")public class Pup  implements OneOfPup  {
  private Long id = null;
  private Category category2 = null;
  private List<AllOfPupPetsItems> pets = new ArrayList<>();

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("category2")
  public Category getCategory2() {
    return category2;
  }
  public void setCategory2(Category category2) {
    this.category2 = category2;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("pets")
  public List<AllOfPupPetsItems> getPets() {
    return pets;
  }
  public void setPets(List<AllOfPupPetsItems> pets) {
    this.pets = pets;
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
    return Objects.equals(id, pup.id) &&
        Objects.equals(category2, pup.category2) &&
        Objects.equals(pets, pup.pets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category2, pets);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
