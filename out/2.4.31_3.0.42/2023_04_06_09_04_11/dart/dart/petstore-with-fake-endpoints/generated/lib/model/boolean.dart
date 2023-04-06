part of swagger.api;

class Boolean {
  /// The underlying value of this enum member.
  bool value;

  Boolean._internal(this.value);

  /// True or False indicator
  static Boolean true_ = Boolean._internal("true");
  /// True or False indicator
  static Boolean false_ = Boolean._internal("false");

  Boolean.fromJson(dynamic data) {
    switch (data) {
          case "true": value = data; break;
          case "false": value = data; break;
    default: throw('Unknown enum value to decode: $data');
    }
  }

  static dynamic encode(Boolean data) {
    return data.value;
  }
}

