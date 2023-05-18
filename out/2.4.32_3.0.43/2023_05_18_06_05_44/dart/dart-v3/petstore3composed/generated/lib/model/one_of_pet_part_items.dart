part of swagger.api;

class OneOfPetPartItems {
  
  OneOfPetPartItems();

  @override
  String toString() {
    return 'OneOfPetPartItems[]';
  }

  OneOfPetPartItems.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<OneOfPetPartItems> listFromJson(List<dynamic> json) {
    return json == null ? new List<OneOfPetPartItems>() : json.map((value) => new OneOfPetPartItems.fromJson(value)).toList();
  }

  static Map<String, OneOfPetPartItems> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, OneOfPetPartItems>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new OneOfPetPartItems.fromJson(value));
    }
    return map;
  }
}
