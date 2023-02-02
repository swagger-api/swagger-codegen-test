package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import MapTest._

case class MapTest (
  mapMapOfString: Option[Map[String, Map[String, String]]],
mapOfEnumString: Option[Map[String, Inner]])

object MapTest {
  import DateTimeCodecs._
  sealed trait Map[String, Inner]

  object Map[String, Inner] {
    def toMap[String, Inner](s: String): Option[Map[String, Inner]] = s match {
      case _ => None
    }

    def fromMap[String, Inner](x: Map[String, Inner]): String = x match {
    }
  }

  implicit val Map[String, Inner]EnumEncoder: EncodeJson[Map[String, Inner]] =
    EncodeJson[Map[String, Inner]](is => StringEncodeJson(Map[String, Inner].fromMap[String, Inner](is)))

  implicit val Map[String, Inner]EnumDecoder: DecodeJson[Map[String, Inner]] =
    DecodeJson.optionDecoder[Map[String, Inner]](n => n.string.flatMap(jStr => Map[String, Inner].toMap[String, Inner](jStr)), "Map[String, Inner] failed to de-serialize")

  implicit val MapTestCodecJson: CodecJson[MapTest] = CodecJson.derive[MapTest]
  implicit val MapTestDecoder: EntityDecoder[MapTest] = jsonOf[MapTest]
  implicit val MapTestEncoder: EntityEncoder[MapTest] = jsonEncoderOf[MapTest]
}
