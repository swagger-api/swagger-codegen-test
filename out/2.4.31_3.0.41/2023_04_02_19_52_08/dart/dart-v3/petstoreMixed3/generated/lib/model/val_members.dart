part of swagger.api;

class ValMembers {
  /* Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due. */
  List<OneOfvalMembersValMemberItems> valMember = [];

  ValMembers();

  @override
  String toString() {
    return 'ValMembers[valMember=$valMember, ]';
  }

  ValMembers.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    valMember = Object.listFromJson(json['val_member']);
  }

  Map<String, dynamic> toJson() {
    return {
      'val_member': valMember
     };
  }

  static List<ValMembers> listFromJson(List<dynamic> json) {
    return json == null ? new List<ValMembers>() : json.map((value) => new ValMembers.fromJson(value)).toList();
  }

  static Map<String, ValMembers> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ValMembers>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ValMembers.fromJson(value));
    }
    return map;
  }
}
