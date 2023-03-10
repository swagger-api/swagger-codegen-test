/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.5
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

case class Pet (
  id: Option[Long] = None,
  category: Option[Category] = None,
  name: String,
  photoUrls: Seq[String],
  tags: Option[Seq[Tag]] = None,
  /* pet status in the store */
  status: Option[PetEnums.Status] = None
) extends ApiModel

object PetEnums {

  type Status = Status.Value
  object Status extends Enumeration {
    val Available = Value("available")
    val Pending = Value("pending")
    val Sold = Value("sold")
  }

}

