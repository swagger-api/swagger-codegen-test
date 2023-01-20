package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Users;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserWrapper
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-20T14:05:35.656Z[Etc/UTC]")


public class UserWrapper   {
  @JsonProperty("users")
  private Users users = null;

  public UserWrapper users(Users users) {
    this.users = users;
    return this;
  }

  /**
   * Get users
   * @return users
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWrapper userWrapper = (UserWrapper) o;
    return Objects.equals(this.users, userWrapper.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWrapper {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
