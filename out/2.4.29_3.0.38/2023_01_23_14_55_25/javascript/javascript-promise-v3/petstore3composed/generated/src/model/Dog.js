/**
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
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
import Pet from './Pet';

/**
* The Dog model module.
* @module model/Dog
* @version 1.0.0
*/
export default class Dog {
    /**
    * Constructs a new <code>Dog</code>.
    * @alias module:model/Dog
    * @class
    * @extends module:model/Pet
    * @param name {} 
    */

    constructor(name) {
        Pet.call(this, name);
        OneOfAllPetsResponseItems.call(this);OneOfPetPartItems.call(this);OneOfPup.call(this);
        
    }

    /**
    * Constructs a <code>Dog</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/Dog} obj Optional instance to populate.
    * @return {module:model/Dog} The populated <code>Dog</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Dog();
            
            Pet.constructFromObject(data, obj);
            
            if (data.hasOwnProperty('bark')) {
                obj['bark'] = ApiClient.convertToType(data['bark'], 'Boolean');
            }
            if (data.hasOwnProperty('breed')) {
                obj['breed'] = ApiClient.convertToType(data['breed'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} bark
    */
    'bark' = undefined;
    /**
    * @member {module:model/Dog.BreedEnum} breed
    */
    'breed' = undefined;

    // Implement OneOfAllPetsResponseItems interface:
        // Implement OneOfPetPartItems interface:
        // Implement OneOfPup interface:
    

    /**
    * Allowed values for the <code>breed</code> property.
    * @enum {String}
    * @readonly
    */
    static BreedEnum = {
        /**
         * value: "Dingo"
         * @const
         */
        "dingo": "Dingo",
        /**
         * value: "Husky"
         * @const
         */
        "husky": "Husky",
        /**
         * value: "Retriever"
         * @const
         */
        "retriever": "Retriever",
        /**
         * value: "Shepherd"
         * @const
         */
        "shepherd": "Shepherd"    };

}
