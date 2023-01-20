part of swagger.api;

class Parakeet {
  
  String color = null;

  bool soundRepeater = null;

  Parakeet();

  @override
  String toString() {
    return 'Parakeet[color=$color, soundRepeater=$soundRepeater, ]';
  }

  Parakeet.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    color = json['color'];
    soundRepeater = json['soundRepeater'];
  }

  Map<String, dynamic> toJson() {
    return {
      'color': color,
      'soundRepeater': soundRepeater
     };
  }

  static List<Parakeet> listFromJson(List<dynamic> json) {
    return json == null ? new List<Parakeet>() : json.map((value) => new Parakeet.fromJson(value)).toList();
  }

  static Map<String, Parakeet> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Parakeet>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Parakeet.fromJson(value));
    }
    return map;
  }
}
