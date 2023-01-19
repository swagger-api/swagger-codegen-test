package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ClassModel._

case class ClassModel (
  `class`: Option[String])

object ClassModel {
  import DateTimeCodecs._

  implicit val ClassModelCodecJson: CodecJson[ClassModel] = CodecJson.derive[ClassModel]
  implicit val ClassModelDecoder: EntityDecoder[ClassModel] = jsonOf[ClassModel]
  implicit val ClassModelEncoder: EntityEncoder[ClassModel] = jsonEncoderOf[ClassModel]
}
