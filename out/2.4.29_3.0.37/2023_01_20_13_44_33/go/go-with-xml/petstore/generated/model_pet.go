/*
 * Swagger Petstore
 *
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API version: 1.0.5
 * Contact: apiteam@swagger.io
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package petstore

type Pet struct {
	Id int64 `json:"id,omitempty" xml:"id"`
	Category *Category `json:"category,omitempty" xml:"category"`
	Name string `json:"name" xml:"name"`
	PhotoUrls []string `json:"photoUrls" xml:"photoUrls"`
	Tags []Tag `json:"tags,omitempty" xml:"tags"`
	// pet status in the store
	Status string `json:"status,omitempty" xml:"status"`
}
