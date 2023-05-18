part of swagger.api;

class OneOfvalMembersValMemberItems {
  
  OneOfvalMembersValMemberItems();

  @override
  String toString() {
    return 'OneOfvalMembersValMemberItems[]';
  }

  OneOfvalMembersValMemberItems.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<OneOfvalMembersValMemberItems> listFromJson(List<dynamic> json) {
    return json == null ? new List<OneOfvalMembersValMemberItems>() : json.map((value) => new OneOfvalMembersValMemberItems.fromJson(value)).toList();
  }

  static Map<String, OneOfvalMembersValMemberItems> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, OneOfvalMembersValMemberItems>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new OneOfvalMembersValMemberItems.fromJson(value));
    }
    return map;
  }
}
