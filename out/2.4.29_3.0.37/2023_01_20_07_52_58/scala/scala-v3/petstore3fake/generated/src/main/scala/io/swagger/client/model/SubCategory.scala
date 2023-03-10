/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model


/**
 * @param category 
 * @param category2 
 * @param pets 
 */
case class SubCategory (
  category: Option[AllOfSubCategoryCategory] = None,
  category2: Option[Category] = None,
  pets: Option[List[AllOfSubCategoryPetsItems]] = None
)

