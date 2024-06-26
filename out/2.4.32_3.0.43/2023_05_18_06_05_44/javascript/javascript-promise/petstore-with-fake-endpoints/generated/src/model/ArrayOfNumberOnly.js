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
 * Swagger Codegen version: 2.4.32
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggerPetstore) {
      root.SwaggerPetstore = {};
    }
    root.SwaggerPetstore.ArrayOfNumberOnly = factory(root.SwaggerPetstore.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The ArrayOfNumberOnly model module.
   * @module model/ArrayOfNumberOnly
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>ArrayOfNumberOnly</code>.
   * @alias module:model/ArrayOfNumberOnly
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>ArrayOfNumberOnly</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ArrayOfNumberOnly} obj Optional instance to populate.
   * @return {module:model/ArrayOfNumberOnly} The populated <code>ArrayOfNumberOnly</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('ArrayNumber'))
        obj.arrayNumber = ApiClient.convertToType(data['ArrayNumber'], ['Number']);
    }
    return obj;
  }

  /**
   * @member {Array.<Number>} arrayNumber
   */
  exports.prototype.arrayNumber = undefined;


  return exports;

}));
