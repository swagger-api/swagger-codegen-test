package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.PartMaster;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-20T14:04:27.508Z[Etc/UTC]")@Component("io.swagger.client.api.MasterApi")
public class MasterApi {
    private ApiClient apiClient;

    public MasterApi() {
        this(new ApiClient());
    }

    @Autowired
    public MasterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - peticion realizada con exito
     * @return List&lt;PartMaster&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PartMaster> masterOperation() throws RestClientException {
        return masterOperationWithHttpInfo().getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - peticion realizada con exito
     * @return ResponseEntity&lt;List&lt;PartMaster&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PartMaster>> masterOperationWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/master").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "http_bearer_test" };

        ParameterizedTypeReference<List<PartMaster>> returnType = new ParameterizedTypeReference<List<PartMaster>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
