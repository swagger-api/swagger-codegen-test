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
    public interface IAnimalApi
    {
        /// <summary>
        /// Add a new animal to the store 
        /// </summary>
        /// <param name="body">Animal object that needs to be added to the store</param>
        /// <returns></returns>
        void AddAnimal (Animal body);
        /// <summary>
        /// Deletes a animal 
        /// </summary>
        /// <param name="animalId">Animal id to delete</param>
        /// <param name="apiKey"></param>
        /// <returns></returns>
        void DeleteAnimal (long? animalId, string apiKey);
        /// <summary>
        /// Find animal by ID Returns a single animal
        /// </summary>
        /// <param name="animalId">ID of pet to return</param>
        /// <returns>Animal</returns>
        Animal GetAnimalById (long? animalId);
        /// <summary>
        /// Update an existing animal 
        /// </summary>
        /// <param name="body">Animal object that needs to be added.</param>
        /// <returns></returns>
        void UpdateAnimal (Animal body);
        /// <summary>
        /// Updates a animal 
        /// </summary>
        /// <param name="animalId">ID of animal that needs to be updated</param>
        /// <param name="name"></param>
        /// <param name="status"></param>
        /// <returns></returns>
        void UpdateAnimalWithForm (long? animalId, string name, string status);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class AnimalApi : IAnimalApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AnimalApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public AnimalApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="AnimalApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AnimalApi(String basePath)
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
        /// Add a new animal to the store 
        /// </summary>
        /// <param name="body">Animal object that needs to be added to the store</param>
        /// <returns></returns>
        public void AddAnimal (Animal body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling AddAnimal");
    
            var path = "/animal";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "api_key_query" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AddAnimal: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AddAnimal: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Deletes a animal 
        /// </summary>
        /// <param name="animalId">Animal id to delete</param>
        /// <param name="apiKey"></param>
        /// <returns></returns>
        public void DeleteAnimal (long? animalId, string apiKey)
        {
            // verify the required parameter 'animalId' is set
            if (animalId == null) throw new ApiException(400, "Missing required parameter 'animalId' when calling DeleteAnimal");
    
            var path = "/animal/{animalId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "animalId" + "}", ApiClient.ParameterToString(animalId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (apiKey != null) headerParams.Add("api_key", ApiClient.ParameterToString(apiKey)); // header parameter
            
            // authentication setting, if any
            String[] authSettings = new String[] { "api_key_query" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteAnimal: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteAnimal: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Find animal by ID Returns a single animal
        /// </summary>
        /// <param name="animalId">ID of pet to return</param>
        /// <returns>Animal</returns>
        public Animal GetAnimalById (long? animalId)
        {
            // verify the required parameter 'animalId' is set
            if (animalId == null) throw new ApiException(400, "Missing required parameter 'animalId' when calling GetAnimalById");
    
            var path = "/animal/{animalId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "animalId" + "}", ApiClient.ParameterToString(animalId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "api_key_query" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAnimalById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAnimalById: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Animal) ApiClient.Deserialize(response.Content, typeof(Animal), response.Headers);
        }
    
        /// <summary>
        /// Update an existing animal 
        /// </summary>
        /// <param name="body">Animal object that needs to be added.</param>
        /// <returns></returns>
        public void UpdateAnimal (Animal body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling UpdateAnimal");
    
            var path = "/animal";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "api_key_query" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateAnimal: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateAnimal: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Updates a animal 
        /// </summary>
        /// <param name="animalId">ID of animal that needs to be updated</param>
        /// <param name="name"></param>
        /// <param name="status"></param>
        /// <returns></returns>
        public void UpdateAnimalWithForm (long? animalId, string name, string status)
        {
            // verify the required parameter 'animalId' is set
            if (animalId == null) throw new ApiException(400, "Missing required parameter 'animalId' when calling UpdateAnimalWithForm");
    
            var path = "/animal/{animalId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "animalId" + "}", ApiClient.ParameterToString(animalId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    if (name != null) formParams.Add("name", ApiClient.ParameterToString(name)); // form parameter
if (status != null) formParams.Add("status", ApiClient.ParameterToString(status)); // form parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "api_key_query" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateAnimalWithForm: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateAnimalWithForm: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
