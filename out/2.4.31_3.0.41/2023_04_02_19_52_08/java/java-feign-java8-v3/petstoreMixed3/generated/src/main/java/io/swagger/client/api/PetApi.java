package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;

import io.swagger.client.model.AllPetsResponse;
import java.io.File;
import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.Pet;
import io.swagger.client.model.SinglePetResponse;
import io.swagger.client.model.SubCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-02T19:57:59.907Z[Etc/UTC]")public interface PetApi extends ApiClient.Api {

  /**
   * Add a new pet to the store
   * 
   * @param body Pet object that needs to be added to the store (required)
   */
  @RequestLine("POST /pet")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void addPet(Pet body);
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
   * 
   * 
   * @param body  (optional)
   * @return ModelApiResponse
   */
  @RequestLine("POST /pet/category")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ModelApiResponse doCategoryStuff(SubCategory body);
  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (required)
   * @return List&lt;Pet&gt;
   */
  @RequestLine("GET /pet/findByStatus?status={status}")
  @Headers({
      "Accept: application/json",
  })
  List<Pet> findPetsByStatus(@Param("status") List<String> status);

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
   *   <li>status - Status values that need to be considered for filter (required)</li>
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
    public FindPetsByStatusQueryParams status(final List<String> value) {
      put("status", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }
  }
  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (required)
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
   *   <li>tags - Tags to filter by (required)</li>
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
      put("tags", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }
  }
  /**
   * 
   * 
   * @return AllPetsResponse
   */
  @RequestLine("GET /allPets")
  @Headers({
      "Accept: application/json",
  })
  AllPetsResponse getAllPets();
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
   * 
   * 
   * @return SinglePetResponse
   */
  @RequestLine("GET /randomPet")
  @Headers({
      "Accept: application/json",
  })
  SinglePetResponse getRandomPet();
  /**
   * Update an existing pet
   * 
   * @param body Pet object that needs to be added to the store (required)
   */
  @RequestLine("PUT /pet")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void updatePet(Pet body);
  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name  (optional)
   * @param status  (optional)
   */
  @RequestLine("POST /pet/{petId}")
  @Headers({
      "Content-Type: application/x-www-form-urlencoded",
      "Accept: */*",
  })
  void updatePetWithForm(@Param("petId") Long petId, @Param("name") String name, @Param("status") String status);
  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param additionalMetadata  (optional)
   * @param file  (optional)
   * @return ModelApiResponse
   */
  @RequestLine("POST /pet/{petId}/uploadImage")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ModelApiResponse uploadFile(@Param("petId") Long petId, @Param("additionalMetadata") String additionalMetadata, @Param("file") File file);
}
