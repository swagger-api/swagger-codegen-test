import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'enum_class.jser.dart';

class EnumClass {
  /// The underlying value of this enum member.
  final String value;

  const EnumClass._internal(this.value);

  static const EnumClass abc_ = const EnumClass._internal("_abc");
  static const EnumClass efg_ = const EnumClass._internal("-efg");
  static const EnumClass xyz__ = const EnumClass._internal("(xyz)");
}

class EnumClassTypeTransformer {

  dynamic encode(EnumClass data) {
    return data.value;
  }

  EnumClass decode(dynamic data) {
    switch (data) {
      case "_abc": return EnumClass.abc_;
      case "-efg": return EnumClass.efg_;
      case "(xyz)": return EnumClass.xyz__;
      default: throw('Unknown enum value to decode: $data');
    }
  }
}

