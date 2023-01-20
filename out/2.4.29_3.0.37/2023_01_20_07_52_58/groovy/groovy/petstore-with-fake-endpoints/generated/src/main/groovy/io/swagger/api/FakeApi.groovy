package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.BigDecimal
import io.swagger.model.Client
import io.swagger.model.Date
import io.swagger.model.OuterComposite
import io.swagger.model.User

import java.util.*;

@Mixin(ApiUtils)
class FakeApi {
    String basePath = "http://petstore.swagger.io:80/v2"
    String versionPath = "/api/v1"

    def fakeOuterBooleanSerialize ( Boolean body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fake/outer/boolean"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Boolean.class )
                    
    }
    def fakeOuterCompositeSerialize ( OuterComposite body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fake/outer/composite"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    OuterComposite.class )
                    
    }
    def fakeOuterNumberSerialize ( BigDecimal body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fake/outer/number"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    BigDecimal.class )
                    
    }
    def fakeOuterStringSerialize ( String body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fake/outer/string"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def testBodyWithQueryParams ( User body, String query, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fake/body-with-query-params"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }
        // verify required params are set
        if (query == null) {
            throw new RuntimeException("missing required params query")
        }

        if (!"null".equals(String.valueOf(query)))
            queryParams.put("query", String.valueOf(query))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def testClientModel ( Client body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fake"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Client.class )
                    
    }
    def testEndpointParameters ( BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, byte[] binary, Date date, Date dateTime, String password, String paramCallback, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fake"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (number == null) {
            throw new RuntimeException("missing required params number")
        }
        // verify required params are set
        if (_double == null) {
            throw new RuntimeException("missing required params _double")
        }
        // verify required params are set
        if (patternWithoutDelimiter == null) {
            throw new RuntimeException("missing required params patternWithoutDelimiter")
        }
        // verify required params are set
        if (_byte == null) {
            throw new RuntimeException("missing required params _byte")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def testEnumParameters ( List<String> enumFormStringArray, String enumFormString, List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fake"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(enumQueryStringArray)))
            queryParams.put("enum_query_string_array", String.valueOf(enumQueryStringArray))
if (!"null".equals(String.valueOf(enumQueryString)))
            queryParams.put("enum_query_string", String.valueOf(enumQueryString))
if (!"null".equals(String.valueOf(enumQueryInteger)))
            queryParams.put("enum_query_integer", String.valueOf(enumQueryInteger))

        headerParams.put("enum_header_string_array", enumHeaderStringArray)
        headerParams.put("enum_header_string", enumHeaderString)

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def testInlineAdditionalProperties ( Object param, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fake/inline-additionalProperties"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (param == null) {
            throw new RuntimeException("missing required params param")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def testJsonFormData ( String param, String param2, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fake/jsonFormData"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (param == null) {
            throw new RuntimeException("missing required params param")
        }
        // verify required params are set
        if (param2 == null) {
            throw new RuntimeException("missing required params param2")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
}
