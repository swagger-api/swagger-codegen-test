part of swagger.api;

class QueryParam {
  String name;
  String value;

  QueryParam(this.name, this.value);
}

class ApiClient {

  String basePath;
  var client = new Client();

  Map<String, String> _defaultHeaderMap = {};
  Map<String, Authentication> _authentications = {};

  final _RegList = new RegExp(r'^List<(.*)>$');
  final _RegMap = new RegExp(r'^Map<String,(.*)>$');

  ApiClient({this.basePath: "http://petstore.swagger.io:80/v2"}) {
    // Setup authentications (key: authentication name, value: authentication).
    _authentications['api_key'] = new ApiKeyAuth("header", "api_key");
    _authentications['api_key_query'] = new ApiKeyAuth("query", "api_key_query");
    _authentications['http_basic_test'] = new HttpBasicAuth();
    _authentications['petstore_auth'] = new OAuth();
  }

  void addDefaultHeader(String key, String value) {
     _defaultHeaderMap[key] = value;
  }

  dynamic _deserialize(dynamic value, String targetType) {
    try {
      switch (targetType) {
        case 'String':
          return '$value';
        case 'int':
          return value is int ? value : int.parse('$value');
        case 'bool':
          return value is bool ? value : '$value'.toLowerCase() == 'true';
        case 'double':
          return value is double ? value : double.parse('$value');
        case '$Special[modelName]':
          return new $Special[modelName].fromJson(value);
        case 'AdditionalPropertiesClass':
          return new AdditionalPropertiesClass.fromJson(value);
        case 'AllOfSubCategoryCategory':
          return new AllOfSubCategoryCategory.fromJson(value);
        case 'AllOfSubCategoryPetsItems':
          return new AllOfSubCategoryPetsItems.fromJson(value);
        case 'AllPetsResponse':
          return new AllPetsResponse.fromJson(value);
        case 'Animal':
          return new Animal.fromJson(value);
        case 'AnimalAnimalIdBody':
          return new AnimalAnimalIdBody.fromJson(value);
        case 'AnimalFarm':
          return new AnimalFarm.fromJson(value);
        case 'ApiResponse':
          return new ApiResponse.fromJson(value);
        case 'ArrayOfArrayOfNumberOnly':
          return new ArrayOfArrayOfNumberOnly.fromJson(value);
        case 'ArrayOfNumberOnly':
          return new ArrayOfNumberOnly.fromJson(value);
        case 'ArrayTest':
          return new ArrayTest.fromJson(value);
        case 'Capitalization':
          return new Capitalization.fromJson(value);
        case 'Cat':
          return new Cat.fromJson(value);
        case 'Category':
          return new Category.fromJson(value);
        case 'ClassModel':
          return new ClassModel.fromJson(value);
        case 'Client':
          return new Client.fromJson(value);
        case 'Dog':
          return new Dog.fromJson(value);
        case 'DogDogIdBody':
          return new DogDogIdBody.fromJson(value);
        case 'EnumArrays':
          return new EnumArrays.fromJson(value);
        case 'EnumClass':
           return new EnumClass.fromJson(value);
        case 'EnumFormBody':
          return new EnumFormBody.fromJson(value);
        case 'EnumTest':
          return new EnumTest.fromJson(value);
        case 'FakeBody':
          return new FakeBody.fromJson(value);
        case 'FakeBody1':
          return new FakeBody1.fromJson(value);
        case 'FakeJsonFormDataBody':
          return new FakeJsonFormDataBody.fromJson(value);
        case 'FormatTest':
          return new FormatTest.fromJson(value);
        case 'HasOnlyReadOnly':
          return new HasOnlyReadOnly.fromJson(value);
        case 'List':
          return new List.fromJson(value);
        case 'MapTest':
          return new MapTest.fromJson(value);
        case 'MixedPropertiesAndAdditionalPropertiesClass':
          return new MixedPropertiesAndAdditionalPropertiesClass.fromJson(value);
        case 'Model200Response':
          return new Model200Response.fromJson(value);
        case 'ModelReturn':
          return new ModelReturn.fromJson(value);
        case 'Name':
          return new Name.fromJson(value);
        case 'NullableEnumModel':
          return new NullableEnumModel.fromJson(value);
        case 'NumberOnly':
          return new NumberOnly.fromJson(value);
        case 'OneOfAllPetsResponseItems':
          return new OneOfAllPetsResponseItems.fromJson(value);
        case 'OneOfSinglePetResponsePet':
          return new OneOfSinglePetResponsePet.fromJson(value);
        case 'Order':
          return new Order.fromJson(value);
        case 'OuterBoolean':
          return new OuterBoolean.fromJson(value);
        case 'OuterComposite':
          return new OuterComposite.fromJson(value);
        case 'OuterEnum':
           return new OuterEnum.fromJson(value);
        case 'OuterNumber':
          return new OuterNumber.fromJson(value);
        case 'OuterString':
          return new OuterString.fromJson(value);
        case 'Pet':
          return new Pet.fromJson(value);
        case 'PetIdUploadImageBody':
          return new PetIdUploadImageBody.fromJson(value);
        case 'PetPetIdBody':
          return new PetPetIdBody.fromJson(value);
        case 'ReadOnlyFirst':
          return new ReadOnlyFirst.fromJson(value);
        case 'SinglePetResponse':
          return new SinglePetResponse.fromJson(value);
        case 'SubCategory':
          return new SubCategory.fromJson(value);
        case 'Tag':
          return new Tag.fromJson(value);
        case 'User':
          return new User.fromJson(value);
        default:
          {
            Match match;
            if (value is List &&
                (match = _RegList.firstMatch(targetType)) != null) {
              var newTargetType = match[1];
              return value.map((v) => _deserialize(v, newTargetType)).toList();
            } else if (value is Map &&
                (match = _RegMap.firstMatch(targetType)) != null) {
              var newTargetType = match[1];
              return new Map.fromIterables(value.keys,
                  value.values.map((v) => _deserialize(v, newTargetType)));
            }
          }
      }
    } catch (e, stack) {
      throw new ApiException.withInner(500, 'Exception during deserialization.', e, stack);
    }
    throw new ApiException(500, 'Could not find a suitable class for deserialization');
  }

