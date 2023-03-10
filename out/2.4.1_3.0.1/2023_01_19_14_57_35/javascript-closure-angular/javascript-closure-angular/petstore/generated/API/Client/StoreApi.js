/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.StoreApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key &#x60;special-key&#x60; to test the authorization filters.
 * Version: 1.0.5
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license Apache 2.0
 * http://www.apache.org/licenses/LICENSE-2.0.html
 */

goog.provide('API.Client.StoreApi');

goog.require('API.Client.Order');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.StoreApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('StoreApiBasePath') ?
                   /** @type {!string} */ ($injector.get('StoreApiBasePath')) :
                   'https://petstore.swagger.io/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('StoreApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('StoreApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.StoreApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Delete purchase order by ID
 * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
 * @param {!number} orderId ID of the order that needs to be deleted
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.StoreApi.prototype.deleteOrder = function(orderId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/store/order/{orderId}'
      .replace('{' + 'orderId' + '}', String(orderId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'orderId' is set
  if (!orderId) {
    throw new Error('Missing required parameter orderId when calling deleteOrder');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'DELETE',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Returns pet inventories by status
 * Returns a map of status codes to quantities
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Object<!string, number>>}
 */
API.Client.StoreApi.prototype.getInventory = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/store/inventory';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Find purchase order by ID
 * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions
 * @param {!number} orderId ID of pet that needs to be fetched
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.Order>}
 */
API.Client.StoreApi.prototype.getOrderById = function(orderId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/store/order/{orderId}'
      .replace('{' + 'orderId' + '}', String(orderId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'orderId' is set
  if (!orderId) {
    throw new Error('Missing required parameter orderId when calling getOrderById');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Place an order for a pet
 * 
 * @param {!Order} body order placed for purchasing the pet
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.Order>}
 */
API.Client.StoreApi.prototype.placeOrder = function(body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/store/order';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling placeOrder');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: body,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
