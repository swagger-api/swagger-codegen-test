part of swagger.api;



class FakeApi {
  final ApiClient apiClient;

  FakeApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// 
  ///
  /// Test serialization of outer boolean types
  Future<OuterBoolean> fakeOuterBooleanSerialize({ OuterBoolean body }) async {
    Object postBody = body;

    // verify required params are set

    // create path and map variables
    String path = "/fake/outer/boolean".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          apiClient.deserialize(response.body, 'OuterBoolean') as OuterBoolean ;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// Test serialization of object with outer number type
  Future<OuterComposite> fakeOuterCompositeSerialize({ OuterComposite body }) async {
    Object postBody = body;

    // verify required params are set

    // create path and map variables
    String path = "/fake/outer/composite".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          apiClient.deserialize(response.body, 'OuterComposite') as OuterComposite ;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// Test serialization of outer number types
  Future<OuterNumber> fakeOuterNumberSerialize({ OuterNumber body }) async {
    Object postBody = body;

    // verify required params are set

    // create path and map variables
    String path = "/fake/outer/number".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          apiClient.deserialize(response.body, 'OuterNumber') as OuterNumber ;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// Test serialization of outer string types
  Future<OuterString> fakeOuterStringSerialize({ OuterString body }) async {
    Object postBody = body;

    // verify required params are set

    // create path and map variables
    String path = "/fake/outer/string".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          apiClient.deserialize(response.body, 'OuterString') as OuterString ;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future testBodyWithQueryParams(User body, String query) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }
    if(query == null) {
     throw new ApiException(400, "Missing required param: query");
    }

    // create path and map variables
    String path = "/fake/body-with-query-params".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "query", query));
    
    List<String> contentTypes = ["application/json"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'PUT',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          ;
    } else {
      return ;
    }
  }
  /// To test \&quot;client\&quot; model
  ///
  /// To test \&quot;client\&quot; model
  Future<Client> testClientModel(Client body) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/fake".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["application/json"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'PATCH',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          apiClient.deserialize(response.body, 'Client') as Client ;
    } else {
      return null;
    }
  }
  /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
  ///
  /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
  Future testEndpointParameters(num number, double double, String patternWithoutDelimiter, ByteArray byte, { int integer, int int32, int int64, double float, String string, String binary, DateTime date, DateTime dateTime, String password, String callback }) async {
    Object postBody = null;

    // verify required params are set
    if(number == null) {
     throw new ApiException(400, "Missing required param: number");
    }
    if(double == null) {
     throw new ApiException(400, "Missing required param: double");
    }
    if(patternWithoutDelimiter == null) {
     throw new ApiException(400, "Missing required param: patternWithoutDelimiter");
    }
    if(byte == null) {
     throw new ApiException(400, "Missing required param: byte");
    }

    // create path and map variables
    String path = "/fake".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["application/xml; charset=utf-8","application/json; charset=utf-8"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["http_basic_test"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (integer != null) {
        hasFields = true;
        mp.fields['integer'] = parameterToString(integer);
      }
      
      if (int32 != null) {
        hasFields = true;
        mp.fields['int32'] = parameterToString(int32);
      }
      
      if (int64 != null) {
        hasFields = true;
        mp.fields['int64'] = parameterToString(int64);
      }
      
      if (number != null) {
        hasFields = true;
        mp.fields['number'] = parameterToString(number);
      }
      
      if (float != null) {
        hasFields = true;
        mp.fields['float'] = parameterToString(float);
      }
      
      if (double != null) {
        hasFields = true;
        mp.fields['double'] = parameterToString(double);
      }
      
      if (string != null) {
        hasFields = true;
        mp.fields['string'] = parameterToString(string);
      }
      
      if (patternWithoutDelimiter != null) {
        hasFields = true;
        mp.fields['pattern_without_delimiter'] = parameterToString(patternWithoutDelimiter);
      }
      
      if (byte != null) {
        hasFields = true;
        mp.fields['byte'] = parameterToString(byte);
      }
      
      if (binary != null) {
        hasFields = true;
        mp.fields['binary'] = parameterToString(binary);
      }
      
      if (date != null) {
        hasFields = true;
        mp.fields['date'] = parameterToString(date);
      }
      
      if (dateTime != null) {
        hasFields = true;
        mp.fields['dateTime'] = parameterToString(dateTime);
      }
      
      if (password != null) {
        hasFields = true;
        mp.fields['password'] = parameterToString(password);
      }
      
      if (callback != null) {
        hasFields = true;
        mp.fields['callback'] = parameterToString(callback);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (integer != null)
        formParams['integer'] = parameterToString(integer);
if (int32 != null)
        formParams['int32'] = parameterToString(int32);
if (int64 != null)
        formParams['int64'] = parameterToString(int64);
if (number != null)
        formParams['number'] = parameterToString(number);
if (float != null)
        formParams['float'] = parameterToString(float);
if (double != null)
        formParams['double'] = parameterToString(double);
if (string != null)
        formParams['string'] = parameterToString(string);
if (patternWithoutDelimiter != null)
        formParams['pattern_without_delimiter'] = parameterToString(patternWithoutDelimiter);
if (byte != null)
        formParams['byte'] = parameterToString(byte);
if (binary != null)
        formParams['binary'] = parameterToString(binary);
if (date != null)
        formParams['date'] = parameterToString(date);
if (dateTime != null)
        formParams['dateTime'] = parameterToString(dateTime);
if (password != null)
        formParams['password'] = parameterToString(password);
if (callback != null)
        formParams['callback'] = parameterToString(callback);
    }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          ;
    } else {
      return ;
    }
  }
  /// To test enum parameters
  ///
  /// To test enum parameters
  Future testEnumParameters({ List<String> enumFormStringArray, String enumFormString, List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, int enumQueryInteger, double enumQueryDouble }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/fake".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(enumQueryStringArray != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("csv", "enum_query_string_array", enumQueryStringArray));
    }
    if(enumQueryString != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "enum_query_string", enumQueryString));
    }
    if(enumQueryInteger != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "enum_query_integer", enumQueryInteger));
    }
    headerParams["enum_header_string_array"] = enumHeaderStringArray;
