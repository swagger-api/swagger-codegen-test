part of swagger.api;

class Pet {
  
  int id = null;

  String name = null;
/* pet status in the store */
  String status = null;
  //enum statusEnum {  available,  pending,  sold,  };

  List<OneOfPetPartItems> part_ = [];

  Pet();

  @override
  String toString() {
    return 'Pet[id=$id, name=$name, status=$status, part_=$part_, ]';
  }

  Pet.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    name = json['name'];
    status = json['status'];
    part_ = Object.listFromJson(json['part']);
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'name': name,
      'status': status,
      'part': part_
     };
  }

  static List<Pet> listFromJson(List<dynamic> json) {
    return json == null ? new List<Pet>() : json.map((value) => new Pet.fromJson(value)).toList();
  }

  static Map<String, Pet> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Pet>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Pet.fromJson(value));
    }
    return map;
  }
}
