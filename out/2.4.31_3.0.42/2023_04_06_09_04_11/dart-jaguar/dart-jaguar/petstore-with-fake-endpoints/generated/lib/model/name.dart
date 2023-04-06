import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'name.jser.dart';

class Name {
  
  final int name;
  
  final int snakeCase;
  
  final String property;
  
  final int n123Number;
  

  Name(
    

{
    
     this.name = null,   this.snakeCase = null,  
     this.property = null,  
     this.n123Number = null 
    
    }
  );

  @override
  String toString() {
    return 'Name[name=$name, snakeCase=$snakeCase, property=$property, n123Number=$n123Number, ]';
  }
}

@GenSerializer()
class NameSerializer extends Serializer<Name> with _$NameSerializer {

}
