package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Parakeet   {
  private @Valid String color = null;  private @Valid Boolean soundRepeater = null;

  /**
   **/
  public Parakeet color(String color) {
    this.color = color;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  /**
   **/
  public Parakeet soundRepeater(Boolean soundRepeater) {
    this.soundRepeater = soundRepeater;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("soundRepeater")
  public Boolean isisSoundRepeater() {
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
    return Objects.equals(color, parakeet.color) &&
        Objects.equals(soundRepeater, parakeet.soundRepeater);
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
