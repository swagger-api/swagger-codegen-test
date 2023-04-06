package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import EnumClass._

case class EnumClass (
  
object EnumClass {
  import DateTimeCodecs._

  implicit val EnumClassCodecJson: CodecJson[EnumClass] = CodecJson.derive[EnumClass]
  implicit val EnumClassDecoder: EntityDecoder[EnumClass] = jsonOf[EnumClass]
  implicit val EnumClassEncoder: EntityEncoder[EnumClass] = jsonEncoderOf[EnumClass]
}
