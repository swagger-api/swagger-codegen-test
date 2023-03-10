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
package io.swagger.client.model


/**
 * @param smallCamel 
 * @param capitalCamel 
 * @param smallSnake 
 * @param capitalSnake 
 * @param sCAETHFlowPoints 
 * @param ATT_NAME Name of the pet 
 */
case class Capitalization (
  smallCamel: Option[String] = None,
  capitalCamel: Option[String] = None,
  smallSnake: Option[String] = None,
  capitalSnake: Option[String] = None,
  sCAETHFlowPoints: Option[String] = None,
  ATT_NAME: Option[String] = None
)

