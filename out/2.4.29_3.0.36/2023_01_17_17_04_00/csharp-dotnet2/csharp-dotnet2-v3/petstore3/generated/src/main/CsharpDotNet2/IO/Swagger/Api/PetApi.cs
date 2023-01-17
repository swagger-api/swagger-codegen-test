using System;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IPetApi
    {
        /// <summary>
        /// Add a new pet to the store Add a new pet to the store
        /// </summary>
        /// <param name="body">Create a new pet in the store</param>
        /// <returns>Pet</returns>
        Pet AddPet (Pet body);
        /// <summary>
        /// Add a new pet to the store Add a new pet to the store
        /// </summary>
        /// <param name="id"></param>
        /// <param name="name"></param>
        /// <param name="category"></param>
        /// <param name="photoUrls"></param>
        /// <param name="tags"></param>
        /// <param name="status"></param>
        /// <returns>Pet</returns>
        Pet AddPet (long? id, string name, Category category, List<string> photoUrls, List<Tag> tags, string status);
        /// <summary>
        /// Deletes a pet 
        /// </summary>
        /// <param name="petId">Pet id to delete</param>
        /// <param name="apiKey"></param>
        /// <returns></returns>
        void DeletePet (long? petId, string apiKey);
        /// <summary>
        /// Finds Pets by status Multiple status values can be provided with comma separated strings
        /// </summary>
        /// <param name="status">Status values that need to be considered for filter</param>
        /// <returns>List&lt;Pet&gt;</returns>
        List<Pet> FindPetsByStatus (string status);
        /// <summary>
        /// Finds Pets by tags Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
        /// </summary>
        /// <param name="tags">Tags to filter by</param>
        /// <returns>List&lt;Pet&gt;</returns>
        List<Pet> FindPetsByTags (List<string> tags);
        /// <summary>
        /// Find pet by ID Returns a single pet
        /// </summary>
        /// <param name="petId">ID of pet to return</param>
        /// <returns>Pet</returns>
        Pet GetPetById (long? petId);
        /// <summary>
        /// Update an existing pet Update an existing pet by Id
        /// </summary>
        /// <param name="body">Update an existent pet in the store</param>
        /// <returns>Pet</returns>
        Pet UpdatePet (Pet body);
        /// <summary>
        /// Update an existing pet Update an existing pet by Id
        /// </summary>
        /// <param name="id"></param>
        /// <param name="name"></param>
        /// <param name="category"></param>
        /// <param name="photoUrls"></param>
        /// <param name="tags"></param>
        /// <param name="status"></param>
        /// <returns>Pet</returns>
        Pet UpdatePet (long? id, string name, Category category, List<string> photoUrls, List<Tag> tags, string status);
        /// <summary>
        /// Updates a pet in the store with form data 
        /// </summary>
        /// <param name="petId">ID of pet that needs to be updated</param>
        /// <param name="name">Name of pet that needs to be updated</param>
        /// <param name="status">Status of pet that needs to be updated</param>
        /// <returns></returns>
        void UpdatePetWithForm (long? petId, string name, string status);
        /// <summary>
        /// uploads an image 
        /// </summary>
        /// <param name="petId">ID of pet to update</param>
        /// <param name="body"></param>
        /// <param name="additionalMetadata">Additional Metadata</param>
        /// <returns>ModelApiResponse</returns>
        ModelApiResponse UploadFile (long? petId, Object body, string additionalMetadata);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PetApi : IPetApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PetApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PetApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PetApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PetApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        /// Add a new pet to the store Add a new pet to the store
        /// </summary>
        /// <param name="body">Create a new pet in the store</param>
        /// <returns>Pet</returns>
        public Pet AddPet (Pet body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling AddPet");
    
            var path = "/pet";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "petstore_auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AddPet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AddPet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Pet) ApiClient.Deserialize(response.Content, typeof(Pet), response.Headers);
        }
    
        /// <summary>
        /// Add a new pet to the store Add a new pet to the store
        /// </summary>
        /// <param name="id"></param>
        /// <param name="name"></param>
        /// <param name="category"></param>
        /// <param name="photoUrls"></param>
        /// <param name="tags"></param>
        /// <param name="status"></param>
        /// <returns>Pet</returns>
        public Pet AddPet (long? id, string name, Category category, List<string> photoUrls, List<Tag> tags, string status)
        {
            // verify the required parameter 'id' is set
            if (id == null) throw new ApiException(400, "Missing required parameter 'id' when calling AddPet");
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling AddPet");
            // verify the required parameter 'category' is set
            if (category == null) throw new ApiException(400, "Missing required parameter 'category' when calling AddPet");
            // verify the required parameter 'photoUrls' is set
            if (photoUrls == null) throw new ApiException(400, "Missing required parameter 'photoUrls' when calling AddPet");
            // verify the required parameter 'tags' is set
            if (tags == null) throw new ApiException(400, "Missing required parameter 'tags' when calling AddPet");
            // verify the required parameter 'status' is set
            if (status == null) throw new ApiException(400, "Missing required parameter 'status' when calling AddPet");
    
            var path = "/pet";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    if (id != null) formParams.Add("id", ApiClient.ParameterToString(id)); // form parameter
if (name != null) formParams.Add("name", ApiClient.ParameterToString(name)); // form parameter
if (category != null) formParams.Add("category", ApiClient.ParameterToString(category)); // form parameter
if (photoUrls != null) formParams.Add("photoUrls", ApiClient.ParameterToString(photoUrls)); // form parameter
if (tags != null) formParams.Add("tags", ApiClient.ParameterToString(tags)); // form parameter
if (status != null) formParams.Add("status", ApiClient.ParameterToString(status)); // form parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "petstore_auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AddPet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AddPet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Pet) ApiClient.Deserialize(response.Content, typeof(Pet), response.Headers);
        }
    
        /// <summary>
        /// Deletes a pet 
        /// </summary>
        /// <param name="petId">Pet id to delete</param>
        /// <param name="apiKey"></param>
        /// <returns></returns>
        public void DeletePet (long? petId, string apiKey)
        {
            // verify the required parameter 'petId' is set
            if (petId == null) throw new ApiException(400, "Missing required parameter 'petId' when calling DeletePet");
    
            var path = "/pet/{petId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "petId" + "}", ApiClient.ParameterToString(petId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (apiKey != null) headerParams.Add("api_key", ApiClient.ParameterToString(apiKey)); // header parameter
            
            // authentication setting, if any
            String[] authSettings = new String[] { "petstore_auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeletePet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeletePet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Finds Pets by status Multiple status values can be provided with comma separated strings
        /// </summary>
        /// <param name="status">Status values that need to be considered for filter</param>
        /// <returns>List&lt;Pet&gt;</returns>
        public List<Pet> FindPetsByStatus (string status)
        {
    
            var path = "/pet/findByStatus";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (status != null) queryParams.Add("status", ApiClient.ParameterToString(status)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] { "petstore_auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling FindPetsByStatus: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FindPetsByStatus: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Pet>) ApiClient.Deserialize(response.Content, typeof(List<Pet>), response.Headers);
        }
    
        /// <summary>
        /// Finds Pets by tags Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
        /// </summary>
        /// <param name="tags">Tags to filter by</param>
        /// <returns>List&lt;Pet&gt;</returns>
        public List<Pet> FindPetsByTags (List<string> tags)
        {
    
            var path = "/pet/findByTags";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (tags != null) queryParams.Add("tags", ApiClient.ParameterToString(tags)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] { "petstore_auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling FindPetsByTags: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FindPetsByTags: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Pet>) ApiClient.Deserialize(response.Content, typeof(List<Pet>), response.Headers);
        }
    
        /// <summary>
        /// Find pet by ID Returns a single pet
        /// </summary>
        /// <param name="petId">ID of pet to return</param>
        /// <returns>Pet</returns>
        public Pet GetPetById (long? petId)
        {
            // verify the required parameter 'petId' is set
            if (petId == null) throw new ApiException(400, "Missing required parameter 'petId' when calling GetPetById");
    
            var path = "/pet/{petId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "petId" + "}", ApiClient.ParameterToString(petId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "api_key", "petstore_auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetPetById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetPetById: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Pet) ApiClient.Deserialize(response.Content, typeof(Pet), response.Headers);
        }
    
        /// <summary>
        /// Update an existing pet Update an existing pet by Id
        /// </summary>
        /// <param name="body">Update an existent pet in the store</param>
        /// <returns>Pet</returns>
        public Pet UpdatePet (Pet body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling UpdatePet");
    
            var path = "/pet";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "petstore_auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdatePet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdatePet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Pet) ApiClient.Deserialize(response.Content, typeof(Pet), response.Headers);
        }
    
        /// <summary>
        /// Update an existing pet Update an existing pet by Id
        /// </summary>
        /// <param name="id"></param>
        /// <param name="name"></param>
        /// <param name="category"></param>
        /// <param name="photoUrls"></param>
        /// <param name="tags"></param>
        /// <param name="status"></param>
        /// <returns>Pet</returns>
        public Pet UpdatePet (long? id, string name, Category category, List<string> photoUrls, List<Tag> tags, string status)
        {
            // verify the required parameter 'id' is set
            if (id == null) throw new ApiException(400, "Missing required parameter 'id' when calling UpdatePet");
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling UpdatePet");
            // verify the required parameter 'category' is set
            if (category == null) throw new ApiException(400, "Missing required parameter 'category' when calling UpdatePet");
            // verify the required parameter 'photoUrls' is set
            if (photoUrls == null) throw new ApiException(400, "Missing required parameter 'photoUrls' when calling UpdatePet");
            // verify the required parameter 'tags' is set
            if (tags == null) throw new ApiException(400, "Missing required parameter 'tags' when calling UpdatePet");
            // verify the required parameter 'status' is set
            if (status == null) throw new ApiException(400, "Missing required parameter 'status' when calling UpdatePet");
    
            var path = "/pet";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    if (id != null) formParams.Add("id", ApiClient.ParameterToString(id)); // form parameter
if (name != null) formParams.Add("name", ApiClient.ParameterToString(name)); // form parameter
if (category != null) formParams.Add("category", ApiClient.ParameterToString(category)); // form parameter
if (photoUrls != null) formParams.Add("photoUrls", ApiClient.ParameterToString(photoUrls)); // form parameter
if (tags != null) formParams.Add("tags", ApiClient.ParameterToString(tags)); // form parameter
if (status != null) formParams.Add("status", ApiClient.ParameterToString(status)); // form parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "petstore_auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdatePet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdatePet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Pet) ApiClient.Deserialize(response.Content, typeof(Pet), response.Headers);
        }
    
        /// <summary>
        /// Updates a pet in the store with form data 
        /// </summary>
        /// <param name="petId">ID of pet that needs to be updated</param>
        /// <param name="name">Name of pet that needs to be updated</param>
        /// <param name="status">Status of pet that needs to be updated</param>
        /// <returns></returns>
        public void UpdatePetWithForm (long? petId, string name, string status)
        {
            // verify the required parameter 'petId' is set
            if (petId == null) throw new ApiException(400, "Missing required parameter 'petId' when calling UpdatePetWithForm");
    
            var path = "/pet/{petId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "petId" + "}", ApiClient.ParameterToString(petId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (name != null) queryParams.Add("name", ApiClient.ParameterToString(name)); // query parameter
 if (status != null) queryParams.Add("status", ApiClient.ParameterToString(status)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] { "petstore_auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdatePetWithForm: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdatePetWithForm: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// uploads an image 
        /// </summary>
        /// <param name="petId">ID of pet to update</param>
        /// <param name="body"></param>
        /// <param name="additionalMetadata">Additional Metadata</param>
        /// <returns>ModelApiResponse</returns>
        public ModelApiResponse UploadFile (long? petId, Object body, string additionalMetadata)
        {
            // verify the required parameter 'petId' is set
            if (petId == null) throw new ApiException(400, "Missing required parameter 'petId' when calling UploadFile");
    
            var path = "/pet/{petId}/uploadImage";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "petId" + "}", ApiClient.ParameterToString(petId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (additionalMetadata != null) queryParams.Add("additionalMetadata", ApiClient.ParameterToString(additionalMetadata)); // query parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "petstore_auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UploadFile: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UploadFile: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ModelApiResponse) ApiClient.Deserialize(response.Content, typeof(ModelApiResponse), response.Headers);
        }
    
    }
}
