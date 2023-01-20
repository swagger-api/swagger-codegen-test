part of swagger.api;

class PartFour {
  
  String otherIdPart = null;

  PartFour();

  @override
  String toString() {
    return 'PartFour[otherIdPart=$otherIdPart, ]';
  }

  PartFour.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    otherIdPart = json['otherIdPart'];
  }

  Map<String, dynamic> toJson() {
    return {
      'otherIdPart': otherIdPart
     };
  }

  static List<PartFour> listFromJson(List<dynamic> json) {
    return json == null ? new List<PartFour>() : json.map((value) => new PartFour.fromJson(value)).toList();
  }

  static Map<String, PartFour> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, PartFour>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new PartFour.fromJson(value));
    }
    return map;
  }
}
