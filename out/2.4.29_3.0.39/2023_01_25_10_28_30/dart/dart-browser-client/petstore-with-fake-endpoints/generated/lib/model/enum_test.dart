part of swagger.api;

class EnumTest {
  
  String enumString = null;
  //enum enumStringEnum {  UPPER,  lower,  ,  };

  String enumStringRequired = null;
  //enum enumStringRequiredEnum {  UPPER,  lower,  ,  };

  int enumInteger = null;
  //enum enumIntegerEnum {  1,  -1,  };

  double enumNumber = null;
  //enum enumNumberEnum {  1.1,  -1.2,  };

  OuterEnum outerEnum = null;
  
  EnumTest();

  @override
  String toString() {
    return 'EnumTest[enumString=$enumString, enumStringRequired=$enumStringRequired, enumInteger=$enumInteger, enumNumber=$enumNumber, outerEnum=$outerEnum, ]';
  }

  EnumTest.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    enumString =
        json['enum_string']
    ;
    enumStringRequired =
        json['enum_string_required']
    ;
    enumInteger =
        json['enum_integer']
    ;
    enumNumber =
        json['enum_number'] == null ? null : json['enum_number'].toDouble()
    ;
    outerEnum =
      
      
      new OuterEnum.fromJson(json['outerEnum'])
;
  }

  Map<String, dynamic> toJson() {
    return {
      'enum_string': enumString,
      'enum_string_required': enumStringRequired,
      'enum_integer': enumInteger,
      'enum_number': enumNumber,
      'outerEnum': outerEnum
     };
  }

  static List<EnumTest> listFromJson(List<dynamic> json) {
    return json == null ? new List<EnumTest>() : json.map((value) => new EnumTest.fromJson(value)).toList();
  }

  static Map<String, EnumTest> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, EnumTest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new EnumTest.fromJson(value));
    }
    return map;
  }
}

