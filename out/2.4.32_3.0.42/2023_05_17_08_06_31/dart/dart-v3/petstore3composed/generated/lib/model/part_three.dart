part of swagger.api;

class PartThree {
  
  String otherId = null;

  PartThree();

  @override
  String toString() {
    return 'PartThree[otherId=$otherId, ]';
  }

  PartThree.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    otherId = json['otherId'];
  }

  Map<String, dynamic> toJson() {
    return {
      'otherId': otherId
     };
  }

  static List<PartThree> listFromJson(List<dynamic> json) {
    return json == null ? new List<PartThree>() : json.map((value) => new PartThree.fromJson(value)).toList();
  }

  static Map<String, PartThree> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, PartThree>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new PartThree.fromJson(value));
    }
    return map;
  }
}
