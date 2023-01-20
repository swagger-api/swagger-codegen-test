import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:swagger/model/animal.dart';
part 'cat.jser.dart';

class Cat {
  
  final String className;
  
  final String color;
  
  final bool declawed;
  

  Cat(
    

{
    
     this.className = null,   this.color = null,  
     this.declawed = null 
    
    }
  );

  @override
  String toString() {
    return 'Cat[className=$className, color=$color, declawed=$declawed, ]';
  }
}

@GenSerializer()
class CatSerializer extends Serializer<Cat> with _$CatSerializer {

}
