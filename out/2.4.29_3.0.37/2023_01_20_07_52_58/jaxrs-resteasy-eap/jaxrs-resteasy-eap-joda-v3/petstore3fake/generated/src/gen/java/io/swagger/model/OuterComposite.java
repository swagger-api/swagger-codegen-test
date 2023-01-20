package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-20T08:12:48.241Z[Etc/UTC]")public class OuterComposite   {
  private BigDecimal myNumber = null;
  private String myString = null;
  private Boolean myBoolean = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("my_number")
  public BigDecimal getMyNumber() {
    return myNumber;
  }
  public void setMyNumber(BigDecimal myNumber) {
    this.myNumber = myNumber;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("my_string")
  public String getMyString() {
    return myString;
  }
  public void setMyString(String myString) {
    this.myString = myString;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("my_boolean")
  public Boolean getMyBoolean() {
    return myBoolean;
  }
  public void setMyBoolean(Boolean myBoolean) {
    this.myBoolean = myBoolean;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterComposite outerComposite = (OuterComposite) o;
    return Objects.equals(myNumber, outerComposite.myNumber) &&
        Objects.equals(myString, outerComposite.myString) &&
        Objects.equals(myBoolean, outerComposite.myBoolean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myNumber, myString, myBoolean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterComposite {\n");
    
    sb.append("    myNumber: ").append(toIndentedString(myNumber)).append("\n");
    sb.append("    myString: ").append(toIndentedString(myString)).append("\n");
    sb.append("    myBoolean: ").append(toIndentedString(myBoolean)).append("\n");
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
