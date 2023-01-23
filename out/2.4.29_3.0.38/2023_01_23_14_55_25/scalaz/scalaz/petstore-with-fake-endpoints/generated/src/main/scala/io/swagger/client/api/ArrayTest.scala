package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ArrayTest._

case class ArrayTest (
  arrayOfString: Option[List[String]],
arrayArrayOfInteger: Option[List[List[Long]]],
arrayArrayOfModel: Option[List[List[ReadOnlyFirst]]])

object ArrayTest {
  import DateTimeCodecs._

  implicit val ArrayTestCodecJson: CodecJson[ArrayTest] = CodecJson.derive[ArrayTest]
  implicit val ArrayTestDecoder: EntityDecoder[ArrayTest] = jsonOf[ArrayTest]
  implicit val ArrayTestEncoder: EntityEncoder[ArrayTest] = jsonEncoderOf[ArrayTest]
}
