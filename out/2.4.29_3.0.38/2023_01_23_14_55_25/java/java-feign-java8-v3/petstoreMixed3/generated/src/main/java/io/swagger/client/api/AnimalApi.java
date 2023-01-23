package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;

import io.swagger.client.model.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-23T15:06:55.445Z[Etc/UTC]")public interface AnimalApi extends ApiClient.Api {

  /**
   * Add a new animal to the store
   * 
   * @param body Animal object that needs to be added to the store (required)
   */
  @RequestLine("POST /animal?")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void addAnimal(Animal body);

  /**
   * Add a new animal to the store
   * 
   * Note, this is equivalent to the other <code>addAnimal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddAnimalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body Animal object that needs to be added to the store (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   </ul>

   */
  @RequestLine("POST /animal?")
  @Headers({
      "Content-Type: application/json",
  })
  void addAnimal(Animal body, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>addAnimal</code> method in a fluent style.
   */
  public static class AddAnimalQueryParams extends HashMap<String, Object> {
  }
  /**
   * Deletes a animal
   * 
   * @param animalId Animal id to delete (required)
   * @param apiKey  (optional)
   */
  @RequestLine("DELETE /animal/{animalId}?")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
    "api_key: {apiKey}"
  })
  void deleteAnimal(@Param("animalId") Long animalId, @Param("apiKey") String apiKey);

  /**
   * Deletes a animal
   * 
   * Note, this is equivalent to the other <code>deleteAnimal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAnimalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param animalId Animal id to delete (required)
   * @param apiKey  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   </ul>

   */
  @RequestLine("DELETE /animal/{animalId}?")
  @Headers({
      "Content-Type: application/json",
      "api_key: {apiKey}"
  })
  void deleteAnimal(@Param("animalId") Long animalId, @Param("apiKey") String apiKey, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteAnimal</code> method in a fluent style.
   */
  public static class DeleteAnimalQueryParams extends HashMap<String, Object> {
  }
  /**
   * Find animal by ID
   * Returns a single animal
   * @param animalId ID of pet to return (required)
   * @return Animal
   */
  @RequestLine("GET /animal/{animalId}?")
  @Headers({
      "Accept: application/json",
  })
  Animal getAnimalById(@Param("animalId") Long animalId);

  /**
   * Find animal by ID
   * Returns a single animal
   * Note, this is equivalent to the other <code>getAnimalById</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAnimalByIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param animalId ID of pet to return (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   </ul>
   * @return Animal

   */
  @RequestLine("GET /animal/{animalId}?")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  Animal getAnimalById(@Param("animalId") Long animalId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAnimalById</code> method in a fluent style.
   */
  public static class GetAnimalByIdQueryParams extends HashMap<String, Object> {
  }
  /**
   * Update an existing animal
   * 
   * @param body Animal object that needs to be added. (required)
   */
  @RequestLine("PUT /animal?")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void updateAnimal(Animal body);

  /**
   * Update an existing animal
   * 
   * Note, this is equivalent to the other <code>updateAnimal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateAnimalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body Animal object that needs to be added. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   </ul>

   */
  @RequestLine("PUT /animal?")
  @Headers({
      "Content-Type: application/json",
  })
  void updateAnimal(Animal body, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>updateAnimal</code> method in a fluent style.
   */
  public static class UpdateAnimalQueryParams extends HashMap<String, Object> {
  }
  /**
   * Updates a animal
   * 
   * @param animalId ID of animal that needs to be updated (required)
   * @param name  (optional)
   * @param status  (optional)
   */
  @RequestLine("POST /animal/{animalId}?")
  @Headers({
      "Content-Type: application/x-www-form-urlencoded",
      "Accept: */*",
  })
  void updateAnimalWithForm(@Param("animalId") Long animalId, @Param("name") String name, @Param("status") String status);

  /**
   * Updates a animal
   * 
   * Note, this is equivalent to the other <code>updateAnimalWithForm</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateAnimalWithFormQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param animalId ID of animal that needs to be updated (required)
   * @param name  (optional)
   * @param status  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   </ul>

   */
  @RequestLine("POST /animal/{animalId}?")
  @Headers({
      "Content-Type: application/x-www-form-urlencoded",
  })
  void updateAnimalWithForm(@Param("animalId") Long animalId, @Param("name") String name, @Param("status") String status, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>updateAnimalWithForm</code> method in a fluent style.
   */
  public static class UpdateAnimalWithFormQueryParams extends HashMap<String, Object> {
  }
}
