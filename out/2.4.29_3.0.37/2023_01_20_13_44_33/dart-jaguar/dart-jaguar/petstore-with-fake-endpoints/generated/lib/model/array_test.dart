import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:swagger/model/read_only_first.dart';
part 'array_test.jser.dart';

class ArrayTest {
  
  final List<String> arrayOfString;
  
  final List<List<int>> arrayArrayOfInteger;
  
  final List<List<ReadOnlyFirst>> arrayArrayOfModel;
  

  ArrayTest(
    

{
     this.arrayOfString = const [],  
     this.arrayArrayOfInteger = const [],  
     this.arrayArrayOfModel = const [] 
    
    }
  );

  @override
  String toString() {
    return 'ArrayTest[arrayOfString=$arrayOfString, arrayArrayOfInteger=$arrayArrayOfInteger, arrayArrayOfModel=$arrayArrayOfModel, ]';
  }
}

@GenSerializer()
class ArrayTestSerializer extends Serializer<ArrayTest> with _$ArrayTestSerializer {

}
