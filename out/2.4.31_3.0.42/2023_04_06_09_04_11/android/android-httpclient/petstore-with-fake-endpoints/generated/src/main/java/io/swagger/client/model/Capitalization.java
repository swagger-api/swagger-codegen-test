package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Capitalization  {
  
  @SerializedName("smallCamel")
  private String smallCamel = null;
  @SerializedName("CapitalCamel")
  private String capitalCamel = null;
  @SerializedName("small_Snake")
  private String smallSnake = null;
  @SerializedName("Capital_Snake")
  private String capitalSnake = null;
  @SerializedName("SCA_ETH_Flow_Points")
  private String sCAETHFlowPoints = null;
  @SerializedName("ATT_NAME")
  private String ATT_NAME = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSmallCamel() {
    return smallCamel;
  }
  public void setSmallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCapitalCamel() {
    return capitalCamel;
  }
  public void setCapitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSmallSnake() {
    return smallSnake;
  }
  public void setSmallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCapitalSnake() {
    return capitalSnake;
  }
  public void setCapitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSCAETHFlowPoints() {
    return sCAETHFlowPoints;
  }
  public void setSCAETHFlowPoints(String sCAETHFlowPoints) {
    this.sCAETHFlowPoints = sCAETHFlowPoints;
  }

  /**
   * Name of the pet 
   **/
  @ApiModelProperty(value = "Name of the pet ")
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
    return (this.smallCamel == null ? capitalization.smallCamel == null : this.smallCamel.equals(capitalization.smallCamel)) &&
        (this.capitalCamel == null ? capitalization.capitalCamel == null : this.capitalCamel.equals(capitalization.capitalCamel)) &&
        (this.smallSnake == null ? capitalization.smallSnake == null : this.smallSnake.equals(capitalization.smallSnake)) &&
        (this.capitalSnake == null ? capitalization.capitalSnake == null : this.capitalSnake.equals(capitalization.capitalSnake)) &&
        (this.sCAETHFlowPoints == null ? capitalization.sCAETHFlowPoints == null : this.sCAETHFlowPoints.equals(capitalization.sCAETHFlowPoints)) &&
        (this.ATT_NAME == null ? capitalization.ATT_NAME == null : this.ATT_NAME.equals(capitalization.ATT_NAME));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.smallCamel == null ? 0: this.smallCamel.hashCode());
    result = 31 * result + (this.capitalCamel == null ? 0: this.capitalCamel.hashCode());
    result = 31 * result + (this.smallSnake == null ? 0: this.smallSnake.hashCode());
    result = 31 * result + (this.capitalSnake == null ? 0: this.capitalSnake.hashCode());
    result = 31 * result + (this.sCAETHFlowPoints == null ? 0: this.sCAETHFlowPoints.hashCode());
    result = 31 * result + (this.ATT_NAME == null ? 0: this.ATT_NAME.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    
    sb.append("  smallCamel: ").append(smallCamel).append("\n");
    sb.append("  capitalCamel: ").append(capitalCamel).append("\n");
    sb.append("  smallSnake: ").append(smallSnake).append("\n");
    sb.append("  capitalSnake: ").append(capitalSnake).append("\n");
    sb.append("  sCAETHFlowPoints: ").append(sCAETHFlowPoints).append("\n");
    sb.append("  ATT_NAME: ").append(ATT_NAME).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
