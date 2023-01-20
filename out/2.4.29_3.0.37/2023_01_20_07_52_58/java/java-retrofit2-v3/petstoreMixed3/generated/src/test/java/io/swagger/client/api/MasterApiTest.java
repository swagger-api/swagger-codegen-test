package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.PartMaster;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MasterApi
 */
public class MasterApiTest {

    private MasterApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MasterApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void masterOperationTest() {
        // List<PartMaster> response = api.masterOperation();

        // TODO: test validations
    }
}
