package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit.Callback;
import retrofit.http.*;
import retrofit.mime.*;

import io.swagger.client.model.Category;
import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.Pet;
import io.swagger.client.model.Tag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PetApi {
  /**
   * Add a new pet to the store
   * Sync method
   * Add a new pet to the store
   * @param body Create a new pet in the store (required)
   * @return Pet
   */
  @retrofit.http.FormUrlEncoded
  @POST("/pet")
  Pet addPet(
    @retrofit.http.Body Pet body
  );

  /**
   * Add a new pet to the store
   * Async method
   * @param body Create a new pet in the store (required)
   * @param cb callback method
   */
  @retrofit.http.FormUrlEncoded
  @POST("/pet")
  void addPet(
    @retrofit.http.Body Pet body, Callback<Pet> cb
  );
  /**
   * Add a new pet to the store
   * Sync method
   * Add a new pet to the store
   * @param id  (required)
   * @param name  (required)
   * @param category  (required)
   * @param photoUrls  (required)
   * @param tags  (required)
   * @param status  (required)
   * @return Pet
   */
  @retrofit.http.FormUrlEncoded
  @POST("/pet")
  Pet addPet(
    @retrofit.http.Field("id") Long id, @retrofit.http.Field("name") String name, @retrofit.http.Field("category") Category category, @retrofit.http.Field("photoUrls") List<String> photoUrls, @retrofit.http.Field("tags") List<Tag> tags, @retrofit.http.Field("status") String status
  );

  /**
   * Add a new pet to the store
   * Async method
   * @param id  (required)
   * @param name  (required)
   * @param category  (required)
   * @param photoUrls  (required)
   * @param tags  (required)
   * @param status  (required)
   * @param cb callback method
   */
  @retrofit.http.FormUrlEncoded
  @POST("/pet")
  void addPet(
    @retrofit.http.Field("id") Long id, @retrofit.http.Field("name") String name, @retrofit.http.Field("category") Category category, @retrofit.http.Field("photoUrls") List<String> photoUrls, @retrofit.http.Field("tags") List<Tag> tags, @retrofit.http.Field("status") String status, Callback<Pet> cb
  );
  /**
   * Deletes a pet
   * Sync method
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @return Void
   */
  @DELETE("/pet/{petId}")
  Void deletePet(
    @retrofit.http.Path("petId") Long petId, @retrofit.http.Header("api_key") String apiKey
  );

  /**
   * Deletes a pet
   * Async method
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @param cb callback method
   */
  @DELETE("/pet/{petId}")
  void deletePet(
    @retrofit.http.Path("petId") Long petId, @retrofit.http.Header("api_key") String apiKey, Callback<Void> cb
  );
  /**
   * Finds Pets by status
   * Sync method
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (optional, default to available)
   * @return List&lt;Pet&gt;
   */
  @GET("/pet/findByStatus")
  List<Pet> findPetsByStatus(
    @retrofit.http.Query("status") String status
  );

  /**
   * Finds Pets by status
   * Async method
   * @param status Status values that need to be considered for filter (optional, default to available)
   * @param cb callback method
   */
  @GET("/pet/findByStatus")
  void findPetsByStatus(
    @retrofit.http.Query("status") String status, Callback<List<Pet>> cb
  );
  /**
   * Finds Pets by tags
   * Sync method
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (optional)
   * @return List&lt;Pet&gt;
   */
  @GET("/pet/findByTags")
  List<Pet> findPetsByTags(
    @retrofit.http.Query("tags") List<String> tags
  );

  /**
   * Finds Pets by tags
   * Async method
   * @param tags Tags to filter by (optional)
   * @param cb callback method
   */
  @GET("/pet/findByTags")
  void findPetsByTags(
    @retrofit.http.Query("tags") List<String> tags, Callback<List<Pet>> cb
  );
  /**
   * Find pet by ID
   * Sync method
   * Returns a single pet
   * @param petId ID of pet to return (required)
   * @return Pet
   */
  @GET("/pet/{petId}")
  Pet getPetById(
    @retrofit.http.Path("petId") Long petId
  );

  /**
   * Find pet by ID
   * Async method
   * @param petId ID of pet to return (required)
   * @param cb callback method
   */
  @GET("/pet/{petId}")
  void getPetById(
    @retrofit.http.Path("petId") Long petId, Callback<Pet> cb
  );
  /**
   * Update an existing pet
   * Sync method
   * Update an existing pet by Id
   * @param body Update an existent pet in the store (required)
   * @return Pet
   */
  @retrofit.http.FormUrlEncoded
  @PUT("/pet")
  Pet updatePet(
    @retrofit.http.Body Pet body
  );

  /**
   * Update an existing pet
   * Async method
   * @param body Update an existent pet in the store (required)
   * @param cb callback method
   */
  @retrofit.http.FormUrlEncoded
  @PUT("/pet")
  void updatePet(
    @retrofit.http.Body Pet body, Callback<Pet> cb
  );
  /**
   * Update an existing pet
   * Sync method
   * Update an existing pet by Id
   * @param id  (required)
   * @param name  (required)
   * @param category  (required)
   * @param photoUrls  (required)
   * @param tags  (required)
   * @param status  (required)
   * @return Pet
   */
  @retrofit.http.FormUrlEncoded
  @PUT("/pet")
  Pet updatePet(
    @retrofit.http.Field("id") Long id, @retrofit.http.Field("name") String name, @retrofit.http.Field("category") Category category, @retrofit.http.Field("photoUrls") List<String> photoUrls, @retrofit.http.Field("tags") List<Tag> tags, @retrofit.http.Field("status") String status
  );

  /**
   * Update an existing pet
   * Async method
   * @param id  (required)
   * @param name  (required)
   * @param category  (required)
   * @param photoUrls  (required)
   * @param tags  (required)
   * @param status  (required)
   * @param cb callback method
   */
  @retrofit.http.FormUrlEncoded
  @PUT("/pet")
  void updatePet(
    @retrofit.http.Field("id") Long id, @retrofit.http.Field("name") String name, @retrofit.http.Field("category") Category category, @retrofit.http.Field("photoUrls") List<String> photoUrls, @retrofit.http.Field("tags") List<Tag> tags, @retrofit.http.Field("status") String status, Callback<Pet> cb
  );
  /**
   * Updates a pet in the store with form data
   * Sync method
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Name of pet that needs to be updated (optional)
   * @param status Status of pet that needs to be updated (optional)
   * @return Void
   */
  @POST("/pet/{petId}")
  Void updatePetWithForm(
    @retrofit.http.Path("petId") Long petId, @retrofit.http.Query("name") String name, @retrofit.http.Query("status") String status
  );

  /**
   * Updates a pet in the store with form data
   * Async method
   * @param petId ID of pet that needs to be updated (required)
   * @param name Name of pet that needs to be updated (optional)
   * @param status Status of pet that needs to be updated (optional)
   * @param cb callback method
   */
  @POST("/pet/{petId}")
  void updatePetWithForm(
    @retrofit.http.Path("petId") Long petId, @retrofit.http.Query("name") String name, @retrofit.http.Query("status") String status, Callback<Void> cb
  );
  /**
   * uploads an image
   * Sync method
   * 
   * @param petId ID of pet to update (required)
   * @param body  (optional)
   * @param additionalMetadata Additional Metadata (optional)
   * @return ModelApiResponse
   */
  @POST("/pet/{petId}/uploadImage")
  ModelApiResponse uploadFile(
    @retrofit.http.Path("petId") Long petId, @retrofit.http.Body Object body, @retrofit.http.Query("additionalMetadata") String additionalMetadata
  );

  /**
   * uploads an image
   * Async method
   * @param petId ID of pet to update (required)
   * @param body  (optional)
   * @param additionalMetadata Additional Metadata (optional)
   * @param cb callback method
   */
  @POST("/pet/{petId}/uploadImage")
  void uploadFile(
    @retrofit.http.Path("petId") Long petId, @retrofit.http.Body Object body, @retrofit.http.Query("additionalMetadata") String additionalMetadata, Callback<ModelApiResponse> cb
  );
}
