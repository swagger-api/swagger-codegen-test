package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Animal._

case class Animal (
  className: String,
color: Option[String])

object Animal {
  import DateTimeCodecs._

  implicit val AnimalCodecJson: CodecJson[Animal] = CodecJson.derive[Animal]
  implicit val AnimalDecoder: EntityDecoder[Animal] = jsonOf[Animal]
  implicit val AnimalEncoder: EntityEncoder[Animal] = jsonEncoderOf[Animal]
}
