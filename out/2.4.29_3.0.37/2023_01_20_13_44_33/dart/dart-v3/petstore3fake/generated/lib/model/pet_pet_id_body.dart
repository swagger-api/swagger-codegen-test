part of swagger.api;

class PetPetIdBody {
  /* Updated name of the pet */
  String name = null;
/* Updated status of the pet */
  String status = null;

  PetPetIdBody();

  @override
  String toString() {
    return 'PetPetIdBody[name=$name, status=$status, ]';
  }

  PetPetIdBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    status = json['status'];
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'status': status
     };
  }

  static List<PetPetIdBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<PetPetIdBody>() : json.map((value) => new PetPetIdBody.fromJson(value)).toList();
  }

  static Map<String, PetPetIdBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, PetPetIdBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new PetPetIdBody.fromJson(value));
    }
    return map;
  }
}
