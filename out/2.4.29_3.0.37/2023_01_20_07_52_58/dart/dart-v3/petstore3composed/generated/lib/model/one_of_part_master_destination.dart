part of swagger.api;

class OneOfPartMasterDestination {
  
  OneOfPartMasterDestination();

  @override
  String toString() {
    return 'OneOfPartMasterDestination[]';
  }

  OneOfPartMasterDestination.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<OneOfPartMasterDestination> listFromJson(List<dynamic> json) {
    return json == null ? new List<OneOfPartMasterDestination>() : json.map((value) => new OneOfPartMasterDestination.fromJson(value)).toList();
  }

  static Map<String, OneOfPartMasterDestination> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, OneOfPartMasterDestination>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new OneOfPartMasterDestination.fromJson(value));
    }
    return map;
  }
}
