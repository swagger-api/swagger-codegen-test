import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'read_only_first.jser.dart';

class ReadOnlyFirst {
  
  final String bar;
  
  final String baz;
  

  ReadOnlyFirst(
    

{
     this.bar = null,  
     this.baz = null 
    
    }
  );

  @override
  String toString() {
    return 'ReadOnlyFirst[bar=$bar, baz=$baz, ]';
  }
}

@GenSerializer()
class ReadOnlyFirstSerializer extends Serializer<ReadOnlyFirst> with _$ReadOnlyFirstSerializer {

}
