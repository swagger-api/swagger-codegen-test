/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * Body6
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:07:20.258Z[Etc/UTC]")@XmlRootElement(name = "Body6")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "Body6")public class Body6 {

  @JsonProperty("name")
  @JacksonXmlProperty(localName = "name")
  @XmlElement(name="name")

  private String name = null;

  @JsonProperty("status")
  @JacksonXmlProperty(localName = "status")
  @XmlElement(name="status")

  private String status = null;
  public Body6 name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Updated name of the animal
  * @return name
  **/
  @Schema(description = "Updated name of the animal")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Body6 status(String status) {
    this.status = status;
    return this;
  }

  

  /**
  * Updated status of the animal
  * @return status
  **/
  @Schema(description = "Updated status of the animal")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body6 body6 = (Body6) o;
    return Objects.equals(this.name, body6.name) &&
        Objects.equals(this.status, body6.status);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body6 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
