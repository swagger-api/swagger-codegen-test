import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:swagger/model/outer_boolean.dart';
import 'package:swagger/model/outer_string.dart';
import 'package:swagger/model/outer_number.dart';
part 'outer_composite.jser.dart';

class OuterComposite {
  
  final OuterNumber myNumber;
  
  final OuterString myString;
  
  final OuterBoolean myBoolean;
  

  OuterComposite(
    

{
     this.myNumber = null,  
     this.myString = null,  
     this.myBoolean = null 
    
    }
  );

  @override
  String toString() {
    return 'OuterComposite[myNumber=$myNumber, myString=$myString, myBoolean=$myBoolean, ]';
  }
}

@GenSerializer()
class OuterCompositeSerializer extends Serializer<OuterComposite> with _$OuterCompositeSerializer {

}
