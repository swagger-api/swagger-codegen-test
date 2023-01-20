goog.provide('API.Client.ArrayTest');

/**
 * @record
 */
API.Client.ArrayTest = function() {}

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.ArrayTest.prototype.arrayOfString;

/**
 * @type {!Array<!Array<!number>>}
 * @export
 */
API.Client.ArrayTest.prototype.arrayArrayOfInteger;

/**
 * @type {!Array<!Array<!API.Client.ReadOnlyFirst>>}
 * @export
 */
API.Client.ArrayTest.prototype.arrayArrayOfModel;

