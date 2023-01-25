import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:swagger/model/animal.dart';
part 'mixed_properties_and_additional_properties_class.jser.dart';

class MixedPropertiesAndAdditionalPropertiesClass {
  
  final String uuid;
  
  final DateTime dateTime;
  
  final Map<String, Animal> map;
  

  MixedPropertiesAndAdditionalPropertiesClass(
    

{
     this.uuid = null,  
     this.dateTime = null,  
     this.map = const {} 
    
    }
  );

  @override
  String toString() {
    return 'MixedPropertiesAndAdditionalPropertiesClass[uuid=$uuid, dateTime=$dateTime, map=$map, ]';
  }
}

@GenSerializer()
class MixedPropertiesAndAdditionalPropertiesClassSerializer extends Serializer<MixedPropertiesAndAdditionalPropertiesClass> with _$MixedPropertiesAndAdditionalPropertiesClassSerializer {

}
