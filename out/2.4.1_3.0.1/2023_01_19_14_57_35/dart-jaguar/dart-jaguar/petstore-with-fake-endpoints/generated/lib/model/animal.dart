import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'animal.jser.dart';

class Animal {
  
  final String className;
  
  final String color;
  

  Animal(
    

{
    
     this.className = null,   this.color = null 
    
    }
  );

  @override
  String toString() {
    return 'Animal[className=$className, color=$color, ]';
  }
}

@GenSerializer()
class AnimalSerializer extends Serializer<Animal> with _$AnimalSerializer {

}
