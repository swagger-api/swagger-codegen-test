part of swagger.api;

class List {
  
  String n123List = null;

  List();

  @override
  String toString() {
    return 'List[n123List=$n123List, ]';
  }

  List.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    n123List = json['123-list'];
  }

  Map<String, dynamic> toJson() {
    return {
      '123-list': n123List
     };
  }

  static List<List> listFromJson(List<dynamic> json) {
    return json == null ? new List<List>() : json.map((value) => new List.fromJson(value)).toList();
  }

  static Map<String, List> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, List>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new List.fromJson(value));
    }
    return map;
  }
}
