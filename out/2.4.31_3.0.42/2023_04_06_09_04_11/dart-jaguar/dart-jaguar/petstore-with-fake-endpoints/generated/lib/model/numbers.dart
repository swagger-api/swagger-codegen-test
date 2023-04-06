import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'numbers.jser.dart';

class Numbers {
  /// The underlying value of this enum member.
  final num value;

  const Numbers._internal(this.value);

  /// some number
  static const Numbers 7_ = const Numbers._internal("7");
  /// some number
  static const Numbers 8_ = const Numbers._internal("8");
  /// some number
  static const Numbers 9_ = const Numbers._internal("9");
  /// some number
  static const Numbers 10_ = const Numbers._internal("10");
}

class NumbersTypeTransformer {

  dynamic encode(Numbers data) {
    return data.value;
  }

  Numbers decode(dynamic data) {
    switch (data) {
      case "7": return Numbers.7_;
      case "8": return Numbers.8_;
      case "9": return Numbers.9_;
      case "10": return Numbers.10_;
      default: throw('Unknown enum value to decode: $data');
    }
  }
}

