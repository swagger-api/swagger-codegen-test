part of swagger.api;



class PetApi {
  final ApiClient apiClient;

  PetApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Add a new pet to the store
  ///
  /// Add a new pet to the store
  Future<Pet> addPet(Pet body) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/pet".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["application/json","application/xml","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["petstore_auth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (id != null) {
        hasFields = true;
        mp.fields['id'] = parameterToString(id);
      }
      if (name != null) {
        hasFields = true;
        mp.fields['name'] = parameterToString(name);
      }
      if (category != null) {
        hasFields = true;
        mp.fields['category'] = parameterToString(category);
      }
      if (photoUrls != null) {
        hasFields = true;
        mp.fields['photoUrls'] = parameterToString(photoUrls);
      }
      if (tags != null) {
        hasFields = true;
        mp.fields['tags'] = parameterToString(tags);
      }
      if (status != null) {
        hasFields = true;
        mp.fields['status'] = parameterToString(status);
      }
      if(hasFields)
        postBody = mp;
    }
    else {
      if (id != null)
        formParams['id'] = parameterToString(id);
if (name != null)
        formParams['name'] = parameterToString(name);
if (category != null)
        formParams['category'] = parameterToString(category);
if (photoUrls != null)
        formParams['photoUrls'] = parameterToString(photoUrls);
if (tags != null)
        formParams['tags'] = parameterToString(tags);
if (status != null)
        formParams['status'] = parameterToString(status);
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
          apiClient.deserialize(response.body, 'Pet') as Pet ;
    } else {
      return null;
    }
  }
  /// Deletes a pet
  ///
  /// 
  Future deletePet(int petId, { String apiKey }) async {
    Object postBody = null;

    // verify required params are set
    if(petId == null) {
     throw new ApiException(400, "Missing required param: petId");
    }

    // create path and map variables
    String path = "/pet/{petId}".replaceAll("{format}","json").replaceAll("{" + "petId" + "}", petId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    headerParams["api_key"] = apiKey;

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["petstore_auth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'DELETE',
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
  /// Finds Pets by status
  ///
  /// Multiple status values can be provided with comma separated strings
  Future<List<Pet>> findPetsByStatus({ String status }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/pet/findByStatus".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(status != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "status", status));
    }
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["petstore_auth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
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
        (apiClient.deserialize(response.body, 'List<Pet>') as List).map((item) => item as Pet).toList();
    } else {
      return null;
    }
  }
  /// Finds Pets by tags
  ///
  /// Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
  Future<List<Pet>> findPetsByTags({ List<String> tags }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/pet/findByTags".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(tags != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "tags", tags));
    }
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["petstore_auth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
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
        (apiClient.deserialize(response.body, 'List<Pet>') as List).map((item) => item as Pet).toList();
    } else {
      return null;
    }
  }
  /// Find pet by ID
  ///
  /// Returns a single pet
  Future<Pet> getPetById(int petId) async {
    Object postBody = null;

    // verify required params are set
    if(petId == null) {
     throw new ApiException(400, "Missing required param: petId");
    }

    // create path and map variables
    String path = "/pet/{petId}".replaceAll("{format}","json").replaceAll("{" + "petId" + "}", petId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["api_key", "petstore_auth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
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
          apiClient.deserialize(response.body, 'Pet') as Pet ;
    } else {
      return null;
    }
  }
  /// Update an existing pet
  ///
  /// Update an existing pet by Id
  Future<Pet> updatePet(Pet body) async {
    Object postBody = body;

    // verify required params are set
    if(body == null) {
     throw new ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/pet".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["application/json","application/xml","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["petstore_auth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (id != null) {
        hasFields = true;
        mp.fields['id'] = parameterToString(id);
      }
      if (name != null) {
        hasFields = true;
        mp.fields['name'] = parameterToString(name);
      }
      if (category != null) {
        hasFields = true;
        mp.fields['category'] = parameterToString(category);
      }
      if (photoUrls != null) {
        hasFields = true;
        mp.fields['photoUrls'] = parameterToString(photoUrls);
      }
      if (tags != null) {
        hasFields = true;
        mp.fields['tags'] = parameterToString(tags);
      }
      if (status != null) {
        hasFields = true;
        mp.fields['status'] = parameterToString(status);
      }
      if(hasFields)
        postBody = mp;
    }
    else {
      if (id != null)
        formParams['id'] = parameterToString(id);
if (name != null)
        formParams['name'] = parameterToString(name);
if (category != null)
        formParams['category'] = parameterToString(category);
if (photoUrls != null)
        formParams['photoUrls'] = parameterToString(photoUrls);
if (tags != null)
        formParams['tags'] = parameterToString(tags);
if (status != null)
        formParams['status'] = parameterToString(status);
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
          apiClient.deserialize(response.body, 'Pet') as Pet ;
    } else {
      return null;
    }
  }
  /// Updates a pet in the store with form data
  ///
  /// 
  Future updatePetWithForm(int petId, { String name, String status }) async {
    Object postBody = null;

    // verify required params are set
    if(petId == null) {
     throw new ApiException(400, "Missing required param: petId");
    }

    // create path and map variables
    String path = "/pet/{petId}".replaceAll("{format}","json").replaceAll("{" + "petId" + "}", petId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(name != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "name", name));
    }
    if(status != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "status", status));
    }
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["petstore_auth"];

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
  /// uploads an image
  ///
  /// 
  Future<ApiResponse> uploadFile(int petId, { Object body, String additionalMetadata }) async {
    Object postBody = body;

    // verify required params are set
    if(petId == null) {
     throw new ApiException(400, "Missing required param: petId");
    }

    // create path and map variables
    String path = "/pet/{petId}/uploadImage".replaceAll("{format}","json").replaceAll("{" + "petId" + "}", petId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(additionalMetadata != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "additionalMetadata", additionalMetadata));
    }
    
    List<String> contentTypes = ["application/octet-stream"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["petstore_auth"];

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
          apiClient.deserialize(response.body, 'ApiResponse') as ApiResponse ;
    } else {
      return null;
    }
  }
}
