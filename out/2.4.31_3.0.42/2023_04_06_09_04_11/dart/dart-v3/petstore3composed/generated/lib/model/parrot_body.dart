part of swagger.api;

class ParrotBody {
  
  List<AnyOfparrotBodyParrotsItems> parrots = [];

  ParrotBody();

  @override
  String toString() {
    return 'ParrotBody[parrots=$parrots, ]';
  }

  ParrotBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    parrots = Object.listFromJson(json['parrots']);
  }

  Map<String, dynamic> toJson() {
    return {
      'parrots': parrots
     };
  }

  static List<ParrotBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<ParrotBody>() : json.map((value) => new ParrotBody.fromJson(value)).toList();
  }

  static Map<String, ParrotBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ParrotBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ParrotBody.fromJson(value));
    }
    return map;
  }
}
