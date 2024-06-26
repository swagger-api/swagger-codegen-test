/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.31
 *
 * Do not edit the class manually.
 *
 */

import {ApiClient} from '../ApiClient';

/**
 * The AdditionalPropertiesClass model module.
 * @module model/AdditionalPropertiesClass
 * @version 1.0.0
 */
export class AdditionalPropertiesClass {
  /**
   * Constructs a new <code>AdditionalPropertiesClass</code>.
   * @alias module:model/AdditionalPropertiesClass
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>AdditionalPropertiesClass</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdditionalPropertiesClass} obj Optional instance to populate.
   * @return {module:model/AdditionalPropertiesClass} The populated <code>AdditionalPropertiesClass</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AdditionalPropertiesClass();
      if (data.hasOwnProperty('map_property'))
        obj.mapProperty = ApiClient.convertToType(data['map_property'], {'String': 'String'});
      if (data.hasOwnProperty('map_of_map_property'))
        obj.mapOfMapProperty = ApiClient.convertToType(data['map_of_map_property'], {'String': {'String': 'String'}});
    }
    return obj;
  }
}

/**
 * @member {Object.<String, String>} mapProperty
 */
AdditionalPropertiesClass.prototype.mapProperty = undefined;

/**
 * @member {Object.<String, Object.<String, String>>} mapOfMapProperty
 */
AdditionalPropertiesClass.prototype.mapOfMapProperty = undefined;


