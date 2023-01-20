part of swagger.api;

class ParrotBody1 {
  
  ParrotBody1();

  @override
  String toString() {
    return 'ParrotBody1[]';
  }

  ParrotBody1.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<ParrotBody1> listFromJson(List<dynamic> json) {
    return json == null ? new List<ParrotBody1>() : json.map((value) => new ParrotBody1.fromJson(value)).toList();
  }

  static Map<String, ParrotBody1> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ParrotBody1>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ParrotBody1.fromJson(value));
    }
    return map;
  }
}
