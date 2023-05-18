import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'enum_arrays.jser.dart';

class EnumArrays {
  
  final String justSymbol;
  //enum justSymbolEnum {  &gt;&#x3D;,  $,  };
  final List<String> arrayEnum;
  //enum arrayEnumEnum {  fish,  crab,  };

  EnumArrays(
    

{
     this.justSymbol = null,  
     this.arrayEnum = const [] 
    
    }
  );

  @override
  String toString() {
    return 'EnumArrays[justSymbol=$justSymbol, arrayEnum=$arrayEnum, ]';
  }
}

@GenSerializer()
class EnumArraysSerializer extends Serializer<EnumArrays> with _$EnumArraysSerializer {

}
