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
 * Swagger Codegen version: 2.4.30-SNAPSHOT
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
    root.SwaggerPetstore.SpecialModelName = factory(root.SwaggerPetstore.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The SpecialModelName model module.
   * @module model/SpecialModelName
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>SpecialModelName</code>.
   * @alias module:model/SpecialModelName
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>SpecialModelName</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpecialModelName} obj Optional instance to populate.
   * @return {module:model/SpecialModelName} The populated <code>SpecialModelName</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('$special[property.name]'))
        obj.specialPropertyName = ApiClient.convertToType(data['$special[property.name]'], 'Number');
    }
    return obj;
  }

  /**
   * @member {Number} specialPropertyName
   */
  exports.prototype.specialPropertyName = undefined;


  return exports;

}));
