package io.swagger.client.model;

import io.swagger.client.model.OuterBoolean;
import io.swagger.client.model.OuterNumber;
import io.swagger.client.model.OuterString;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class OuterComposite  {
  
  @SerializedName("my_number")
  private OuterNumber myNumber = null;
  @SerializedName("my_string")
  private OuterString myString = null;
  @SerializedName("my_boolean")
  private OuterBoolean myBoolean = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public OuterNumber getMyNumber() {
    return myNumber;
  }
  public void setMyNumber(OuterNumber myNumber) {
    this.myNumber = myNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OuterString getMyString() {
    return myString;
  }
  public void setMyString(OuterString myString) {
    this.myString = myString;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OuterBoolean getMyBoolean() {
    return myBoolean;
  }
  public void setMyBoolean(OuterBoolean myBoolean) {
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
    return (this.myNumber == null ? outerComposite.myNumber == null : this.myNumber.equals(outerComposite.myNumber)) &&
        (this.myString == null ? outerComposite.myString == null : this.myString.equals(outerComposite.myString)) &&
        (this.myBoolean == null ? outerComposite.myBoolean == null : this.myBoolean.equals(outerComposite.myBoolean));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.myNumber == null ? 0: this.myNumber.hashCode());
    result = 31 * result + (this.myString == null ? 0: this.myString.hashCode());
    result = 31 * result + (this.myBoolean == null ? 0: this.myBoolean.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterComposite {\n");
    
    sb.append("  myNumber: ").append(myNumber).append("\n");
    sb.append("  myString: ").append(myString).append("\n");
    sb.append("  myBoolean: ").append(myBoolean).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
