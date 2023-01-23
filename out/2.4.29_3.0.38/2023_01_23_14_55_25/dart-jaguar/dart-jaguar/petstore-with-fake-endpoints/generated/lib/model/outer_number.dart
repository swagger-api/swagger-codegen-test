import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'outer_number.jser.dart';

class OuterNumber {
  

  OuterNumber(
    


  );

  @override
  String toString() {
    return 'OuterNumber[]';
  }
}

@GenSerializer()
class OuterNumberSerializer extends Serializer<OuterNumber> with _$OuterNumberSerializer {

}
