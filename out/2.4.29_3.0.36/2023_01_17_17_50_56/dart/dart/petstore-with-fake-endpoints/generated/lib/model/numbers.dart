part of swagger.api;

class Numbers {
  /// The underlying value of this enum member.
  num value;

  Numbers._internal(this.value);

  /// some number
  static Numbers 7_ = Numbers._internal("7");
  /// some number
  static Numbers 8_ = Numbers._internal("8");
  /// some number
  static Numbers 9_ = Numbers._internal("9");
  /// some number
  static Numbers 10_ = Numbers._internal("10");

  Numbers.fromJson(dynamic data) {
    switch (data) {
          case "7": value = data; break;
          case "8": value = data; break;
          case "9": value = data; break;
          case "10": value = data; break;
    default: throw('Unknown enum value to decode: $data');
    }
  }

  static dynamic encode(Numbers data) {
    return data.value;
  }
}

