package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Category;
import io.swagger.model.Tag;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class Pet   {
  private Long id = null;
  private String name = null;
  private Category category = null;
  private List<String> photoUrls = new ArrayList<String>();
  private List<Tag> tags = new ArrayList<Tag>();
@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

    @XmlEnumValue("available") AVAILABLE(String.valueOf("available")), @XmlEnumValue("pending") PENDING(String.valueOf("pending")), @XmlEnumValue("sold") SOLD(String.valueOf("sold"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private StatusEnum status = null;

  /**
   **/
  public Pet id(Long id) {
    this.id = id;
    return this;
  }

  
  
  @Schema(example = "10", description = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public Pet name(String name) {
    this.name = name;
    return this;
  }

  
  
  @Schema(example = "doggie", required = true, description = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Pet category(Category category) {
    this.category = category;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("category")
  @Valid
  public Category getCategory() {
    return category;
  }
  public void setCategory(Category category) {
    this.category = category;
  }

  /**
   **/
  public Pet photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  
  
  @Schema(required = true, description = "")
  @JsonProperty("photoUrls")
  @NotNull
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

  
  
  @Schema(description = "")
  @JsonProperty("tags")
  @Valid
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

  
  
  @Schema(description = "pet status in the store")
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
        Objects.equals(name, pet.name) &&
        Objects.equals(category, pet.category) &&
        Objects.equals(photoUrls, pet.photoUrls) &&
        Objects.equals(tags, pet.tags) &&
        Objects.equals(status, pet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, photoUrls, tags, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
