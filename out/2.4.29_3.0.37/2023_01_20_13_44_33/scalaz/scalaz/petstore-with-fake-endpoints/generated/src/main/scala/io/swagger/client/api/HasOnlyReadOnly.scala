package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import HasOnlyReadOnly._

case class HasOnlyReadOnly (
  bar: Option[String],
foo: Option[String])

object HasOnlyReadOnly {
  import DateTimeCodecs._

  implicit val HasOnlyReadOnlyCodecJson: CodecJson[HasOnlyReadOnly] = CodecJson.derive[HasOnlyReadOnly]
  implicit val HasOnlyReadOnlyDecoder: EntityDecoder[HasOnlyReadOnly] = jsonOf[HasOnlyReadOnly]
  implicit val HasOnlyReadOnlyEncoder: EntityEncoder[HasOnlyReadOnly] = jsonEncoderOf[HasOnlyReadOnly]
}
