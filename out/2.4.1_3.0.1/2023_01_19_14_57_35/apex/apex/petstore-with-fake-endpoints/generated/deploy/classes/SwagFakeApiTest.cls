@isTest
private class SwagFakeApiTest {
    /**
     * 
     *
     * Test serialization of outer boolean types
     */
    @isTest
    private static void fakeOuterBooleanSerializeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => Boolean.getExample()
        };

        SwagClient client;
        SwagFakeApi api;
        Boolean response;
        Boolean expectedResponse;

        api = new SwagFakeApi(new SwagClient());

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{ }');
        expectedResponse = Boolean.getExample();
        response = (Boolean) api.fakeOuterBooleanSerialize(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * Test serialization of object with outer number type
     */
    @isTest
    private static void fakeOuterCompositeSerializeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => SwagOuterComposite.getExample()
        };

        SwagClient client;
        SwagFakeApi api;
        SwagOuterComposite response;
        SwagOuterComposite expectedResponse;

        api = new SwagFakeApi(new SwagClient());

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "my_string" : { },\n  "my_number" : { },\n  "my_boolean" : { }\n}');
        expectedResponse = SwagOuterComposite.getExample();
        response = (SwagOuterComposite) api.fakeOuterCompositeSerialize(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * Test serialization of outer number types
     */
    @isTest
    private static void fakeOuterNumberSerializeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => Double.getExample()
        };

        SwagClient client;
        SwagFakeApi api;
        Double response;
        Double expectedResponse;

        api = new SwagFakeApi(new SwagClient());

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{ }');
        expectedResponse = Double.getExample();
        response = (Double) api.fakeOuterNumberSerialize(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * Test serialization of outer string types
     */
    @isTest
    private static void fakeOuterStringSerializeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => String.getExample()
        };

        SwagClient client;
        SwagFakeApi api;
        String response;
        String expectedResponse;

        api = new SwagFakeApi(new SwagClient());

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{ }');
        expectedResponse = String.getExample();
        response = (String) api.fakeOuterStringSerialize(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void testBodyWithQueryParamsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => SwagUser.getExample(),
            'query' => 'query_example'
        };

        SwagClient client;
        SwagFakeApi api;

        api = new SwagFakeApi(new SwagClient());

        api.testBodyWithQueryParams(params);
    }

    /**
     * To test &quot;client&quot; model
     *
     * To test &quot;client&quot; model
     */
    @isTest
    private static void testClientModelTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => SwagClient.getExample()
        };

        SwagClient client;
        SwagFakeApi api;
        SwagClient response;
        SwagClient expectedResponse;

        api = new SwagFakeApi(new SwagClient());

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "client" : "client"\n}');
        expectedResponse = SwagClient.getExample();
        response = (SwagClient) api.testClientModel(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Fake endpoint for testing various parameters\n假端點\n偽のエンドポイント\n가짜 엔드 포인트\n
     *
     * Fake endpoint for testing various parameters\n假端點\n偽のエンドポイント\n가짜 엔드 포인트\n
     */
    @isTest
    private static void testEndpointParametersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_number' => 8.14,
            'double' => 1.2,
            'patternWithoutDelimiter' => 'patternWithoutDelimiter_example',
            'r_byte' => B,
            'integer' => 56,
            'int32' => 56,
            'int64' => 2147483648L,
            'r_float' => 3.4,
            'string' => 'string_example',
            'binary' => B,
            'r_date' => Date.newInstance(1960, 2, 17),
            'dateTime' => Datetime.newInstanceGmt(2013, 11, 12, 3, 3, 3),
            'password' => 'password_example',
            'paramCallback' => 'paramCallback_example'
        };

        SwagClient client;
        SwagFakeApi api;

        client = new SwagClient();
        api = new SwagFakeApi(client); client.getAuthentication('http_basic_test');

        api.testEndpointParameters(params);
    }

    /**
     * To test enum parameters
     *
     * To test enum parameters
     */
    @isTest
    private static void testEnumParametersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'enumFormStringArray' => new List<String>{'>'},
            'enumFormString' => 'enumFormString_example',
            'enumHeaderStringArray' => new List<String>{'>'},
            'enumHeaderString' => 'enumHeaderString_example',
            'enumQueryStringArray' => new List<String>{'>'},
            'enumQueryString' => 'enumQueryString_example',
            'enumQueryInteger' => 56,
            'enumQueryDouble' => 1.2
        };

        SwagClient client;
        SwagFakeApi api;

        api = new SwagFakeApi(new SwagClient());

        api.testEnumParameters(params);
    }

    /**
     * test inline additionalProperties
     *
     * 
     */
    @isTest
    private static void testInlineAdditionalPropertiesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'param' => Object.getExample()
        };

        SwagClient client;
        SwagFakeApi api;

        api = new SwagFakeApi(new SwagClient());

        api.testInlineAdditionalProperties(params);
    }

    /**
     * test json serialization of form data
     *
     * 
     */
    @isTest
    private static void testJsonFormDataTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'param' => 'param_example',
            'param2' => 'param2_example'
        };

        SwagClient client;
        SwagFakeApi api;

        api = new SwagFakeApi(new SwagClient());

        api.testJsonFormData(params);
    }
}