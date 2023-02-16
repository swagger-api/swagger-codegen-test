package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OuterBoolean._

case class OuterBoolean (
  
object OuterBoolean {
  import DateTimeCodecs._

  implicit val OuterBooleanCodecJson: CodecJson[OuterBoolean] = CodecJson.derive[OuterBoolean]
  implicit val OuterBooleanDecoder: EntityDecoder[OuterBoolean] = jsonOf[OuterBoolean]
  implicit val OuterBooleanEncoder: EntityEncoder[OuterBoolean] = jsonEncoderOf[OuterBoolean]
}
