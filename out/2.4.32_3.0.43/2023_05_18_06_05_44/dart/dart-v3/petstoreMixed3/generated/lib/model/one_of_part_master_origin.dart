part of swagger.api;

class OneOfPartMasterOrigin {
  
  OneOfPartMasterOrigin();

  @override
  String toString() {
    return 'OneOfPartMasterOrigin[]';
  }

  OneOfPartMasterOrigin.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<OneOfPartMasterOrigin> listFromJson(List<dynamic> json) {
    return json == null ? new List<OneOfPartMasterOrigin>() : json.map((value) => new OneOfPartMasterOrigin.fromJson(value)).toList();
  }

  static Map<String, OneOfPartMasterOrigin> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, OneOfPartMasterOrigin>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new OneOfPartMasterOrigin.fromJson(value));
    }
    return map;
  }
}
