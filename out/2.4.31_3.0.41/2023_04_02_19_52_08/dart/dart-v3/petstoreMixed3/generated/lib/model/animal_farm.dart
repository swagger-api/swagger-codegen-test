part of swagger.api;

class AnimalFarm {
  
  AnimalFarm();

  @override
  String toString() {
    return 'AnimalFarm[]';
  }

  AnimalFarm.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<AnimalFarm> listFromJson(List<dynamic> json) {
    return json == null ? new List<AnimalFarm>() : json.map((value) => new AnimalFarm.fromJson(value)).toList();
  }

  static Map<String, AnimalFarm> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, AnimalFarm>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new AnimalFarm.fromJson(value));
    }
    return map;
  }
}
