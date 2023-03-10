@isTest
private class SwagPetApiTest {
    /**
     * Add a new pet to the store
     *
     * 
     */
    @isTest
    private static void addPetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => SwagPet.getExample()
        };

        SwagClient client;
        SwagPetApi api;

        client = new SwagClient();
        api = new SwagPetApi(client); client.getAuthentication('petstore_auth');

        api.addPet(params);
    }

    /**
     * Deletes a pet
     *
     * 
     */
    @isTest
    private static void deletePetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'petId' => 2147483648L,
            'apiKey' => 'apiKey_example'
        };

        SwagClient client;
        SwagPetApi api;

        client = new SwagClient();
        api = new SwagPetApi(client); client.getAuthentication('petstore_auth');

        api.deletePet(params);
    }

    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     */
    @isTest
    private static void findPetsByStatusTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'status' => new List<String>{'available'}
        };

        SwagClient client;
        SwagPetApi api;
        List<SwagPet> response;
        List<SwagPet> expectedResponse;

        client = new SwagClient();
        api = new SwagPetApi(client); client.getAuthentication('petstore_auth');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('[ {\n  "photoUrls" : [ "photoUrls", "photoUrls" ],\n  "name" : "doggie",\n  "id" : 0,\n  "category" : {\n    "name" : "name",\n    "id" : 6\n  },\n  "tags" : [ {\n    "name" : "name",\n    "id" : 1\n  }, {\n    "name" : "name",\n    "id" : 1\n  } ],\n  "status" : "available"\n}, {\n  "photoUrls" : [ "photoUrls", "photoUrls" ],\n  "name" : "doggie",\n  "id" : 0,\n  "category" : {\n    "name" : "name",\n    "id" : 6\n  },\n  "tags" : [ {\n    "name" : "name",\n    "id" : 1\n  }, {\n    "name" : "name",\n    "id" : 1\n  } ],\n  "status" : "available"\n} ]');
        expectedResponse = new List<SwagPet>{SwagPet.getExample()};
        response = (List<SwagPet>) api.findPetsByStatus(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     */
    @isTest
    private static void findPetsByTagsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'tags' => new List<String>{'aeiou'}
        };

        SwagClient client;
        SwagPetApi api;
        List<SwagPet> response;
        List<SwagPet> expectedResponse;

        client = new SwagClient();
        api = new SwagPetApi(client); client.getAuthentication('petstore_auth');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('[ {\n  "photoUrls" : [ "photoUrls", "photoUrls" ],\n  "name" : "doggie",\n  "id" : 0,\n  "category" : {\n    "name" : "name",\n    "id" : 6\n  },\n  "tags" : [ {\n    "name" : "name",\n    "id" : 1\n  }, {\n    "name" : "name",\n    "id" : 1\n  } ],\n  "status" : "available"\n}, {\n  "photoUrls" : [ "photoUrls", "photoUrls" ],\n  "name" : "doggie",\n  "id" : 0,\n  "category" : {\n    "name" : "name",\n    "id" : 6\n  },\n  "tags" : [ {\n    "name" : "name",\n    "id" : 1\n  }, {\n    "name" : "name",\n    "id" : 1\n  } ],\n  "status" : "available"\n} ]');
        expectedResponse = new List<SwagPet>{SwagPet.getExample()};
        response = (List<SwagPet>) api.findPetsByTags(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Find pet by ID
     *
     * Returns a single pet
     */
    @isTest
    private static void getPetByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'petId' => 2147483648L
        };

        SwagClient client;
        SwagPetApi api;
        SwagPet response;
        SwagPet expectedResponse;

        client = new SwagClient();
        api = new SwagPetApi(client);
        ((Swagger.ApiKeyAuth) client.getAuthentication('api_key');
            client.setApiKey('foo-bar-api-key');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "photoUrls" : [ "photoUrls", "photoUrls" ],\n  "name" : "doggie",\n  "id" : 0,\n  "category" : {\n    "name" : "name",\n    "id" : 6\n  },\n  "tags" : [ {\n    "name" : "name",\n    "id" : 1\n  }, {\n    "name" : "name",\n    "id" : 1\n  } ],\n  "status" : "available"\n}');
        expectedResponse = SwagPet.getExample();
        response = (SwagPet) api.getPetById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Update an existing pet
     *
     * 
     */
    @isTest
    private static void updatePetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'body' => SwagPet.getExample()
        };

        SwagClient client;
        SwagPetApi api;

        client = new SwagClient();
        api = new SwagPetApi(client); client.getAuthentication('petstore_auth');

        api.updatePet(params);
    }

    /**
     * Updates a pet in the store with form data
     *
     * 
     */
    @isTest
    private static void updatePetWithFormTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'petId' => 2147483648L,
            'name' => 'name_example',
            'status' => 'status_example'
        };

        SwagClient client;
        SwagPetApi api;

        client = new SwagClient();
        api = new SwagPetApi(client); client.getAuthentication('petstore_auth');

        api.updatePetWithForm(params);
    }

    /**
     * uploads an image
     *
     * 
     */
    @isTest
    private static void uploadFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new SwaggerResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'petId' => 2147483648L,
            'additionalMetadata' => 'additionalMetadata_example',
            'file' => Blob.valueOf('Sample text file\nContents')
        };

        SwagClient client;
        SwagPetApi api;
        SwagApiResponse response;
        SwagApiResponse expectedResponse;

        client = new SwagClient();
        api = new SwagPetApi(client); client.getAuthentication('petstore_auth');

        res.setHeader('Content-Type', 'application/json');
        res.setBody('{\n  "code" : 0,\n  "type" : "type",\n  "message" : "message"\n}');
        expectedResponse = SwagApiResponse.getExample();
        response = (SwagApiResponse) api.uploadFile(params);
        System.assertEquals(expectedResponse, response);
    }
}