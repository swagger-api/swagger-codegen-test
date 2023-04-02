part of swagger.api;

class AllOfSubCategoryPetsItems {
  
  int id = null;

  Category category = null;

  String name = null;

  List<String> photoUrls = [];

  List<Tag> tags = [];
/* pet status in the store */
  String status = null;
  //enum statusEnum {  available,  pending,  sold,  };

  AllOfSubCategoryPetsItems();

  @override
  String toString() {
    return 'AllOfSubCategoryPetsItems[id=$id, category=$category, name=$name, photoUrls=$photoUrls, tags=$tags, status=$status, ]';
  }

  AllOfSubCategoryPetsItems.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    category = new Category.fromJson(json['category']);
    name = json['name'];
    photoUrls = (json['photoUrls'] as List).map((item) => item as String).toList();
    tags = Tag.listFromJson(json['tags']);
    status = json['status'];
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'category': category,
      'name': name,
      'photoUrls': photoUrls,
      'tags': tags,
      'status': status
     };
  }

  static List<AllOfSubCategoryPetsItems> listFromJson(List<dynamic> json) {
    return json == null ? new List<AllOfSubCategoryPetsItems>() : json.map((value) => new AllOfSubCategoryPetsItems.fromJson(value)).toList();
  }

  static Map<String, AllOfSubCategoryPetsItems> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, AllOfSubCategoryPetsItems>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new AllOfSubCategoryPetsItems.fromJson(value));
    }
    return map;
  }
}
