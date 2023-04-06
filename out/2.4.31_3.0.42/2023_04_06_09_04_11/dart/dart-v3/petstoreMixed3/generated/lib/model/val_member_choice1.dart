part of swagger.api;

class ValMemberChoice1 {
  /* Business Term: Date Of Birth Definition: The date of birth of the member. Purpose: To be able to uniquely identify a member within a scheme. */
  DateTime valDateOfBirth = null;
/* Business Term: Leaving Date Definition: The date the member left/is due to leave the scheme. Purpose: To identify those members that have left or are due to leave the scheme. To be able to calculate the benefit insured/premium payable in respect of the member/category. */
  DateTime valLeavingDate = null;

  ValMemberChoice1();

  @override
  String toString() {
    return 'ValMemberChoice1[valDateOfBirth=$valDateOfBirth, valLeavingDate=$valLeavingDate, ]';
  }

  ValMemberChoice1.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    valDateOfBirth = new DateTime.fromJson(json['val_date_of_birth']);
    valLeavingDate = new DateTime.fromJson(json['val_leaving_date']);
  }

  Map<String, dynamic> toJson() {
    return {
      'val_date_of_birth': valDateOfBirth,
      'val_leaving_date': valLeavingDate
     };
  }

  static List<ValMemberChoice1> listFromJson(List<dynamic> json) {
    return json == null ? new List<ValMemberChoice1>() : json.map((value) => new ValMemberChoice1.fromJson(value)).toList();
  }

  static Map<String, ValMemberChoice1> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ValMemberChoice1>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ValMemberChoice1.fromJson(value));
    }
    return map;
  }
}
