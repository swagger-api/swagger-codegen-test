package io.swagger.api;

import io.swagger.model.Client;

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
public class FakeClassnameTestApiControllerIntegrationTest {

    @Autowired
    private FakeClassnameTestApi api;

    @Test
    public void testClassnameTest() throws Exception {
        Client body = new Client();
        ResponseEntity<Client> responseEntity = api.testClassname(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
