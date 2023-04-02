part of swagger.api;

class ArrayTest {
  
  List<String> arrayOfString = [];
  

  List<List<int>> arrayArrayOfInteger = [];
  

  List<List<ReadOnlyFirst>> arrayArrayOfModel = [];
  
  ArrayTest();

  @override
  String toString() {
    return 'ArrayTest[arrayOfString=$arrayOfString, arrayArrayOfInteger=$arrayArrayOfInteger, arrayArrayOfModel=$arrayArrayOfModel, ]';
  }

  ArrayTest.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    arrayOfString =
        (json['array_of_string'] as List).map((item) => item as String).toList()
    ;
    arrayArrayOfInteger =
      List.listFromJson(json['array_array_of_integer'])
;
    arrayArrayOfModel =
      List.listFromJson(json['array_array_of_model'])
;
  }

  Map<String, dynamic> toJson() {
    return {
      'array_of_string': arrayOfString,
      'array_array_of_integer': arrayArrayOfInteger,
      'array_array_of_model': arrayArrayOfModel
     };
  }

  static List<ArrayTest> listFromJson(List<dynamic> json) {
    return json == null ? new List<ArrayTest>() : json.map((value) => new ArrayTest.fromJson(value)).toList();
  }

  static Map<String, ArrayTest> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ArrayTest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ArrayTest.fromJson(value));
    }
    return map;
  }
}

