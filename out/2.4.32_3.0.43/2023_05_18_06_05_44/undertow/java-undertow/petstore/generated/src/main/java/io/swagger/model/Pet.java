package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Category;
import io.swagger.model.Tag;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "io.swagger.codegen.languages.UndertowCodegen", date = "2023-05-18T06:07:11.402Z")
public class Pet   {
  
  private Long id = null;
  private Category category = null;
  private String name = null;
  private List<String> photoUrls = new ArrayList<String>();
  private List<Tag> tags = new ArrayList<Tag>();


  public enum StatusEnum {
    AVAILABLE("available"),
    PENDING("pending"),
    SOLD("sold");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;

  /**
   **/
  public Pet id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public Pet category(Category category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("category")
  public Category getCategory() {
    return category;
  }
  public void setCategory(Category category) {
    this.category = category;
  }

  /**
   **/
  public Pet name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "doggie", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Pet photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("photoUrls")
  public List<String> getPhotoUrls() {
    return photoUrls;
  }
  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  /**
   **/
  public Pet tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  /**
   * pet status in the store
   **/
  public Pet status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "pet status in the store")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pet pet = (Pet) o;
    return Objects.equals(id, pet.id) &&
        Objects.equals(category, pet.category) &&
        Objects.equals(name, pet.name) &&
        Objects.equals(photoUrls, pet.photoUrls) &&
        Objects.equals(tags, pet.tags) &&
        Objects.equals(status, pet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, name, photoUrls, tags, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

