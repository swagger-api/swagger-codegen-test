'use strict';


/**
 * Test serialization of outer boolean types
 *
 * body OuterBoolean Input boolean as post body (optional)
 * returns OuterBoolean
 **/
exports.fakeOuterBooleanSerialize = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = { };
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Test serialization of object with outer number type
 *
 * body OuterComposite Input composite as post body (optional)
 * returns OuterComposite
 **/
exports.fakeOuterCompositeSerialize = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "my_string" : { },
  "my_number" : { },
  "my_boolean" : { }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Test serialization of outer number types
 *
 * body OuterNumber Input number as post body (optional)
 * returns OuterNumber
 **/
exports.fakeOuterNumberSerialize = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = { };
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Test serialization of outer string types
 *
 * body OuterString Input string as post body (optional)
 * returns OuterString
 **/
exports.fakeOuterStringSerialize = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = { };
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 *
 * body User 
 * query String 
 * no response value expected for this operation
 **/
exports.testBodyWithQueryParams = function(body,query) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * To test \"client\" model
 * To test \"client\" model
 *
 * body Client client model
 * returns Client
 **/
exports.testClientModel = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "client" : "client"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
 * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
 *
 * number BigDecimal None
 * double Double None
 * pattern_without_delimiter String None
 * byte byte[] None
 * integer Integer None (optional)
 * int32 Integer None (optional)
 * int64 Long None (optional)
 * float Float None (optional)
 * string String None (optional)
 * binary byte[] None (optional)
 * date date None (optional)
 * dateTime Date None (optional)
 * password String None (optional)
 * callback String None (optional)
 * no response value expected for this operation
 **/
exports.testEndpointParameters = function(number,double,pattern_without_delimiter,byte,integer,int32,int64,float,string,binary,date,dateTime,password,callback) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * To test enum parameters
 * To test enum parameters
 *
 * enum_form_string_array List Form parameter enum test (string array) (optional)
 * enum_form_string String Form parameter enum test (string) (optional)
 * enum_header_string_array List Header parameter enum test (string array) (optional)
 * enum_header_string String Header parameter enum test (string) (optional)
 * enum_query_string_array List Query parameter enum test (string array) (optional)
 * enum_query_string String Query parameter enum test (string) (optional)
 * enum_query_integer Integer Query parameter enum test (double) (optional)
 * enum_query_double Double Query parameter enum test (double) (optional)
 * no response value expected for this operation
 **/
exports.testEnumParameters = function(enum_form_string_array,enum_form_string,enum_header_string_array,enum_header_string,enum_query_string_array,enum_query_string,enum_query_integer,enum_query_double) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * test inline additionalProperties
 * 
 *
 * param Object request body
 * no response value expected for this operation
 **/
exports.testInlineAdditionalProperties = function(param) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * test json serialization of form data
 * 
 *
 * param String field1
 * param2 String field2
 * no response value expected for this operation
 **/
exports.testJsonFormData = function(param,param2) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

