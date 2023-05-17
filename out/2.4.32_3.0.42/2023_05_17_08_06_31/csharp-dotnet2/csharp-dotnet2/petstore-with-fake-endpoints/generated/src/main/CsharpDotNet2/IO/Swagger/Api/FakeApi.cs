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
        /// <returns>OuterBoolean</returns>
        OuterBoolean FakeOuterBooleanSerialize (OuterBoolean body);
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
        /// <returns>OuterNumber</returns>
        OuterNumber FakeOuterNumberSerialize (OuterNumber body);
        /// <summary>
        ///  Test serialization of outer string types
        /// </summary>
        /// <param name="body">Input string as post body</param>
        /// <returns>OuterString</returns>
        OuterString FakeOuterStringSerialize (OuterString body);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="body"></param>
        /// <param name="query"></param>
        /// <returns></returns>
        void TestBodyWithQueryParams (User body, string query);
        /// <summary>
        /// To test \&quot;client\&quot; model To test \&quot;client\&quot; model
        /// </summary>
        /// <param name="body">client model</param>
        /// <returns>ModelClient</returns>
        ModelClient TestClientModel (ModelClient body);
        /// <summary>
        /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트  Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        /// </summary>
        /// <param name="number">None</param>
        /// <param name="_double">None</param>
        /// <param name="patternWithoutDelimiter">None</param>
        /// <param name="_byte">None</param>
        /// <param name="integer">None</param>
        /// <param name="int32">None</param>
        /// <param name="int64">None</param>
        /// <param name="_float">None</param>
        /// <param name="_string">None</param>
        /// <param name="binary">None</param>
        /// <param name="date">None</param>
        /// <param name="dateTime">None</param>
        /// <param name="password">None</param>
        /// <param name="callback">None</param>
        /// <returns></returns>
        void TestEndpointParameters (decimal? number, double? _double, string patternWithoutDelimiter, byte[] _byte, int? integer, int? int32, long? int64, float? _float, string _string, byte[] binary, DateTime? date, DateTime? dateTime, string password, string callback);
        /// <summary>
        /// To test enum parameters To test enum parameters
        /// </summary>
        /// <param name="enumFormStringArray">Form parameter enum test (string array)</param>
        /// <param name="enumFormString">Form parameter enum test (string)</param>
        /// <param name="enumHeaderStringArray">Header parameter enum test (string array)</param>
        /// <param name="enumHeaderString">Header parameter enum test (string)</param>
        /// <param name="enumQueryStringArray">Query parameter enum test (string array)</param>
        /// <param name="enumQueryString">Query parameter enum test (string)</param>
        /// <param name="enumQueryInteger">Query parameter enum test (double)</param>
        /// <param name="enumQueryDouble">Query parameter enum test (double)</param>
        /// <returns></returns>
        void TestEnumParameters (List<string> enumFormStringArray, string enumFormString, List<string> enumHeaderStringArray, string enumHeaderString, List<string> enumQueryStringArray, string enumQueryString, int? enumQueryInteger, double? enumQueryDouble);
        /// <summary>
        /// test inline additionalProperties 
        /// </summary>
        /// <param name="param">request body</param>
        /// <returns></returns>
        void TestInlineAdditionalProperties (Object param);
        /// <summary>
        /// test json serialization of form data 
        /// </summary>
        /// <param name="param">field1</param>
        /// <param name="param2">field2</param>
        /// <returns></returns>
        void TestJsonFormData (string param, string param2);
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
        /// <returns>OuterBoolean</returns>            
        public OuterBoolean FakeOuterBooleanSerialize (OuterBoolean body)
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
    
            return (OuterBoolean) ApiClient.Deserialize(response.Content, typeof(OuterBoolean), response.Headers);
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
        /// <returns>OuterNumber</returns>            
        public OuterNumber FakeOuterNumberSerialize (OuterNumber body)
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
    
            return (OuterNumber) ApiClient.Deserialize(response.Content, typeof(OuterNumber), response.Headers);
        }
    
        /// <summary>
        ///  Test serialization of outer string types
        /// </summary>
        /// <param name="body">Input string as post body</param> 
        /// <returns>OuterString</returns>            
        public OuterString FakeOuterStringSerialize (OuterString body)
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
    
            return (OuterString) ApiClient.Deserialize(response.Content, typeof(OuterString), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="body"></param> 
        /// <param name="query"></param> 
        /// <returns></returns>            
        public void TestBodyWithQueryParams (User body, string query)
        {
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling TestBodyWithQueryParams");
            
            // verify the required parameter 'query' is set
            if (query == null) throw new ApiException(400, "Missing required parameter 'query' when calling TestBodyWithQueryParams");
            
    
            var path = "/fake/body-with-query-params";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (query != null) queryParams.Add("query", ApiClient.ParameterToString(query)); // query parameter
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TestBodyWithQueryParams: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TestBodyWithQueryParams: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
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
        /// <param name="number">None</param> 
        /// <param name="_double">None</param> 
        /// <param name="patternWithoutDelimiter">None</param> 
        /// <param name="_byte">None</param> 
        /// <param name="integer">None</param> 
        /// <param name="int32">None</param> 
        /// <param name="int64">None</param> 
        /// <param name="_float">None</param> 
        /// <param name="_string">None</param> 
        /// <param name="binary">None</param> 
        /// <param name="date">None</param> 
        /// <param name="dateTime">None</param> 
        /// <param name="password">None</param> 
        /// <param name="callback">None</param> 
        /// <returns></returns>            
        public void TestEndpointParameters (decimal? number, double? _double, string patternWithoutDelimiter, byte[] _byte, int? integer, int? int32, long? int64, float? _float, string _string, byte[] binary, DateTime? date, DateTime? dateTime, string password, string callback)
        {
            
            // verify the required parameter 'number' is set
            if (number == null) throw new ApiException(400, "Missing required parameter 'number' when calling TestEndpointParameters");
            
            // verify the required parameter '_double' is set
            if (_double == null) throw new ApiException(400, "Missing required parameter '_double' when calling TestEndpointParameters");
            
            // verify the required parameter 'patternWithoutDelimiter' is set
            if (patternWithoutDelimiter == null) throw new ApiException(400, "Missing required parameter 'patternWithoutDelimiter' when calling TestEndpointParameters");
            
            // verify the required parameter '_byte' is set
            if (_byte == null) throw new ApiException(400, "Missing required parameter '_byte' when calling TestEndpointParameters");
            
    
            var path = "/fake";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    if (integer != null) formParams.Add("integer", ApiClient.ParameterToString(integer)); // form parameter
if (int32 != null) formParams.Add("int32", ApiClient.ParameterToString(int32)); // form parameter
if (int64 != null) formParams.Add("int64", ApiClient.ParameterToString(int64)); // form parameter
if (number != null) formParams.Add("number", ApiClient.ParameterToString(number)); // form parameter
if (_float != null) formParams.Add("float", ApiClient.ParameterToString(_float)); // form parameter
if (_double != null) formParams.Add("double", ApiClient.ParameterToString(_double)); // form parameter
if (_string != null) formParams.Add("string", ApiClient.ParameterToString(_string)); // form parameter
if (patternWithoutDelimiter != null) formParams.Add("pattern_without_delimiter", ApiClient.ParameterToString(patternWithoutDelimiter)); // form parameter
if (_byte != null) formParams.Add("byte", ApiClient.ParameterToString(_byte)); // form parameter
if (binary != null) formParams.Add("binary", ApiClient.ParameterToString(binary)); // form parameter
if (date != null) formParams.Add("date", ApiClient.ParameterToString(date)); // form parameter
if (dateTime != null) formParams.Add("dateTime", ApiClient.ParameterToString(dateTime)); // form parameter
if (password != null) formParams.Add("password", ApiClient.ParameterToString(password)); // form parameter
if (callback != null) formParams.Add("callback", ApiClient.ParameterToString(callback)); // form parameter
                
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
        /// <param name="enumFormStringArray">Form parameter enum test (string array)</param> 
        /// <param name="enumFormString">Form parameter enum test (string)</param> 
        /// <param name="enumHeaderStringArray">Header parameter enum test (string array)</param> 
        /// <param name="enumHeaderString">Header parameter enum test (string)</param> 
        /// <param name="enumQueryStringArray">Query parameter enum test (string array)</param> 
        /// <param name="enumQueryString">Query parameter enum test (string)</param> 
        /// <param name="enumQueryInteger">Query parameter enum test (double)</param> 
        /// <param name="enumQueryDouble">Query parameter enum test (double)</param> 
        /// <returns></returns>            
        public void TestEnumParameters (List<string> enumFormStringArray, string enumFormString, List<string> enumHeaderStringArray, string enumHeaderString, List<string> enumQueryStringArray, string enumQueryString, int? enumQueryInteger, double? enumQueryDouble)
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
            if (enumFormStringArray != null) formParams.Add("enum_form_string_array", ApiClient.ParameterToString(enumFormStringArray)); // form parameter
if (enumFormString != null) formParams.Add("enum_form_string", ApiClient.ParameterToString(enumFormString)); // form parameter
if (enumQueryDouble != null) formParams.Add("enum_query_double", ApiClient.ParameterToString(enumQueryDouble)); // form parameter
                
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
        /// test inline additionalProperties 
        /// </summary>
        /// <param name="param">request body</param> 
        /// <returns></returns>            
        public void TestInlineAdditionalProperties (Object param)
        {
            
            // verify the required parameter 'param' is set
            if (param == null) throw new ApiException(400, "Missing required parameter 'param' when calling TestInlineAdditionalProperties");
            
    
            var path = "/fake/inline-additionalProperties";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(param); // http body (model) parameter
    
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
        /// <param name="param">field1</param> 
        /// <param name="param2">field2</param> 
        /// <returns></returns>            
        public void TestJsonFormData (string param, string param2)
        {
            
            // verify the required parameter 'param' is set
            if (param == null) throw new ApiException(400, "Missing required parameter 'param' when calling TestJsonFormData");
            
            // verify the required parameter 'param2' is set
            if (param2 == null) throw new ApiException(400, "Missing required parameter 'param2' when calling TestJsonFormData");
            
    
            var path = "/fake/jsonFormData";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    if (param != null) formParams.Add("param", ApiClient.ParameterToString(param)); // form parameter
if (param2 != null) formParams.Add("param2", ApiClient.ParameterToString(param2)); // form parameter
                
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TestJsonFormData: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TestJsonFormData: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
