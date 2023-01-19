part of swagger.api;

class Name {
  
  int name = null;
  

  int snakeCase = null;
  

  String property = null;
  

  int n123Number = null;
  
  Name();

  @override
  String toString() {
    return 'Name[name=$name, snakeCase=$snakeCase, property=$property, n123Number=$n123Number, ]';
  }

  Name.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name =
        json['name']
    ;
    snakeCase =
        json['snakeCase']
    ;
    property =
        json['property']
    ;
    n123Number =
        json['n123Number']
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'snakeCase': snakeCase,
      'property': property,
      'n123Number': n123Number
     };
  }

  static List<Name> listFromJson(List<dynamic> json) {
    return json == null ? new List<Name>() : json.map((value) => new Name.fromJson(value)).toList();
  }

  static Map<String, Name> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Name>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Name.fromJson(value));
    }
    return map;
  }
}

