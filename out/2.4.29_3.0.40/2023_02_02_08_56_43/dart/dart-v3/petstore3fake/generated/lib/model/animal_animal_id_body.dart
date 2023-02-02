part of swagger.api;

class AnimalAnimalIdBody {
  /* Updated name of the animal */
  String name = null;
/* Updated status of the animal */
  String status = null;

  AnimalAnimalIdBody();

  @override
  String toString() {
    return 'AnimalAnimalIdBody[name=$name, status=$status, ]';
  }

  AnimalAnimalIdBody.fromJson(Map<String, dynamic> json) {
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

  static List<AnimalAnimalIdBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<AnimalAnimalIdBody>() : json.map((value) => new AnimalAnimalIdBody.fromJson(value)).toList();
  }

  static Map<String, AnimalAnimalIdBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, AnimalAnimalIdBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new AnimalAnimalIdBody.fromJson(value));
    }
    return map;
  }
}
