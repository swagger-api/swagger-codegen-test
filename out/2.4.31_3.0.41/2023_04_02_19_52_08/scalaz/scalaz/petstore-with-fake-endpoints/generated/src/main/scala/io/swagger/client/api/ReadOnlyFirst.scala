package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ReadOnlyFirst._

case class ReadOnlyFirst (
  bar: Option[String],
baz: Option[String])

object ReadOnlyFirst {
  import DateTimeCodecs._

  implicit val ReadOnlyFirstCodecJson: CodecJson[ReadOnlyFirst] = CodecJson.derive[ReadOnlyFirst]
  implicit val ReadOnlyFirstDecoder: EntityDecoder[ReadOnlyFirst] = jsonOf[ReadOnlyFirst]
  implicit val ReadOnlyFirstEncoder: EntityEncoder[ReadOnlyFirst] = jsonEncoderOf[ReadOnlyFirst]
}
