@isTest
private class SwagFakeClassnameTags123ApiTest {
    /**
     * To test class name in snake case
     *
     * To test class name in snake case
     */
    @isTest
    private static void testClassnameTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => SwagClient.getExample()
        };

        SwagClient client;
        SwagFakeClassnameTags123Api api;
        SwagClient response;
        SwagClient expectedResponse;

        client = new SwagClient();
        api = new SwagFakeClassnameTags123Api(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('api_key_query');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{"empty": false}');
        expectedResponse = SwagClient.getExample();
        response = (SwagClient) api.testClassname(params);
        System.assertEquals(expectedResponse, response);
    }
}