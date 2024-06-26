package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.
 */
@Schema(description = "Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-17T08:21:16.364Z[Etc/UTC]")


public class ValMemberChoice1  implements OneOfvalMembersValMemberItems {
  @JsonProperty("val_date_of_birth")
  private LocalDate valDateOfBirth = null;

  @JsonProperty("val_leaving_date")
  private LocalDate valLeavingDate = null;

  public ValMemberChoice1 valDateOfBirth(LocalDate valDateOfBirth) {
    this.valDateOfBirth = valDateOfBirth;
    return this;
  }

  /**
   * Business Term: Date Of Birth Definition: The date of birth of the member. Purpose: To be able to uniquely identify a member within a scheme.
   * @return valDateOfBirth
   **/
  @Schema(required = true, description = "Business Term: Date Of Birth Definition: The date of birth of the member. Purpose: To be able to uniquely identify a member within a scheme.")
      @NotNull

    @Valid
    public LocalDate getValDateOfBirth() {
    return valDateOfBirth;
  }

  public void setValDateOfBirth(LocalDate valDateOfBirth) {
    this.valDateOfBirth = valDateOfBirth;
  }

  public ValMemberChoice1 valLeavingDate(LocalDate valLeavingDate) {
    this.valLeavingDate = valLeavingDate;
    return this;
  }

  /**
   * Business Term: Leaving Date Definition: The date the member left/is due to leave the scheme. Purpose: To identify those members that have left or are due to leave the scheme. To be able to calculate the benefit insured/premium payable in respect of the member/category.
   * @return valLeavingDate
   **/
  @Schema(description = "Business Term: Leaving Date Definition: The date the member left/is due to leave the scheme. Purpose: To identify those members that have left or are due to leave the scheme. To be able to calculate the benefit insured/premium payable in respect of the member/category.")
  
    @Valid
    public LocalDate getValLeavingDate() {
    return valLeavingDate;
  }

  public void setValLeavingDate(LocalDate valLeavingDate) {
    this.valLeavingDate = valLeavingDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValMemberChoice1 valMemberChoice1 = (ValMemberChoice1) o;
    return Objects.equals(this.valDateOfBirth, valMemberChoice1.valDateOfBirth) &&
        Objects.equals(this.valLeavingDate, valMemberChoice1.valLeavingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valDateOfBirth, valLeavingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValMemberChoice1 {\n");
    
    sb.append("    valDateOfBirth: ").append(toIndentedString(valDateOfBirth)).append("\n");
    sb.append("    valLeavingDate: ").append(toIndentedString(valLeavingDate)).append("\n");
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
