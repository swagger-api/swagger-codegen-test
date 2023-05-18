part of swagger.api;

class UserWrapper {
  
  Users users = null;

  UserWrapper();

  @override
  String toString() {
    return 'UserWrapper[users=$users, ]';
  }

  UserWrapper.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    users = new Users.fromJson(json['users']);
  }

  Map<String, dynamic> toJson() {
    return {
      'users': users
     };
  }

  static List<UserWrapper> listFromJson(List<dynamic> json) {
    return json == null ? new List<UserWrapper>() : json.map((value) => new UserWrapper.fromJson(value)).toList();
  }

  static Map<String, UserWrapper> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, UserWrapper>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new UserWrapper.fromJson(value));
    }
    return map;
  }
}
