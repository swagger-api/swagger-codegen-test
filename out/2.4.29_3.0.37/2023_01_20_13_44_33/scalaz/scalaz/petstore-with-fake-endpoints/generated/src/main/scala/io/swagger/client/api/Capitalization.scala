package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Capitalization._

case class Capitalization (
  smallCamel: Option[String],
capitalCamel: Option[String],
smallSnake: Option[String],
capitalSnake: Option[String],
sCAETHFlowPoints: Option[String],
/* Name of the pet  */
  ATT_NAME: Option[String])

object Capitalization {
  import DateTimeCodecs._

  implicit val CapitalizationCodecJson: CodecJson[Capitalization] = CodecJson.derive[Capitalization]
  implicit val CapitalizationDecoder: EntityDecoder[Capitalization] = jsonOf[Capitalization]
  implicit val CapitalizationEncoder: EntityEncoder[Capitalization] = jsonEncoderOf[Capitalization]
}
