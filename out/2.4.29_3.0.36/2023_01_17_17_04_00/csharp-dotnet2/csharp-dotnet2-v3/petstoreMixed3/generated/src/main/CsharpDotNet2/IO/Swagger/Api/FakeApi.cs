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
    public interface IFakeApi
    {
        /// <summary>
        ///  Test serialization of outer boolean types
        /// </summary>
        /// <param name="body">Input boolean as post body</param>
        /// <returns>bool?</returns>
        bool? FakeOuterBooleanSerialize (bool? body);
        /// <summary>
        ///  Test serialization of object with outer number type
        /// </summary>
        /// <param name="body">Input composite as post body</param>
        /// <returns>OuterComposite</returns>
        OuterComposite FakeOuterCompositeSerialize (OuterComposite body);
        /// <summary>
        ///  Test serialization of outer number types
        /// </summary>
        /// <param name="body">Input number as post body</param>
        /// <returns>decimal?</returns>
        decimal? FakeOuterNumberSerialize (decimal? body);
        /// <summary>
        ///  Test serialization of outer string types
        /// </summary>
        /// <param name="body">Input string as post body</param>
        /// <returns>string</returns>
        string FakeOuterStringSerialize (string body);
        /// <summary>
        /// To test \&quot;client\&quot; model To test \&quot;client\&quot; model
        /// </summary>
        /// <param name="body">client model</param>
        /// <returns>ModelClient</returns>
        ModelClient TestClientModel (ModelClient body);
        /// <summary>
        /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트  Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        /// </summary>
        /// <param name="body"></param>
        /// <returns></returns>
        void TestEndpointParameters (FakeBody body);
        /// <summary>
        /// To test enum parameters To test enum parameters
        /// </summary>
        /// <param name="enumHeaderStringArray">Header parameter enum test (string array)</param>
        /// <param name="enumHeaderString">Header parameter enum test (string)</param>
        /// <param name="enumQueryStringArray">Query parameter enum test (string array)</param>
        /// <param name="enumQueryString">Query parameter enum test (string)</param>
        /// <param name="enumQueryInteger">Query parameter enum test (double)</param>
        /// <returns></returns>
        void TestEnumParameters (List<string> enumHeaderStringArray, string enumHeaderString, List<string> enumQueryStringArray, string enumQueryString, int? enumQueryInteger);
        /// <summary>
        /// To test enum parameters To test enum parameters
        /// </summary>
        /// <param name="body"></param>
        /// <returns></returns>
        void TestEnumRequestBody (EnumFormBody body);
        /// <summary>
        /// test inline additionalProperties 
        /// </summary>
        /// <param name="body">request body</param>
        /// <returns></returns>
        void TestInlineAdditionalProperties (Dictionary<string, string> body);
        /// <summary>
        /// test json serialization of form data 
        /// </summary>
        /// <param name="body"></param>
        /// <returns></returns>
        void TestJsonFormData (FakeJsonFormDataBody body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class FakeApi : IFakeApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FakeApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public FakeApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="FakeApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FakeApi(String basePath)
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
        ///  Test serialization of outer boolean types
        /// </summary>
        /// <param name="body">Input boolean as post body</param>
        /// <returns>bool?</returns>
        public bool? FakeOuterBooleanSerialize (bool? body)
        {
    
            var path = "/fake/outer/boolean";
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
                throw new ApiException ((int)response.StatusCode, "Error calling FakeOuterBooleanSerialize: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FakeOuterBooleanSerialize: " + response.ErrorMessage, response.ErrorMessage);
    
            return (bool?) ApiClient.Deserialize(response.Content, typeof(bool?), response.Headers);
        }
    
        /// <summary>
        ///  Test serialization of object with outer number type
        /// </summary>
        /// <param name="body">Input composite as post body</param>
        /// <returns>OuterComposite</returns>
        public OuterComposite FakeOuterCompositeSerialize (OuterComposite body)
        {
    
            var path = "/fake/outer/composite";
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
                throw new ApiException ((int)response.StatusCode, "Error calling FakeOuterCompositeSerialize: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FakeOuterCompositeSerialize: " + response.ErrorMessage, response.ErrorMessage);
    
            return (OuterComposite) ApiClient.Deserialize(response.Content, typeof(OuterComposite), response.Headers);
        }
    
        /// <summary>
        ///  Test serialization of outer number types
        /// </summary>
        /// <param name="body">Input number as post body</param>
        /// <returns>decimal?</returns>
        public decimal? FakeOuterNumberSerialize (decimal? body)
        {
    
            var path = "/fake/outer/number";
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
                throw new ApiException ((int)response.StatusCode, "Error calling FakeOuterNumberSerialize: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FakeOuterNumberSerialize: " + response.ErrorMessage, response.ErrorMessage);
    
            return (decimal?) ApiClient.Deserialize(response.Content, typeof(decimal?), response.Headers);
        }
    
        /// <summary>
        ///  Test serialization of outer string types
        /// </summary>
        /// <param name="body">Input string as post body</param>
        /// <returns>string</returns>
        public string FakeOuterStringSerialize (string body)
        {
    
            var path = "/fake/outer/string";
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
                throw new ApiException ((int)response.StatusCode, "Error calling FakeOuterStringSerialize: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FakeOuterStringSerialize: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// To test \&quot;client\&quot; model To test \&quot;client\&quot; model
        /// </summary>
        /// <param name="body">client model</param>
        /// <returns>ModelClient</returns>
        public ModelClient TestClientModel (ModelClient body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling TestClientModel");
    
            var path = "/fake";
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
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TestClientModel: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TestClientModel: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ModelClient) ApiClient.Deserialize(response.Content, typeof(ModelClient), response.Headers);
        }
    
        /// <summary>
        /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트  Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        /// </summary>
        /// <param name="body"></param>
        /// <returns></returns>
        public void TestEndpointParameters (FakeBody body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling TestEndpointParameters");
    
            var path = "/fake";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "http_basic_test" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TestEndpointParameters: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TestEndpointParameters: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// To test enum parameters To test enum parameters
        /// </summary>
        /// <param name="enumHeaderStringArray">Header parameter enum test (string array)</param>
        /// <param name="enumHeaderString">Header parameter enum test (string)</param>
        /// <param name="enumQueryStringArray">Query parameter enum test (string array)</param>
        /// <param name="enumQueryString">Query parameter enum test (string)</param>
        /// <param name="enumQueryInteger">Query parameter enum test (double)</param>
        /// <returns></returns>
        public void TestEnumParameters (List<string> enumHeaderStringArray, string enumHeaderString, List<string> enumQueryStringArray, string enumQueryString, int? enumQueryInteger)
        {
    
            var path = "/fake";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (enumQueryStringArray != null) queryParams.Add("enum_query_string_array", ApiClient.ParameterToString(enumQueryStringArray)); // query parameter
 if (enumQueryString != null) queryParams.Add("enum_query_string", ApiClient.ParameterToString(enumQueryString)); // query parameter
 if (enumQueryInteger != null) queryParams.Add("enum_query_integer", ApiClient.ParameterToString(enumQueryInteger)); // query parameter
             if (enumHeaderStringArray != null) headerParams.Add("enum_header_string_array", ApiClient.ParameterToString(enumHeaderStringArray)); // header parameter
 if (enumHeaderString != null) headerParams.Add("enum_header_string", ApiClient.ParameterToString(enumHeaderString)); // header parameter
            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TestEnumParameters: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TestEnumParameters: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// To test enum parameters To test enum parameters
        /// </summary>
        /// <param name="body"></param>
        /// <returns></returns>
        public void TestEnumRequestBody (EnumFormBody body)
        {
    
            var path = "/fake/enum/form";
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
                throw new ApiException ((int)response.StatusCode, "Error calling TestEnumRequestBody: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TestEnumRequestBody: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// test inline additionalProperties 
        /// </summary>
        /// <param name="body">request body</param>
        /// <returns></returns>
        public void TestInlineAdditionalProperties (Dictionary<string, string> body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling TestInlineAdditionalProperties");
    
            var path = "/fake/inline-additionalProperties";
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
                throw new ApiException ((int)response.StatusCode, "Error calling TestInlineAdditionalProperties: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TestInlineAdditionalProperties: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// test json serialization of form data 
        /// </summary>
        /// <param name="body"></param>
        /// <returns></returns>
        public void TestJsonFormData (FakeJsonFormDataBody body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling TestJsonFormData");
    
            var path = "/fake/jsonFormData";
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
                throw new ApiException ((int)response.StatusCode, "Error calling TestJsonFormData: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TestJsonFormData: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
