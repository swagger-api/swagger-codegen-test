package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ModelReturn._

case class ModelReturn (
  `return`: Option[Integer])

object ModelReturn {
  import DateTimeCodecs._

  implicit val ModelReturnCodecJson: CodecJson[ModelReturn] = CodecJson.derive[ModelReturn]
  implicit val ModelReturnDecoder: EntityDecoder[ModelReturn] = jsonOf[ModelReturn]
  implicit val ModelReturnEncoder: EntityEncoder[ModelReturn] = jsonEncoderOf[ModelReturn]
}
