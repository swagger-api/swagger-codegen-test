import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'outer_boolean.jser.dart';

class OuterBoolean {
  

  OuterBoolean(
    


  );

  @override
  String toString() {
    return 'OuterBoolean[]';
  }
}

@GenSerializer()
class OuterBooleanSerializer extends Serializer<OuterBoolean> with _$OuterBooleanSerializer {

}
