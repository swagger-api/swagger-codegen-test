/**
* Swagger Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* OpenAPI spec version: 1.0.0
* Contact: apiteam@swagger.io
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models

import io.swagger.client.models.ReadOnlyFirst

/**
 * 
 * @param arrayOfString 
 * @param arrayArrayOfInteger 
 * @param arrayArrayOfModel 
 */
data class ArrayTest (
    val arrayOfString: kotlin.Array<kotlin.String>? = null,
    val arrayArrayOfInteger: kotlin.Array<kotlin.Array<kotlin.Long>>? = null,
    val arrayArrayOfModel: kotlin.Array<kotlin.Array<ReadOnlyFirst>>? = null,
) {

}

