package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OuterNumber._

case class OuterNumber (
  
object OuterNumber {
  import DateTimeCodecs._

  implicit val OuterNumberCodecJson: CodecJson[OuterNumber] = CodecJson.derive[OuterNumber]
  implicit val OuterNumberDecoder: EntityDecoder[OuterNumber] = jsonOf[OuterNumber]
  implicit val OuterNumberEncoder: EntityEncoder[OuterNumber] = jsonEncoderOf[OuterNumber]
}
