package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Body2;
import io.swagger.model.Body4;
import io.swagger.model.Body5;
import io.swagger.model.Client;
import io.swagger.model.OuterComposite;

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
public class FakeApiControllerIntegrationTest {

    @Autowired
    private FakeApi api;

    @Test
    public void fakeOuterBooleanSerializeTest() throws Exception {
        Boolean body = true;
        ResponseEntity<Boolean> responseEntity = api.fakeOuterBooleanSerialize(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void fakeOuterCompositeSerializeTest() throws Exception {
        OuterComposite body = new OuterComposite();
        ResponseEntity<OuterComposite> responseEntity = api.fakeOuterCompositeSerialize(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void fakeOuterNumberSerializeTest() throws Exception {
        BigDecimal body = new BigDecimal();
        ResponseEntity<BigDecimal> responseEntity = api.fakeOuterNumberSerialize(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void fakeOuterStringSerializeTest() throws Exception {
        String body = "body_example";
        ResponseEntity<String> responseEntity = api.fakeOuterStringSerialize(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void testClientModelTest() throws Exception {
        Client body = new Client();
        ResponseEntity<Client> responseEntity = api.testClientModel(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void testEndpointParametersTest() throws Exception {
        Body2 body = new Body2();
        ResponseEntity<Void> responseEntity = api.testEndpointParameters(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void testEnumParametersTest() throws Exception {
        List<String> enumHeaderStringArray = Arrays.asList("enumHeaderStringArray_example");
        String enumHeaderString = "enumHeaderString_example";
        List<String> enumQueryStringArray = Arrays.asList("enumQueryStringArray_example");
        String enumQueryString = "enumQueryString_example";
        Integer enumQueryInteger = 56;
        ResponseEntity<Void> responseEntity = api.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void testEnumRequestBodyTest() throws Exception {
        Body4 body = new Body4();
        ResponseEntity<Void> responseEntity = api.testEnumRequestBody(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void testInlineAdditionalPropertiesTest() throws Exception {
        Map<String, String> body = new Map();
        ResponseEntity<Void> responseEntity = api.testInlineAdditionalProperties(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void testJsonFormDataTest() throws Exception {
        Body5 body = new Body5();
        ResponseEntity<Void> responseEntity = api.testJsonFormData(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
