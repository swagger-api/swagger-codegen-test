package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;

import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-02T09:08:00.403Z[Etc/UTC]")public interface UserApi extends ApiClient.Api {

  /**
   * Create user
   * This can only be done by the logged in user.
   * @param body Created user object (optional)
   * @return User
   */
  @RequestLine("POST /user")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  User createUser(User body);
  /**
   * Create user
   * This can only be done by the logged in user.
   * @param id  (optional)
   * @param username  (optional)
   * @param firstName  (optional)
   * @param lastName  (optional)
   * @param email  (optional)
   * @param password  (optional)
   * @param phone  (optional)
   * @param userStatus  (optional)
   * @return User
   */
  @RequestLine("POST /user")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  User createUser(@Param("id") Long id, @Param("username") String username, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("email") String email, @Param("password") String password, @Param("phone") String phone, @Param("userStatus") Integer userStatus);
  /**
   * Creates list of users with given input array
   * Creates list of users with given input array
   * @param body  (optional)
   * @return User
   */
  @RequestLine("POST /user/createWithList")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  User createUsersWithListInput(List<User> body);
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
   * @param username The name that needs to be fetched. Use user1 for testing.  (required)
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
   * @param username The user name for login (optional)
   * @param password The password for login in clear text (optional)
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
   *   <li>username - The user name for login (optional)</li>
   *   <li>password - The password for login in clear text (optional)</li>
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
   * Update user
   * This can only be done by the logged in user.
   * @param username name that need to be deleted (required)
   * @param body Update an existent user in the store (optional)
   */
  @RequestLine("PUT /user/{username}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void updateUser(@Param("username") String username, User body);
  /**
   * Update user
   * This can only be done by the logged in user.
   * @param username name that need to be deleted (required)
   * @param id  (optional)
   * @param username2  (optional)
   * @param firstName  (optional)
   * @param lastName  (optional)
   * @param email  (optional)
   * @param password  (optional)
   * @param phone  (optional)
   * @param userStatus  (optional)
   */
  @RequestLine("PUT /user/{username}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void updateUser(@Param("username") String username, @Param("id") Long id, @Param("username2") String username2, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("email") String email, @Param("password") String password, @Param("phone") String phone, @Param("userStatus") Integer userStatus);
}
