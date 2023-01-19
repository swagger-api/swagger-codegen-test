package io.swagger.api;

import io.swagger.model.Dog;

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
public class DogApiControllerIntegrationTest {

    @Autowired
    private DogApi api;

    @Test
    public void addDogTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.addDog(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteDogTest() throws Exception {
        Long dogId = 789L;
        String apiKey = "apiKey_example";
        ResponseEntity<Void> responseEntity = api.deleteDog(dogId, apiKey);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getDogByIdTest() throws Exception {
        Long dogId = 789L;
        ResponseEntity<Dog> responseEntity = api.getDogById(dogId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateDogTest() throws Exception {
        Object body = null;
        ResponseEntity<Void> responseEntity = api.updateDog(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateDogWithFormTest() throws Exception {
        Long dogId = 789L;
        String name = "name_example";
        String status = "status_example";
        ResponseEntity<Void> responseEntity = api.updateDogWithForm(dogId, name, status);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
