package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.io.File;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-05-18T06:16:15.318Z[Etc/UTC]")
public class PetIdUploadImageBody   {
  private String additionalMetadata = null;
  private File file = null;

  /**
   * Additional data to pass to server
   **/
  
  @Schema(description = "Additional data to pass to server")
  @JsonProperty("additionalMetadata")
  public String getAdditionalMetadata() {
    return additionalMetadata;
  }
  public void setAdditionalMetadata(String additionalMetadata) {
    this.additionalMetadata = additionalMetadata;
  }

  /**
   * file to upload
   **/
  
  @Schema(description = "file to upload")
  @JsonProperty("file")
  public File getFile() {
    return file;
  }
  public void setFile(File file) {
    this.file = file;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetIdUploadImageBody petIdUploadImageBody = (PetIdUploadImageBody) o;
    return Objects.equals(additionalMetadata, petIdUploadImageBody.additionalMetadata) &&
        Objects.equals(file, petIdUploadImageBody.file);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
