package io.swagger.api;

import io.swagger.model.SinglePetResponse;

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
public class RandomPetApiControllerIntegrationTest {

    @Autowired
    private RandomPetApi api;

    @Test
    public void getRandomPetTest() throws Exception {
        ResponseEntity<SinglePetResponse> responseEntity = api.getRandomPet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
