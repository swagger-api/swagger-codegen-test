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
* The EnumFormBody model module.
* @module model/EnumFormBody
* @version 1.0.0
*/
export default class EnumFormBody {
    /**
    * Constructs a new <code>EnumFormBody</code>.
    * @alias module:model/EnumFormBody
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EnumFormBody</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EnumFormBody} obj Optional instance to populate.
    * @return {module:model/EnumFormBody} The populated <code>EnumFormBody</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EnumFormBody();
                        
            
            if (data.hasOwnProperty('enum_form_string_array')) {
                obj['enum_form_string_array'] = ApiClient.convertToType(data['enum_form_string_array'], ['String']);
            }
            if (data.hasOwnProperty('enum_form_string')) {
                obj['enum_form_string'] = ApiClient.convertToType(data['enum_form_string'], 'String');
            }
            if (data.hasOwnProperty('enum_query_double')) {
                obj['enum_query_double'] = ApiClient.convertToType(data['enum_query_double'], 'Number');
            }
        }
        return obj;
    }

    /**
    * Form parameter enum test (string array)
    * @member {Array.<module:model/EnumFormBody.EnumFormStringArrayEnum>} enum_form_string_array
    */
    'enum_form_string_array' = undefined;
    /**
    * Form parameter enum test (string)
    * @member {module:model/EnumFormBody.EnumFormStringEnum} enum_form_string
    * @default '-efg'
    */
    'enum_form_string' = '-efg';
    /**
    * Query parameter enum test (double)
    * @member {module:model/EnumFormBody.EnumQueryDoubleEnum} enum_query_double
    */
    'enum_query_double' = undefined;



    /**
    * Allowed values for the <code>enumFormStringArray</code> property.
    * @enum {String}
    * @readonly
    */
    static EnumFormStringArrayEnum = {
        /**
         * value: ">"
         * @const
         */
        "GREATER_THAN": ">",
        /**
         * value: "$"
         * @const
         */
        "DOLLAR": "$"    };
    /**
    * Allowed values for the <code>enum_form_string</code> property.
    * @enum {String}
    * @readonly
    */
    static EnumFormStringEnum = {
        /**
         * value: "_abc"
         * @const
         */
        "abc": "_abc",
        /**
         * value: "-efg"
         * @const
         */
        "efg": "-efg",
        /**
         * value: "(xyz)"
         * @const
         */
        "xyz": "(xyz)"    };
    /**
    * Allowed values for the <code>enum_query_double</code> property.
    * @enum {Number}
    * @readonly
    */
    static EnumQueryDoubleEnum = {
        /**
         * value: 1.1
         * @const
         */
        "_11": 1.1,
        /**
         * value: -1.2
         * @const
         */
        "_12": -1.2    };

}