headerParams["enum_header_string"] = enumHeaderString;

    List<String> contentTypes = ["*/*"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (enumFormStringArray != null) {
        hasFields = true;
        mp.fields['enum_form_string_array'] = parameterToString(enumFormStringArray);
      }
      
      if (enumFormString != null) {
        hasFields = true;
        mp.fields['enum_form_string'] = parameterToString(enumFormString);
      }
      
      if (enumQueryDouble != null) {
        hasFields = true;
        mp.fields['enum_query_double'] = parameterToString(enumQueryDouble);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (enumFormStringArray != null)
        formParams['enum_form_string_array'] = parameterToString(enumFormStringArray);
if (enumFormString != null)
        formParams['enum_form_string'] = parameterToString(enumFormString);
if (enumQueryDouble != null)
        formParams['enum_query_double'] = parameterToString(enumQueryDouble);
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          ;
    } else {
      return ;
    }
  }
  /// test inline additionalProperties
  ///
  /// 
  Future testInlineAdditionalProperties(Object param) async {
    Object postBody = param;

    // verify required params are set
    if(param == null) {
     throw new ApiException(400, "Missing required param: param");
    }

    // create path and map variables
    String path = "/fake/inline-additionalProperties".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["application/json"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          ;
    } else {
      return ;
    }
  }
  /// test json serialization of form data
  ///
  /// 
  Future testJsonFormData(String param, String param2) async {
    Object postBody = null;

    // verify required params are set
    if(param == null) {
     throw new ApiException(400, "Missing required param: param");
    }
    if(param2 == null) {
     throw new ApiException(400, "Missing required param: param2");
    }

    // create path and map variables
    String path = "/fake/jsonFormData".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["application/json"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (param != null) {
        hasFields = true;
        mp.fields['param'] = parameterToString(param);
      }
      
      if (param2 != null) {
        hasFields = true;
        mp.fields['param2'] = parameterToString(param2);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (param != null)
        formParams['param'] = parameterToString(param);
if (param2 != null)
        formParams['param2'] = parameterToString(param2);
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return 
          ;
    } else {
      return ;
    }
  }
}
