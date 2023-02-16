part of swagger.api;

class Address {
  
  String street = null;

  String city = null;

  String state = null;

  String zip = null;

  Address();

  @override
  String toString() {
    return 'Address[street=$street, city=$city, state=$state, zip=$zip, ]';
  }

  Address.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    street = json['street'];
    city = json['city'];
    state = json['state'];
    zip = json['zip'];
  }

  Map<String, dynamic> toJson() {
    return {
      'street': street,
      'city': city,
      'state': state,
      'zip': zip
     };
  }

  static List<Address> listFromJson(List<dynamic> json) {
    return json == null ? new List<Address>() : json.map((value) => new Address.fromJson(value)).toList();
  }

  static Map<String, Address> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Address>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Address.fromJson(value));
    }
    return map;
  }
}
