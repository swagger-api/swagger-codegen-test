package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Model for testing model name same as property name
 */
@Schema(description = "Model for testing model name same as property name")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-06T09:19:52.017Z[Etc/UTC]")


public class Name   {
  @JsonProperty("name")
  private Integer name = null;

  @JsonProperty("snake_case")
  private Integer snakeCase = null;

  @JsonProperty("property")
  private String property = null;

  @JsonProperty("123Number")
  private Integer _123Number = null;

  public Name name(Integer name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getName() {
    return name;
  }

  public void setName(Integer name) {
    this.name = name;
  }

  public Name snakeCase(Integer snakeCase) {
    this.snakeCase = snakeCase;
    return this;
  }

  /**
   * Get snakeCase
   * @return snakeCase
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
    public Integer getSnakeCase() {
    return snakeCase;
  }

  public void setSnakeCase(Integer snakeCase) {
    this.snakeCase = snakeCase;
  }

  public Name property(String property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
   **/
  @Schema(description = "")
  
    public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public Name _123Number(Integer _123Number) {
    this._123Number = _123Number;
    return this;
  }

  /**
   * Get _123Number
   * @return _123Number
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
    public Integer get123Number() {
    return _123Number;
  }

  public void set123Number(Integer _123Number) {
    this._123Number = _123Number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.name, name.name) &&
        Objects.equals(this.snakeCase, name.snakeCase) &&
        Objects.equals(this.property, name.property) &&
        Objects.equals(this._123Number, name._123Number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, snakeCase, property, _123Number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    _123Number: ").append(toIndentedString(_123Number)).append("\n");
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
