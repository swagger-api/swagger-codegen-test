package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

object FakeApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def fakeOuterBooleanSerialize(host: String, body: OuterBoolean): Task[OuterBoolean] = {
    implicit val returnTypeDecoder: EntityDecoder[OuterBoolean] = jsonOf[OuterBoolean]

    val path = "/fake/outer/boolean"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[OuterBoolean](req)

    } yield resp
  }
  
  def fakeOuterCompositeSerialize(host: String, body: OuterComposite): Task[OuterComposite] = {
    implicit val returnTypeDecoder: EntityDecoder[OuterComposite] = jsonOf[OuterComposite]

    val path = "/fake/outer/composite"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[OuterComposite](req)

    } yield resp
  }
  
  def fakeOuterNumberSerialize(host: String, body: OuterNumber): Task[OuterNumber] = {
    implicit val returnTypeDecoder: EntityDecoder[OuterNumber] = jsonOf[OuterNumber]

    val path = "/fake/outer/number"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[OuterNumber](req)

    } yield resp
  }
  
  def fakeOuterStringSerialize(host: String, body: OuterString): Task[OuterString] = {
    implicit val returnTypeDecoder: EntityDecoder[OuterString] = jsonOf[OuterString]

    val path = "/fake/outer/string"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[OuterString](req)

    } yield resp
  }
  
  def testBodyWithQueryParams(host: String, body: User, query: String)(implicit queryQuery: QueryParam[String]): Task[Unit] = {
    val path = "/fake/body-with-query-params"
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("query", Some(queryQuery.toParamString(query))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def testClientModel(host: String, body: Client): Task[Client] = {
    implicit val returnTypeDecoder: EntityDecoder[Client] = jsonOf[Client]

    val path = "/fake"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[Client](req)

    } yield resp
  }
  
  def testEndpointParameters(host: String, number: BigDecimal, double: Double, patternWithoutDelimiter: String, byte: ByteArray, integer: Integer, int32: Integer, int64: Long, float: Float, string: String, binary: Binary, date: DateTime, dateTime: DateTime, password: String, callback: String): Task[Unit] = {
    val path = "/fake"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def testEnumParameters(host: String, enumFormStringArray: List[String], enumFormString: String = -efg, enumHeaderStringArray: List[String], enumHeaderString: String = -efg, enumQueryStringArray: List[String], enumQueryString: String = -efg, enumQueryInteger: Integer, enumQueryDouble: Double)(implicit enumQueryStringArrayQuery: QueryParam[List[String]], enumQueryStringQuery: QueryParam[String], enumQueryIntegerQuery: QueryParam[Integer]): Task[Unit] = {
    val path = "/fake"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("enum_header_string_array", enumHeaderStringArray), Header("enum_header_string", enumHeaderString))
    val queryParams = Query(
      ("enumQueryStringArray", Some(enum_query_string_arrayQuery.toParamString(enum_query_string_array))), ("enumQueryString", Some(enum_query_stringQuery.toParamString(enum_query_string))), ("enumQueryInteger", Some(enum_query_integerQuery.toParamString(enum_query_integer))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def testInlineAdditionalProperties(host: String, param: Any): Task[Unit] = {
    val path = "/fake/inline-additionalProperties"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(param)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def testJsonFormData(host: String, param: String, param2: String): Task[Unit] = {
    val path = "/fake/jsonFormData"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
}

class HttpServiceFakeApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def fakeOuterBooleanSerialize(body: OuterBoolean): Task[OuterBoolean] = {
    implicit val returnTypeDecoder: EntityDecoder[OuterBoolean] = jsonOf[OuterBoolean]

    val path = "/fake/outer/boolean"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[OuterBoolean](req)

    } yield resp
  }
  
  def fakeOuterCompositeSerialize(body: OuterComposite): Task[OuterComposite] = {
    implicit val returnTypeDecoder: EntityDecoder[OuterComposite] = jsonOf[OuterComposite]

    val path = "/fake/outer/composite"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[OuterComposite](req)

    } yield resp
  }
  
  def fakeOuterNumberSerialize(body: OuterNumber): Task[OuterNumber] = {
    implicit val returnTypeDecoder: EntityDecoder[OuterNumber] = jsonOf[OuterNumber]

    val path = "/fake/outer/number"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[OuterNumber](req)

    } yield resp
  }
  
  def fakeOuterStringSerialize(body: OuterString): Task[OuterString] = {
    implicit val returnTypeDecoder: EntityDecoder[OuterString] = jsonOf[OuterString]

    val path = "/fake/outer/string"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[OuterString](req)

    } yield resp
  }
  
  def testBodyWithQueryParams(body: User, query: String)(implicit queryQuery: QueryParam[String]): Task[Unit] = {
    val path = "/fake/body-with-query-params"
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("query", Some(queryQuery.toParamString(query))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def testClientModel(body: Client): Task[Client] = {
    implicit val returnTypeDecoder: EntityDecoder[Client] = jsonOf[Client]

    val path = "/fake"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[Client](req)

    } yield resp
  }
  
  def testEndpointParameters(number: BigDecimal, double: Double, patternWithoutDelimiter: String, byte: ByteArray, integer: Integer, int32: Integer, int64: Long, float: Float, string: String, binary: Binary, date: DateTime, dateTime: DateTime, password: String, callback: String): Task[Unit] = {
    val path = "/fake"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def testEnumParameters(enumFormStringArray: List[String], enumFormString: String = -efg, enumHeaderStringArray: List[String], enumHeaderString: String = -efg, enumQueryStringArray: List[String], enumQueryString: String = -efg, enumQueryInteger: Integer, enumQueryDouble: Double)(implicit enumQueryStringArrayQuery: QueryParam[List[String]], enumQueryStringQuery: QueryParam[String], enumQueryIntegerQuery: QueryParam[Integer]): Task[Unit] = {
    val path = "/fake"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("enum_header_string_array", enumHeaderStringArray), Header("enum_header_string", enumHeaderString))
    val queryParams = Query(
      ("enumQueryStringArray", Some(enum_query_string_arrayQuery.toParamString(enum_query_string_array))), ("enumQueryString", Some(enum_query_stringQuery.toParamString(enum_query_string))), ("enumQueryInteger", Some(enum_query_integerQuery.toParamString(enum_query_integer))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def testInlineAdditionalProperties(param: Any): Task[Unit] = {
    val path = "/fake/inline-additionalProperties"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(param)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def testJsonFormData(param: String, param2: String): Task[Unit] = {
    val path = "/fake/jsonFormData"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
}
