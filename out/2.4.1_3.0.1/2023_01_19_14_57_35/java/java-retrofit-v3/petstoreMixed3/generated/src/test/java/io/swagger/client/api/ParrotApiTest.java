package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Body8;
import io.swagger.client.model.InlineResponse200;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ParrotApi
 */
public class ParrotApiTest {

    private ParrotApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ParrotApi.class);
    }

    /**
     * Add a new parrow to the store
     *
     * 
     */
    @Test
    public void addParrotTest() {
        Object body = null;
        // Object response = api.addParrot(body);

        // TODO: test validations
    }
    /**
     * get Parrots
     *
     * 
     */
    @Test
    public void getParrotsTest() {
        // List<Object> response = api.getParrots();

        // TODO: test validations
    }
    /**
     * update parrots
     *
     * 
     */
    @Test
    public void updateParrotsTest() {
        Body8 body = null;
        // InlineResponse200 response = api.updateParrots(body);

        // TODO: test validations
    }
}
