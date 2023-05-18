goog.provide('API.Client.MapTest');

/**
 * @record
 */
API.Client.MapTest = function() {}

/**
 * @type {!Object<!string, Object<!string, string>>}
 * @export
 */
API.Client.MapTest.prototype.mapMapOfString;

/**
 * @type {!Object<!string, string>}
 * @export
 */
API.Client.MapTest.prototype.mapOfEnumString;

/** @enum {string} */
API.Client.MapTest.Object&lt;!string, InnerEnum&gt; = { 
  UPPER: 'UPPER',
  lower: 'lower',
}
