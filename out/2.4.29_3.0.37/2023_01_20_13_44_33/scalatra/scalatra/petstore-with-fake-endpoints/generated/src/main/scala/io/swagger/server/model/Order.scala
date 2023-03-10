/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */

package io.swagger.server.model
import java.util.Date

case class Order(
  id: Option[Long],
    petId: Option[Long],
    quantity: Option[Int],
    shipDate: Option[Date],
  /* Order Status */
  status: Option[String],
    complete: Option[Boolean]
  )
