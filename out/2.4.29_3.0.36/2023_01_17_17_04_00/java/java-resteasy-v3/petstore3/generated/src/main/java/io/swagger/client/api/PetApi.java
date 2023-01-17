package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import io.swagger.client.model.Category;
import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.Pet;
import io.swagger.client.model.Tag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T17:06:59.997Z[Etc/UTC]")public class PetApi {
  private ApiClient apiClient;

  public PetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add a new pet to the store
   * Add a new pet to the store
   * @param body Create a new pet in the store (required)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet addPet(Pet body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addPet");
    }
    // create path and map variables
    String localVarPath = "/pet".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<Pet> localVarReturnType = new GenericType<Pet>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Add a new pet to the store
   * Add a new pet to the store
   * @param id  (required)
   * @param name  (required)
   * @param category  (required)
   * @param photoUrls  (required)
   * @param tags  (required)
   * @param status  (required)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet addPet(Long id, String name, Category category, List<String> photoUrls, List<Tag> tags, String status) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addPet");
    }
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling addPet");
    }
    // verify the required parameter 'category' is set
    if (category == null) {
      throw new ApiException(400, "Missing the required parameter 'category' when calling addPet");
    }
    // verify the required parameter 'photoUrls' is set
    if (photoUrls == null) {
      throw new ApiException(400, "Missing the required parameter 'photoUrls' when calling addPet");
    }
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling addPet");
    }
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling addPet");
    }
    // create path and map variables
    String localVarPath = "/pet".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        if (id != null)
      localVarFormParams.put("id", id);
if (name != null)
      localVarFormParams.put("name", name);
if (category != null)
      localVarFormParams.put("category", category);
if (photoUrls != null)
      localVarFormParams.put("photoUrls", photoUrls);
if (tags != null)
      localVarFormParams.put("tags", tags);
if (status != null)
      localVarFormParams.put("status", status);

    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<Pet> localVarReturnType = new GenericType<Pet>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @throws ApiException if fails to make API call
   */
  public void deletePet(Long petId, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling deletePet");
    }
    // create path and map variables
    String localVarPath = "/pet/{petId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiKey != null)
      localVarHeaderParams.put("api_key", apiClient.parameterToString(apiKey));

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (optional, default to available)
   * @return List<Pet>
   * @throws ApiException if fails to make API call
   */
  public List<Pet> findPetsByStatus(String status) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/pet/findByStatus".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<List<Pet>> localVarReturnType = new GenericType<List<Pet>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (optional)
   * @return List<Pet>
   * @throws ApiException if fails to make API call
   */
  public List<Pet> findPetsByTags(List<String> tags) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/pet/findByTags".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<List<Pet>> localVarReturnType = new GenericType<List<Pet>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find pet by ID
   * Returns a single pet
   * @param petId ID of pet to return (required)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet getPetById(Long petId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling getPetById");
    }
    // create path and map variables
    String localVarPath = "/pet/{petId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key", "petstore_auth" };

    GenericType<Pet> localVarReturnType = new GenericType<Pet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update an existing pet
   * Update an existing pet by Id
   * @param body Update an existent pet in the store (required)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet updatePet(Pet body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePet");
    }
    // create path and map variables
    String localVarPath = "/pet".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<Pet> localVarReturnType = new GenericType<Pet>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update an existing pet
   * Update an existing pet by Id
   * @param id  (required)
   * @param name  (required)
   * @param category  (required)
   * @param photoUrls  (required)
   * @param tags  (required)
   * @param status  (required)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet updatePet(Long id, String name, Category category, List<String> photoUrls, List<Tag> tags, String status) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePet");
    }
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling updatePet");
    }
    // verify the required parameter 'category' is set
    if (category == null) {
      throw new ApiException(400, "Missing the required parameter 'category' when calling updatePet");
    }
    // verify the required parameter 'photoUrls' is set
    if (photoUrls == null) {
      throw new ApiException(400, "Missing the required parameter 'photoUrls' when calling updatePet");
    }
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling updatePet");
    }
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling updatePet");
    }
    // create path and map variables
    String localVarPath = "/pet".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        if (id != null)
      localVarFormParams.put("id", id);
if (name != null)
      localVarFormParams.put("name", name);
if (category != null)
      localVarFormParams.put("category", category);
if (photoUrls != null)
      localVarFormParams.put("photoUrls", photoUrls);
if (tags != null)
      localVarFormParams.put("tags", tags);
if (status != null)
      localVarFormParams.put("status", status);

    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<Pet> localVarReturnType = new GenericType<Pet>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Name of pet that needs to be updated (optional)
   * @param status Status of pet that needs to be updated (optional)
   * @throws ApiException if fails to make API call
   */
  public void updatePetWithForm(Long petId, String name, String status) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling updatePetWithForm");
    }
    // create path and map variables
    String localVarPath = "/pet/{petId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));

    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param body  (optional)
   * @param additionalMetadata Additional Metadata (optional)
   * @return ModelApiResponse
   * @throws ApiException if fails to make API call
   */
  public ModelApiResponse uploadFile(Long petId, Object body, String additionalMetadata) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling uploadFile");
    }
    // create path and map variables
    String localVarPath = "/pet/{petId}/uploadImage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "additionalMetadata", additionalMetadata));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/octet-stream"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<ModelApiResponse> localVarReturnType = new GenericType<ModelApiResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
