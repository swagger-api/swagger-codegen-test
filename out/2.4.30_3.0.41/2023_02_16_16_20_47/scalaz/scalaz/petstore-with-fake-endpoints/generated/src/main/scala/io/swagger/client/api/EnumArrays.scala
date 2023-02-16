package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import EnumArrays._

case class EnumArrays (
  justSymbol: Option[JustSymbol],
arrayEnum: Option[List[ArrayEnum]])

object EnumArrays {
  import DateTimeCodecs._
  sealed trait JustSymbol
  case object Gtx3D extends JustSymbol
  case object Value extends JustSymbol

  object JustSymbol {
    def toJustSymbol(s: String): Option[JustSymbol] = s match {
      case "Gtx3D" => Some(Gtx3D)
      case "Value" => Some(Value)
      case _ => None
    }

    def fromJustSymbol(x: JustSymbol): String = x match {
      case Gtx3D => "Gtx3D"
      case Value => "Value"
    }
  }

  implicit val JustSymbolEnumEncoder: EncodeJson[JustSymbol] =
    EncodeJson[JustSymbol](is => StringEncodeJson(JustSymbol.fromJustSymbol(is)))

  implicit val JustSymbolEnumDecoder: DecodeJson[JustSymbol] =
    DecodeJson.optionDecoder[JustSymbol](n => n.string.flatMap(jStr => JustSymbol.toJustSymbol(jStr)), "JustSymbol failed to de-serialize")
  sealed trait List[ArrayEnum]

  object List[ArrayEnum] {
    def toList[ArrayEnum](s: String): Option[List[ArrayEnum]] = s match {
      case _ => None
    }

    def fromList[ArrayEnum](x: List[ArrayEnum]): String = x match {
    }
  }

  implicit val List[ArrayEnum]EnumEncoder: EncodeJson[List[ArrayEnum]] =
    EncodeJson[List[ArrayEnum]](is => StringEncodeJson(List[ArrayEnum].fromList[ArrayEnum](is)))

  implicit val List[ArrayEnum]EnumDecoder: DecodeJson[List[ArrayEnum]] =
    DecodeJson.optionDecoder[List[ArrayEnum]](n => n.string.flatMap(jStr => List[ArrayEnum].toList[ArrayEnum](jStr)), "List[ArrayEnum] failed to de-serialize")

  implicit val EnumArraysCodecJson: CodecJson[EnumArrays] = CodecJson.derive[EnumArrays]
  implicit val EnumArraysDecoder: EntityDecoder[EnumArrays] = jsonOf[EnumArrays]
  implicit val EnumArraysEncoder: EntityEncoder[EnumArrays] = jsonEncoderOf[EnumArrays]
}
