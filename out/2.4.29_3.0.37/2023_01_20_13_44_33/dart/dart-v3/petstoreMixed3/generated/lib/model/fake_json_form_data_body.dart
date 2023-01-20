part of swagger.api;

class FakeJsonFormDataBody {
  /* field1 */
  String param = null;
/* field2 */
  String param2 = null;

  FakeJsonFormDataBody();

  @override
  String toString() {
    return 'FakeJsonFormDataBody[param=$param, param2=$param2, ]';
  }

  FakeJsonFormDataBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    param = json['param'];
    param2 = json['param2'];
  }

  Map<String, dynamic> toJson() {
    return {
      'param': param,
      'param2': param2
     };
  }

  static List<FakeJsonFormDataBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<FakeJsonFormDataBody>() : json.map((value) => new FakeJsonFormDataBody.fromJson(value)).toList();
  }

  static Map<String, FakeJsonFormDataBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, FakeJsonFormDataBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new FakeJsonFormDataBody.fromJson(value));
    }
    return map;
  }
}
