package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-18T06:14:05.871Z[Etc/UTC]")
public class UserApi {
  private ApiClient apiClient;

  public UserApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create user
   * This can only be done by the logged in user.
   * @param body Created user object (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User createUser(User body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/user";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json", "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
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
   * @throws ApiException if fails to make API call
   */
  public User createUser(Long id, String username, String firstName, String lastName, String email, String password, String phone, Integer userStatus) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/user";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (id != null)
      localVarFormParams.put("id", id);
    if (username != null)
      localVarFormParams.put("username", username);
    if (firstName != null)
      localVarFormParams.put("firstName", firstName);
    if (lastName != null)
      localVarFormParams.put("lastName", lastName);
    if (email != null)
      localVarFormParams.put("email", email);
    if (password != null)
      localVarFormParams.put("password", password);
    if (phone != null)
      localVarFormParams.put("phone", phone);
    if (userStatus != null)
      localVarFormParams.put("userStatus", userStatus);

    final String[] localVarAccepts = {
      "application/json", "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Creates list of users with given input array
   * Creates list of users with given input array
   * @param body  (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User createUsersWithListInput(List<User> body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/user/createWithList";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete user
   * This can only be done by the logged in user.
   * @param username The name that needs to be deleted (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUser(String username) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling deleteUser");
    }
    // create path and map variables
    String localVarPath = "/user/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get user by user name
   * 
   * @param username The name that needs to be fetched. Use user1 for testing.  (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUserByName(String username) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling getUserByName");
    }
    // create path and map variables
    String localVarPath = "/user/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Logs user into the system
   * 
   * @param username The user name for login (optional)
   * @param password The password for login in clear text (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String loginUser(String username, String password) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/user/login";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));


    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Logs out current logged in user session
   * 
   * @throws ApiException if fails to make API call
   */
  public void logoutUser() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/user/logout";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update user
   * This can only be done by the logged in user.
   * @param username name that need to be deleted (required)
   * @param body Update an existent user in the store (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateUser(String username, User body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling updateUser");
    }
    // create path and map variables
    String localVarPath = "/user/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
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
   * @throws ApiException if fails to make API call
   */
  public void updateUser(String username, Long id, String username2, String firstName, String lastName, String email, String password, String phone, Integer userStatus) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling updateUser");
    }
    // create path and map variables
    String localVarPath = "/user/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (id != null)
      localVarFormParams.put("id", id);
    if (username != null)
      localVarFormParams.put("username", username);
    if (firstName != null)
      localVarFormParams.put("firstName", firstName);
    if (lastName != null)
      localVarFormParams.put("lastName", lastName);
    if (email != null)
      localVarFormParams.put("email", email);
    if (password != null)
      localVarFormParams.put("password", password);
    if (phone != null)
      localVarFormParams.put("phone", phone);
    if (userStatus != null)
      localVarFormParams.put("userStatus", userStatus);

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
