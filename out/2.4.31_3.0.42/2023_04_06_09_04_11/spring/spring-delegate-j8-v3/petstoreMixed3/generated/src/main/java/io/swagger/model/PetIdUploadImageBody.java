package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PetIdUploadImageBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-06T09:19:48.089Z[Etc/UTC]")


public class PetIdUploadImageBody   {
  @JsonProperty("additionalMetadata")
  private String additionalMetadata = null;

  @JsonProperty("file")
  private Resource file = null;

  public PetIdUploadImageBody additionalMetadata(String additionalMetadata) {
    this.additionalMetadata = additionalMetadata;
    return this;
  }

  /**
   * Additional data to pass to server
   * @return additionalMetadata
   **/
  @Schema(description = "Additional data to pass to server")
  
    public String getAdditionalMetadata() {
    return additionalMetadata;
  }

  public void setAdditionalMetadata(String additionalMetadata) {
    this.additionalMetadata = additionalMetadata;
  }

  public PetIdUploadImageBody file(Resource file) {
    this.file = file;
    return this;
  }

  /**
   * file to upload
   * @return file
   **/
  @Schema(description = "file to upload")
  
    @Valid
    public Resource getFile() {
    return file;
  }

  public void setFile(Resource file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetIdUploadImageBody petIdUploadImageBody = (PetIdUploadImageBody) o;
    return Objects.equals(this.additionalMetadata, petIdUploadImageBody.additionalMetadata) &&
        Objects.equals(this.file, petIdUploadImageBody.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalMetadata, file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetIdUploadImageBody {\n");
    
    sb.append("    additionalMetadata: ").append(toIndentedString(additionalMetadata)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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
