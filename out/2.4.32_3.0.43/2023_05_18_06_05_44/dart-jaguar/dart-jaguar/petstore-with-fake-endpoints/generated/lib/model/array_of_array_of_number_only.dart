import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'array_of_array_of_number_only.jser.dart';

class ArrayOfArrayOfNumberOnly {
  
  final List<List<num>> arrayArrayNumber;
  

  ArrayOfArrayOfNumberOnly(
    

{
     this.arrayArrayNumber = const [] 
    
    }
  );

  @override
  String toString() {
    return 'ArrayOfArrayOfNumberOnly[arrayArrayNumber=$arrayArrayNumber, ]';
  }
}

@GenSerializer()
class ArrayOfArrayOfNumberOnlySerializer extends Serializer<ArrayOfArrayOfNumberOnly> with _$ArrayOfArrayOfNumberOnlySerializer {

}
