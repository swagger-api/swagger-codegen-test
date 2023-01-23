part of swagger.api;

class Ints {
  /// The underlying value of this enum member.
  int value;

  Ints._internal(this.value);

  /// True or False indicator
  static Ints number0_ = Ints._internal(0);
  /// True or False indicator
  static Ints number1_ = Ints._internal(1);
  /// True or False indicator
  static Ints number2_ = Ints._internal(2);
  /// True or False indicator
  static Ints number3_ = Ints._internal(3);
  /// True or False indicator
  static Ints number4_ = Ints._internal(4);
  /// True or False indicator
  static Ints number5_ = Ints._internal(5);
  /// True or False indicator
  static Ints number6_ = Ints._internal(6);

  Ints.fromJson(dynamic data) {
    switch (data) {
          case 0: value = data; break;
          case 1: value = data; break;
          case 2: value = data; break;
          case 3: value = data; break;
          case 4: value = data; break;
          case 5: value = data; break;
          case 6: value = data; break;
    default: throw('Unknown enum value to decode: $data');
    }
  }

  static dynamic encode(Ints data) {
    return data.value;
  }
}

