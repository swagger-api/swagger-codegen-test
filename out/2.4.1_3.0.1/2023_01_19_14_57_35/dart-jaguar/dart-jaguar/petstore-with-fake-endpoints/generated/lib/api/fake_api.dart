import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/client.dart';
import 'package:swagger/model/outer_boolean.dart';
import 'package:swagger/model/outer_string.dart';
import 'package:swagger/model/outer_composite.dart';
import 'package:swagger/model/user.dart';
import 'package:swagger/model/byte_array.dart';
import 'package:swagger/model/outer_number.dart';
import 'package:swagger/model/object.dart';


part 'fake_api.jretro.dart';

@GenApiClient()
class FakeApi extends _$FakeApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    FakeApi({this.base, this.serializers});

    /// 
    ///
    /// Test serialization of outer boolean types
    @PostReq(path: "/fake/outer/boolean")
    Future<OuterBoolean> fakeOuterBooleanSerialize(
        
        @AsJson() OuterBoolean body
    );

    /// 
    ///
    /// Test serialization of object with outer number type
    @PostReq(path: "/fake/outer/composite")
    Future<OuterComposite> fakeOuterCompositeSerialize(
        
        @AsJson() OuterComposite body
    );

    /// 
    ///
    /// Test serialization of outer number types
    @PostReq(path: "/fake/outer/number")
    Future<OuterNumber> fakeOuterNumberSerialize(
        
        @AsJson() OuterNumber body
    );

    /// 
    ///
    /// Test serialization of outer string types
    @PostReq(path: "/fake/outer/string")
    Future<OuterString> fakeOuterStringSerialize(
        
        @AsJson() OuterString body
    );

    /// 
    ///
    /// 
    @PutReq(path: "/fake/body-with-query-params")
    Future<void> testBodyWithQueryParams(
        
        @QueryParam("query") String query
        ,
        @AsJson() User body, 
    );

    /// To test \&quot;client\&quot; model
    ///
    /// To test \&quot;client\&quot; model
    @PatchReq(path: "/fake")
    Future<Client> testClientModel(
        
        @AsJson() Client body
    );

    /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    ///
    /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    @PostReq(path: "/fake", metadata: {"auth": [ {"type": "basic", "name": "http_basic_test" }]})
    Future<void> testEndpointParameters(
        
        int integer, 
        
        int int32, 
        
        int int64, 
        
        num number, 
        
        double float, 
        
        double double, 
        
        String string, 
        
        String patternWithoutDelimiter, 
        
        ByteArray byte, 
        
        String binary, 
        
        DateTime date, 
        
        DateTime dateTime, 
        
        String password, 
        
        String callback
    );

    /// To test enum parameters
    ///
    /// To test enum parameters
    @GetReq(path: "/fake")
    Future<void> testEnumParameters(
        
        @Header("enum_header_string_array") List<String> enumHeaderStringArray, 
        
        @Header("enum_header_string") String enumHeaderString
        ,
        @QueryParam("enum_query_string_array") List<String> enumQueryStringArray, 
        
        @QueryParam("enum_query_string") String enumQueryString, 
        
        @QueryParam("enum_query_integer") int enumQueryInteger
        ,
        List<String> enumFormStringArray, 
        
        String enumFormString, 
        
        double enumQueryDouble
    );

    /// test inline additionalProperties
    ///
    /// 
    @PostReq(path: "/fake/inline-additionalProperties")
    Future<void> testInlineAdditionalProperties(
        
        @AsJson() Object param
    );

    /// test json serialization of form data
    ///
    /// 
    @GetReq(path: "/fake/jsonFormData")
    Future<void> testJsonFormData(
        
        @AsJson() String param, 
        
        @AsJson() String param2
    );


}
