package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Model200Response._

case class Model200Response (
  name: Option[Integer],
`class`: Option[String])

object Model200Response {
  import DateTimeCodecs._

  implicit val Model200ResponseCodecJson: CodecJson[Model200Response] = CodecJson.derive[Model200Response]
  implicit val Model200ResponseDecoder: EntityDecoder[Model200Response] = jsonOf[Model200Response]
  implicit val Model200ResponseEncoder: EntityEncoder[Model200Response] = jsonEncoderOf[Model200Response]
}
