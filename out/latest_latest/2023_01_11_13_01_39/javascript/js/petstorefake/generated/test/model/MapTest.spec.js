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

  describe('(package)', function() {
    describe('MapTest', function() {
      beforeEach(function() {
        instance = new SwaggerPetstore.MapTest();
      });

      it('should create an instance of MapTest', function() {
        // TODO: update the code to test MapTest
        expect(instance).to.be.a(SwaggerPetstore.MapTest);
      });

      it('should have the property mapMapOfString (base name: "map_map_of_string")', function() {
        // TODO: update the code to test the property mapMapOfString
        expect(instance).to.have.property('mapMapOfString');
        // expect(instance.mapMapOfString).to.be(expectedValueLiteral);
      });

      it('should have the property mapOfEnumString (base name: "map_of_enum_string")', function() {
        // TODO: update the code to test the property mapOfEnumString
        expect(instance).to.have.property('mapOfEnumString');
        // expect(instance.mapOfEnumString).to.be(expectedValueLiteral);
      });

    });
  });

}));
