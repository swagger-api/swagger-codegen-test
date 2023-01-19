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
      
      
      new OuterNumber.fromJson(json['myNumber'])
;
    myString =
      
      
      new OuterString.fromJson(json['myString'])
;
    myBoolean =
      
      
      new OuterBoolean.fromJson(json['myBoolean'])
;
  }

  Map<String, dynamic> toJson() {
    return {
      'myNumber': myNumber,
      'myString': myString,
      'myBoolean': myBoolean
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

