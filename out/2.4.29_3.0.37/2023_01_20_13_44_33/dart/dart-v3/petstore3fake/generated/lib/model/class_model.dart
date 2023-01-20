part of swagger.api;

class ClassModel {
  
  String class_ = null;

  ClassModel();

  @override
  String toString() {
    return 'ClassModel[class_=$class_, ]';
  }

  ClassModel.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    class_ = json['_class'];
  }

  Map<String, dynamic> toJson() {
    return {
      '_class': class_
     };
  }

  static List<ClassModel> listFromJson(List<dynamic> json) {
    return json == null ? new List<ClassModel>() : json.map((value) => new ClassModel.fromJson(value)).toList();
  }

  static Map<String, ClassModel> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ClassModel>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ClassModel.fromJson(value));
    }
    return map;
  }
}
