/*
 * Swagger Petstore - OpenAPI 3.0
 * This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.43
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from './ApiClient';
import {Address} from './model/Address';
import {ApiResponse} from './model/ApiResponse';
import {Category} from './model/Category';
import {Customer} from './model/Customer';
import {Order} from './model/Order';
import {Pet} from './model/Pet';
import {Tag} from './model/Tag';
import {User} from './model/User';
import {PetApi} from './api/PetApi';
import {StoreApi} from './api/StoreApi';
import {UserApi} from './api/UserApi';

/**
* This_is_a_sample_Pet_Store_Server_based_on_the_OpenAPI_3_0_specification___You_can_find_out_more_aboutSwagger_at__httpswagger_io_httpswagger_io__In_the_third_iteration_of_the_pet_store_weve_switched_to_the_design_first_approachYou_can_now_help_us_improve_the_API_whether_its_by_making_changes_to_the_definition_itself_or_to_the_code_That_way_with_time_we_can_improve_the_API_in_general_and_expose_some_of_the_new_features_in_OAS3_Some_useful_links___The_Pet_Store_repository_httpsgithub_comswagger_apiswagger_petstore___The_source_API_definition_for_the_Pet_Store_httpsgithub_comswagger_apiswagger_petstoreblobmastersrcmainresourcesopenapi_yaml.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var SwaggerPetstoreOpenApi30 = require('index'); // See note below*.
* var xxxSvc = new SwaggerPetstoreOpenApi30.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new SwaggerPetstoreOpenApi30.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new SwaggerPetstoreOpenApi30.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new SwaggerPetstoreOpenApi30.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.0.5
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Address model constructor.
     * @property {module:model/Address}
     */
    Address,

    /**
     * The ApiResponse model constructor.
     * @property {module:model/ApiResponse}
     */
    ApiResponse,

    /**
     * The Category model constructor.
     * @property {module:model/Category}
     */
    Category,

    /**
     * The Customer model constructor.
     * @property {module:model/Customer}
     */
    Customer,

    /**
     * The Order model constructor.
     * @property {module:model/Order}
     */
    Order,

    /**
     * The Pet model constructor.
     * @property {module:model/Pet}
     */
    Pet,

    /**
     * The Tag model constructor.
     * @property {module:model/Tag}
     */
    Tag,

    /**
     * The User model constructor.
     * @property {module:model/User}
     */
    User,

    /**
    * The PetApi service constructor.
    * @property {module:api/PetApi}
    */
    PetApi,

    /**
    * The StoreApi service constructor.
    * @property {module:api/StoreApi}
    */
    StoreApi,

    /**
    * The UserApi service constructor.
    * @property {module:api/UserApi}
    */
    UserApi
};
