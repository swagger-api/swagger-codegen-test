part of swagger.api;

class PartOne {
  /* A test description */
  String name = null;

  PartOne();

  @override
  String toString() {
    return 'PartOne[name=$name, ]';
  }

  PartOne.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name
     };
  }

  static List<PartOne> listFromJson(List<dynamic> json) {
    return json == null ? new List<PartOne>() : json.map((value) => new PartOne.fromJson(value)).toList();
  }

  static Map<String, PartOne> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, PartOne>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new PartOne.fromJson(value));
    }
    return map;
  }
}
