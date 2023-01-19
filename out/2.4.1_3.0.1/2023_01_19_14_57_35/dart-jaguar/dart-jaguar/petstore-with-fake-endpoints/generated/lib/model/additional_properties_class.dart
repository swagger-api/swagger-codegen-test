import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'additional_properties_class.jser.dart';

class AdditionalPropertiesClass {
  
  final Map<String, String> mapProperty;
  
  final Map<String, Map<String, String>> mapOfMapProperty;
  

  AdditionalPropertiesClass(
    

{
     this.mapProperty = const {},  
     this.mapOfMapProperty = const {} 
    
    }
  );

  @override
  String toString() {
    return 'AdditionalPropertiesClass[mapProperty=$mapProperty, mapOfMapProperty=$mapOfMapProperty, ]';
  }
}

@GenSerializer()
class AdditionalPropertiesClassSerializer extends Serializer<AdditionalPropertiesClass> with _$AdditionalPropertiesClassSerializer {

}
