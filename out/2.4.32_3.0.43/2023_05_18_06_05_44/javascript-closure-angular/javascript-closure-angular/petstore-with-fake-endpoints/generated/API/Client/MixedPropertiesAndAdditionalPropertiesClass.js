goog.provide('API.Client.MixedPropertiesAndAdditionalPropertiesClass');

/**
 * @record
 */
API.Client.MixedPropertiesAndAdditionalPropertiesClass = function() {}

/**
 * @type {!API.Client.UUID}
 * @export
 */
API.Client.MixedPropertiesAndAdditionalPropertiesClass.prototype.uuid;

/**
 * @type {!Date}
 * @export
 */
API.Client.MixedPropertiesAndAdditionalPropertiesClass.prototype.dateTime;

/**
 * @type {!Object<!string, API.Client.Animal>}
 * @export
 */
API.Client.MixedPropertiesAndAdditionalPropertiesClass.prototype.map;