  dynamic deserialize(String jsonVal, String targetType) {
    // Remove all spaces.  Necessary for reg expressions as well.
    targetType = targetType.replaceAll(' ', '');

    if (targetType == 'String') return jsonVal;

    var decodedJson = json.decode(jsonVal);
    return _deserialize(decodedJson, targetType);
  }

  String serialize(Object obj) {
    String serialized = '';
    if (obj == null) {
      serialized = '';
    } else {
      serialized = json.encode(obj);
    }
    return serialized;
  }

  // We don't use a Map<String, String> for queryParams.
  // If collectionFormat is 'multi' a key might appear multiple times.
  Future<Response> invokeAPI(String path,
                             String method,
                             Iterable<QueryParam> queryParams,
                             Object body,
                             Map<String, String> headerParams,
                             Map<String, String> formParams,
                             String contentType,
                             List<String> authNames) async {

    _updateParamsForAuth(authNames, queryParams, headerParams);

    var ps = queryParams.where((p) => p.value != null).map((p) => '${Uri.encodeComponent(p.name)}=${Uri.encodeComponent(p.value)}');
    String queryString = ps.isNotEmpty ?
                         '?' + ps.join('&') :
                         '';

    String url = basePath + path + queryString;

    headerParams.addAll(_defaultHeaderMap);
    headerParams['Content-Type'] = contentType;

    if(body is MultipartRequest) {
      var request = new MultipartRequest(method, Uri.parse(url));
      request.fields.addAll(body.fields);
      request.files.addAll(body.files);
      request.headers.addAll(body.headers);
      request.headers.addAll(headerParams);
      var response = await client.send(request);
      return Response.fromStream(response);
    } else {
      var msgBody = contentType == "application/x-www-form-urlencoded" ? formParams : serialize(body);
      switch(method) {
        case "POST":
          return client.post(url, headers: headerParams, body: msgBody);
        case "PUT":
          return client.put(url, headers: headerParams, body: msgBody);
        case "DELETE":
          return client.delete(url, headers: headerParams);
        case "PATCH":
          return client.patch(url, headers: headerParams, body: msgBody);
        default:
          return client.get(url, headers: headerParams);
      }
    }
  }

  /// Update query and header parameters based on authentication settings.
  /// @param authNames The authentications to apply
  void _updateParamsForAuth(List<String> authNames, List<QueryParam> queryParams, Map<String, String> headerParams) {
    authNames.forEach((authName) {
      Authentication auth = _authentications[authName];
      if (auth == null) throw new ArgumentError("Authentication undefined: " + authName);
      auth.applyToParams(queryParams, headerParams);
    });
  }

  void setAccessToken(String accessToken) {
    _authentications.forEach((key, auth) {
      if (auth is OAuth) {
        auth.setAccessToken(accessToken);
      }
    });
  }
}
