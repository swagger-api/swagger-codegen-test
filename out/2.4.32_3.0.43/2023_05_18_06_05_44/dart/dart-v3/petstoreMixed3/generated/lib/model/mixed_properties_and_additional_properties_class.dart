part of swagger.api;

class MixedPropertiesAndAdditionalPropertiesClass {
  
  String uuid = null;

  DateTime dateTime = null;

  Map<String, Animal> map = {};

  MixedPropertiesAndAdditionalPropertiesClass();

  @override
  String toString() {
    return 'MixedPropertiesAndAdditionalPropertiesClass[uuid=$uuid, dateTime=$dateTime, map=$map, ]';
  }

  MixedPropertiesAndAdditionalPropertiesClass.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    uuid = json['uuid'];
    dateTime = json['dateTime'] == null ? null : DateTime.parse(json['dateTime']);
    map = Animal.mapFromJson(json['map']);
  }

  Map<String, dynamic> toJson() {
    return {
      'uuid': uuid,
      'dateTime': dateTime == null ? '' : dateTime.toUtc().toIso8601String(),
      'map': map
     };
  }

  static List<MixedPropertiesAndAdditionalPropertiesClass> listFromJson(List<dynamic> json) {
    return json == null ? new List<MixedPropertiesAndAdditionalPropertiesClass>() : json.map((value) => new MixedPropertiesAndAdditionalPropertiesClass.fromJson(value)).toList();
  }

  static Map<String, MixedPropertiesAndAdditionalPropertiesClass> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MixedPropertiesAndAdditionalPropertiesClass>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MixedPropertiesAndAdditionalPropertiesClass.fromJson(value));
    }
    return map;
  }
}
