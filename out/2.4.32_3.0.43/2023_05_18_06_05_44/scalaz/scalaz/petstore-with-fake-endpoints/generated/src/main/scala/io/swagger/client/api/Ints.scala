package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Ints._

case class Ints (
  
object Ints {
  import DateTimeCodecs._

  implicit val IntsCodecJson: CodecJson[Ints] = CodecJson.derive[Ints]
  implicit val IntsDecoder: EntityDecoder[Ints] = jsonOf[Ints]
  implicit val IntsEncoder: EntityEncoder[Ints] = jsonEncoderOf[Ints]
}
