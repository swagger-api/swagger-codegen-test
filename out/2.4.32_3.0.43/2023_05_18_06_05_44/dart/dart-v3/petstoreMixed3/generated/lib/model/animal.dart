part of swagger.api;

class Animal {
  
  String className = null;

  String color = "red";

  Animal();

  @override
  String toString() {
    return 'Animal[className=$className, color=$color, ]';
  }

  Animal.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    className = json['className'];
    color = json['color'];
  }

  Map<String, dynamic> toJson() {
    return {
      'className': className,
      'color': color
     };
  }

  static List<Animal> listFromJson(List<dynamic> json) {
    return json == null ? new List<Animal>() : json.map((value) => new Animal.fromJson(value)).toList();
  }

  static Map<String, Animal> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Animal>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Animal.fromJson(value));
    }
    return map;
  }
}
