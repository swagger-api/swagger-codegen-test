package io.swagger.api;

import io.swagger.model.Body8;
import io.swagger.model.InlineResponse200;

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
public class ParrotApiControllerIntegrationTest {

    @Autowired
    private ParrotApi api;

    @Test
    public void addParrotTest() throws Exception {
        Object body = null;
        ResponseEntity<Object> responseEntity = api.addParrot(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getParrotsTest() throws Exception {
        ResponseEntity<List<Object>> responseEntity = api.getParrots();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateParrotsTest() throws Exception {
        Body8 body = new Body8();
        ResponseEntity<InlineResponse200> responseEntity = api.updateParrots(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
