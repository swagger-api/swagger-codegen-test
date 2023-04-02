import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'ints.jser.dart';

class Ints {
  /// The underlying value of this enum member.
  final int value;

  const Ints._internal(this.value);

  /// True or False indicator
  static const Ints number0_ = const Ints._internal(0);
  /// True or False indicator
  static const Ints number1_ = const Ints._internal(1);
  /// True or False indicator
  static const Ints number2_ = const Ints._internal(2);
  /// True or False indicator
  static const Ints number3_ = const Ints._internal(3);
  /// True or False indicator
  static const Ints number4_ = const Ints._internal(4);
  /// True or False indicator
  static const Ints number5_ = const Ints._internal(5);
  /// True or False indicator
  static const Ints number6_ = const Ints._internal(6);
}

class IntsTypeTransformer {

  dynamic encode(Ints data) {
    return data.value;
  }

  Ints decode(dynamic data) {
    switch (data) {
      case 0: return Ints.number0_;
      case 1: return Ints.number1_;
      case 2: return Ints.number2_;
      case 3: return Ints.number3_;
      case 4: return Ints.number4_;
      case 5: return Ints.number5_;
      case 6: return Ints.number6_;
      default: throw('Unknown enum value to decode: $data');
    }
  }
}

