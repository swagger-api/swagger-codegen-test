import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'model_return.jser.dart';

class ModelReturn {
  
  final int return_;
  

  ModelReturn(
    

{
     this.return_ = null 
    
    }
  );

  @override
  String toString() {
    return 'ModelReturn[return_=$return_, ]';
  }
}

@GenSerializer()
class ModelReturnSerializer extends Serializer<ModelReturn> with _$ModelReturnSerializer {

}
