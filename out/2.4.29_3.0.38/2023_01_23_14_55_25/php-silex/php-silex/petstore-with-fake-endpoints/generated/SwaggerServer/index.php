<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->PATCH('/v2/another-fake/dummy', function(Application $app, Request $request) {
            return new Response('How about implementing testSpecialTags as a PATCH method ?');
            });


$app->POST('/v2/fake/outer/boolean', function(Application $app, Request $request) {
            return new Response('How about implementing fakeOuterBooleanSerialize as a POST method ?');
            });


$app->POST('/v2/fake/outer/composite', function(Application $app, Request $request) {
            return new Response('How about implementing fakeOuterCompositeSerialize as a POST method ?');
            });


$app->POST('/v2/fake/outer/number', function(Application $app, Request $request) {
            return new Response('How about implementing fakeOuterNumberSerialize as a POST method ?');
            });


$app->POST('/v2/fake/outer/string', function(Application $app, Request $request) {
            return new Response('How about implementing fakeOuterStringSerialize as a POST method ?');
            });


$app->PUT('/v2/fake/body-with-query-params', function(Application $app, Request $request) {
            $query = $request->get('query');
            return new Response('How about implementing testBodyWithQueryParams as a PUT method ?');
            });


$app->PATCH('/v2/fake', function(Application $app, Request $request) {
            return new Response('How about implementing testClientModel as a PATCH method ?');
            });


$app->POST('/v2/fake', function(Application $app, Request $request) {
            $integer = $request->get('integer');
            $int32 = $request->get('int32');
            $int64 = $request->get('int64');
            $number = $request->get('number');
            $float = $request->get('float');
            $double = $request->get('double');
            $string = $request->get('string');
            $pattern_without_delimiter = $request->get('pattern_without_delimiter');
            $byte = $request->get('byte');
            $binary = $request->get('binary');
            $date = $request->get('date');
            $date_time = $request->get('date_time');
            $password = $request->get('password');
            $callback = $request->get('callback');
            return new Response('How about implementing testEndpointParameters as a POST method ?');
            });


$app->GET('/v2/fake', function(Application $app, Request $request) {
            $enum_query_string_array = $request->get('enum_query_string_array');
            $enum_query_string = $request->get('enum_query_string');
            $enum_query_integer = $request->get('enum_query_integer');
            $enum_form_string_array = $request->get('enum_form_string_array');
            $enum_form_string = $request->get('enum_form_string');
            $enum_query_double = $request->get('enum_query_double');
            return new Response('How about implementing testEnumParameters as a GET method ?');
            });


$app->POST('/v2/fake/inline-additionalProperties', function(Application $app, Request $request) {
            return new Response('How about implementing testInlineAdditionalProperties as a POST method ?');
            });


$app->GET('/v2/fake/jsonFormData', function(Application $app, Request $request) {
            $param = $request->get('param');
            $param2 = $request->get('param2');
            return new Response('How about implementing testJsonFormData as a GET method ?');
            });


$app->PATCH('/v2/fake_classname_test', function(Application $app, Request $request) {
            return new Response('How about implementing testClassname as a PATCH method ?');
            });


$app->POST('/v2/pet', function(Application $app, Request $request) {
            return new Response('How about implementing addPet as a POST method ?');
            });


$app->DELETE('/v2/pet/{petId}', function(Application $app, Request $request, $petId) {
            return new Response('How about implementing deletePet as a DELETE method ?');
            });


$app->GET('/v2/pet/findByStatus', function(Application $app, Request $request) {
            $status = $request->get('status');
            return new Response('How about implementing findPetsByStatus as a GET method ?');
            });


$app->GET('/v2/pet/findByTags', function(Application $app, Request $request) {
            $tags = $request->get('tags');
            return new Response('How about implementing findPetsByTags as a GET method ?');
            });


$app->GET('/v2/pet/{petId}', function(Application $app, Request $request, $petId) {
            return new Response('How about implementing getPetById as a GET method ?');
            });


$app->PUT('/v2/pet', function(Application $app, Request $request) {
            return new Response('How about implementing updatePet as a PUT method ?');
            });


$app->POST('/v2/pet/{petId}', function(Application $app, Request $request, $petId) {
            $name = $request->get('name');
            $status = $request->get('status');
            return new Response('How about implementing updatePetWithForm as a POST method ?');
            });


$app->POST('/v2/pet/{petId}/uploadImage', function(Application $app, Request $request, $petId) {
            $additional_metadata = $request->get('additional_metadata');
            $file = $request->get('file');
            return new Response('How about implementing uploadFile as a POST method ?');
            });


$app->DELETE('/v2/store/order/{orderId}', function(Application $app, Request $request, $order_id) {
            return new Response('How about implementing deleteOrder as a DELETE method ?');
            });


$app->GET('/v2/store/inventory', function(Application $app, Request $request) {
            return new Response('How about implementing getInventory as a GET method ?');
            });


$app->GET('/v2/store/order/{orderId}', function(Application $app, Request $request, $order_id) {
            return new Response('How about implementing getOrderById as a GET method ?');
            });


$app->POST('/v2/store/order', function(Application $app, Request $request) {
            return new Response('How about implementing placeOrder as a POST method ?');
            });


$app->POST('/v2/user', function(Application $app, Request $request) {
            return new Response('How about implementing createUser as a POST method ?');
            });


$app->POST('/v2/user/createWithArray', function(Application $app, Request $request) {
            return new Response('How about implementing createUsersWithArrayInput as a POST method ?');
            });


$app->POST('/v2/user/createWithList', function(Application $app, Request $request) {
            return new Response('How about implementing createUsersWithListInput as a POST method ?');
            });


$app->DELETE('/v2/user/{username}', function(Application $app, Request $request, $username) {
            return new Response('How about implementing deleteUser as a DELETE method ?');
            });


$app->GET('/v2/user/{username}', function(Application $app, Request $request, $username) {
            return new Response('How about implementing getUserByName as a GET method ?');
            });


$app->GET('/v2/user/login', function(Application $app, Request $request) {
            $username = $request->get('username');
            $password = $request->get('password');
            return new Response('How about implementing loginUser as a GET method ?');
            });


$app->GET('/v2/user/logout', function(Application $app, Request $request) {
            return new Response('How about implementing logoutUser as a GET method ?');
            });


$app->PUT('/v2/user/{username}', function(Application $app, Request $request, $username) {
            return new Response('How about implementing updateUser as a PUT method ?');
            });


$app->run();
