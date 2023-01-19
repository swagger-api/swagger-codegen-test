import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:swagger/model/byte_array.dart';
part 'format_test.jser.dart';

class FormatTest {
  
  final int integer;
   // range from 10 to 100//
  final int int32;
   // range from 20 to 200//
  final int int64;
  
  final num number;
   // range from 32.1 to 543.2//
  final double float;
   // range from 54.3 to 987.6//
  final double double;
   // range from 67.8 to 123.4//
  final String string;
  
  final ByteArray byte;
  
  final String binary;
  
  final DateTime date;
  
  final DateTime dateTime;
  
  final String uuid;
  
  final String password;
  

  FormatTest(
    

{
     this.integer = null,  
     this.int32 = null,  
     this.int64 = null,  
    
     this.number = null,   this.float = null,  
     this.double = null,  
     this.string = null,  
    
     this.byte = null,   this.binary = null,  
    
     this.date = null,   this.dateTime = null,  
     this.uuid = null,  
    
     this.password = null 
    }
  );

  @override
  String toString() {
    return 'FormatTest[integer=$integer, int32=$int32, int64=$int64, number=$number, float=$float, double=$double, string=$string, byte=$byte, binary=$binary, date=$date, dateTime=$dateTime, uuid=$uuid, password=$password, ]';
  }
}

@GenSerializer()
class FormatTestSerializer extends Serializer<FormatTest> with _$FormatTestSerializer {

}
