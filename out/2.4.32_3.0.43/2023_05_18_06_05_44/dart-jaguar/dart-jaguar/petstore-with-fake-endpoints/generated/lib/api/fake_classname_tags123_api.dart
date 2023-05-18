import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/client.dart';


part 'fake_classname_tags123_api.jretro.dart';

@GenApiClient()
class FakeClassnameTags123Api extends _$FakeClassnameTags123ApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    FakeClassnameTags123Api({this.base, this.serializers});

    /// To test class name in snake case
    ///
    /// To test class name in snake case
    @PatchReq(path: "/fake_classname_test", metadata: {"auth": [ {"type": "apiKey", "name": "api_key_query", "keyName": "api_key_query", "where": "query" }]})
    Future<Client> testClassname(
        ,
        @AsJson() Client body
    );


}
