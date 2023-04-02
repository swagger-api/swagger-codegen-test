part of swagger.api;

class OneOfAllPetsResponseItems {
  
  OneOfAllPetsResponseItems();

  @override
  String toString() {
    return 'OneOfAllPetsResponseItems[]';
  }

  OneOfAllPetsResponseItems.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<OneOfAllPetsResponseItems> listFromJson(List<dynamic> json) {
    return json == null ? new List<OneOfAllPetsResponseItems>() : json.map((value) => new OneOfAllPetsResponseItems.fromJson(value)).toList();
  }

  static Map<String, OneOfAllPetsResponseItems> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, OneOfAllPetsResponseItems>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new OneOfAllPetsResponseItems.fromJson(value));
    }
    return map;
  }
}
