package io.swagger.api;

import io.swagger.model.Category;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.Tag;

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
public class PetApiControllerIntegrationTest {

    @Autowired
    private PetApi api;

    @Test
    public void addPetTest() throws Exception {
        Long id = 789L;
        String name = "name_example";
        Category category = new Category();
        List<String> photoUrls = Arrays.asList("photoUrls_example");
        List<Tag> tags = Arrays.asList(new Tag());
        String status = "status_example";
        ResponseEntity<Pet> responseEntity = api.addPet(id, name, category, photoUrls, tags, status);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deletePetTest() throws Exception {
        Long petId = 789L;
        String apiKey = "apiKey_example";
        ResponseEntity<Void> responseEntity = api.deletePet(petId, apiKey);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void findPetsByStatusTest() throws Exception {
        String status = "status_example";
        ResponseEntity<List<Pet>> responseEntity = api.findPetsByStatus(status);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void findPetsByTagsTest() throws Exception {
        List<String> tags = Arrays.asList("tags_example");
        ResponseEntity<List<Pet>> responseEntity = api.findPetsByTags(tags);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getPetByIdTest() throws Exception {
        Long petId = 789L;
        ResponseEntity<Pet> responseEntity = api.getPetById(petId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updatePetTest() throws Exception {
        Long id = 789L;
        String name = "name_example";
        Category category = new Category();
        List<String> photoUrls = Arrays.asList("photoUrls_example");
        List<Tag> tags = Arrays.asList(new Tag());
        String status = "status_example";
        ResponseEntity<Pet> responseEntity = api.updatePet(id, name, category, photoUrls, tags, status);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updatePetWithFormTest() throws Exception {
        Long petId = 789L;
        String name = "name_example";
        String status = "status_example";
        ResponseEntity<Void> responseEntity = api.updatePetWithForm(petId, name, status);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void uploadFileTest() throws Exception {
        Long petId = 789L;
        Object body = null;
        String additionalMetadata = "additionalMetadata_example";
        ResponseEntity<ModelApiResponse> responseEntity = api.uploadFile(petId, body, additionalMetadata);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
