part of swagger.api;

class 200Response {
  
  int name = null;
  

  String class_ = null;
  
  200Response();

  @override
  String toString() {
    return '200Response[name=$name, class_=$class_, ]';
  }

  200Response.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name =
        json['name']
    ;
    class_ =
        json['class_']
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'class_': class_
     };
  }

  static List<200Response> listFromJson(List<dynamic> json) {
    return json == null ? new List<200Response>() : json.map((value) => new 200Response.fromJson(value)).toList();
  }

  static Map<String, 200Response> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, 200Response>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new 200Response.fromJson(value));
    }
    return map;
  }
}

