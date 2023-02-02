package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AdditionalPropertiesClass._

case class AdditionalPropertiesClass (
  mapProperty: Option[Map[String, String]],
mapOfMapProperty: Option[Map[String, Map[String, String]]])

object AdditionalPropertiesClass {
  import DateTimeCodecs._

  implicit val AdditionalPropertiesClassCodecJson: CodecJson[AdditionalPropertiesClass] = CodecJson.derive[AdditionalPropertiesClass]
  implicit val AdditionalPropertiesClassDecoder: EntityDecoder[AdditionalPropertiesClass] = jsonOf[AdditionalPropertiesClass]
  implicit val AdditionalPropertiesClassEncoder: EntityEncoder[AdditionalPropertiesClass] = jsonEncoderOf[AdditionalPropertiesClass]
}
