part of swagger.api;

class NumberOnly {
  
  num justNumber = null;
  
  NumberOnly();

  @override
  String toString() {
    return 'NumberOnly[justNumber=$justNumber, ]';
  }

  NumberOnly.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    justNumber =
        json['JustNumber']
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'JustNumber': justNumber
     };
  }

  static List<NumberOnly> listFromJson(List<dynamic> json) {
    return json == null ? new List<NumberOnly>() : json.map((value) => new NumberOnly.fromJson(value)).toList();
  }

  static Map<String, NumberOnly> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, NumberOnly>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new NumberOnly.fromJson(value));
    }
    return map;
  }
}

