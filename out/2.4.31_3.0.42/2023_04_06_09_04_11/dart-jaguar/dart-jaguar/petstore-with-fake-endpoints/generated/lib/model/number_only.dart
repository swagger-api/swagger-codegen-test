import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'number_only.jser.dart';

class NumberOnly {
  
  final num justNumber;
  

  NumberOnly(
    

{
     this.justNumber = null 
    
    }
  );

  @override
  String toString() {
    return 'NumberOnly[justNumber=$justNumber, ]';
  }
}

@GenSerializer()
class NumberOnlySerializer extends Serializer<NumberOnly> with _$NumberOnlySerializer {

}
