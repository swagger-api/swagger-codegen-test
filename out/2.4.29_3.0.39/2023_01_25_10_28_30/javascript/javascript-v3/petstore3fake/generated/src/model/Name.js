/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
* The Name model module.
* @module model/Name
* @version 1.0.0
*/
export default class Name {
    /**
    * Constructs a new <code>Name</code>.
    * Model for testing model name same as property name
    * @alias module:model/Name
    * @class
    * @param name {Number} 
    */

    constructor(name) {
        
        
        this['name'] = name;
        
    }

    /**
    * Constructs a <code>Name</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/Name} obj Optional instance to populate.
    * @return {module:model/Name} The populated <code>Name</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Name();
                        
            
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'Number');
            }
            if (data.hasOwnProperty('snake_case')) {
                obj['snake_case'] = ApiClient.convertToType(data['snake_case'], 'Number');
            }
            if (data.hasOwnProperty('property')) {
                obj['property'] = ApiClient.convertToType(data['property'], 'String');
            }
            if (data.hasOwnProperty('123Number')) {
                obj['123Number'] = ApiClient.convertToType(data['123Number'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Number} name
    */
    'name' = undefined;
    /**
    * @member {Number} snake_case
    */
    'snake_case' = undefined;
    /**
    * @member {String} property
    */
    'property' = undefined;
    /**
    * @member {Number} 123Number
    */
    '123Number' = undefined;




}
