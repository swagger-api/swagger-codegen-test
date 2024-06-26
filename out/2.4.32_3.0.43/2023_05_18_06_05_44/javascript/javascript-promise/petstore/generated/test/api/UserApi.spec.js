/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.5
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
    instance = new SwaggerPetstore.UserApi();
  });

  describe('(package)', function() {
    describe('UserApi', function() {
      describe('createUser', function() {
        it('should call createUser successfully', function(done) {
          // TODO: uncomment, update parameter values for createUser call
          /*
          var body = new SwaggerPetstore.User();
          body.id = "0";
          body.username = "";
          body.firstName = "";
          body.lastName = "";
          body.email = "";
          body.password = "";
          body.phone = "";
          body.userStatus = 0;

          instance.createUser(body).then(function(data) {

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('createUsersWithArrayInput', function() {
        it('should call createUsersWithArrayInput successfully', function(done) {
          // TODO: uncomment, update parameter values for createUsersWithArrayInput call
          /*
          var body = [new SwaggerPetstore.User()];
          body[0].id = "0";
          body[0].username = "";
          body[0].firstName = "";
          body[0].lastName = "";
          body[0].email = "";
          body[0].password = "";
          body[0].phone = "";
          body[0].userStatus = 0;

          instance.createUsersWithArrayInput(body).then(function(data) {

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('createUsersWithListInput', function() {
        it('should call createUsersWithListInput successfully', function(done) {
          // TODO: uncomment, update parameter values for createUsersWithListInput call
          /*
          var body = [new SwaggerPetstore.User()];
          body[0].id = "0";
          body[0].username = "";
          body[0].firstName = "";
          body[0].lastName = "";
          body[0].email = "";
          body[0].password = "";
          body[0].phone = "";
          body[0].userStatus = 0;

          instance.createUsersWithListInput(body).then(function(data) {

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('deleteUser', function() {
        it('should call deleteUser successfully', function(done) {
          // TODO: uncomment, update parameter values for deleteUser call
          /*
          var username = "username_example";

          instance.deleteUser(username).then(function(data) {

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getUserByName', function() {
        it('should call getUserByName successfully', function(done) {
          // TODO: uncomment, update parameter values for getUserByName call and complete the assertions
          /*
          var username = "username_example";

          instance.getUserByName(username).then(function(data) {
            // TODO: update response assertions
            expect(data).to.be.a(SwaggerPetstore.User);
            expect(data.id).to.be.a('number');
            expect(data.id).to.be("0");
            expect(data.username).to.be.a('string');
            expect(data.username).to.be("");
            expect(data.firstName).to.be.a('string');
            expect(data.firstName).to.be("");
            expect(data.lastName).to.be.a('string');
            expect(data.lastName).to.be("");
            expect(data.email).to.be.a('string');
            expect(data.email).to.be("");
            expect(data.password).to.be.a('string');
            expect(data.password).to.be("");
            expect(data.phone).to.be.a('string');
            expect(data.phone).to.be("");
            expect(data.userStatus).to.be.a('number');
            expect(data.userStatus).to.be(0);

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('loginUser', function() {
        it('should call loginUser successfully', function(done) {
          // TODO: uncomment, update parameter values for loginUser call and complete the assertions
          /*
          var username = "username_example";
          var password = "password_example";

          instance.loginUser(username, password).then(function(data) {
            // TODO: update response assertions
            expect(data).to.be.a('string');
            // expect(data).to.be(null);

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('logoutUser', function() {
        it('should call logoutUser successfully', function(done) {
          // TODO: uncomment logoutUser call
          /*

          instance.logoutUser().then(function(data) {

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('updateUser', function() {
        it('should call updateUser successfully', function(done) {
          // TODO: uncomment, update parameter values for updateUser call
          /*
          var username = "username_example";
          var body = new SwaggerPetstore.User();
          body.id = "0";
          body.username = "";
          body.firstName = "";
          body.lastName = "";
          body.email = "";
          body.password = "";
          body.phone = "";
          body.userStatus = 0;

          instance.updateUser(username, body).then(function(data) {

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
