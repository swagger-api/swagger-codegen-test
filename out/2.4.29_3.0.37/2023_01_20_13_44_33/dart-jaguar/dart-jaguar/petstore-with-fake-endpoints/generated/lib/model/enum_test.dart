import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:swagger/model/outer_enum.dart';
part 'enum_test.jser.dart';

class EnumTest {
  
  final String enumString;
  //enum enumStringEnum {  UPPER,  lower,  ,  };
  final String enumStringRequired;
  //enum enumStringRequiredEnum {  UPPER,  lower,  ,  };
  final int enumInteger;
  //enum enumIntegerEnum {  1,  -1,  };
  final double enumNumber;
  //enum enumNumberEnum {  1.1,  -1.2,  };
  final OuterEnum outerEnum;
  

  EnumTest(
    

{
     this.enumString = null,  
    
     this.enumStringRequired = null,   this.enumInteger = null,  
     this.enumNumber = null,  
     this.outerEnum = null 
    
    }
  );

  @override
  String toString() {
    return 'EnumTest[enumString=$enumString, enumStringRequired=$enumStringRequired, enumInteger=$enumInteger, enumNumber=$enumNumber, outerEnum=$outerEnum, ]';
  }
}

@GenSerializer()
class EnumTestSerializer extends Serializer<EnumTest> with _$EnumTestSerializer {

}
