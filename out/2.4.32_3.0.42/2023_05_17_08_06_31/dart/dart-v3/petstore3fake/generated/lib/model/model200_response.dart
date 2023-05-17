part of swagger.api;

class Model200Response {
  
  int name = null;

  String class_ = null;

  Model200Response();

  @override
  String toString() {
    return 'Model200Response[name=$name, class_=$class_, ]';
  }

  Model200Response.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    class_ = json['class'];
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'class': class_
     };
  }

  static List<Model200Response> listFromJson(List<dynamic> json) {
    return json == null ? new List<Model200Response>() : json.map((value) => new Model200Response.fromJson(value)).toList();
  }

  static Map<String, Model200Response> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Model200Response>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Model200Response.fromJson(value));
    }
    return map;
  }
}
