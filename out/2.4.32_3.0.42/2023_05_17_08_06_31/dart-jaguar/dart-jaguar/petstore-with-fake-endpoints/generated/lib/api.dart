library swagger.api;

import 'package:http/http.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:swagger/auth/api_key_auth.dart';
import 'package:swagger/auth/basic_auth.dart';
import 'package:swagger/auth/oauth.dart';

import 'package:swagger/api/another_fake_api.dart';
import 'package:swagger/api/fake_api.dart';
import 'package:swagger/api/fake_classname_tags123_api.dart';
import 'package:swagger/api/pet_api.dart';
import 'package:swagger/api/store_api.dart';
import 'package:swagger/api/user_api.dart';

import 'package:swagger/model/__special[model_name].dart';
import 'package:swagger/model/200_response.dart';
import 'package:swagger/model/additional_properties_class.dart';
import 'package:swagger/model/animal.dart';
import 'package:swagger/model/animal_farm.dart';
import 'package:swagger/model/api_response.dart';
import 'package:swagger/model/array_of_array_of_number_only.dart';
import 'package:swagger/model/array_of_number_only.dart';
import 'package:swagger/model/array_test.dart';
import 'package:swagger/model/boolean.dart';
import 'package:swagger/model/capitalization.dart';
import 'package:swagger/model/cat.dart';
import 'package:swagger/model/category.dart';
import 'package:swagger/model/class_model.dart';
import 'package:swagger/model/client.dart';
import 'package:swagger/model/dog.dart';
import 'package:swagger/model/enum_arrays.dart';
import 'package:swagger/model/enum_class.dart';
import 'package:swagger/model/enum_test.dart';
import 'package:swagger/model/format_test.dart';
import 'package:swagger/model/has_only_read_only.dart';
import 'package:swagger/model/ints.dart';
import 'package:swagger/model/list.dart';
import 'package:swagger/model/map_test.dart';
import 'package:swagger/model/mixed_properties_and_additional_properties_class.dart';
import 'package:swagger/model/model_return.dart';
import 'package:swagger/model/name.dart';
import 'package:swagger/model/number_only.dart';
import 'package:swagger/model/numbers.dart';
import 'package:swagger/model/order.dart';
import 'package:swagger/model/outer_boolean.dart';
import 'package:swagger/model/outer_composite.dart';
import 'package:swagger/model/outer_enum.dart';
import 'package:swagger/model/outer_number.dart';
import 'package:swagger/model/outer_string.dart';
import 'package:swagger/model/pet.dart';
import 'package:swagger/model/read_only_first.dart';
import 'package:swagger/model/tag.dart';
import 'package:swagger/model/user.dart';


final jsonJaguarRepo = JsonRepo()
..add($Special[modelName]Serializer())
..add(200ResponseSerializer())
..add(AdditionalPropertiesClassSerializer())
..add(AnimalSerializer())
..add(AnimalFarmSerializer())
..add(ApiResponseSerializer())
..add(ArrayOfArrayOfNumberOnlySerializer())
..add(ArrayOfNumberOnlySerializer())
..add(ArrayTestSerializer())
..add(BooleanSerializer())
..add(CapitalizationSerializer())
..add(CatSerializer())
..add(CategorySerializer())
..add(ClassModelSerializer())
..add(ClientSerializer())
..add(DogSerializer())
..add(EnumArraysSerializer())
..add(EnumClassSerializer())
..add(EnumTestSerializer())
..add(FormatTestSerializer())
..add(HasOnlyReadOnlySerializer())
..add(IntsSerializer())
..add(ListSerializer())
..add(MapTestSerializer())
..add(MixedPropertiesAndAdditionalPropertiesClassSerializer())
..add(ModelReturnSerializer())
..add(NameSerializer())
..add(NumberOnlySerializer())
..add(NumbersSerializer())
..add(OrderSerializer())
..add(OuterBooleanSerializer())
..add(OuterCompositeSerializer())
..add(OuterEnumSerializer())
..add(OuterNumberSerializer())
..add(OuterStringSerializer())
..add(PetSerializer())
..add(ReadOnlyFirstSerializer())
..add(TagSerializer())
..add(UserSerializer())
;

final _defaultInterceptors = [OAuthInterceptor(), BasicAuthInterceptor(), ApiKeyAuthInterceptor()];

class JaguarApiGen {
    List<Interceptor> interceptors;
    String basePath = "http://petstore.swagger.io:80/v2";
    Route _baseRoute;

    /**
     * Add custom global interceptors, put overrideInterceptors to true to set your interceptors only (auth interceptors will not be added)
     */
    JaguarApiGen({List<Interceptor> interceptors, bool overrideInterceptors = false, String baseUrl}) {
        _baseRoute = Route(baseUrl ?? basePath).withClient(globalClient ?? IOClient());
        if(interceptors == null) {
            this.interceptors = _defaultInterceptors;
        }
        else if(overrideInterceptors){
            this.interceptors = interceptors;
        }
        else {
            this.interceptors = List.from(_defaultInterceptors)..addAll(interceptors);
        }

        this.interceptors.forEach((interceptor) {
            _baseRoute.before(interceptor.before);
            _baseRoute.after(interceptor.after);
        });
    }

    void setOAuthToken(String name, String token) {
        (_defaultInterceptors[0] as OAuthInterceptor).tokens[name] = token;
    }

    void setBasicAuth(String name, String username, String password) {
        (_defaultInterceptors[1] as BasicAuthInterceptor).authInfo[name] = BasicAuthInfo(username, password);
    }

    void setApiKey(String name, String apiKey) {
        (_defaultInterceptors[2] as ApiKeyAuthInterceptor).apiKeys[name] = apiKey;
    }

    
    /**
     * Get AnotherFakeApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    AnotherFakeApi getAnotherFakeApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return AnotherFakeApi(base: base, serializers: serializers);
    }

    
    /**
     * Get FakeApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    FakeApi getFakeApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return FakeApi(base: base, serializers: serializers);
    }

    
    /**
     * Get FakeClassnameTags123Api instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    FakeClassnameTags123Api getFakeClassnameTags123Api({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return FakeClassnameTags123Api(base: base, serializers: serializers);
    }

    
    /**
     * Get PetApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    PetApi getPetApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return PetApi(base: base, serializers: serializers);
    }

    
    /**
     * Get StoreApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    StoreApi getStoreApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return StoreApi(base: base, serializers: serializers);
    }

    
    /**
     * Get UserApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    UserApi getUserApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return UserApi(base: base, serializers: serializers);
    }

    
}