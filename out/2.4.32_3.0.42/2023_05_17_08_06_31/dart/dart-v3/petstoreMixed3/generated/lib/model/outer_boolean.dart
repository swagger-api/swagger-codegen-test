part of swagger.api;

class OuterBoolean {
  
  OuterBoolean();

  @override
  String toString() {
    return 'OuterBoolean[]';
  }

  OuterBoolean.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<OuterBoolean> listFromJson(List<dynamic> json) {
    return json == null ? new List<OuterBoolean>() : json.map((value) => new OuterBoolean.fromJson(value)).toList();
  }

  static Map<String, OuterBoolean> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, OuterBoolean>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new OuterBoolean.fromJson(value));
    }
    return map;
  }
}
