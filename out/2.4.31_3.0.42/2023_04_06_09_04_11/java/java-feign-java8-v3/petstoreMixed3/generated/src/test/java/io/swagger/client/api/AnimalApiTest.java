package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Animal;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AnimalApi
 */
public class AnimalApiTest {

    private AnimalApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AnimalApi.class);
    }

    /**
     * Add a new animal to the store
     *
     * 
     */
    @Test
    public void addAnimalTest() {
        Animal body = null;
        // api.addAnimal(body);

        // TODO: test validations
    }

    /**
     * Add a new animal to the store
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void addAnimalTestQueryMap() {
        Animal body = null;
        AnimalApi.AddAnimalQueryParams queryParams = new AnimalApi.AddAnimalQueryParams();
        // api.addAnimal(body, queryParams);

    // TODO: test validations
    }
    /**
     * Deletes a animal
     *
     * 
     */
    @Test
    public void deleteAnimalTest() {
        Long animalId = null;
        String apiKey = null;
        // api.deleteAnimal(animalId, apiKey);

        // TODO: test validations
    }

    /**
     * Deletes a animal
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void deleteAnimalTestQueryMap() {
        Long animalId = null;
        String apiKey = null;
        AnimalApi.DeleteAnimalQueryParams queryParams = new AnimalApi.DeleteAnimalQueryParams();
        // api.deleteAnimal(animalId, apiKey, queryParams);

    // TODO: test validations
    }
    /**
     * Find animal by ID
     *
     * Returns a single animal
     */
    @Test
    public void getAnimalByIdTest() {
        Long animalId = null;
        // Animal response = api.getAnimalById(animalId);

        // TODO: test validations
    }

    /**
     * Find animal by ID
     *
     * Returns a single animal
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAnimalByIdTestQueryMap() {
        Long animalId = null;
        AnimalApi.GetAnimalByIdQueryParams queryParams = new AnimalApi.GetAnimalByIdQueryParams();
        // Animal response = api.getAnimalById(animalId, queryParams);

    // TODO: test validations
    }
    /**
     * Update an existing animal
     *
     * 
     */
    @Test
    public void updateAnimalTest() {
        Animal body = null;
        // api.updateAnimal(body);

        // TODO: test validations
    }

    /**
     * Update an existing animal
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void updateAnimalTestQueryMap() {
        Animal body = null;
        AnimalApi.UpdateAnimalQueryParams queryParams = new AnimalApi.UpdateAnimalQueryParams();
        // api.updateAnimal(body, queryParams);

    // TODO: test validations
    }
    /**
     * Updates a animal
     *
     * 
     */
    @Test
    public void updateAnimalWithFormTest() {
        Long animalId = null;
        String name = null;
        String status = null;
        // api.updateAnimalWithForm(animalId, name, status);

        // TODO: test validations
    }

    /**
     * Updates a animal
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void updateAnimalWithFormTestQueryMap() {
        Long animalId = null;
        String name = null;
        String status = null;
        AnimalApi.UpdateAnimalWithFormQueryParams queryParams = new AnimalApi.UpdateAnimalWithFormQueryParams();
        // api.updateAnimalWithForm(animalId, name, status, queryParams);

    // TODO: test validations
    }
}
