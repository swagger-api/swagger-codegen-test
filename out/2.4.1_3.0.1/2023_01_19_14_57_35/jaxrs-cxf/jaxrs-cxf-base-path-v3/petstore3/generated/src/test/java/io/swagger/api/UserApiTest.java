/**
 * Swagger Petstore - OpenAPI 3.0
 * This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.api;

import io.swagger.model.User;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Swagger Petstore - OpenAPI 3.0
 *
 * <p>This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * API tests for UserApi 
 */
public class UserApiTest {


    private UserApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://raw.githubusercontent.com/api/v3", UserApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() {
        Long id = null;
        String username = null;
        String firstName = null;
        String lastName = null;
        String email = null;
        String password = null;
        String phone = null;
        Integer userStatus = null;
        //User response = api.createUser(id, username, firstName, lastName, email, password, phone, userStatus);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Creates list of users with given input array
     *
     * Creates list of users with given input array
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsersWithListInputTest() {
        List<User> body = null;
        //User response = api.createUsersWithListInput(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() {
        String username = null;
        //api.deleteUser(username);
        
        // TODO: test validations
        
        
    }
    /**
     * Get user by user name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserByNameTest() {
        String username = null;
        //User response = api.getUserByName(username);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Logs user into the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginUserTest() {
        String username = null;
        String password = null;
        //String response = api.loginUser(username, password);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Logs out current logged in user session
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logoutUserTest() {
        //api.logoutUser();
        
        // TODO: test validations
        
        
    }
    /**
     * Update user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() {
        String username2 = null;
        Long id = null;
        String username = null;
        String firstName = null;
        String lastName = null;
        String email = null;
        String password = null;
        String phone = null;
        Integer userStatus = null;
        //api.updateUser(username2, id, username, firstName, lastName, email, password, phone, userStatus);
        
        // TODO: test validations
        
        
    }
}
