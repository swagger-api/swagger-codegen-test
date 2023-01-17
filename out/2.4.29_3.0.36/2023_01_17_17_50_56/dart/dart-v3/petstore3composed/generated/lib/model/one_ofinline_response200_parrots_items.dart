part of swagger.api;

class OneOfinlineResponse200ParrotsItems {
  
  OneOfinlineResponse200ParrotsItems();

  @override
  String toString() {
    return 'OneOfinlineResponse200ParrotsItems[]';
  }

  OneOfinlineResponse200ParrotsItems.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<OneOfinlineResponse200ParrotsItems> listFromJson(List<dynamic> json) {
    return json == null ? new List<OneOfinlineResponse200ParrotsItems>() : json.map((value) => new OneOfinlineResponse200ParrotsItems.fromJson(value)).toList();
  }

  static Map<String, OneOfinlineResponse200ParrotsItems> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, OneOfinlineResponse200ParrotsItems>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new OneOfinlineResponse200ParrotsItems.fromJson(value));
    }
    return map;
  }
}
