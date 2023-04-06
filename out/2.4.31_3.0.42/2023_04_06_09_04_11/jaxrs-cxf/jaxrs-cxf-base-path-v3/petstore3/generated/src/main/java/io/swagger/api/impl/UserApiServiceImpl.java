package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.User;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Swagger Petstore - OpenAPI 3.0
 *
 * <p>This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 */
public class UserApiServiceImpl implements UserApi {
    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     */
    public User createUser(User body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     */
    public User createUser(Long id, String username, String firstName, String lastName, String email, String password, String phone, Integer userStatus) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Creates list of users with given input array
     *
     * Creates list of users with given input array
     *
     */
    public User createUsersWithListInput(List<User> body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     */
    public void deleteUser(String username) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get user by user name
     *
     */
    public User getUserByName(String username) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Logs user into the system
     *
     */
    public String loginUser(String username, String password) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Logs out current logged in user session
     *
     */
    public void logoutUser() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Update user
     *
     * This can only be done by the logged in user.
     *
     */
    public void updateUser(String username, User body) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Update user
     *
     * This can only be done by the logged in user.
     *
     */
    public void updateUser(String username, Long id, String username2, String firstName, String lastName, String email, String password, String phone, Integer userStatus) {
        // TODO: Implement...
        
        
    }
    
}

