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
    instance = new SwaggerPetstore.FakeApi();
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

  describe('FakeApi', function() {
    describe('fakeOuterBooleanSerialize', function() {
      it('should call fakeOuterBooleanSerialize successfully', function(done) {
        //uncomment below and update the code to test fakeOuterBooleanSerialize
        //instance.fakeOuterBooleanSerialize(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('fakeOuterCompositeSerialize', function() {
      it('should call fakeOuterCompositeSerialize successfully', function(done) {
        //uncomment below and update the code to test fakeOuterCompositeSerialize
        //instance.fakeOuterCompositeSerialize(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('fakeOuterNumberSerialize', function() {
      it('should call fakeOuterNumberSerialize successfully', function(done) {
        //uncomment below and update the code to test fakeOuterNumberSerialize
        //instance.fakeOuterNumberSerialize(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('fakeOuterStringSerialize', function() {
      it('should call fakeOuterStringSerialize successfully', function(done) {
        //uncomment below and update the code to test fakeOuterStringSerialize
        //instance.fakeOuterStringSerialize(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('testClientModel', function() {
      it('should call testClientModel successfully', function(done) {
        //uncomment below and update the code to test testClientModel
        //instance.testClientModel(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('testEndpointParameters', function() {
      it('should call testEndpointParameters successfully', function(done) {
        //uncomment below and update the code to test testEndpointParameters
        //instance.testEndpointParameters(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('testEnumParameters', function() {
      it('should call testEnumParameters successfully', function(done) {
        //uncomment below and update the code to test testEnumParameters
        //instance.testEnumParameters(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('testEnumRequestBody', function() {
      it('should call testEnumRequestBody successfully', function(done) {
        //uncomment below and update the code to test testEnumRequestBody
        //instance.testEnumRequestBody(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('testInlineAdditionalProperties', function() {
      it('should call testInlineAdditionalProperties successfully', function(done) {
        //uncomment below and update the code to test testInlineAdditionalProperties
        //instance.testInlineAdditionalProperties(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('testJsonFormData', function() {
      it('should call testJsonFormData successfully', function(done) {
        //uncomment below and update the code to test testJsonFormData
        //instance.testJsonFormData(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
