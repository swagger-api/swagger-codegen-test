part of swagger.api;

class FormatTest {
  
  int integer = null;
   // range from 10.0 to 100.0//

  int int32 = null;
   // range from 20.0 to 200.0//

  int int64 = null;

  double number = null;

  double float = null;

  double double_ = null;

  String string = null;

  String byte = null;

  String binary = null;

  DateTime date = null;

  DateTime dateTime = null;

  String uuid = null;

  String password = null;

  FormatTest();

  @override
  String toString() {
    return 'FormatTest[integer=$integer, int32=$int32, int64=$int64, number=$number, float=$float, double_=$double_, string=$string, byte=$byte, binary=$binary, date=$date, dateTime=$dateTime, uuid=$uuid, password=$password, ]';
  }

  FormatTest.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    integer = json['integer'];
    int32 = json['int32'];
    int64 = json['int64'];
    number = json['number'];
    float = json['float'];
    double_ = json['double'];
    string = json['string'];
    byte = json['byte'];
    binary = json['binary'];
    date = new DateTime.fromJson(json['date']);
    dateTime = json['dateTime'] == null ? null : DateTime.parse(json['dateTime']);
    uuid = json['uuid'];
    password = json['password'];
  }

  Map<String, dynamic> toJson() {
    return {
      'integer': integer,
      'int32': int32,
      'int64': int64,
      'number': number,
      'float': float,
      'double': double_,
      'string': string,
      'byte': byte,
      'binary': binary,
      'date': date,
      'dateTime': dateTime == null ? '' : dateTime.toUtc().toIso8601String(),
      'uuid': uuid,
      'password': password
     };
  }

  static List<FormatTest> listFromJson(List<dynamic> json) {
    return json == null ? new List<FormatTest>() : json.map((value) => new FormatTest.fromJson(value)).toList();
  }

  static Map<String, FormatTest> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, FormatTest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new FormatTest.fromJson(value));
    }
    return map;
  }
}
