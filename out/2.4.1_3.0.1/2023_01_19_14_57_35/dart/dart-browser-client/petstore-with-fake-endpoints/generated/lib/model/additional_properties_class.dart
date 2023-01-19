part of swagger.api;

class AdditionalPropertiesClass {
  
  Map<String, String> mapProperty = {};
  

  Map<String, Map<String, String>> mapOfMapProperty = {};
  
  AdditionalPropertiesClass();

  @override
  String toString() {
    return 'AdditionalPropertiesClass[mapProperty=$mapProperty, mapOfMapProperty=$mapOfMapProperty, ]';
  }

  AdditionalPropertiesClass.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    mapProperty =
        json['mapProperty']
    ;
    mapOfMapProperty =
      
      Map.mapFromJson(json['mapOfMapProperty'])
      
;
  }

  Map<String, dynamic> toJson() {
    return {
      'mapProperty': mapProperty,
      'mapOfMapProperty': mapOfMapProperty
     };
  }

  static List<AdditionalPropertiesClass> listFromJson(List<dynamic> json) {
    return json == null ? new List<AdditionalPropertiesClass>() : json.map((value) => new AdditionalPropertiesClass.fromJson(value)).toList();
  }

  static Map<String, AdditionalPropertiesClass> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, AdditionalPropertiesClass>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new AdditionalPropertiesClass.fromJson(value));
    }
    return map;
  }
}

