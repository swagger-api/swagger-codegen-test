package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import FormatTest._

case class FormatTest (
  integer: Option[Integer],
int32: Option[Integer],
int64: Option[Long],
number: BigDecimal,
float: Option[Float],
double: Option[Double],
string: Option[String],
byte: ByteArray,
binary: Option[Binary],
date: DateTime,
dateTime: Option[DateTime],
uuid: Option[UUID],
password: String)

object FormatTest {
  import DateTimeCodecs._

  implicit val FormatTestCodecJson: CodecJson[FormatTest] = CodecJson.derive[FormatTest]
  implicit val FormatTestDecoder: EntityDecoder[FormatTest] = jsonOf[FormatTest]
  implicit val FormatTestEncoder: EntityEncoder[FormatTest] = jsonEncoderOf[FormatTest]
}
