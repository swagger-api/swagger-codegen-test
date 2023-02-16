part of swagger.api;

class AllOfSubCategoryPetsItems {
  
  int id = null;

  String name = null;
/* pet status in the store */
  String status = null;
  //enum statusEnum {  available,  pending,  sold,  };

  List<Object> part_ = [];

  AllOfSubCategoryPetsItems();

  @override
  String toString() {
    return 'AllOfSubCategoryPetsItems[id=$id, name=$name, status=$status, part_=$part_, ]';
  }

  AllOfSubCategoryPetsItems.fromJson(Map<String, dynamic> json) {
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
