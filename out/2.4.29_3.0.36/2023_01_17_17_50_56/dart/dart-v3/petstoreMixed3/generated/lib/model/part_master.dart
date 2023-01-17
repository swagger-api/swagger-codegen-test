part of swagger.api;

class PartMaster {
  
  OneOfPartMasterDestination destination = null;

  OneOfPartMasterOrigin origin = null;

  PartMaster();

  @override
  String toString() {
    return 'PartMaster[destination=$destination, origin=$origin, ]';
  }

  PartMaster.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    destination = new OneOfPartMasterDestination.fromJson(json['destination']);
    origin = new OneOfPartMasterOrigin.fromJson(json['origin']);
  }

  Map<String, dynamic> toJson() {
    return {
      'destination': destination,
      'origin': origin
     };
  }

  static List<PartMaster> listFromJson(List<dynamic> json) {
    return json == null ? new List<PartMaster>() : json.map((value) => new PartMaster.fromJson(value)).toList();
  }

  static Map<String, PartMaster> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, PartMaster>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new PartMaster.fromJson(value));
    }
    return map;
  }
}
