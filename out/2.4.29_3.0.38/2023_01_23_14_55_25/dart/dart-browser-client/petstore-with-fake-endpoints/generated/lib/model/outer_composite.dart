part of swagger.api;

class OuterComposite {
  
  OuterNumber myNumber = null;
  

  OuterString myString = null;
  

  OuterBoolean myBoolean = null;
  
  OuterComposite();

  @override
  String toString() {
    return 'OuterComposite[myNumber=$myNumber, myString=$myString, myBoolean=$myBoolean, ]';
  }

  OuterComposite.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    myNumber =
      
      
      new OuterNumber.fromJson(json['my_number'])
;
    myString =
      
      
      new OuterString.fromJson(json['my_string'])
;
    myBoolean =
      
      
      new OuterBoolean.fromJson(json['my_boolean'])
;
  }

  Map<String, dynamic> toJson() {
    return {
      'my_number': myNumber,
      'my_string': myString,
      'my_boolean': myBoolean
     };
  }

  static List<OuterComposite> listFromJson(List<dynamic> json) {
    return json == null ? new List<OuterComposite>() : json.map((value) => new OuterComposite.fromJson(value)).toList();
  }

  static Map<String, OuterComposite> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, OuterComposite>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new OuterComposite.fromJson(value));
    }
    return map;
  }
}

