part of swagger.api;

class Pet {
  
  int id = null;

  String name = null;

  Category category = null;

  List<String> photoUrls = [];

  List<Tag> tags = [];
/* pet status in the store */
  String status = null;
  //enum statusEnum {  available,  pending,  sold,  };

  Pet();

  @override
  String toString() {
    return 'Pet[id=$id, name=$name, category=$category, photoUrls=$photoUrls, tags=$tags, status=$status, ]';
  }

  Pet.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    name = json['name'];
    category = new Category.fromJson(json['category']);
    photoUrls = (json['photoUrls'] as List).map((item) => item as String).toList();
    tags = Tag.listFromJson(json['tags']);
    status = json['status'];
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'name': name,
      'category': category,
      'photoUrls': photoUrls,
      'tags': tags,
      'status': status
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
