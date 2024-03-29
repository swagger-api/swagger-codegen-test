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
 * Swagger Codegen version: 3.0.42
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from '../ApiClient';

/**
 * The DogDogIdBody model module.
 * @module model/DogDogIdBody
 * @version 1.0.0
 */
export class DogDogIdBody {
  /**
   * Constructs a new <code>DogDogIdBody</code>.
   * @alias module:model/DogDogIdBody
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>DogDogIdBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DogDogIdBody} obj Optional instance to populate.
   * @return {module:model/DogDogIdBody} The populated <code>DogDogIdBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new DogDogIdBody();
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('status'))
        obj.status = ApiClient.convertToType(data['status'], 'String');
    }
    return obj;
  }
}

/**
 * Updated name of the dog
 * @member {String} name
 */
DogDogIdBody.prototype.name = undefined;

/**
 * Updated status of the dog
 * @member {String} status
 */
DogDogIdBody.prototype.status = undefined;

