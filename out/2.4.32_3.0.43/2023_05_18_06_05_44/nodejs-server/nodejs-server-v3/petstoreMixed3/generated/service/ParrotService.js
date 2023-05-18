'use strict';


/**
 * Add a new parrow to the store
 *
 * body Parrot_body_1  (optional)
 * returns inline_response_200_1
 **/
exports.addParrot = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * get Parrots
 *
 * returns List
 **/
exports.getParrots = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ "", "" ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * update parrots
 *
 * body Parrot_body  (optional)
 * returns inline_response_200
 **/
exports.updateParrots = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "parrots" : [ "", "" ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

