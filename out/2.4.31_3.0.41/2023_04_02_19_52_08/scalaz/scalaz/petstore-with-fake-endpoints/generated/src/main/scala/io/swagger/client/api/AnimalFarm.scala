package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AnimalFarm._

case class AnimalFarm (
  
object AnimalFarm {
  import DateTimeCodecs._

  implicit val AnimalFarmCodecJson: CodecJson[AnimalFarm] = CodecJson.derive[AnimalFarm]
  implicit val AnimalFarmDecoder: EntityDecoder[AnimalFarm] = jsonOf[AnimalFarm]
  implicit val AnimalFarmEncoder: EntityEncoder[AnimalFarm] = jsonEncoderOf[AnimalFarm]
}
