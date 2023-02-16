part of swagger.api;

class Pup {
  
  int id = null;

  Category category2 = null;

  List<AllOfPupPetsItems> pets = [];

  Pup();

  @override
  String toString() {
    return 'Pup[id=$id, category2=$category2, pets=$pets, ]';
  }

  Pup.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    category2 = new Category.fromJson(json['category2']);
    pets = Object.listFromJson(json['pets']);
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'category2': category2,
      'pets': pets
     };
  }

  static List<Pup> listFromJson(List<dynamic> json) {
    return json == null ? new List<Pup>() : json.map((value) => new Pup.fromJson(value)).toList();
  }

  static Map<String, Pup> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Pup>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Pup.fromJson(value));
    }
    return map;
  }
}
