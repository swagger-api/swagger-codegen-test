package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Client._

case class Client (
  client: Option[String])

object Client {
  import DateTimeCodecs._

  implicit val ClientCodecJson: CodecJson[Client] = CodecJson.derive[Client]
  implicit val ClientDecoder: EntityDecoder[Client] = jsonOf[Client]
  implicit val ClientEncoder: EntityEncoder[Client] = jsonEncoderOf[Client]
}
