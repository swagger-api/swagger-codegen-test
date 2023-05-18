import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:swagger/model/animal.dart';
part 'dog.jser.dart';

class Dog {
  
  final String className;
  
  final String color;
  
  final String breed;
  

  Dog(
    

{
    
     this.className = null,   this.color = null,  
     this.breed = null 
    
    }
  );

  @override
  String toString() {
    return 'Dog[className=$className, color=$color, breed=$breed, ]';
  }
}

@GenSerializer()
class DogSerializer extends Serializer<Dog> with _$DogSerializer {

}
