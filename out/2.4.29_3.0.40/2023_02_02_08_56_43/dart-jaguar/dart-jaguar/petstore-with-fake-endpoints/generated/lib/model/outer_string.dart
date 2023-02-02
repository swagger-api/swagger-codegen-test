import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'outer_string.jser.dart';

class OuterString {
  

  OuterString(
    


  );

  @override
  String toString() {
    return 'OuterString[]';
  }
}

@GenSerializer()
class OuterStringSerializer extends Serializer<OuterString> with _$OuterStringSerializer {

}
