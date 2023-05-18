import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'client.jser.dart';

class Client {
  
  final String client;
  

  Client(
    

{
     this.client = null 
    
    }
  );

  @override
  String toString() {
    return 'Client[client=$client, ]';
  }
}

@GenSerializer()
class ClientSerializer extends Serializer<Client> with _$ClientSerializer {

}
