part of swagger.api;

class Cat {
  
  int id = null;

  String name = null;
/* pet status in the store */
  String status = null;
  //enum statusEnum {  available,  pending,  sold,  };

  List<Object> part_ = [];

  bool hunts = null;

  int age = null;

  Cat();

  @override
  String toString() {
    return 'Cat[id=$id, name=$name, status=$status, part_=$part_, hunts=$hunts, age=$age, ]';
  }

  Cat.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    name = json['name'];
    status = json['status'];
    part_ = Object.listFromJson(json['part']);
    hunts = json['hunts'];
    age = json['age'];
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'name': name,
      'status': status,
      'part': part_,
      'hunts': hunts,
      'age': age
     };
  }

  static List<Cat> listFromJson(List<dynamic> json) {
    return json == null ? new List<Cat>() : json.map((value) => new Cat.fromJson(value)).toList();
  }

  static Map<String, Cat> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Cat>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Cat.fromJson(value));
    }
    return map;
  }
}
