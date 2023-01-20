import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'has_only_read_only.jser.dart';

class HasOnlyReadOnly {
  
  final String bar;
  
  final String foo;
  

  HasOnlyReadOnly(
    

{
     this.bar = null,  
     this.foo = null 
    
    }
  );

  @override
  String toString() {
    return 'HasOnlyReadOnly[bar=$bar, foo=$foo, ]';
  }
}

@GenSerializer()
class HasOnlyReadOnlySerializer extends Serializer<HasOnlyReadOnly> with _$HasOnlyReadOnlySerializer {

}
