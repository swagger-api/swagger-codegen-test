package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OuterString._

case class OuterString (
  
object OuterString {
  import DateTimeCodecs._

  implicit val OuterStringCodecJson: CodecJson[OuterString] = CodecJson.derive[OuterString]
  implicit val OuterStringDecoder: EntityDecoder[OuterString] = jsonOf[OuterString]
  implicit val OuterStringEncoder: EntityEncoder[OuterString] = jsonEncoderOf[OuterString]
}
