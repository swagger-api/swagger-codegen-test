package io.swagger.api;

import io.swagger.model.Animal;

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
public class AnimalApiControllerIntegrationTest {

    @Autowired
    private AnimalApi api;

    @Test
    public void addAnimalTest() throws Exception {
        Animal body = new Animal();
        ResponseEntity<Void> responseEntity = api.addAnimal(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteAnimalTest() throws Exception {
        Long animalId = 789L;
        String apiKey = "apiKey_example";
        ResponseEntity<Void> responseEntity = api.deleteAnimal(animalId, apiKey);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAnimalByIdTest() throws Exception {
        Long animalId = 789L;
        ResponseEntity<Animal> responseEntity = api.getAnimalById(animalId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateAnimalTest() throws Exception {
        Animal body = new Animal();
        ResponseEntity<Void> responseEntity = api.updateAnimal(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateAnimalWithFormTest() throws Exception {
        Long animalId = 789L;
        String name = "name_example";
        String status = "status_example";
        ResponseEntity<Void> responseEntity = api.updateAnimalWithForm(animalId, name, status);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
