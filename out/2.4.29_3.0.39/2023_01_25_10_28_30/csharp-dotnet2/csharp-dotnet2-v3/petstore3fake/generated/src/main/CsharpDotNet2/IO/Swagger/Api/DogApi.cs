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
    public interface IDogApi
    {
        /// <summary>
        /// Add a new dog to the store 
        /// </summary>
        /// <param name="body">Dog object that needs to be added to the store</param>
        /// <returns></returns>
        void AddDog (Dog body);
        /// <summary>
        /// Deletes a dog 
        /// </summary>
        /// <param name="dogId">Dog id to delete</param>
        /// <param name="apiKey"></param>
        /// <returns></returns>
        void DeleteDog (long? dogId, string apiKey);
        /// <summary>
        /// Find dog by ID Returns a single dog
        /// </summary>
        /// <param name="dogId">ID of dog to return</param>
        /// <returns>Dog</returns>
        Dog GetDogById (long? dogId);
        /// <summary>
        /// Update an existing dog 
        /// </summary>
        /// <param name="body">Dog object that needs to be added.</param>
        /// <returns></returns>
        void UpdateDog (Dog body);
        /// <summary>
        /// Updates a dog 
        /// </summary>
        /// <param name="dogId">ID of dog that needs to be updated</param>
        /// <param name="name"></param>
        /// <param name="status"></param>
        /// <returns></returns>
        void UpdateDogWithForm (long? dogId, string name, string status);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class DogApi : IDogApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DogApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public DogApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="DogApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DogApi(String basePath)
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
        /// Add a new dog to the store 
        /// </summary>
        /// <param name="body">Dog object that needs to be added to the store</param>
        /// <returns></returns>
        public void AddDog (Dog body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling AddDog");
    
            var path = "/dog";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AddDog: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AddDog: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Deletes a dog 
        /// </summary>
        /// <param name="dogId">Dog id to delete</param>
        /// <param name="apiKey"></param>
        /// <returns></returns>
        public void DeleteDog (long? dogId, string apiKey)
        {
            // verify the required parameter 'dogId' is set
            if (dogId == null) throw new ApiException(400, "Missing required parameter 'dogId' when calling DeleteDog");
    
            var path = "/dog/{dogId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "dogId" + "}", ApiClient.ParameterToString(dogId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (apiKey != null) headerParams.Add("api_key", ApiClient.ParameterToString(apiKey)); // header parameter
            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteDog: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteDog: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Find dog by ID Returns a single dog
        /// </summary>
        /// <param name="dogId">ID of dog to return</param>
        /// <returns>Dog</returns>
        public Dog GetDogById (long? dogId)
        {
            // verify the required parameter 'dogId' is set
            if (dogId == null) throw new ApiException(400, "Missing required parameter 'dogId' when calling GetDogById");
    
            var path = "/dog/{dogId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "dogId" + "}", ApiClient.ParameterToString(dogId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDogById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDogById: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Dog) ApiClient.Deserialize(response.Content, typeof(Dog), response.Headers);
        }
    
        /// <summary>
        /// Update an existing dog 
        /// </summary>
        /// <param name="body">Dog object that needs to be added.</param>
        /// <returns></returns>
        public void UpdateDog (Dog body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling UpdateDog");
    
            var path = "/dog";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateDog: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateDog: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Updates a dog 
        /// </summary>
        /// <param name="dogId">ID of dog that needs to be updated</param>
        /// <param name="name"></param>
        /// <param name="status"></param>
        /// <returns></returns>
        public void UpdateDogWithForm (long? dogId, string name, string status)
        {
            // verify the required parameter 'dogId' is set
            if (dogId == null) throw new ApiException(400, "Missing required parameter 'dogId' when calling UpdateDogWithForm");
    
            var path = "/dog/{dogId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "dogId" + "}", ApiClient.ParameterToString(dogId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    if (name != null) formParams.Add("name", ApiClient.ParameterToString(name)); // form parameter
if (status != null) formParams.Add("status", ApiClient.ParameterToString(status)); // form parameter

            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateDogWithForm: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateDogWithForm: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
