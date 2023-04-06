package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Macaw
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-06T09:19:56.061Z[Etc/UTC]")


public class Macaw  implements OneOfinlineResponse200ParrotsItems, InlineResponse2001, AnyOfparrotBodyParrotsItems, ParrotBody1 {
  @JsonProperty("color")
  private String color = null;

  @JsonProperty("singer")
  private Boolean singer = null;

  public Macaw color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   **/
  @Schema(description = "")
  
    public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Macaw singer(Boolean singer) {
    this.singer = singer;
    return this;
  }

  /**
   * Get singer
   * @return singer
   **/
  @Schema(description = "")
  
    public Boolean isSinger() {
    return singer;
  }

  public void setSinger(Boolean singer) {
    this.singer = singer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Macaw macaw = (Macaw) o;
    return Objects.equals(this.color, macaw.color) &&
        Objects.equals(this.singer, macaw.singer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, singer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Macaw {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    singer: ").append(toIndentedString(singer)).append("\n");
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
