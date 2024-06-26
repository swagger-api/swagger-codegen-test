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
*/package io.swagger.server.models


/**
 * 
 * @param integer 
 * @param int32 
 * @param int64 
 * @param number 
 * @param float 
 * @param double 
 * @param string 
 * @param byte 
 * @param binary 
 * @param date 
 * @param dateTime 
 * @param uuid 
 * @param password 
 */
data class FormatTest (

    val integer: kotlin.Int? = null,
    val int32: kotlin.Int? = null,
    val int64: kotlin.Long? = null,
    val number: java.math.BigDecimal,
    val float: kotlin.Float? = null,
    val double: kotlin.Double? = null,
    val string: kotlin.String? = null,
    val byte: kotlin.ByteArray,
    val binary: kotlin.Array<kotlin.Byte>? = null,
    val date: java.time.LocalDate,
    val dateTime: java.time.LocalDateTime? = null,
    val uuid: java.util.UUID? = null,
    val password: kotlin.String
) {
}
