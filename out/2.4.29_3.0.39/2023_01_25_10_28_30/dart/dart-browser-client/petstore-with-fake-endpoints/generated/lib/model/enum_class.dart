part of swagger.api;

class EnumClass {
  /// The underlying value of this enum member.
  String value;

  EnumClass._internal(this.value);

  static EnumClass abc_ = EnumClass._internal("_abc");
  static EnumClass efg_ = EnumClass._internal("-efg");
  static EnumClass xyz__ = EnumClass._internal("(xyz)");

  EnumClass.fromJson(dynamic data) {
    switch (data) {
          case "_abc": value = data; break;
          case "-efg": value = data; break;
          case "(xyz)": value = data; break;
    default: throw('Unknown enum value to decode: $data');
    }
  }

  static dynamic encode(EnumClass data) {
    return data.value;
  }
}

