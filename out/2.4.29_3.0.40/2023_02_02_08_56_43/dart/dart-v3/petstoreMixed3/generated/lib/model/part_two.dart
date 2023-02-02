part of swagger.api;

class PartTwo {
  
  String id = null;

  PartTwo();

  @override
  String toString() {
    return 'PartTwo[id=$id, ]';
  }

  PartTwo.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id
     };
  }

  static List<PartTwo> listFromJson(List<dynamic> json) {
    return json == null ? new List<PartTwo>() : json.map((value) => new PartTwo.fromJson(value)).toList();
  }

  static Map<String, PartTwo> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, PartTwo>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new PartTwo.fromJson(value));
    }
    return map;
  }
}
