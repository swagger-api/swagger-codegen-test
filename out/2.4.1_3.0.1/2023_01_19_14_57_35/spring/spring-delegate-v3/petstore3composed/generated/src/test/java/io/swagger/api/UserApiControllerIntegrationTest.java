package io.swagger.api;

import io.swagger.model.User;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApiControllerIntegrationTest {

    @Autowired
    private UserApi api;

    @Test
    public void createUserTest() throws Exception {
        User body = new User();
        ResponseEntity<Void> responseEntity = api.createUser(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void createUsersWithArrayInputTest() throws Exception {
        List<User> body = Arrays.asList(new User());
        ResponseEntity<Void> responseEntity = api.createUsersWithArrayInput(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void createUsersWithListInputTest() throws Exception {
        List<User> body = Arrays.asList(new User());
        ResponseEntity<Void> responseEntity = api.createUsersWithListInput(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteUserTest() throws Exception {
        String username = "username_example";
        ResponseEntity<Void> responseEntity = api.deleteUser(username);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getUserByNameTest() throws Exception {
        String username = "username_example";
        ResponseEntity<User> responseEntity = api.getUserByName(username);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void loginUserTest() throws Exception {
        String username = "username_example";
        String password = "password_example";
        ResponseEntity<String> responseEntity = api.loginUser(username, password);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void logoutUserTest() throws Exception {
        ResponseEntity<Void> responseEntity = api.logoutUser();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void userUsernamePutTest() throws Exception {
        User body = new User();
        String username = "username_example";
        ResponseEntity<Void> responseEntity = api.userUsernamePut(body, username);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
