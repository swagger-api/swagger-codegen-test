/*
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package petstore

type EnumFormBody struct {
	// Form parameter enum test (string array)
	EnumFormStringArray []string `json:"enum_form_string_array,omitempty"`
	// Form parameter enum test (string)
	EnumFormString string `json:"enum_form_string,omitempty"`
	// Query parameter enum test (double)
	EnumQueryDouble float64 `json:"enum_query_double,omitempty"`
}
