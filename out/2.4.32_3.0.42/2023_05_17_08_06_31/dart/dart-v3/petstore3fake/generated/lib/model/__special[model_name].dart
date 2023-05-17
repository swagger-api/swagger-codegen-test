part of swagger.api;

class $Special[modelName] {
  
  int $Special[propertyName] = null;

  $Special[modelName]();

  @override
  String toString() {
    return '$Special[modelName][$Special[propertyName]=$$Special[propertyName], ]';
  }

  $Special[modelName].fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    $Special[propertyName] = json['$special[property.name]'];
  }

  Map<String, dynamic> toJson() {
    return {
      '$special[property.name]': $Special[propertyName]
     };
  }

  static List<$Special[modelName]> listFromJson(List<dynamic> json) {
    return json == null ? new List<$Special[modelName]>() : json.map((value) => new $Special[modelName].fromJson(value)).toList();
  }

  static Map<String, $Special[modelName]> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, $Special[modelName]>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new $Special[modelName].fromJson(value));
    }
    return map;
  }
}
