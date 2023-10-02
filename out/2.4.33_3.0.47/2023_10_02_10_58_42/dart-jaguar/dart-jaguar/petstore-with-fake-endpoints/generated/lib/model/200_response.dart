import 'package:jaguar_serializer/jaguar_serializer.dart';

part '200_response.jser.dart';

class 200Response {
  
  final int name;
  
  final String class_;
  

  200Response(
    

{
     this.name = null,  
     this.class_ = null 
    
    }
  );

  @override
  String toString() {
    return '200Response[name=$name, class_=$class_, ]';
  }
}

@GenSerializer()
class 200ResponseSerializer extends Serializer<200Response> with _$200ResponseSerializer {

}
