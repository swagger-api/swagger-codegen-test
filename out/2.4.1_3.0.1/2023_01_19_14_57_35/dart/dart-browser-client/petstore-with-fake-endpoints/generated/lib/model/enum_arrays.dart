part of swagger.api;

class EnumArrays {
  
  String justSymbol = null;
  //enum justSymbolEnum {  &gt;&#x3D;,  $,  };

  List<String> arrayEnum = [];
  //enum arrayEnumEnum {  fish,  crab,  };
  EnumArrays();

  @override
  String toString() {
    return 'EnumArrays[justSymbol=$justSymbol, arrayEnum=$arrayEnum, ]';
  }

  EnumArrays.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    justSymbol =
        json['justSymbol']
    ;
    arrayEnum =
        (json['arrayEnum'] as List).map((item) => item as String).toList()
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'justSymbol': justSymbol,
      'arrayEnum': arrayEnum
     };
  }

  static List<EnumArrays> listFromJson(List<dynamic> json) {
    return json == null ? new List<EnumArrays>() : json.map((value) => new EnumArrays.fromJson(value)).toList();
  }

  static Map<String, EnumArrays> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, EnumArrays>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new EnumArrays.fromJson(value));
    }
    return map;
  }
}

