package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.User;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserApi
 */
public class UserApiTest {

    private UserApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UserApi.class);
    }


    /**
     * Create user
     *
     * This can only be done by the logged in user.
     */
    @Test
    public void createUserTest() {
        User body = null;
        // User response = api.createUser(body);

        // TODO: test validations
    }

    /**
     * Creates list of users with given input array
     *
     * Creates list of users with given input array
     */
    @Test
    public void createUsersWithListInputTest() {
        List<User> body = null;
        // User response = api.createUsersWithListInput(body);

        // TODO: test validations
    }

    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     */
    @Test
    public void deleteUserTest() {
        String username = null;
        // Void response = api.deleteUser(username);

        // TODO: test validations
    }

    /**
     * Get user by user name
     *
     * 
     */
    @Test
    public void getUserByNameTest() {
        String username = null;
        // User response = api.getUserByName(username);

        // TODO: test validations
    }

    /**
     * Logs user into the system
     *
     * 
     */
    @Test
    public void loginUserTest() {
        String username = null;
        String password = null;
        // String response = api.loginUser(username, password);

        // TODO: test validations
    }

    /**
     * Logs out current logged in user session
     *
     * 
     */
    @Test
    public void logoutUserTest() {
        // Void response = api.logoutUser();

        // TODO: test validations
    }

    /**
     * Update user
     *
     * This can only be done by the logged in user.
     */
    @Test
    public void updateUserTest() {
        String username = null;
        User body = null;
        // Void response = api.updateUser(username, body);

        // TODO: test validations
    }
}
