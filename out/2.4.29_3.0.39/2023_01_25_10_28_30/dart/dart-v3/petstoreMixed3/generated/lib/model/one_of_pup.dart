part of swagger.api;

class OneOfPup {
  
  OneOfPup();

  @override
  String toString() {
    return 'OneOfPup[]';
  }

  OneOfPup.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<OneOfPup> listFromJson(List<dynamic> json) {
    return json == null ? new List<OneOfPup>() : json.map((value) => new OneOfPup.fromJson(value)).toList();
  }

  static Map<String, OneOfPup> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, OneOfPup>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new OneOfPup.fromJson(value));
    }
    return map;
  }
}
