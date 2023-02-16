part of swagger.api;

class FakeBody1 {
  /* None */
  int integer = null;
   // range from 10 to 100//
/* None */
  int int32 = null;
   // range from 20 to 200//
/* None */
  int int64 = null;
/* None */
  double number = null;
/* None */
  double float = null;
/* None */
  double double_ = null;
/* None */
  String string = null;
/* None */
  String patternWithoutDelimiter = null;
/* None */
  String byte = null;
/* None */
  String binary = null;
/* None */
  DateTime date = null;
/* None */
  DateTime dateTime = null;
/* None */
  String password = null;
/* None */
  String callback = null;

  FakeBody1();

  @override
  String toString() {
    return 'FakeBody1[integer=$integer, int32=$int32, int64=$int64, number=$number, float=$float, double_=$double_, string=$string, patternWithoutDelimiter=$patternWithoutDelimiter, byte=$byte, binary=$binary, date=$date, dateTime=$dateTime, password=$password, callback=$callback, ]';
  }

  FakeBody1.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    integer = json['integer'];
    int32 = json['int32'];
    int64 = json['int64'];
    number = json['number'];
    float = json['float'];
    double_ = json['double'];
    string = json['string'];
    patternWithoutDelimiter = json['pattern_without_delimiter'];
    byte = json['byte'];
    binary = json['binary'];
    date = new DateTime.fromJson(json['date']);
    dateTime = json['dateTime'] == null ? null : DateTime.parse(json['dateTime']);
    password = json['password'];
    callback = json['callback'];
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
      'pattern_without_delimiter': patternWithoutDelimiter,
      'byte': byte,
      'binary': binary,
      'date': date,
      'dateTime': dateTime == null ? '' : dateTime.toUtc().toIso8601String(),
      'password': password,
      'callback': callback
     };
  }

  static List<FakeBody1> listFromJson(List<dynamic> json) {
    return json == null ? new List<FakeBody1>() : json.map((value) => new FakeBody1.fromJson(value)).toList();
  }

  static Map<String, FakeBody1> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, FakeBody1>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new FakeBody1.fromJson(value));
    }
    return map;
  }
}
