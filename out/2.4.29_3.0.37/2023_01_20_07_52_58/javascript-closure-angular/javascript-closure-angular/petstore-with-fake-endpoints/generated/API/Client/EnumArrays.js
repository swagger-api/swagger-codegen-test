goog.provide('API.Client.EnumArrays');

/**
 * @record
 */
API.Client.EnumArrays = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.EnumArrays.prototype.justSymbol;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.EnumArrays.prototype.arrayEnum;

/** @enum {string} */
API.Client.EnumArrays.JustSymbolEnum = { 
  &gt;&#x3D;: '&gt;&#x3D;',
  $: '$',
}
/** @enum {string} */
API.Client.EnumArrays.Array&lt;!ArrayEnumEnum&gt; = { 
  fish: 'fish',
  crab: 'crab',
}
