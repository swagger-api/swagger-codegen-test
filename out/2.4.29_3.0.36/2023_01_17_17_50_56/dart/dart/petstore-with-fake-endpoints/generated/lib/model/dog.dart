part of swagger.api;

class Dog {
  
  String className = null;
  

  String color = null;
  

  String breed = null;
  
  Dog();

  @override
  String toString() {
    return 'Dog[className=$className, color=$color, breed=$breed, ]';
  }

  Dog.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    className =
        json['className']
    ;
    color =
        json['color']
    ;
    breed =
        json['breed']
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'className': className,
      'color': color,
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

