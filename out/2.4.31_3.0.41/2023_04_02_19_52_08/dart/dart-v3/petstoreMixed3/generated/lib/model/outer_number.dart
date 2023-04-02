part of swagger.api;

class OuterNumber {
  
  OuterNumber();

  @override
  String toString() {
    return 'OuterNumber[]';
  }

  OuterNumber.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<OuterNumber> listFromJson(List<dynamic> json) {
    return json == null ? new List<OuterNumber>() : json.map((value) => new OuterNumber.fromJson(value)).toList();
  }

  static Map<String, OuterNumber> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, OuterNumber>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new OuterNumber.fromJson(value));
    }
    return map;
  }
}
