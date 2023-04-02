package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Client  {
  
  @SerializedName("client")
  private String client = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClient() {
    return client;
  }
  public void setClient(String client) {
    this.client = client;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return (this.client == null ? client.client == null : this.client.equals(client.client));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.client == null ? 0: this.client.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("  client: ").append(client).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
