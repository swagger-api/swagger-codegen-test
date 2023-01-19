public class SwagClient extends Swagger.ApiClient {
    public SwagClient() {
        basePath = 'http://petstore.swagger.io:80/v2';
        calloutName = 'Swagger_Petstore';
        authentications.put('api_key', new Swagger.ApiKeyHeaderAuth('api_key'));
        authentications.put('api_key_query', new Swagger.ApiKeyQueryAuth('api_key_query'));
    }
}
