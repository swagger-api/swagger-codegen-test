import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/client.dart';


part 'another_fake_api.jretro.dart';

@GenApiClient()
class AnotherFakeApi extends _$AnotherFakeApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    AnotherFakeApi({this.base, this.serializers});

    /// To test special tags
    ///
    /// To test special tags
    @PatchReq(path: "/another-fake/dummy")
    Future<Client> testSpecialTags(
        
        @AsJson() Client body
    );


}
