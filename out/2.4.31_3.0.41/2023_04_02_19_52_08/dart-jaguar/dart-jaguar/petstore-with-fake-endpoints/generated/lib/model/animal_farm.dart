import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:swagger/model/animal.dart';
part 'animal_farm.jser.dart';

class AnimalFarm {
  

  AnimalFarm(
    


  );

  @override
  String toString() {
    return 'AnimalFarm[]';
  }
}

@GenSerializer()
class AnimalFarmSerializer extends Serializer<AnimalFarm> with _$AnimalFarmSerializer {

}
