part of swagger.api;

class Macaw {
  
  String color = null;

  bool singer = null;

  Macaw();

  @override
  String toString() {
    return 'Macaw[color=$color, singer=$singer, ]';
  }

  Macaw.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    color = json['color'];
    singer = json['singer'];
  }

  Map<String, dynamic> toJson() {
    return {
      'color': color,
      'singer': singer
     };
  }

  static List<Macaw> listFromJson(List<dynamic> json) {
    return json == null ? new List<Macaw>() : json.map((value) => new Macaw.fromJson(value)).toList();
  }

  static Map<String, Macaw> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Macaw>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Macaw.fromJson(value));
    }
    return map;
  }
}
