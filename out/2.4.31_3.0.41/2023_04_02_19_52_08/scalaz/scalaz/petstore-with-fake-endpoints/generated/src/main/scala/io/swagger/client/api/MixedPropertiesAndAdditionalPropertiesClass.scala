package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import MixedPropertiesAndAdditionalPropertiesClass._

case class MixedPropertiesAndAdditionalPropertiesClass (
  uuid: Option[UUID],
dateTime: Option[DateTime],
map: Option[Map[String, Animal]])

object MixedPropertiesAndAdditionalPropertiesClass {
  import DateTimeCodecs._

  implicit val MixedPropertiesAndAdditionalPropertiesClassCodecJson: CodecJson[MixedPropertiesAndAdditionalPropertiesClass] = CodecJson.derive[MixedPropertiesAndAdditionalPropertiesClass]
  implicit val MixedPropertiesAndAdditionalPropertiesClassDecoder: EntityDecoder[MixedPropertiesAndAdditionalPropertiesClass] = jsonOf[MixedPropertiesAndAdditionalPropertiesClass]
  implicit val MixedPropertiesAndAdditionalPropertiesClassEncoder: EntityEncoder[MixedPropertiesAndAdditionalPropertiesClass] = jsonEncoderOf[MixedPropertiesAndAdditionalPropertiesClass]
}
