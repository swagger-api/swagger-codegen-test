goog.provide('API.Client.Enum_Test');

/**
 * @record
 */
API.Client.EnumTest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.EnumTest.prototype.enumString;

/**
 * @type {!string}
 * @export
 */
API.Client.EnumTest.prototype.enumStringRequired;

/**
 * @type {!number}
 * @export
 */
API.Client.EnumTest.prototype.enumInteger;

/**
 * @type {!number}
 * @export
 */
API.Client.EnumTest.prototype.enumNumber;

/**
 * @type {!API.Client.OuterEnum}
 * @export
 */
API.Client.EnumTest.prototype.outerEnum;

/** @enum {string} */
API.Client.EnumTest.EnumStringEnum = { 
  UPPER: 'UPPER',
  lower: 'lower',
  : '',
}
/** @enum {string} */
API.Client.EnumTest.EnumStringRequiredEnum = { 
  UPPER: 'UPPER',
  lower: 'lower',
  : '',
}
/** @enum {string} */
API.Client.EnumTest.EnumIntegerEnum = { 
  1: '1',
  -1: '-1',
}
/** @enum {string} */
API.Client.EnumTest.EnumNumberEnum = { 
  1.1: '1.1',
  -1.2: '-1.2',
}
