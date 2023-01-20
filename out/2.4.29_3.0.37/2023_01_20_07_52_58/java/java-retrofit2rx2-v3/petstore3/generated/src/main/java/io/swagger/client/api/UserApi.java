package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserApi {
  /**
   * Create user
   * This can only be done by the logged in user.
   * @param body Created user object (optional)
   * @return Call&lt;User&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("user")
  Call<User> createUser(
    @retrofit2.http.Body User body
  );

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
   * @return Call&lt;User&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("user")
  Call<User> createUser(
    @retrofit2.http.Field("id") Long id, @retrofit2.http.Field("username") String username, @retrofit2.http.Field("firstName") String firstName, @retrofit2.http.Field("lastName") String lastName, @retrofit2.http.Field("email") String email, @retrofit2.http.Field("password") String password, @retrofit2.http.Field("phone") String phone, @retrofit2.http.Field("userStatus") Integer userStatus
  );

  /**
   * Creates list of users with given input array
   * Creates list of users with given input array
   * @param body  (optional)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("user/createWithList")
  Call<User> createUsersWithListInput(
    @retrofit2.http.Body List<User> body
  );

  /**
   * Delete user
   * This can only be done by the logged in user.
   * @param username The name that needs to be deleted (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/{username}")
  Call<Void> deleteUser(
    @retrofit2.http.Path("username") String username
  );

  /**
   * Get user by user name
   * 
   * @param username The name that needs to be fetched. Use user1 for testing.  (required)
   * @return Call&lt;User&gt;
   */
  @GET("user/{username}")
  Call<User> getUserByName(
    @retrofit2.http.Path("username") String username
  );

  /**
   * Logs user into the system
   * 
   * @param username The user name for login (optional)
   * @param password The password for login in clear text (optional)
   * @return Call&lt;String&gt;
   */
  @GET("user/login")
  Call<String> loginUser(
    @retrofit2.http.Query("username") String username, @retrofit2.http.Query("password") String password
  );

  /**
   * Logs out current logged in user session
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("user/logout")
  Call<Void> logoutUser();
    

  /**
   * Update user
   * This can only be done by the logged in user.
   * @param username name that need to be deleted (required)
   * @param body Update an existent user in the store (optional)
   * @return Call&lt;Void&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @PUT("user/{username}")
  Call<Void> updateUser(
    @retrofit2.http.Path("username") String username, @retrofit2.http.Body User body
  );

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
   * @return Call&lt;Void&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @PUT("user/{username}")
  Call<Void> updateUser(
    @retrofit2.http.Path("username") String username, @retrofit2.http.Field("id") Long id, @retrofit2.http.Field("username") String username2, @retrofit2.http.Field("firstName") String firstName, @retrofit2.http.Field("lastName") String lastName, @retrofit2.http.Field("email") String email, @retrofit2.http.Field("password") String password, @retrofit2.http.Field("phone") String phone, @retrofit2.http.Field("userStatus") Integer userStatus
  );

}
