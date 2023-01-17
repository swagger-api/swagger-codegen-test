import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'map_test.jser.dart';

class MapTest {
  
  final Map<String, Map<String, String>> mapMapOfString;
  
  final Map<String, String> mapOfEnumString;
  //enum mapOfEnumStringEnum {  UPPER,  lower,  };

  MapTest(
    

{
     this.mapMapOfString = const {},  
     this.mapOfEnumString = const {} 
    
    }
  );

  @override
  String toString() {
    return 'MapTest[mapMapOfString=$mapMapOfString, mapOfEnumString=$mapOfEnumString, ]';
  }
}

@GenSerializer()
class MapTestSerializer extends Serializer<MapTest> with _$MapTestSerializer {

}
