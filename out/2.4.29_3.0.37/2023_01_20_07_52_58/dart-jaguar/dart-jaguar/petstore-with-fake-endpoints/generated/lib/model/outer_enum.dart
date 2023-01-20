import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'outer_enum.jser.dart';

class OuterEnum {
  /// The underlying value of this enum member.
  final String value;

  const OuterEnum._internal(this.value);

  static const OuterEnum placed_ = const OuterEnum._internal("placed");
  static const OuterEnum approved_ = const OuterEnum._internal("approved");
  static const OuterEnum delivered_ = const OuterEnum._internal("delivered");
}

class OuterEnumTypeTransformer {

  dynamic encode(OuterEnum data) {
    return data.value;
  }

  OuterEnum decode(dynamic data) {
    switch (data) {
      case "placed": return OuterEnum.placed_;
      case "approved": return OuterEnum.approved_;
      case "delivered": return OuterEnum.delivered_;
      default: throw('Unknown enum value to decode: $data');
    }
  }
}

