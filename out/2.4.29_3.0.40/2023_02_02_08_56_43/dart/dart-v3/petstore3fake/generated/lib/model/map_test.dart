part of swagger.api;

class MapTest {
  
  Map<String, Map<String, String>> mapMapOfString = {};

  Map<String, String> mapOfEnumString = null;
  //enum mapOfEnumStringEnum {  UPPER,  lower,  };

  MapTest();

  @override
  String toString() {
    return 'MapTest[mapMapOfString=$mapMapOfString, mapOfEnumString=$mapOfEnumString, ]';
  }

  MapTest.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    mapMapOfString = Map.mapFromJson(json['map_map_of_string']);
    mapOfEnumString = json['map_of_enum_string'];
  }

  Map<String, dynamic> toJson() {
    return {
      'map_map_of_string': mapMapOfString,
      'map_of_enum_string': mapOfEnumString
     };
  }

  static List<MapTest> listFromJson(List<dynamic> json) {
    return json == null ? new List<MapTest>() : json.map((value) => new MapTest.fromJson(value)).toList();
  }

  static Map<String, MapTest> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MapTest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MapTest.fromJson(value));
    }
    return map;
  }
}
