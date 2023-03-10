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

public class SwagAnotherFakeApi {
    SwagClient client;

    public SwagAnotherFakeApi(SwagClient client) {
        this.client = client;
    }

    public SwagAnotherFakeApi() {
        this.client = new SwagClient();
    }

    public SwagClient getClient() {
        return this.client;
    }

    /**
     * To test special tags
     * To test special tags
     * @param body client model (required)
     * @return SwagClient
     * @throws Swagger.ApiException if fails to make API call
     */
    public SwagClient testSpecialTags(Map<String, Object> params) {
        client.assertNotNull(params.get('body'), 'body');
        List<Swagger.Param> query = new List<Swagger.Param>();
        List<Swagger.Param> form = new List<Swagger.Param>();

        return (SwagClient) client.invoke(
            'PATCH', '/another-fake/dummy',
            (SwagClient) params.get('body'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            SwagClient.class
        );
    }
}
