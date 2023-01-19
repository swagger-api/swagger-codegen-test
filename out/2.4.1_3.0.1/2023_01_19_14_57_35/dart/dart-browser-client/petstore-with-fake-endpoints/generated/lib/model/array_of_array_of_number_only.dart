part of swagger.api;

class ArrayOfArrayOfNumberOnly {
  
  List<List<num>> arrayArrayNumber = [];
  
  ArrayOfArrayOfNumberOnly();

  @override
  String toString() {
    return 'ArrayOfArrayOfNumberOnly[arrayArrayNumber=$arrayArrayNumber, ]';
  }

  ArrayOfArrayOfNumberOnly.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    arrayArrayNumber =
      List.listFromJson(json['arrayArrayNumber'])
;
  }

  Map<String, dynamic> toJson() {
    return {
      'arrayArrayNumber': arrayArrayNumber
     };
  }

  static List<ArrayOfArrayOfNumberOnly> listFromJson(List<dynamic> json) {
    return json == null ? new List<ArrayOfArrayOfNumberOnly>() : json.map((value) => new ArrayOfArrayOfNumberOnly.fromJson(value)).toList();
  }

  static Map<String, ArrayOfArrayOfNumberOnly> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ArrayOfArrayOfNumberOnly>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ArrayOfArrayOfNumberOnly.fromJson(value));
    }
    return map;
  }
}

