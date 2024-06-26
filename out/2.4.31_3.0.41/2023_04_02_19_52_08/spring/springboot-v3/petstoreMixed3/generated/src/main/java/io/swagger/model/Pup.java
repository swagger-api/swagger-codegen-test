package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Category;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-02T20:06:05.651Z[Etc/UTC]")


public class Pup  implements OneOfPup {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("category2")
  private Category category2 = null;

  @JsonProperty("pets")
  @Valid
  private List<AllOfPupPetsItems> pets = null;

  public Pup id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Pup category2(Category category2) {
    this.category2 = category2;
    return this;
  }

  /**
   * Get category2
   * @return category2
   **/
  @Schema(description = "")
  
    @Valid
    public Category getCategory2() {
    return category2;
  }

  public void setCategory2(Category category2) {
    this.category2 = category2;
  }

  public Pup pets(List<AllOfPupPetsItems> pets) {
    this.pets = pets;
    return this;
  }

  public Pup addPetsItem(AllOfPupPetsItems petsItem) {
    if (this.pets == null) {
      this.pets = new ArrayList<AllOfPupPetsItems>();
    }
    this.pets.add(petsItem);
    return this;
  }

  /**
   * Get pets
   * @return pets
   **/
  @Schema(description = "")
  
    public List<AllOfPupPetsItems> getPets() {
    return pets;
  }

  public void setPets(List<AllOfPupPetsItems> pets) {
    this.pets = pets;
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
    return Objects.equals(this.id, pup.id) &&
        Objects.equals(this.category2, pup.category2) &&
        Objects.equals(this.pets, pup.pets);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
