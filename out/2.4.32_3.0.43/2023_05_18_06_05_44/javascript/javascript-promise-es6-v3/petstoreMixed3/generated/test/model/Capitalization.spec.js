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
 * Swagger Codegen version: 3.0.43
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
    describe('Capitalization', function() {
      beforeEach(function() {
        instance = new SwaggerPetstore.Capitalization();
      });

      it('should create an instance of Capitalization', function() {
        // TODO: update the code to test Capitalization
        expect(instance).to.be.a(SwaggerPetstore.Capitalization);
      });

      it('should have the property smallCamel (base name: "smallCamel")', function() {
        // TODO: update the code to test the property smallCamel
        expect(instance).to.have.property('smallCamel');
        // expect(instance.smallCamel).to.be(expectedValueLiteral);
      });

      it('should have the property capitalCamel (base name: "CapitalCamel")', function() {
        // TODO: update the code to test the property capitalCamel
        expect(instance).to.have.property('capitalCamel');
        // expect(instance.capitalCamel).to.be(expectedValueLiteral);
      });

      it('should have the property smallSnake (base name: "small_Snake")', function() {
        // TODO: update the code to test the property smallSnake
        expect(instance).to.have.property('smallSnake');
        // expect(instance.smallSnake).to.be(expectedValueLiteral);
      });

      it('should have the property capitalSnake (base name: "Capital_Snake")', function() {
        // TODO: update the code to test the property capitalSnake
        expect(instance).to.have.property('capitalSnake');
        // expect(instance.capitalSnake).to.be(expectedValueLiteral);
      });

      it('should have the property sCAETHFlowPoints (base name: "SCA_ETH_Flow_Points")', function() {
        // TODO: update the code to test the property sCAETHFlowPoints
        expect(instance).to.have.property('sCAETHFlowPoints');
        // expect(instance.sCAETHFlowPoints).to.be(expectedValueLiteral);
      });

      it('should have the property ATT_NAME (base name: "ATT_NAME")', function() {
        // TODO: update the code to test the property ATT_NAME
        expect(instance).to.have.property('ATT_NAME');
        // expect(instance.ATT_NAME).to.be(expectedValueLiteral);
      });

    });
  });

}));
