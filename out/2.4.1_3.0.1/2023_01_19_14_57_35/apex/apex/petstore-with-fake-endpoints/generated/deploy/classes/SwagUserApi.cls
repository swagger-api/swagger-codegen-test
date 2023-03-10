/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: " \
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

public class SwagUserApi {
    SwagClient client;

    public SwagUserApi(SwagClient client) {
        this.client = client;
    }

    public SwagUserApi() {
        this.client = new SwagClient();
    }

    public SwagClient getClient() {
        return this.client;
    }

    /**
     * Create user
     * This can only be done by the logged in user.
     * @param body Created user object (required)
     * @throws Swagger.ApiException if fails to make API call
     */
    public void createUser(Map<String, Object> params) {
        client.assertNotNull(params.get('body'), 'body');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        client.invoke(
            'POST', '/user',
            (SwagUser) params.get('body'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            null
        );
    }
    /**
     * Creates list of users with given input array
     * 
     * @param body List of user object (required)
     * @throws Swagger.ApiException if fails to make API call
     */
    public void createUsersWithArrayInput(Map<String, Object> params) {
        client.assertNotNull(params.get('body'), 'body');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        client.invoke(
            'POST', '/user/createWithArray',
            (List<SwagUser>) params.get('body'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            null
        );
    }
    /**
     * Creates list of users with given input array
     * 
     * @param body List of user object (required)
     * @throws Swagger.ApiException if fails to make API call
     */
    public void createUsersWithListInput(Map<String, Object> params) {
        client.assertNotNull(params.get('body'), 'body');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        client.invoke(
            'POST', '/user/createWithList',
            (List<SwagUser>) params.get('body'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            null
        );
    }
    /**
     * Delete user
     * This can only be done by the logged in user.
     * @param username The name that needs to be deleted (required)
     * @throws Swagger.ApiException if fails to make API call
     */
    public void deleteUser(Map<String, Object> params) {
        client.assertNotNull(params.get('username'), 'username');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        client.invoke(
            'DELETE', '/user/{username}', '',
            query, form,
            new Map<String, Object>{
                'username' => (String) params.get('username')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            null
        );
    }
    /**
     * Get user by user name
     * 
     * @param username The name that needs to be fetched. Use user1 for testing. (required)
     * @return SwagUser
     * @throws Swagger.ApiException if fails to make API call
     */
    public SwagUser getUserByName(Map<String, Object> params) {
        client.assertNotNull(params.get('username'), 'username');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        return (SwagUser) client.invoke(
            'GET', '/user/{username}', '',
            query, form,
            new Map<String, Object>{
                'username' => (String) params.get('username')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            SwagUser.class
        );
    }
    /**
     * Logs user into the system
     * 
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return String
     * @throws Swagger.ApiException if fails to make API call
     */
    public String loginUser(Map<String, Object> params) {
        client.assertNotNull(params.get('username'), 'username');
        client.assertNotNull(params.get('password'), 'password');
        List<Swagger.Param> query = new List<Swagger.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('username', (String) params.get('username')));
        query.addAll(client.makeParam('password', (String) params.get('password')));

        List<Swagger.Param> form = new List<Swagger.Param>();

        return (String) client.invoke(
            'GET', '/user/login', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            String.class
        );
    }
    /**
     * Logs out current logged in user session
     * 
     * @throws Swagger.ApiException if fails to make API call
     */
    public void logoutUser() {
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        client.invoke(
            'GET', '/user/logout', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            null
        );
    }
    /**
     * Updated user
     * This can only be done by the logged in user.
     * @param username name that need to be deleted (required)
     * @param body Updated user object (required)
     * @throws Swagger.ApiException if fails to make API call
     */
    public void updateUser(Map<String, Object> params) {
        client.assertNotNull(params.get('username'), 'username');
        client.assertNotNull(params.get('body'), 'body');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        client.invoke(
            'PUT', '/user/{username}',
            (SwagUser) params.get('body'),
            query, form,
            new Map<String, Object>{
                'username' => (String) params.get('username')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            null
        );
    }
}
