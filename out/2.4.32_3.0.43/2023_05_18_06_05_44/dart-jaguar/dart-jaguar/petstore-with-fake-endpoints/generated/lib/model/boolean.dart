import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'boolean.jser.dart';

class Boolean {
  /// The underlying value of this enum member.
  final bool value;

  const Boolean._internal(this.value);

  /// True or False indicator
  static const Boolean true_ = const Boolean._internal("true");
  /// True or False indicator
  static const Boolean false_ = const Boolean._internal("false");
}

class BooleanTypeTransformer {

  dynamic encode(Boolean data) {
    return data.value;
  }

  Boolean decode(dynamic data) {
    switch (data) {
      case "true": return Boolean.true_;
      case "false": return Boolean.false_;
      default: throw('Unknown enum value to decode: $data');
    }
  }
}

