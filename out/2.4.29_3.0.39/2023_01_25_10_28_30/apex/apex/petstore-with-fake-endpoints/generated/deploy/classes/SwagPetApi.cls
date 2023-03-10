/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: " \
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

public class SwagPetApi {
    SwagClient client;

    public SwagPetApi(SwagClient client) {
        this.client = client;
    }

    public SwagPetApi() {
        this.client = new SwagClient();
    }

    public SwagClient getClient() {
        return this.client;
    }

    /**
     * Add a new pet to the store
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @throws Swagger.ApiException if fails to make API call
     */
    public void addPet(Map<String, Object> params) {
        client.assertNotNull(params.get('body'), 'body');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        client.invoke(
            'POST', '/pet',
            (SwagPet) params.get('body'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'petstore_auth' },
            null
        );
    }
    /**
     * Deletes a pet
     * 
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @throws Swagger.ApiException if fails to make API call
     */
    public void deletePet(Map<String, Object> params) {
        client.assertNotNull(params.get('petId'), 'petId');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        client.invoke(
            'DELETE', '/pet/{petId}', '',
            query, form,
            new Map<String, Object>{
                'petId' => (Long) params.get('petId')
            },
            new Map<String, Object>{
                'api_key' => (String) params.get('apiKey')
            },
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'petstore_auth' },
            null
        );
    }
    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter (required)
     * @return List<SwagPet>
     * @throws Swagger.ApiException if fails to make API call
     */
    public List<SwagPet> findPetsByStatus(Map<String, Object> params) {
        client.assertNotNull(params.get('status'), 'status');
        List<Swagger.Param> query = new List<Swagger.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('status', (List<String>) params.get('status'), 'csv'));

        List<Swagger.Param> form = new List<Swagger.Param>();

        return (List<SwagPet>) client.invoke(
            'GET', '/pet/findByStatus', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'petstore_auth' },
            List<SwagPet>.class
        );
    }
    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by (required)
     * @return List<SwagPet>
     * @throws Swagger.ApiException if fails to make API call
     */
    public List<SwagPet> findPetsByTags(Map<String, Object> params) {
        client.assertNotNull(params.get('tags'), 'tags');
        List<Swagger.Param> query = new List<Swagger.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('tags', (List<String>) params.get('tags'), 'csv'));

        List<Swagger.Param> form = new List<Swagger.Param>();

        return (List<SwagPet>) client.invoke(
            'GET', '/pet/findByTags', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'petstore_auth' },
            List<SwagPet>.class
        );
    }
    /**
     * Find pet by ID
     * Returns a single pet
     * @param petId ID of pet to return (required)
     * @return SwagPet
     * @throws Swagger.ApiException if fails to make API call
     */
    public SwagPet getPetById(Map<String, Object> params) {
        client.assertNotNull(params.get('petId'), 'petId');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        return (SwagPet) client.invoke(
            'GET', '/pet/{petId}', '',
            query, form,
            new Map<String, Object>{
                'petId' => (Long) params.get('petId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'api_key' },
            SwagPet.class
        );
    }
    /**
     * Update an existing pet
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @throws Swagger.ApiException if fails to make API call
     */
    public void updatePet(Map<String, Object> params) {
        client.assertNotNull(params.get('body'), 'body');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        client.invoke(
            'PUT', '/pet',
            (SwagPet) params.get('body'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'petstore_auth' },
            null
        );
    }
    /**
     * Updates a pet in the store with form data
     * 
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @throws Swagger.ApiException if fails to make API call
     */
    public void updatePetWithForm(Map<String, Object> params) {
        client.assertNotNull(params.get('petId'), 'petId');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        // cast form params to verify their expected type
        form.addAll(client.makeParam('name', (String) params.get('name')));
        form.addAll(client.makeParam('status', (String) params.get('status')));

        client.invoke(
            'POST', '/pet/{petId}', '',
            query, form,
            new Map<String, Object>{
                'petId' => (Long) params.get('petId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/x-www-form-urlencoded' },
            new List<String> { 'petstore_auth' },
            null
        );
    }
    /**
     * uploads an image
     * 
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return SwagApiResponse
     * @throws Swagger.ApiException if fails to make API call
     */
    public SwagApiResponse uploadFile(Map<String, Object> params) {
        client.assertNotNull(params.get('petId'), 'petId');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        // cast form params to verify their expected type
        form.addAll(client.makeParam('additionalMetadata', (String) params.get('additionalMetadata')));
        form.addAll(client.makeParam('file', (Blob) params.get('file')));

        return (SwagApiResponse) client.invoke(
            'POST', '/pet/{petId}/uploadImage', '',
            query, form,
            new Map<String, Object>{
                'petId' => (Long) params.get('petId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/x-www-form-urlencoded' },
            new List<String> { 'petstore_auth' },
            SwagApiResponse.class
        );
    }
}
