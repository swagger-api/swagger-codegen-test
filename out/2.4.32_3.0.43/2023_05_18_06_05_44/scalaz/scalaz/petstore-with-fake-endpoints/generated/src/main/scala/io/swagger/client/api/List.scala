package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import List._

case class List (
  `123List`: Option[String])

object List {
  import DateTimeCodecs._

  implicit val ListCodecJson: CodecJson[List] = CodecJson.derive[List]
  implicit val ListDecoder: EntityDecoder[List] = jsonOf[List]
  implicit val ListEncoder: EntityEncoder[List] = jsonEncoderOf[List]
}
