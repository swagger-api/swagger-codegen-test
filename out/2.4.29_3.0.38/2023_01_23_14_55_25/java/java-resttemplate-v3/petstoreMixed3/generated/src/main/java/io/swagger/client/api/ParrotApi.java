package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.ParrotBody;
import io.swagger.client.model.ParrotBody1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-23T15:06:58.820Z[Etc/UTC]")@Component("io.swagger.client.api.ParrotApi")
public class ParrotApi {
    private ApiClient apiClient;

    public ParrotApi() {
        this(new ApiClient());
    }

    @Autowired
    public ParrotApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new parrow to the store
     * 
     * <p><b>405</b> - Invalid input
     * <p><b>200</b> - successful operation
     * @param body  (optional)
     * @return InlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2001 addParrot(ParrotBody1 body) throws RestClientException {
        return addParrotWithHttpInfo(body).getBody();
    }

    /**
     * Add a new parrow to the store
     * 
     * <p><b>405</b> - Invalid input
     * <p><b>200</b> - successful operation
     * @param body  (optional)
     * @return ResponseEntity&lt;InlineResponse2001&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse2001> addParrotWithHttpInfo(ParrotBody1 body) throws RestClientException {
        Object postBody = body;
        String path = UriComponentsBuilder.fromPath("/parrot").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "jwt" };

        ParameterizedTypeReference<InlineResponse2001> returnType = new ParameterizedTypeReference<InlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * get Parrots
     * 
     * <p><b>200</b> - successful operation
     * @return List&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Object> getParrots() throws RestClientException {
        return getParrotsWithHttpInfo().getBody();
    }

    /**
     * get Parrots
     * 
     * <p><b>200</b> - successful operation
     * @return ResponseEntity&lt;List&lt;Object&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Object>> getParrotsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/parrot").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "jwt" };

        ParameterizedTypeReference<List<Object>> returnType = new ParameterizedTypeReference<List<Object>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * update parrots
     * 
     * <p><b>405</b> - Invalid input
     * <p><b>200</b> - successful operation
     * @param body  (optional)
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 updateParrots(ParrotBody body) throws RestClientException {
        return updateParrotsWithHttpInfo(body).getBody();
    }

    /**
     * update parrots
     * 
     * <p><b>405</b> - Invalid input
     * <p><b>200</b> - successful operation
     * @param body  (optional)
     * @return ResponseEntity&lt;InlineResponse200&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse200> updateParrotsWithHttpInfo(ParrotBody body) throws RestClientException {
        Object postBody = body;
        String path = UriComponentsBuilder.fromPath("/parrot").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "jwt" };

        ParameterizedTypeReference<InlineResponse200> returnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
