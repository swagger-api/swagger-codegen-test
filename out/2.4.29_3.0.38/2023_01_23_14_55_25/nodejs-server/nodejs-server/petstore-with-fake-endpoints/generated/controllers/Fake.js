'use strict';

var utils = require('../utils/writer.js');
var Fake = require('../service/FakeService');

module.exports.fakeOuterBooleanSerialize = function fakeOuterBooleanSerialize (req, res, next) {
  var body = req.swagger.params['body'].value;
  Fake.fakeOuterBooleanSerialize(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.fakeOuterCompositeSerialize = function fakeOuterCompositeSerialize (req, res, next) {
  var body = req.swagger.params['body'].value;
  Fake.fakeOuterCompositeSerialize(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.fakeOuterNumberSerialize = function fakeOuterNumberSerialize (req, res, next) {
  var body = req.swagger.params['body'].value;
  Fake.fakeOuterNumberSerialize(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.fakeOuterStringSerialize = function fakeOuterStringSerialize (req, res, next) {
  var body = req.swagger.params['body'].value;
  Fake.fakeOuterStringSerialize(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.testBodyWithQueryParams = function testBodyWithQueryParams (req, res, next) {
  var body = req.swagger.params['body'].value;
  var query = req.swagger.params['query'].value;
  Fake.testBodyWithQueryParams(body,query)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.testClientModel = function testClientModel (req, res, next) {
  var body = req.swagger.params['body'].value;
  Fake.testClientModel(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.testEndpointParameters = function testEndpointParameters (req, res, next) {
  var number = req.swagger.params['number'].value;
  var double = req.swagger.params['double'].value;
  var pattern_without_delimiter = req.swagger.params['pattern_without_delimiter'].value;
  var byte = req.swagger.params['byte'].value;
  var integer = req.swagger.params['integer'].value;
  var int32 = req.swagger.params['int32'].value;
  var int64 = req.swagger.params['int64'].value;
  var float = req.swagger.params['float'].value;
  var string = req.swagger.params['string'].value;
  var binary = req.swagger.params['binary'].value;
  var date = req.swagger.params['date'].value;
  var dateTime = req.swagger.params['dateTime'].value;
  var password = req.swagger.params['password'].value;
  var callback = req.swagger.params['callback'].value;
  Fake.testEndpointParameters(number,double,pattern_without_delimiter,byte,integer,int32,int64,float,string,binary,date,dateTime,password,callback)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.testEnumParameters = function testEnumParameters (req, res, next) {
  var enum_form_string_array = req.swagger.params['enum_form_string_array'].value;
  var enum_form_string = req.swagger.params['enum_form_string'].value;
  var enum_header_string_array = req.swagger.params['enum_header_string_array'].value;
  var enum_header_string = req.swagger.params['enum_header_string'].value;
  var enum_query_string_array = req.swagger.params['enum_query_string_array'].value;
  var enum_query_string = req.swagger.params['enum_query_string'].value;
  var enum_query_integer = req.swagger.params['enum_query_integer'].value;
  var enum_query_double = req.swagger.params['enum_query_double'].value;
  Fake.testEnumParameters(enum_form_string_array,enum_form_string,enum_header_string_array,enum_header_string,enum_query_string_array,enum_query_string,enum_query_integer,enum_query_double)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.testInlineAdditionalProperties = function testInlineAdditionalProperties (req, res, next) {
  var param = req.swagger.params['param'].value;
  Fake.testInlineAdditionalProperties(param)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.testJsonFormData = function testJsonFormData (req, res, next) {
  var param = req.swagger.params['param'].value;
  var param2 = req.swagger.params['param2'].value;
  Fake.testJsonFormData(param,param2)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
