package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import NumberOnly._

case class NumberOnly (
  justNumber: Option[BigDecimal])

object NumberOnly {
  import DateTimeCodecs._

  implicit val NumberOnlyCodecJson: CodecJson[NumberOnly] = CodecJson.derive[NumberOnly]
  implicit val NumberOnlyDecoder: EntityDecoder[NumberOnly] = jsonOf[NumberOnly]
  implicit val NumberOnlyEncoder: EntityEncoder[NumberOnly] = jsonEncoderOf[NumberOnly]
}
