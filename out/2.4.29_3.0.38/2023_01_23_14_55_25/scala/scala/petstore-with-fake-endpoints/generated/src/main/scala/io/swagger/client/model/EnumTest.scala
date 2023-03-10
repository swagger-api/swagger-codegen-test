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


case class EnumTest (
  enumString: Option[String] = None,
  enumStringRequired: String,
  enumInteger: Option[Integer] = None,
  enumNumber: Option[Double] = None,
  outerEnum: Option[OuterEnum] = None
)

