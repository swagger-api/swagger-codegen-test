import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'list.jser.dart';

class List {
  
  final String n123List;
  

  List(
    

{
     this.n123List = null 
    
    }
  );

  @override
  String toString() {
    return 'List[n123List=$n123List, ]';
  }
}

@GenSerializer()
class ListSerializer extends Serializer<List> with _$ListSerializer {

}
