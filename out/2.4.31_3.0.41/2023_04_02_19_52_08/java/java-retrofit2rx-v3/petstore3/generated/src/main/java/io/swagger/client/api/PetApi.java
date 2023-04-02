package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

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
   * Add a new pet to the store
   * @param body Create a new pet in the store (required)
   * @return Call&lt;Pet&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("pet")
  Call<Pet> addPet(
    @retrofit2.http.Body Pet body
  );

  /**
   * Add a new pet to the store
   * Add a new pet to the store
   * @param id  (required)
   * @param name  (required)
   * @param category  (required)
   * @param photoUrls  (required)
   * @param tags  (required)
   * @param status  (required)
   * @return Call&lt;Pet&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("pet")
  Call<Pet> addPet(
    @retrofit2.http.Field("id") Long id, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("category") Category category, @retrofit2.http.Field("photoUrls") List<String> photoUrls, @retrofit2.http.Field("tags") List<Tag> tags, @retrofit2.http.Field("status") String status
  );

  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("pet/{petId}")
  Call<Void> deletePet(
    @retrofit2.http.Path("petId") Long petId, @retrofit2.http.Header("api_key") String apiKey
  );

  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (optional, default to available)
   * @return Call&lt;List&lt;Pet&gt;&gt;
   */
  @GET("pet/findByStatus")
  Call<List<Pet>> findPetsByStatus(
    @retrofit2.http.Query("status") String status
  );

  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (optional)
   * @return Call&lt;List&lt;Pet&gt;&gt;
   */
  @GET("pet/findByTags")
  Call<List<Pet>> findPetsByTags(
    @retrofit2.http.Query("tags") List<String> tags
  );

  /**
   * Find pet by ID
   * Returns a single pet
   * @param petId ID of pet to return (required)
   * @return Call&lt;Pet&gt;
   */
  @GET("pet/{petId}")
  Call<Pet> getPetById(
    @retrofit2.http.Path("petId") Long petId
  );

  /**
   * Update an existing pet
   * Update an existing pet by Id
   * @param body Update an existent pet in the store (required)
   * @return Call&lt;Pet&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @PUT("pet")
  Call<Pet> updatePet(
    @retrofit2.http.Body Pet body
  );

  /**
   * Update an existing pet
   * Update an existing pet by Id
   * @param id  (required)
   * @param name  (required)
   * @param category  (required)
   * @param photoUrls  (required)
   * @param tags  (required)
   * @param status  (required)
   * @return Call&lt;Pet&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @PUT("pet")
  Call<Pet> updatePet(
    @retrofit2.http.Field("id") Long id, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("category") Category category, @retrofit2.http.Field("photoUrls") List<String> photoUrls, @retrofit2.http.Field("tags") List<Tag> tags, @retrofit2.http.Field("status") String status
  );

  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Name of pet that needs to be updated (optional)
   * @param status Status of pet that needs to be updated (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("pet/{petId}")
  Call<Void> updatePetWithForm(
    @retrofit2.http.Path("petId") Long petId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("status") String status
  );

  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param body  (optional)
   * @param additionalMetadata Additional Metadata (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/octet-stream"
  })
  @POST("pet/{petId}/uploadImage")
  Call<ModelApiResponse> uploadFile(
    @retrofit2.http.Path("petId") Long petId, @retrofit2.http.Body Object body, @retrofit2.http.Query("additionalMetadata") String additionalMetadata
  );

}
