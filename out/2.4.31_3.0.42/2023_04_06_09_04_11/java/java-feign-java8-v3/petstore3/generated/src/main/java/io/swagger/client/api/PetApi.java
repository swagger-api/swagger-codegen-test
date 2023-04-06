package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;

import io.swagger.client.model.Category;
import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.Pet;
import io.swagger.client.model.Tag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-06T09:14:00.752Z[Etc/UTC]")public interface PetApi extends ApiClient.Api {

  /**
   * Add a new pet to the store
   * Add a new pet to the store
   * @param body Create a new pet in the store (required)
   * @return Pet
   */
  @RequestLine("POST /pet")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Pet addPet(Pet body);
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
   */
  @RequestLine("POST /pet")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Pet addPet(@Param("id") Long id, @Param("name") String name, @Param("category") Category category, @Param("photoUrls") List<String> photoUrls, @Param("tags") List<Tag> tags, @Param("status") String status);
  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   */
  @RequestLine("DELETE /pet/{petId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
    "api_key: {apiKey}"
  })
  void deletePet(@Param("petId") Long petId, @Param("apiKey") String apiKey);
  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (optional, default to available)
   * @return List&lt;Pet&gt;
   */
  @RequestLine("GET /pet/findByStatus?status={status}")
  @Headers({
      "Accept: application/json",
  })
  List<Pet> findPetsByStatus(@Param("status") String status);

  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * Note, this is equivalent to the other <code>findPetsByStatus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindPetsByStatusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>status - Status values that need to be considered for filter (optional, default to available)</li>
   *   </ul>
   * @return List&lt;Pet&gt;

   */
  @RequestLine("GET /pet/findByStatus?status={status}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Pet> findPetsByStatus(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>findPetsByStatus</code> method in a fluent style.
   */
  public static class FindPetsByStatusQueryParams extends HashMap<String, Object> {
    public FindPetsByStatusQueryParams status(final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (optional)
   * @return List&lt;Pet&gt;
   */
  @RequestLine("GET /pet/findByTags?tags={tags}")
  @Headers({
      "Accept: application/json",
  })
  List<Pet> findPetsByTags(@Param("tags") List<String> tags);

  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * Note, this is equivalent to the other <code>findPetsByTags</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindPetsByTagsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>tags - Tags to filter by (optional)</li>
   *   </ul>
   * @return List&lt;Pet&gt;

   */
  @RequestLine("GET /pet/findByTags?tags={tags}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Pet> findPetsByTags(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>findPetsByTags</code> method in a fluent style.
   */
  public static class FindPetsByTagsQueryParams extends HashMap<String, Object> {
    public FindPetsByTagsQueryParams tags(final List<String> value) {
      put("tags", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Find pet by ID
   * Returns a single pet
   * @param petId ID of pet to return (required)
   * @return Pet
   */
  @RequestLine("GET /pet/{petId}")
  @Headers({
      "Accept: application/json",
  })
  Pet getPetById(@Param("petId") Long petId);
  /**
   * Update an existing pet
   * Update an existing pet by Id
   * @param body Update an existent pet in the store (required)
   * @return Pet
   */
  @RequestLine("PUT /pet")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Pet updatePet(Pet body);
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
   */
  @RequestLine("PUT /pet")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Pet updatePet(@Param("id") Long id, @Param("name") String name, @Param("category") Category category, @Param("photoUrls") List<String> photoUrls, @Param("tags") List<Tag> tags, @Param("status") String status);
  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Name of pet that needs to be updated (optional)
   * @param status Status of pet that needs to be updated (optional)
   */
  @RequestLine("POST /pet/{petId}?name={name}&status={status}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void updatePetWithForm(@Param("petId") Long petId, @Param("name") String name, @Param("status") String status);

  /**
   * Updates a pet in the store with form data
   * 
   * Note, this is equivalent to the other <code>updatePetWithForm</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePetWithFormQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param petId ID of pet that needs to be updated (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Name of pet that needs to be updated (optional)</li>
   *   <li>status - Status of pet that needs to be updated (optional)</li>
   *   </ul>

   */
  @RequestLine("POST /pet/{petId}?name={name}&status={status}")
  @Headers({
      "Content-Type: application/json",
  })
  void updatePetWithForm(@Param("petId") Long petId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>updatePetWithForm</code> method in a fluent style.
   */
  public static class UpdatePetWithFormQueryParams extends HashMap<String, Object> {
    public UpdatePetWithFormQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public UpdatePetWithFormQueryParams status(final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param body  (optional)
   * @param additionalMetadata Additional Metadata (optional)
   * @return ModelApiResponse
   */
  @RequestLine("POST /pet/{petId}/uploadImage?additionalMetadata={additionalMetadata}")
  @Headers({
      "Content-Type: application/octet-stream",
      "Accept: application/json",
  })
  ModelApiResponse uploadFile(@Param("petId") Long petId, Object body, @Param("additionalMetadata") String additionalMetadata);

  /**
   * uploads an image
   * 
   * Note, this is equivalent to the other <code>uploadFile</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UploadFileQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param petId ID of pet to update (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>additionalMetadata - Additional Metadata (optional)</li>
   *   </ul>
   * @return ModelApiResponse

   */
  @RequestLine("POST /pet/{petId}/uploadImage?additionalMetadata={additionalMetadata}")
  @Headers({
      "Content-Type: application/octet-stream",
      "Accept: application/json",
  })
  ModelApiResponse uploadFile(@Param("petId") Long petId, Object body, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>uploadFile</code> method in a fluent style.
   */
  public static class UploadFileQueryParams extends HashMap<String, Object> {
    public UploadFileQueryParams additionalMetadata(final String value) {
      put("additionalMetadata", EncodingUtils.encode(value));
      return this;
    }
  }
}
