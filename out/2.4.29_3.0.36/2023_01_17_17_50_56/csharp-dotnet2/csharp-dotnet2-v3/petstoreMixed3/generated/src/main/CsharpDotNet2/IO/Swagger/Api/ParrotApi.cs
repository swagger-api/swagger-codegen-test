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
    public interface IParrotApi
    {
        /// <summary>
        /// Add a new parrow to the store 
        /// </summary>
        /// <param name="body"></param>
        /// <returns>InlineResponse2001</returns>
        InlineResponse2001 AddParrot (ParrotBody1 body);
        /// <summary>
        /// get Parrots 
        /// </summary>
        /// <returns>List&lt;Object&gt;</returns>
        List<Object> GetParrots ();
        /// <summary>
        /// update parrots 
        /// </summary>
        /// <param name="body"></param>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 UpdateParrots (ParrotBody body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ParrotApi : IParrotApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ParrotApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ParrotApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ParrotApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ParrotApi(String basePath)
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
        /// Add a new parrow to the store 
        /// </summary>
        /// <param name="body"></param>
        /// <returns>InlineResponse2001</returns>
        public InlineResponse2001 AddParrot (ParrotBody1 body)
        {
    
            var path = "/parrot";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "jwt" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AddParrot: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AddParrot: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse2001) ApiClient.Deserialize(response.Content, typeof(InlineResponse2001), response.Headers);
        }
    
        /// <summary>
        /// get Parrots 
        /// </summary>
        /// <returns>List&lt;Object&gt;</returns>
        public List<Object> GetParrots ()
        {
    
            var path = "/parrot";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "jwt" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetParrots: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetParrots: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Object>) ApiClient.Deserialize(response.Content, typeof(List<Object>), response.Headers);
        }
    
        /// <summary>
        /// update parrots 
        /// </summary>
        /// <param name="body"></param>
        /// <returns>InlineResponse200</returns>
        public InlineResponse200 UpdateParrots (ParrotBody body)
        {
    
            var path = "/parrot";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "jwt" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateParrots: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateParrots: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse200) ApiClient.Deserialize(response.Content, typeof(InlineResponse200), response.Headers);
        }
    
    }
}
