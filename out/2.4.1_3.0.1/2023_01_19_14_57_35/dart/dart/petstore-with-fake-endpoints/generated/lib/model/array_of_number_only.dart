part of swagger.api;

class ArrayOfNumberOnly {
  
  List<num> arrayNumber = [];
  
  ArrayOfNumberOnly();

  @override
  String toString() {
    return 'ArrayOfNumberOnly[arrayNumber=$arrayNumber, ]';
  }

  ArrayOfNumberOnly.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    arrayNumber =
        (json['arrayNumber'] as List).map((item) => item as num).toList()
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'arrayNumber': arrayNumber
     };
  }

  static List<ArrayOfNumberOnly> listFromJson(List<dynamic> json) {
    return json == null ? new List<ArrayOfNumberOnly>() : json.map((value) => new ArrayOfNumberOnly.fromJson(value)).toList();
  }

  static Map<String, ArrayOfNumberOnly> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ArrayOfNumberOnly>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ArrayOfNumberOnly.fromJson(value));
    }
    return map;
  }
}

