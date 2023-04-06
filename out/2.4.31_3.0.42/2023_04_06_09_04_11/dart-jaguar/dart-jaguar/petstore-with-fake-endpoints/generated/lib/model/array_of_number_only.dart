import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'array_of_number_only.jser.dart';

class ArrayOfNumberOnly {
  
  final List<num> arrayNumber;
  

  ArrayOfNumberOnly(
    

{
     this.arrayNumber = const [] 
    
    }
  );

  @override
  String toString() {
    return 'ArrayOfNumberOnly[arrayNumber=$arrayNumber, ]';
  }
}

@GenSerializer()
class ArrayOfNumberOnlySerializer extends Serializer<ArrayOfNumberOnly> with _$ArrayOfNumberOnlySerializer {

}
