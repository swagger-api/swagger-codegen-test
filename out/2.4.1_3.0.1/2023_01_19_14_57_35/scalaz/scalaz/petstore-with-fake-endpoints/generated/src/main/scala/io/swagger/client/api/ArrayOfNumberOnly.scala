package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ArrayOfNumberOnly._

case class ArrayOfNumberOnly (
  arrayNumber: Option[List[BigDecimal]])

object ArrayOfNumberOnly {
  import DateTimeCodecs._

  implicit val ArrayOfNumberOnlyCodecJson: CodecJson[ArrayOfNumberOnly] = CodecJson.derive[ArrayOfNumberOnly]
  implicit val ArrayOfNumberOnlyDecoder: EntityDecoder[ArrayOfNumberOnly] = jsonOf[ArrayOfNumberOnly]
  implicit val ArrayOfNumberOnlyEncoder: EntityEncoder[ArrayOfNumberOnly] = jsonEncoderOf[ArrayOfNumberOnly]
}
