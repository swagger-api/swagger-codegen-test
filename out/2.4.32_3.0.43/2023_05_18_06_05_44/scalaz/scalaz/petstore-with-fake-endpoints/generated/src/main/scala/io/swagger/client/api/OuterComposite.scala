package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OuterComposite._

case class OuterComposite (
  myNumber: Option[OuterNumber],
myString: Option[OuterString],
myBoolean: Option[OuterBoolean])

object OuterComposite {
  import DateTimeCodecs._

  implicit val OuterCompositeCodecJson: CodecJson[OuterComposite] = CodecJson.derive[OuterComposite]
  implicit val OuterCompositeDecoder: EntityDecoder[OuterComposite] = jsonOf[OuterComposite]
  implicit val OuterCompositeEncoder: EntityEncoder[OuterComposite] = jsonEncoderOf[OuterComposite]
}
