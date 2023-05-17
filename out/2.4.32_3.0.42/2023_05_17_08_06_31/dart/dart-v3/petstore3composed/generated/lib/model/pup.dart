part of swagger.api;

class Pup {
  
  int id = null;

  Pup();

  @override
  String toString() {
    return 'Pup[id=$id, ]';
  }

  Pup.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id
     };
  }

  static List<Pup> listFromJson(List<dynamic> json) {
    return json == null ? new List<Pup>() : json.map((value) => new Pup.fromJson(value)).toList();
  }

  static Map<String, Pup> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Pup>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Pup.fromJson(value));
    }
    return map;
  }
}
