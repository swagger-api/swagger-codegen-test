@isTest
private class SwagAnotherFakeApiTest {
    /**
     * To test special tags
     *
     * To test special tags
     */
    @isTest
    private static void testSpecialTagsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => SwagClient.getExample()
        };

        SwagClient client;
        SwagAnotherFakeApi api;
        SwagClient response;
        SwagClient expectedResponse;

        api = new SwagAnotherFakeApi(new SwagClient());

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{"empty": false}');
        expectedResponse = SwagClient.getExample();
        response = (SwagClient) api.testSpecialTags(params);
        System.assertEquals(expectedResponse, response);
    }
}