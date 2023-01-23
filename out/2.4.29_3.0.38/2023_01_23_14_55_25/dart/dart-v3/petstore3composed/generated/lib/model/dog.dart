part of swagger.api;

class Dog {
  
  int id = null;

  String name = null;
/* pet status in the store */
  String status = null;
  //enum statusEnum {  available,  pending,  sold,  };

  List<Object> part_ = [];

  bool bark = null;

  String breed = null;
  //enum breedEnum {  Dingo,  Husky,  Retriever,  Shepherd,  };

  Dog();

  @override
  String toString() {
    return 'Dog[id=$id, name=$name, status=$status, part_=$part_, bark=$bark, breed=$breed, ]';
  }

  Dog.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    name = json['name'];
    status = json['status'];
    part_ = Object.listFromJson(json['part']);
    bark = json['bark'];
    breed = json['breed'];
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'name': name,
      'status': status,
      'part': part_,
      'bark': bark,
      'breed': breed
     };
  }

  static List<Dog> listFromJson(List<dynamic> json) {
    return json == null ? new List<Dog>() : json.map((value) => new Dog.fromJson(value)).toList();
  }

  static Map<String, Dog> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Dog>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Dog.fromJson(value));
    }
    return map;
  }
}
