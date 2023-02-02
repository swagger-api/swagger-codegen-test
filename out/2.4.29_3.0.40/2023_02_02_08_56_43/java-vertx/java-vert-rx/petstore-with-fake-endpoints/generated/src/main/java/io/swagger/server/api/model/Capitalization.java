package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Capitalization   {
  
  private String smallCamel = null;
  private String capitalCamel = null;
  private String smallSnake = null;
  private String capitalSnake = null;
  private String scAETHFlowPoints = null;
  private String ATT_NAME = null;

  public Capitalization () {

  }

  public Capitalization (String smallCamel, String capitalCamel, String smallSnake, String capitalSnake, String scAETHFlowPoints, String ATT_NAME) {
    this.smallCamel = smallCamel;
    this.capitalCamel = capitalCamel;
    this.smallSnake = smallSnake;
    this.capitalSnake = capitalSnake;
    this.scAETHFlowPoints = scAETHFlowPoints;
    this.ATT_NAME = ATT_NAME;
  }

    
  @JsonProperty("smallCamel")
  public String getSmallCamel() {
    return smallCamel;
  }
  public void setSmallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
  }

    
  @JsonProperty("CapitalCamel")
  public String getCapitalCamel() {
    return capitalCamel;
  }
  public void setCapitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }

    
  @JsonProperty("small_Snake")
  public String getSmallSnake() {
    return smallSnake;
  }
  public void setSmallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
  }

    
  @JsonProperty("Capital_Snake")
  public String getCapitalSnake() {
    return capitalSnake;
  }
  public void setCapitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }

    
  @JsonProperty("SCA_ETH_Flow_Points")
  public String getScAETHFlowPoints() {
    return scAETHFlowPoints;
  }
  public void setScAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }

    
  @JsonProperty("ATT_NAME")
  public String getATTNAME() {
    return ATT_NAME;
  }
  public void setATTNAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capitalization capitalization = (Capitalization) o;
    return Objects.equals(smallCamel, capitalization.smallCamel) &&
        Objects.equals(capitalCamel, capitalization.capitalCamel) &&
        Objects.equals(smallSnake, capitalization.smallSnake) &&
        Objects.equals(capitalSnake, capitalization.capitalSnake) &&
        Objects.equals(scAETHFlowPoints, capitalization.scAETHFlowPoints) &&
        Objects.equals(ATT_NAME, capitalization.ATT_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallCamel, capitalCamel, smallSnake, capitalSnake, scAETHFlowPoints, ATT_NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    
    sb.append("    smallCamel: ").append(toIndentedString(smallCamel)).append("\n");
    sb.append("    capitalCamel: ").append(toIndentedString(capitalCamel)).append("\n");
    sb.append("    smallSnake: ").append(toIndentedString(smallSnake)).append("\n");
    sb.append("    capitalSnake: ").append(toIndentedString(capitalSnake)).append("\n");
    sb.append("    scAETHFlowPoints: ").append(toIndentedString(scAETHFlowPoints)).append("\n");
    sb.append("    ATT_NAME: ").append(toIndentedString(ATT_NAME)).append("\n");
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
