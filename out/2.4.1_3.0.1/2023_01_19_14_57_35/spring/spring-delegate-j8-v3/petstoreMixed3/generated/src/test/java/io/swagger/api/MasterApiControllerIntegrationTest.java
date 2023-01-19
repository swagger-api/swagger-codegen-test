package io.swagger.api;

import io.swagger.model.PartMaster;

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
public class MasterApiControllerIntegrationTest {

    @Autowired
    private MasterApi api;

    @Test
    public void masterOperationTest() throws Exception {
        ResponseEntity<List<PartMaster>> responseEntity = api.masterOperation();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
