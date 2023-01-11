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
    root.SwaggerPetstore.Numbers = factory(root.SwaggerPetstore.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * Enum class Numbers.
   * @enum {Number}
   * @readonly
   */
  var exports = {
    /**
     * value: 7
     * @const
     */
    _7: 7,

    /**
     * value: 8
     * @const
     */
    _8: 8,

    /**
     * value: 9
     * @const
     */
    _9: 9,

    /**
     * value: 10
     * @const
     */
    _10: 10
  };

  /**
   * Returns a <code>Numbers</code> enum value from a JavaScript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/Numbers} The enum <code>Numbers</code> value.
   */
  exports.constructFromObject = function(object) {
    return object;
  }

  return exports;
}));
