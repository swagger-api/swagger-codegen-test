package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnimalAnimalIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-18T06:16:29.820Z[Etc/UTC]")


public class AnimalAnimalIdBody   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private String status = null;

  public AnimalAnimalIdBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Updated name of the animal
   * @return name
   **/
  @ApiModelProperty(value = "Updated name of the animal")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AnimalAnimalIdBody status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Updated status of the animal
   * @return status
   **/
  @ApiModelProperty(value = "Updated status of the animal")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
    AnimalAnimalIdBody animalAnimalIdBody = (AnimalAnimalIdBody) o;
    return Objects.equals(this.name, animalAnimalIdBody.name) &&
        Objects.equals(this.status, animalAnimalIdBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalAnimalIdBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
