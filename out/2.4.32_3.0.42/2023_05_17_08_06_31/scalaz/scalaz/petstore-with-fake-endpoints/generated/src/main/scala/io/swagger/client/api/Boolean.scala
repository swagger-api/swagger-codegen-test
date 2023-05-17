package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Boolean._

case class Boolean (
  
object Boolean {
  import DateTimeCodecs._

  implicit val BooleanCodecJson: CodecJson[Boolean] = CodecJson.derive[Boolean]
  implicit val BooleanDecoder: EntityDecoder[Boolean] = jsonOf[Boolean]
  implicit val BooleanEncoder: EntityEncoder[Boolean] = jsonEncoderOf[Boolean]
}
