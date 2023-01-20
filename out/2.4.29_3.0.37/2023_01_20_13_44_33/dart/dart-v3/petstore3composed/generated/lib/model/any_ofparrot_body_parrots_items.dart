part of swagger.api;

class AnyOfparrotBodyParrotsItems {
  
  AnyOfparrotBodyParrotsItems();

  @override
  String toString() {
    return 'AnyOfparrotBodyParrotsItems[]';
  }

  AnyOfparrotBodyParrotsItems.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<AnyOfparrotBodyParrotsItems> listFromJson(List<dynamic> json) {
    return json == null ? new List<AnyOfparrotBodyParrotsItems>() : json.map((value) => new AnyOfparrotBodyParrotsItems.fromJson(value)).toList();
  }

  static Map<String, AnyOfparrotBodyParrotsItems> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, AnyOfparrotBodyParrotsItems>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new AnyOfparrotBodyParrotsItems.fromJson(value));
    }
    return map;
  }
}
