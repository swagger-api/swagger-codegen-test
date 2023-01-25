part of swagger.api;

class Customer {
  
  int id = null;

  String username = null;

  List<Address> address = [];

  Customer();

  @override
  String toString() {
    return 'Customer[id=$id, username=$username, address=$address, ]';
  }

  Customer.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    username = json['username'];
    address = Address.listFromJson(json['address']);
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'username': username,
      'address': address
     };
  }

  static List<Customer> listFromJson(List<dynamic> json) {
    return json == null ? new List<Customer>() : json.map((value) => new Customer.fromJson(value)).toList();
  }

  static Map<String, Customer> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Customer>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Customer.fromJson(value));
    }
    return map;
  }
}
