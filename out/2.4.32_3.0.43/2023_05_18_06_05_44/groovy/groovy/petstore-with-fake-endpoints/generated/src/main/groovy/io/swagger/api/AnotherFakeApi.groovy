package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Client

import java.util.*;

@Mixin(ApiUtils)
class AnotherFakeApi {
    String basePath = "http://petstore.swagger.io:80/v2"
    String versionPath = "/api/v1"

    def testSpecialTags ( Client body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/another-fake/dummy"

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
}
