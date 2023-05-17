part of swagger.api;

class OuterEnum {
  /// The underlying value of this enum member.
  String value;

  OuterEnum._internal(this.value);

  static OuterEnum placed_ = OuterEnum._internal("placed");
  static OuterEnum approved_ = OuterEnum._internal("approved");
  static OuterEnum delivered_ = OuterEnum._internal("delivered");

  OuterEnum.fromJson(dynamic data) {
    switch (data) {
          case "placed": value = data; break;
          case "approved": value = data; break;
          case "delivered": value = data; break;
    default: throw('Unknown enum value to decode: $data');
    }
  }

  static dynamic encode(OuterEnum data) {
    return data.value;
  }
}

