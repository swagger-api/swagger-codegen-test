part of swagger.api;

class DogDogIdBody {
  /* Updated name of the dog */
  String name = null;
/* Updated status of the dog */
  String status = null;

  DogDogIdBody();

  @override
  String toString() {
    return 'DogDogIdBody[name=$name, status=$status, ]';
  }

  DogDogIdBody.fromJson(Map<String, dynamic> json) {
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

  static List<DogDogIdBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<DogDogIdBody>() : json.map((value) => new DogDogIdBody.fromJson(value)).toList();
  }

  static Map<String, DogDogIdBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, DogDogIdBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new DogDogIdBody.fromJson(value));
    }
    return map;
  }
}
