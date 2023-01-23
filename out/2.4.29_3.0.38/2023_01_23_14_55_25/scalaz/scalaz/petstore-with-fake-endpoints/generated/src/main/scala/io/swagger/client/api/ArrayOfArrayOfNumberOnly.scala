package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ArrayOfArrayOfNumberOnly._

case class ArrayOfArrayOfNumberOnly (
  arrayArrayNumber: Option[List[List[BigDecimal]]])

object ArrayOfArrayOfNumberOnly {
  import DateTimeCodecs._

  implicit val ArrayOfArrayOfNumberOnlyCodecJson: CodecJson[ArrayOfArrayOfNumberOnly] = CodecJson.derive[ArrayOfArrayOfNumberOnly]
  implicit val ArrayOfArrayOfNumberOnlyDecoder: EntityDecoder[ArrayOfArrayOfNumberOnly] = jsonOf[ArrayOfArrayOfNumberOnly]
  implicit val ArrayOfArrayOfNumberOnlyEncoder: EntityEncoder[ArrayOfArrayOfNumberOnly] = jsonEncoderOf[ArrayOfArrayOfNumberOnly]
}
