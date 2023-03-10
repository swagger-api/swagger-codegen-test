/**
* Swagger Petstore
* This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
*
* OpenAPI spec version: 1.0.5
* Contact: apiteam@swagger.io
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.basicAuthentication
import io.ktor.auth.oauth
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.*
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.*

import kotlinx.coroutines.experimental.asCoroutineDispatcher

import io.swagger.server.ApplicationAuthProviders
import io.swagger.server.Paths
import io.swagger.server.ApplicationExecutors
import io.swagger.server.HTTP.client
import io.swagger.server.infrastructure.ApiPrincipal
import io.swagger.server.infrastructure.apiKeyAuth

// ktor 0.9.x is missing io.ktor.locations.DELETE, this adds it.
// see https://github.com/ktorio/ktor/issues/288
import io.swagger.server.delete

import io.swagger.server.models.Order

fun Route.StoreApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    delete<Paths.deleteOrder> {  it: Paths.deleteOrder ->
        call.respond(HttpStatusCode.NotImplemented)
    }
    

    get<Paths.getInventory> {  it: Paths.getInventory ->
        val principal = call.authentication.principal<ApiPrincipal>()
        
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "key" : 0
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    .apply {
      // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
      //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

        try {
            authentication {
                // "Implement API key auth (api_key) for parameter name 'api_key'."
                apiKeyAuth("api_key", "header") {
                    // TODO: "Verify key here , accessible as it.value"
                    if (it.value == "keyboardcat") {
                         ApiPrincipal(it)
                    } else {
                        null
                    }
                }
            }
        } catch(e: io.ktor.application.DuplicateApplicationFeatureException){
            application.environment.log.warn("authentication block for '/store/inventory' is duplicated in code. " +
            "Generated endpoints may need to be merged under a 'route' entry.")
        }
    }

    get<Paths.getOrderById> {  it: Paths.getOrderById ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "petId" : 6,
          "quantity" : 1,
          "id" : 0,
          "shipDate" : "2000-01-23T04:56:07.000+00:00",
          "complete" : true,
          "status" : "placed"
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    route("/store/order") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "petId" : 6,
              "quantity" : 1,
              "id" : 0,
              "shipDate" : "2000-01-23T04:56:07.000+00:00",
              "complete" : true,
              "status" : "placed"
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    
}
