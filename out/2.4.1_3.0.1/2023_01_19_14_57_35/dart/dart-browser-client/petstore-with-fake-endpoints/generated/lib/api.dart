library swagger.api;

import 'dart:async';
import 'dart:convert';
import 'package:http/browser_client.dart';
import 'package:http/http.dart';

part 'api_client.dart';
part 'api_helper.dart';
part 'api_exception.dart';
part 'auth/authentication.dart';
part 'auth/api_key_auth.dart';
part 'auth/oauth.dart';
part 'auth/http_basic_auth.dart';

part 'api/another_fake_api.dart';
part 'api/fake_api.dart';
part 'api/fake_classname_tags123_api.dart';
part 'api/pet_api.dart';
part 'api/store_api.dart';
part 'api/user_api.dart';

part 'model/__special[model_name].dart';
part 'model/200_response.dart';
part 'model/additional_properties_class.dart';
part 'model/animal.dart';
part 'model/animal_farm.dart';
part 'model/api_response.dart';
part 'model/array_of_array_of_number_only.dart';
part 'model/array_of_number_only.dart';
part 'model/array_test.dart';
part 'model/boolean.dart';
part 'model/capitalization.dart';
part 'model/category.dart';
part 'model/class_model.dart';
part 'model/client.dart';
part 'model/enum_arrays.dart';
part 'model/enum_class.dart';
part 'model/enum_test.dart';
part 'model/format_test.dart';
part 'model/has_only_read_only.dart';
part 'model/ints.dart';
part 'model/list.dart';
part 'model/map_test.dart';
part 'model/mixed_properties_and_additional_properties_class.dart';
part 'model/model_return.dart';
part 'model/name.dart';
part 'model/number_only.dart';
part 'model/numbers.dart';
part 'model/order.dart';
part 'model/outer_boolean.dart';
part 'model/outer_composite.dart';
part 'model/outer_enum.dart';
part 'model/outer_number.dart';
part 'model/outer_string.dart';
part 'model/pet.dart';
part 'model/read_only_first.dart';
part 'model/tag.dart';
part 'model/user.dart';
part 'model/cat.dart';
part 'model/dog.dart';


ApiClient defaultApiClient = new ApiClient();
