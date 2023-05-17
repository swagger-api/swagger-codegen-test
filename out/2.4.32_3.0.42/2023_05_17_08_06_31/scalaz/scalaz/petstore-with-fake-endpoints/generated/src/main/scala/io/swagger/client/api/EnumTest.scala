package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import EnumTest._

case class EnumTest (
  enumString: Option[EnumString],
enumStringRequired: EnumStringRequired,
enumInteger: Option[EnumInteger],
enumNumber: Option[EnumNumber],
outerEnum: Option[OuterEnum])

object EnumTest {
  import DateTimeCodecs._
  sealed trait EnumString
  case object UPPER extends EnumString
  case object Lower extends EnumString
  case object `` extends EnumString

  object EnumString {
    def toEnumString(s: String): Option[EnumString] = s match {
      case "UPPER" => Some(UPPER)
      case "Lower" => Some(Lower)
      case "``" => Some(``)
      case _ => None
    }

    def fromEnumString(x: EnumString): String = x match {
      case UPPER => "UPPER"
      case Lower => "Lower"
      case `` => "``"
    }
  }

  implicit val EnumStringEnumEncoder: EncodeJson[EnumString] =
    EncodeJson[EnumString](is => StringEncodeJson(EnumString.fromEnumString(is)))

  implicit val EnumStringEnumDecoder: DecodeJson[EnumString] =
    DecodeJson.optionDecoder[EnumString](n => n.string.flatMap(jStr => EnumString.toEnumString(jStr)), "EnumString failed to de-serialize")
  sealed trait EnumStringRequired
  case object UPPER extends EnumStringRequired
  case object Lower extends EnumStringRequired
  case object `` extends EnumStringRequired

  object EnumStringRequired {
    def toEnumStringRequired(s: String): Option[EnumStringRequired] = s match {
      case "UPPER" => Some(UPPER)
      case "Lower" => Some(Lower)
      case "``" => Some(``)
      case _ => None
    }

    def fromEnumStringRequired(x: EnumStringRequired): String = x match {
      case UPPER => "UPPER"
      case Lower => "Lower"
      case `` => "``"
    }
  }

  implicit val EnumStringRequiredEnumEncoder: EncodeJson[EnumStringRequired] =
    EncodeJson[EnumStringRequired](is => StringEncodeJson(EnumStringRequired.fromEnumStringRequired(is)))

  implicit val EnumStringRequiredEnumDecoder: DecodeJson[EnumStringRequired] =
    DecodeJson.optionDecoder[EnumStringRequired](n => n.string.flatMap(jStr => EnumStringRequired.toEnumStringRequired(jStr)), "EnumStringRequired failed to de-serialize")
  sealed trait EnumInteger
  case object `1` extends EnumInteger
  case object `1` extends EnumInteger

  object EnumInteger {
    def toEnumInteger(s: String): Option[EnumInteger] = s match {
      case "`1`" => Some(`1`)
      case "`1`" => Some(`1`)
      case _ => None
    }

    def fromEnumInteger(x: EnumInteger): String = x match {
      case `1` => "`1`"
      case `1` => "`1`"
    }
  }

  implicit val EnumIntegerEnumEncoder: EncodeJson[EnumInteger] =
    EncodeJson[EnumInteger](is => StringEncodeJson(EnumInteger.fromEnumInteger(is)))

  implicit val EnumIntegerEnumDecoder: DecodeJson[EnumInteger] =
    DecodeJson.optionDecoder[EnumInteger](n => n.string.flatMap(jStr => EnumInteger.toEnumInteger(jStr)), "EnumInteger failed to de-serialize")
  sealed trait EnumNumber
  case object `11` extends EnumNumber
  case object `12` extends EnumNumber

  object EnumNumber {
    def toEnumNumber(s: String): Option[EnumNumber] = s match {
      case "`11`" => Some(`11`)
      case "`12`" => Some(`12`)
      case _ => None
    }

    def fromEnumNumber(x: EnumNumber): String = x match {
      case `11` => "`11`"
      case `12` => "`12`"
    }
  }

  implicit val EnumNumberEnumEncoder: EncodeJson[EnumNumber] =
    EncodeJson[EnumNumber](is => StringEncodeJson(EnumNumber.fromEnumNumber(is)))

  implicit val EnumNumberEnumDecoder: DecodeJson[EnumNumber] =
    DecodeJson.optionDecoder[EnumNumber](n => n.string.flatMap(jStr => EnumNumber.toEnumNumber(jStr)), "EnumNumber failed to de-serialize")

  implicit val EnumTestCodecJson: CodecJson[EnumTest] = CodecJson.derive[EnumTest]
  implicit val EnumTestDecoder: EntityDecoder[EnumTest] = jsonOf[EnumTest]
  implicit val EnumTestEncoder: EntityEncoder[EnumTest] = jsonEncoderOf[EnumTest]
}
