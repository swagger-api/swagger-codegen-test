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
 * Parakeet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-06T09:18:22.013Z[Etc/UTC]")


public class Parakeet  implements OneOfinlineResponse200ParrotsItems, InlineResponse2001, AnyOfparrotBodyParrotsItems, ParrotBody1 {
  @JsonProperty("color")
  private String color = null;

  @JsonProperty("soundRepeater")
  private Boolean soundRepeater = null;

  public Parakeet color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   **/
  @ApiModelProperty(value = "")
  
    public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Parakeet soundRepeater(Boolean soundRepeater) {
    this.soundRepeater = soundRepeater;
    return this;
  }

  /**
   * Get soundRepeater
   * @return soundRepeater
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isSoundRepeater() {
    return soundRepeater;
  }

  public void setSoundRepeater(Boolean soundRepeater) {
    this.soundRepeater = soundRepeater;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parakeet parakeet = (Parakeet) o;
    return Objects.equals(this.color, parakeet.color) &&
        Objects.equals(this.soundRepeater, parakeet.soundRepeater);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, soundRepeater);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parakeet {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    soundRepeater: ").append(toIndentedString(soundRepeater)).append("\n");
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
