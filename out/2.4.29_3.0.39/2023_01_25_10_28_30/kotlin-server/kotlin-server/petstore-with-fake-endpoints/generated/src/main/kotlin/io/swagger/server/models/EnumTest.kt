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
package io.swagger.server.models

import io.swagger.server.models.OuterEnum

/**
 * 
 * @param enum_string 
 * @param enum_string_required 
 * @param enum_integer 
 * @param enum_number 
 * @param outerEnum 
 */
data class EnumTest (
    val enum_string_required: EnumTest.EnumStringRequired,
    val enum_string: EnumTest.EnumString? = null,
    val enum_integer: EnumTest.EnumInteger? = null,
    val enum_number: EnumTest.EnumNumber? = null,
    val outerEnum: OuterEnum? = null
) {

    /**
    * 
    * Values: uPPER,lower,eMPTY
    */
    enum class EnumString(val value: kotlin.Any){
    
        uPPER("UPPER"),
    
        lower("lower"),
    
        eMPTY("");
    
    }

    /**
    * 
    * Values: uPPER,lower,eMPTY
    */
    enum class EnumStringRequired(val value: kotlin.Any){
    
        uPPER("UPPER"),
    
        lower("lower"),
    
        eMPTY("");
    
    }

    /**
    * 
    * Values: 1,minus1
    */
    enum class EnumInteger(val value: kotlin.Any){
    
        1(1),
    
        minus1(-1);
    
    }

    /**
    * 
    * Values: 1Period1,minus1Period2
    */
    enum class EnumNumber(val value: kotlin.Any){
    
        1Period1(1.1),
    
        minus1Period2(-1.2);
    
    }

}

