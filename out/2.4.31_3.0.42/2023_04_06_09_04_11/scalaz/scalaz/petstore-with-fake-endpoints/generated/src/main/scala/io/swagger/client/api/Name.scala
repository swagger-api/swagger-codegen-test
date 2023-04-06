package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Name._

case class Name (
  name: Integer,
snakeCase: Option[Integer],
property: Option[String],
`123Number`: Option[Integer])

object Name {
  import DateTimeCodecs._

  implicit val NameCodecJson: CodecJson[Name] = CodecJson.derive[Name]
  implicit val NameDecoder: EntityDecoder[Name] = jsonOf[Name]
  implicit val NameEncoder: EntityEncoder[Name] = jsonEncoderOf[Name]
}
