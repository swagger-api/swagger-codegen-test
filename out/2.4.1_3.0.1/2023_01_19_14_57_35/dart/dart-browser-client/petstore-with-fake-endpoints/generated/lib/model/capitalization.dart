part of swagger.api;

class Capitalization {
  
  String smallCamel = null;
  

  String capitalCamel = null;
  

  String smallSnake = null;
  

  String capitalSnake = null;
  

  String sCAETHFlowPoints = null;
  
/* Name of the pet  */
  String ATT_NAME = null;
  
  Capitalization();

  @override
  String toString() {
    return 'Capitalization[smallCamel=$smallCamel, capitalCamel=$capitalCamel, smallSnake=$smallSnake, capitalSnake=$capitalSnake, sCAETHFlowPoints=$sCAETHFlowPoints, ATT_NAME=$ATT_NAME, ]';
  }

  Capitalization.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    smallCamel =
        json['smallCamel']
    ;
    capitalCamel =
        json['capitalCamel']
    ;
    smallSnake =
        json['smallSnake']
    ;
    capitalSnake =
        json['capitalSnake']
    ;
    sCAETHFlowPoints =
        json['sCAETHFlowPoints']
    ;
    ATT_NAME =
        json['ATT_NAME']
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'smallCamel': smallCamel,
      'capitalCamel': capitalCamel,
      'smallSnake': smallSnake,
      'capitalSnake': capitalSnake,
      'sCAETHFlowPoints': sCAETHFlowPoints,
      'ATT_NAME': ATT_NAME
     };
  }

  static List<Capitalization> listFromJson(List<dynamic> json) {
    return json == null ? new List<Capitalization>() : json.map((value) => new Capitalization.fromJson(value)).toList();
  }

  static Map<String, Capitalization> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Capitalization>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Capitalization.fromJson(value));
    }
    return map;
  }
}

