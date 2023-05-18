package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-05-18T06:09:36.166Z[Etc/UTC]")
public class Parakeet  implements OneOfinlineResponse200ParrotsItems, InlineResponse2001, AnyOfparrotBodyParrotsItems, ParrotBody1  {
  private String color = null;
  private Boolean soundRepeater = null;

  /**
   **/
  
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
  
  @Schema(description = "")
  @JsonProperty("soundRepeater")
  public Boolean isSoundRepeater() {
    return soundRepeater;
  }
  public void setSoundRepeater(Boolean soundRepeater) {
    this.soundRepeater = soundRepeater;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
