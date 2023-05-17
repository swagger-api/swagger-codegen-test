package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Cat._

case class Cat (
  className: String,
color: Option[String],
declawed: Option[Boolean])

object Cat {
  import DateTimeCodecs._

  implicit val CatCodecJson: CodecJson[Cat] = CodecJson.derive[Cat]
  implicit val CatDecoder: EntityDecoder[Cat] = jsonOf[Cat]
  implicit val CatEncoder: EntityEncoder[Cat] = jsonEncoderOf[Cat]
}
