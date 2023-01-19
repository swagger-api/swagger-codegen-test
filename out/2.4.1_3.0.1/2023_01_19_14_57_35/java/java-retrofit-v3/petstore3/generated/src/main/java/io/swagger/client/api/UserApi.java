package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit.Callback;
import retrofit.http.*;
import retrofit.mime.*;

import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserApi {
  /**
   * Create user
   * Sync method
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
  @retrofit.http.FormUrlEncoded
  @POST("/user")
  User createUser(
    @retrofit.http.Field("id") Long id, @retrofit.http.Field("username") String username, @retrofit.http.Field("firstName") String firstName, @retrofit.http.Field("lastName") String lastName, @retrofit.http.Field("email") String email, @retrofit.http.Field("password") String password, @retrofit.http.Field("phone") String phone, @retrofit.http.Field("userStatus") Integer userStatus
  );

  /**
   * Create user
   * Async method
   * @param id  (optional)
   * @param username  (optional)
   * @param firstName  (optional)
   * @param lastName  (optional)
   * @param email  (optional)
   * @param password  (optional)
   * @param phone  (optional)
   * @param userStatus  (optional)
   * @param cb callback method
   */
  @retrofit.http.FormUrlEncoded
  @POST("/user")
  void createUser(
    @retrofit.http.Field("id") Long id, @retrofit.http.Field("username") String username, @retrofit.http.Field("firstName") String firstName, @retrofit.http.Field("lastName") String lastName, @retrofit.http.Field("email") String email, @retrofit.http.Field("password") String password, @retrofit.http.Field("phone") String phone, @retrofit.http.Field("userStatus") Integer userStatus, Callback<User> cb
  );
  /**
   * Creates list of users with given input array
   * Sync method
   * Creates list of users with given input array
   * @param body  (optional)
   * @return User
   */
  @POST("/user/createWithList")
  User createUsersWithListInput(
    @retrofit.http.Body List<User> body
  );

  /**
   * Creates list of users with given input array
   * Async method
   * @param body  (optional)
   * @param cb callback method
   */
  @POST("/user/createWithList")
  void createUsersWithListInput(
    @retrofit.http.Body List<User> body, Callback<User> cb
  );
  /**
   * Delete user
   * Sync method
   * This can only be done by the logged in user.
   * @param username The name that needs to be deleted (required)
   * @return Void
   */
  @DELETE("/user/{username}")
  Void deleteUser(
    @retrofit.http.Path("username") String username
  );

  /**
   * Delete user
   * Async method
   * @param username The name that needs to be deleted (required)
   * @param cb callback method
   */
  @DELETE("/user/{username}")
  void deleteUser(
    @retrofit.http.Path("username") String username, Callback<Void> cb
  );
  /**
   * Get user by user name
   * Sync method
   * 
   * @param username The name that needs to be fetched. Use user1 for testing.  (required)
   * @return User
   */
  @GET("/user/{username}")
  User getUserByName(
    @retrofit.http.Path("username") String username
  );

  /**
   * Get user by user name
   * Async method
   * @param username The name that needs to be fetched. Use user1 for testing.  (required)
   * @param cb callback method
   */
  @GET("/user/{username}")
  void getUserByName(
    @retrofit.http.Path("username") String username, Callback<User> cb
  );
  /**
   * Logs user into the system
   * Sync method
   * 
   * @param username The user name for login (optional)
   * @param password The password for login in clear text (optional)
   * @return String
   */
  @GET("/user/login")
  String loginUser(
    @retrofit.http.Query("username") String username, @retrofit.http.Query("password") String password
  );

  /**
   * Logs user into the system
   * Async method
   * @param username The user name for login (optional)
   * @param password The password for login in clear text (optional)
   * @param cb callback method
   */
  @GET("/user/login")
  void loginUser(
    @retrofit.http.Query("username") String username, @retrofit.http.Query("password") String password, Callback<String> cb
  );
  /**
   * Logs out current logged in user session
   * Sync method
   * 
   * @return Void
   */
  @GET("/user/logout")
  Void logoutUser();
    

  /**
   * Logs out current logged in user session
   * Async method
   * @param cb callback method
   */
  @GET("/user/logout")
  void logoutUser(
    Callback<Void> cb
  );
  /**
   * Update user
   * Sync method
   * This can only be done by the logged in user.
   * @param username2 name that need to be deleted (required)
   * @param id  (optional)
   * @param username  (optional)
   * @param firstName  (optional)
   * @param lastName  (optional)
   * @param email  (optional)
   * @param password  (optional)
   * @param phone  (optional)
   * @param userStatus  (optional)
   * @return Void
   */
  @retrofit.http.FormUrlEncoded
  @PUT("/user/{username}")
  Void updateUser(
    @retrofit.http.Path("username") String username2, @retrofit.http.Field("id") Long id, @retrofit.http.Field("username") String username, @retrofit.http.Field("firstName") String firstName, @retrofit.http.Field("lastName") String lastName, @retrofit.http.Field("email") String email, @retrofit.http.Field("password") String password, @retrofit.http.Field("phone") String phone, @retrofit.http.Field("userStatus") Integer userStatus
  );

  /**
   * Update user
   * Async method
   * @param username2 name that need to be deleted (required)
   * @param id  (optional)
   * @param username  (optional)
   * @param firstName  (optional)
   * @param lastName  (optional)
   * @param email  (optional)
   * @param password  (optional)
   * @param phone  (optional)
   * @param userStatus  (optional)
   * @param cb callback method
   */
  @retrofit.http.FormUrlEncoded
  @PUT("/user/{username}")
  void updateUser(
    @retrofit.http.Path("username") String username2, @retrofit.http.Field("id") Long id, @retrofit.http.Field("username") String username, @retrofit.http.Field("firstName") String firstName, @retrofit.http.Field("lastName") String lastName, @retrofit.http.Field("email") String email, @retrofit.http.Field("password") String password, @retrofit.http.Field("phone") String phone, @retrofit.http.Field("userStatus") Integer userStatus, Callback<Void> cb
  );
}
