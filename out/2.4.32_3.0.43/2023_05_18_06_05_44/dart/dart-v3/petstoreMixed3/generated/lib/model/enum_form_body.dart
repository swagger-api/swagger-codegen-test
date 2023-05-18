part of swagger.api;

class EnumFormBody {
  /* Form parameter enum test (string array) */
  List<String> enumFormStringArray = null;
  //enum enumFormStringArrayEnum {  &gt;,  $,  };
/* Form parameter enum test (string) */
  String enumFormString = null;
  //enum enumFormStringEnum {  _abc,  -efg,  (xyz),  };
/* Query parameter enum test (double) */
  double enumQueryDouble = null;
  //enum enumQueryDoubleEnum {  1.1,  -1.2,  };

  EnumFormBody();

  @override
  String toString() {
    return 'EnumFormBody[enumFormStringArray=$enumFormStringArray, enumFormString=$enumFormString, enumQueryDouble=$enumQueryDouble, ]';
  }

  EnumFormBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    enumFormStringArray = (json['enum_form_string_array'] as List).map((item) => item as String).toList();
    enumFormString = json['enum_form_string'];
    enumQueryDouble = json['enum_query_double'];
  }

  Map<String, dynamic> toJson() {
    return {
      'enum_form_string_array': enumFormStringArray,
      'enum_form_string': enumFormString,
      'enum_query_double': enumQueryDouble
     };
  }

  static List<EnumFormBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<EnumFormBody>() : json.map((value) => new EnumFormBody.fromJson(value)).toList();
  }

  static Map<String, EnumFormBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, EnumFormBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new EnumFormBody.fromJson(value));
    }
    return map;
  }
}
