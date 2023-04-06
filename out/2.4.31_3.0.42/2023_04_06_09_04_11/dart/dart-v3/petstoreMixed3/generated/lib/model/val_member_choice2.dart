part of swagger.api;

class ValMemberChoice2 {
  /* Business Term: Leaving Date Definition: The date the member left/is due to leave the scheme. Purpose: To identify those members that have left or are due to leave the scheme. To be able to calculate the benefit insured/premium payable in respect of the member/category. */
  DateTime valLeavingDate = null;

  ValMemberChoice2();

  @override
  String toString() {
    return 'ValMemberChoice2[valLeavingDate=$valLeavingDate, ]';
  }

  ValMemberChoice2.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    valLeavingDate = new DateTime.fromJson(json['val_leaving_date']);
  }

  Map<String, dynamic> toJson() {
    return {
      'val_leaving_date': valLeavingDate
     };
  }

  static List<ValMemberChoice2> listFromJson(List<dynamic> json) {
    return json == null ? new List<ValMemberChoice2>() : json.map((value) => new ValMemberChoice2.fromJson(value)).toList();
  }

  static Map<String, ValMemberChoice2> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ValMemberChoice2>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ValMemberChoice2.fromJson(value));
    }
    return map;
  }
}
