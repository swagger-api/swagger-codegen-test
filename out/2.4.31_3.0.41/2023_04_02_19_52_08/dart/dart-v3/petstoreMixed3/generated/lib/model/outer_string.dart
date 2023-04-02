part of swagger.api;

class OuterString {
  
  OuterString();

  @override
  String toString() {
    return 'OuterString[]';
  }

  OuterString.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<OuterString> listFromJson(List<dynamic> json) {
    return json == null ? new List<OuterString>() : json.map((value) => new OuterString.fromJson(value)).toList();
  }

  static Map<String, OuterString> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, OuterString>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new OuterString.fromJson(value));
    }
    return map;
  }
}
