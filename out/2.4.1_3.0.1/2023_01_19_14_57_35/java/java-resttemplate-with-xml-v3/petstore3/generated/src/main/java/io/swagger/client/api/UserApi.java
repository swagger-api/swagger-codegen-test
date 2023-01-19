package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:13:34.897Z[Etc/UTC]")@Component("io.swagger.client.api.UserApi")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>0</b> - successful operation
     * @param id The id parameter
     * @param username The username parameter
     * @param firstName The firstName parameter
     * @param lastName The lastName parameter
     * @param email The email parameter
     * @param password The password parameter
     * @param phone The phone parameter
     * @param userStatus The userStatus parameter
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User createUser(Long id, String username, String firstName, String lastName, String email, String password, String phone, Integer userStatus) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/user").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (id != null)
            formParams.add("id", id);
        if (username != null)
            formParams.add("username", username);
        if (firstName != null)
            formParams.add("firstName", firstName);
        if (lastName != null)
            formParams.add("lastName", lastName);
        if (email != null)
            formParams.add("email", email);
        if (password != null)
            formParams.add("password", password);
        if (phone != null)
            formParams.add("phone", phone);
        if (userStatus != null)
            formParams.add("userStatus", userStatus);

        final String[] accepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates list of users with given input array
     * Creates list of users with given input array
     * <p><b>200</b> - Successful operation
     * <p><b>0</b> - successful operation
     * @param body The body parameter
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User createUsersWithListInput(List<User> body) throws RestClientException {
        Object postBody = body;
        String path = UriComponentsBuilder.fromPath("/user/createWithList").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/xml", "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete user
     * This can only be done by the logged in user.
     * <p><b>400</b> - Invalid username supplied
     * <p><b>404</b> - User not found
     * @param username The name that needs to be deleted
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteUser(String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/user/{username}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get user by user name
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid username supplied
     * <p><b>404</b> - User not found
     * @param username The name that needs to be fetched. Use user1 for testing. 
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User getUserByName(String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getUserByName");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/user/{username}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/xml", "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Logs user into the system
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid username/password supplied
     * @param username The user name for login
     * @param password The password for login in clear text
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String loginUser(String username, String password) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/user/login").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "username", username));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "password", password));

        final String[] accepts = { 
            "application/xml", "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Logs out current logged in user session
     * 
     * <p><b>0</b> - successful operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void logoutUser() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/user/logout").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update user
     * This can only be done by the logged in user.
     * <p><b>0</b> - successful operation
     * @param username2 name that need to be deleted
     * @param id The id parameter
     * @param username The username parameter
     * @param firstName The firstName parameter
     * @param lastName The lastName parameter
     * @param email The email parameter
     * @param password The password parameter
     * @param phone The phone parameter
     * @param userStatus The userStatus parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateUser(String username2, Long id, String username, String firstName, String lastName, String email, String password, String phone, Integer userStatus) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username2' is set
        if (username2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username2' when calling updateUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username2);
        String path = UriComponentsBuilder.fromPath("/user/{username}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (id != null)
            formParams.add("id", id);
        if (username != null)
            formParams.add("username", username);
        if (firstName != null)
            formParams.add("firstName", firstName);
        if (lastName != null)
            formParams.add("lastName", lastName);
        if (email != null)
            formParams.add("email", email);
        if (password != null)
            formParams.add("password", password);
        if (phone != null)
            formParams.add("phone", phone);
        if (userStatus != null)
            formParams.add("userStatus", userStatus);

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
