package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OuterEnum._

case class OuterEnum (
  
object OuterEnum {
  import DateTimeCodecs._

  implicit val OuterEnumCodecJson: CodecJson[OuterEnum] = CodecJson.derive[OuterEnum]
  implicit val OuterEnumDecoder: EntityDecoder[OuterEnum] = jsonOf[OuterEnum]
  implicit val OuterEnumEncoder: EntityEncoder[OuterEnum] = jsonEncoderOf[OuterEnum]
}
