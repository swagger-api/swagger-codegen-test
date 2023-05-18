package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Dog._

case class Dog (
  className: String,
color: Option[String],
breed: Option[String])

object Dog {
  import DateTimeCodecs._

  implicit val DogCodecJson: CodecJson[Dog] = CodecJson.derive[Dog]
  implicit val DogDecoder: EntityDecoder[Dog] = jsonOf[Dog]
  implicit val DogEncoder: EntityEncoder[Dog] = jsonEncoderOf[Dog]
}
