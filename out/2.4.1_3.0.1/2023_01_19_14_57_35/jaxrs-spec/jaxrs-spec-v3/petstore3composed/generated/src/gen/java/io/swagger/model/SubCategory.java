package io.swagger.model;

import io.swagger.model.Category;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SubCategory   {
  private @Valid Object category = null;  private @Valid Category category2 = null;  private @Valid List<Object> pets = new ArrayList<Object>();

  /**
   **/
  public SubCategory category(Object category) {
    this.category = category;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("category")
  public Object getCategory() {
    return category;
  }
  public void setCategory(Object category) {
    this.category = category;
  }

  /**
   **/
  public SubCategory category2(Category category2) {
    this.category2 = category2;
    return this;
  }

  
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
  public SubCategory pets(List<Object> pets) {
    this.pets = pets;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("pets")
  public List<Object> getPets() {
    return pets;
  }
  public void setPets(List<Object> pets) {
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
    SubCategory subCategory = (SubCategory) o;
    return Objects.equals(category, subCategory.category) &&
        Objects.equals(category2, subCategory.category2) &&
        Objects.equals(pets, subCategory.pets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, category2, pets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubCategory {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
