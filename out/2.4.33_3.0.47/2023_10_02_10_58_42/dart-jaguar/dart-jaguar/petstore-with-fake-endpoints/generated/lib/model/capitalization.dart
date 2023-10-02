import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'capitalization.jser.dart';

class Capitalization {
  
  final String smallCamel;
  
  final String capitalCamel;
  
  final String smallSnake;
  
  final String capitalSnake;
  
  final String sCAETHFlowPoints;
   /* Name of the pet  */
  final String ATT_NAME;
  

  Capitalization(
    

{
     this.smallCamel = null,  
     this.capitalCamel = null,  
     this.smallSnake = null,  
     this.capitalSnake = null,  
     this.sCAETHFlowPoints = null,  
     this.ATT_NAME = null 
    
    }
  );

  @override
  String toString() {
    return 'Capitalization[smallCamel=$smallCamel, capitalCamel=$capitalCamel, smallSnake=$smallSnake, capitalSnake=$capitalSnake, sCAETHFlowPoints=$sCAETHFlowPoints, ATT_NAME=$ATT_NAME, ]';
  }
}

@GenSerializer()
class CapitalizationSerializer extends Serializer<Capitalization> with _$CapitalizationSerializer {

}
