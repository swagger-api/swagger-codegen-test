import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'class_model.jser.dart';

class ClassModel {
  
  final String class_;
  

  ClassModel(
    

{
     this.class_ = null 
    
    }
  );

  @override
  String toString() {
    return 'ClassModel[class_=$class_, ]';
  }
}

@GenSerializer()
class ClassModelSerializer extends Serializer<ClassModel> with _$ClassModelSerializer {

}
