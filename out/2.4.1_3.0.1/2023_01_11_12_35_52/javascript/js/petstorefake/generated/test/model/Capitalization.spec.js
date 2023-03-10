/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.1
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SwaggerPetstore);
  }
}(this, function(expect, SwaggerPetstore) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SwaggerPetstore.Capitalization();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('Capitalization', function() {
    it('should create an instance of Capitalization', function() {
      // uncomment below and update the code to test Capitalization
      //var instance = new SwaggerPetstore.Capitalization();
      //expect(instance).to.be.a(SwaggerPetstore.Capitalization);
    });

    it('should have the property smallCamel (base name: "smallCamel")', function() {
      // uncomment below and update the code to test the property smallCamel
      //var instance = new SwaggerPetstore.Capitalization();
      //expect(instance).to.be();
    });

    it('should have the property capitalCamel (base name: "CapitalCamel")', function() {
      // uncomment below and update the code to test the property capitalCamel
      //var instance = new SwaggerPetstore.Capitalization();
      //expect(instance).to.be();
    });

    it('should have the property smallSnake (base name: "small_Snake")', function() {
      // uncomment below and update the code to test the property smallSnake
      //var instance = new SwaggerPetstore.Capitalization();
      //expect(instance).to.be();
    });

    it('should have the property capitalSnake (base name: "Capital_Snake")', function() {
      // uncomment below and update the code to test the property capitalSnake
      //var instance = new SwaggerPetstore.Capitalization();
      //expect(instance).to.be();
    });

    it('should have the property sCAETHFlowPoints (base name: "SCA_ETH_Flow_Points")', function() {
      // uncomment below and update the code to test the property sCAETHFlowPoints
      //var instance = new SwaggerPetstore.Capitalization();
      //expect(instance).to.be();
    });

    it('should have the property ATT_NAME (base name: "ATT_NAME")', function() {
      // uncomment below and update the code to test the property ATT_NAME
      //var instance = new SwaggerPetstore.Capitalization();
      //expect(instance).to.be();
    });

  });

}));
