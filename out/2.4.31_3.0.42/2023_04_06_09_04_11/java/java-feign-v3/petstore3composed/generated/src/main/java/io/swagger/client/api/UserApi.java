package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;

import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-06T09:17:04.289Z[Etc/UTC]")public interface UserApi extends ApiClient.Api {

  /**
   * Create user
   * This can only be done by the logged in user.
   * @param body Created user object (required)
   */
  @RequestLine("POST /user")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void createUser(User body);
  /**
   * Creates list of users with given input array
   * 
   * @param body List of user object (required)
   */
  @RequestLine("POST /user/createWithArray")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void createUsersWithArrayInput(List<User> body);
  /**
   * Creates list of users with given input array
   * 
   * @param body List of user object (required)
   */
  @RequestLine("POST /user/createWithList")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void createUsersWithListInput(List<User> body);
  /**
   * Delete user
   * This can only be done by the logged in user.
   * @param username The name that needs to be deleted (required)
   */
  @RequestLine("DELETE /user/{username}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteUser(@Param("username") String username);
  /**
   * Get user by user name
   * 
   * @param username The name that needs to be fetched. Use user1 for testing. (required)
   * @return User
   */
  @RequestLine("GET /user/{username}")
  @Headers({
      "Accept: application/json",
  })
  User getUserByName(@Param("username") String username);
  /**
   * Logs user into the system
   * 
   * @param username The user name for login (required)
   * @param password The password for login in clear text (required)
   * @return String
   */
  @RequestLine("GET /user/login?username={username}&password={password}")
  @Headers({
      "Accept: application/json",
  })
  String loginUser(@Param("username") String username, @Param("password") String password);

  /**
   * Logs user into the system
   * 
   * Note, this is equivalent to the other <code>loginUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LoginUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>username - The user name for login (required)</li>
   *   <li>password - The password for login in clear text (required)</li>
   *   </ul>
   * @return String

   */
  @RequestLine("GET /user/login?username={username}&password={password}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  String loginUser(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>loginUser</code> method in a fluent style.
   */
  public static class LoginUserQueryParams extends HashMap<String, Object> {
    public LoginUserQueryParams username(final String value) {
      put("username", EncodingUtils.encode(value));
      return this;
    }
    public LoginUserQueryParams password(final String value) {
      put("password", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Logs out current logged in user session
   * 
   */
  @RequestLine("GET /user/logout")
  @Headers({
      "Accept: */*",
  })
  void logoutUser();
  /**
   * Updated user
   * This can only be done by the logged in user.
   * @param body Updated user object (required)
   * @param username name that need to be updated (required)
   */
  @RequestLine("PUT /user/{username}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void userUsernamePut(User body, @Param("username") String username);
}
