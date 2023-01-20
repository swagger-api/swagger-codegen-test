part of swagger.api;

class ReadOnlyFirst {
  
  String bar = null;

  String baz = null;

  ReadOnlyFirst();

  @override
  String toString() {
    return 'ReadOnlyFirst[bar=$bar, baz=$baz, ]';
  }

  ReadOnlyFirst.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    bar = json['bar'];
    baz = json['baz'];
  }

  Map<String, dynamic> toJson() {
    return {
      'bar': bar,
      'baz': baz
     };
  }

  static List<ReadOnlyFirst> listFromJson(List<dynamic> json) {
    return json == null ? new List<ReadOnlyFirst>() : json.map((value) => new ReadOnlyFirst.fromJson(value)).toList();
  }

  static Map<String, ReadOnlyFirst> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ReadOnlyFirst>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ReadOnlyFirst.fromJson(value));
    }
    return map;
  }
}
