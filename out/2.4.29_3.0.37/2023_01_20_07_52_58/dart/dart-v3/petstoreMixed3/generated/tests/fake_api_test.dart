import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for FakeApi
void main() {
  var instance = new FakeApi();

  group('tests for FakeApi', () {
    // Test serialization of outer boolean types
    //
    //Future<OuterBoolean> fakeOuterBooleanSerialize({ bool body }) async
    test('test fakeOuterBooleanSerialize', () async {
      // TODO
    });

    // Test serialization of object with outer number type
    //
    //Future<OuterComposite> fakeOuterCompositeSerialize({ OuterComposite body }) async
    test('test fakeOuterCompositeSerialize', () async {
      // TODO
    });

    // Test serialization of outer number types
    //
    //Future<OuterNumber> fakeOuterNumberSerialize({ double body }) async
    test('test fakeOuterNumberSerialize', () async {
      // TODO
    });

    // Test serialization of outer string types
    //
    //Future<OuterString> fakeOuterStringSerialize({ String body }) async
    test('test fakeOuterStringSerialize', () async {
      // TODO
    });

    // To test \"client\" model
    //
    // To test \"client\" model
    //
    //Future<Client> testClientModel(Client body) async
    test('test testClientModel', () async {
      // TODO
    });

    // Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    //
    // Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    //
    //Future testEndpointParameters(FakeBody body) async
    test('test testEndpointParameters', () async {
      // TODO
    });

    // To test enum parameters
    //
    // To test enum parameters
    //
    //Future testEnumParameters({ List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, int enumQueryInteger }) async
    test('test testEnumParameters', () async {
      // TODO
    });

    // To test enum parameters
    //
    // To test enum parameters
    //
    //Future testEnumRequestBody({ EnumFormBody body }) async
    test('test testEnumRequestBody', () async {
      // TODO
    });

    // test inline additionalProperties
    //
    //Future testInlineAdditionalProperties(Map<String, String> body) async
    test('test testInlineAdditionalProperties', () async {
      // TODO
    });

    // test json serialization of form data
    //
    //Future testJsonFormData(FakeJsonFormDataBody body) async
    test('test testJsonFormData', () async {
      // TODO
    });

  });
}
