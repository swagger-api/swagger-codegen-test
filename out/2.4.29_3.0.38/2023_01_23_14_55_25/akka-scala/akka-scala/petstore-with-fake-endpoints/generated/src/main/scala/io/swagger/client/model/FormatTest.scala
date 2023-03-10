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

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class FormatTest (
  integer: Option[Int] = None,
  int32: Option[Int] = None,
  int64: Option[Long] = None,
  number: Double,
  float: Option[Float] = None,
  double: Option[Double] = None,
  string: Option[String] = None,
  byte: ByteArray,
  binary: Option[Binary] = None,
  date: Date,
  dateTime: Option[DateTime] = None,
  uuid: Option[UUID] = None,
  password: String
) extends ApiModel


