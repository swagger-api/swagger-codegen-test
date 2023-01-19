package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Numbers._

case class Numbers (
  
object Numbers {
  import DateTimeCodecs._

  implicit val NumbersCodecJson: CodecJson[Numbers] = CodecJson.derive[Numbers]
  implicit val NumbersDecoder: EntityDecoder[Numbers] = jsonOf[Numbers]
  implicit val NumbersEncoder: EntityEncoder[Numbers] = jsonEncoderOf[Numbers]
}
