/**
* Swagger Petstore
* This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
*
* OpenAPI spec version: 1.0.0
* Contact: apiteam@swagger.io
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/package io.swagger.server.models

import io.swagger.server.models.Cat
import io.swagger.server.models.Dog

/**
 *  * @param bark  * @param breed  * @param hunts  * @param age */
data class Pup (    val bark: kotlin.Boolean? = null,    val breed: Pup.Breed? = null,    val hunts: kotlin.Boolean? = null,    val age: kotlin.Int? = null,    val bark: kotlin.Boolean? = null,    val breed: Pup.Breed? = null,    val hunts: kotlin.Boolean? = null,    val age: kotlin.Int? = null
) {
    /**
    * 
    * Values: dingo,husky,retriever,shepherd
    */
    enum class Breed(val value: kotlin.String){
        dingo("Dingo"),
        husky("Husky"),
        retriever("Retriever"),
        shepherd("Shepherd");
    }
}
