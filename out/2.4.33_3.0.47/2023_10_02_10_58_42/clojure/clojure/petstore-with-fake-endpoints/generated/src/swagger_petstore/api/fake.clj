(ns swagger-petstore.api.fake
  (:require [swagger-petstore.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn fake-outer-boolean-serialize-with-http-info
  "
  Test serialization of outer boolean types"
  ([] (fake-outer-boolean-serialize-with-http-info nil))
  ([{:keys [body ]}]
   (call-api "/fake/outer/boolean" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn fake-outer-boolean-serialize
  "
  Test serialization of outer boolean types"
  ([] (fake-outer-boolean-serialize nil))
  ([optional-params]
   (:data (fake-outer-boolean-serialize-with-http-info optional-params))))

(defn fake-outer-composite-serialize-with-http-info
  "
  Test serialization of object with outer number type"
  ([] (fake-outer-composite-serialize-with-http-info nil))
  ([{:keys [body ]}]
   (call-api "/fake/outer/composite" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn fake-outer-composite-serialize
  "
  Test serialization of object with outer number type"
  ([] (fake-outer-composite-serialize nil))
  ([optional-params]
   (:data (fake-outer-composite-serialize-with-http-info optional-params))))

(defn fake-outer-number-serialize-with-http-info
  "
  Test serialization of outer number types"
  ([] (fake-outer-number-serialize-with-http-info nil))
  ([{:keys [body ]}]
   (call-api "/fake/outer/number" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn fake-outer-number-serialize
  "
  Test serialization of outer number types"
  ([] (fake-outer-number-serialize nil))
  ([optional-params]
   (:data (fake-outer-number-serialize-with-http-info optional-params))))

(defn fake-outer-string-serialize-with-http-info
  "
  Test serialization of outer string types"
  ([] (fake-outer-string-serialize-with-http-info nil))
  ([{:keys [body ]}]
   (call-api "/fake/outer/string" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn fake-outer-string-serialize
  "
  Test serialization of outer string types"
  ([] (fake-outer-string-serialize nil))
  ([optional-params]
   (:data (fake-outer-string-serialize-with-http-info optional-params))))

(defn test-body-with-query-params-with-http-info
  ""
  [body query ]
  (check-required-params body query)
  (call-api "/fake/body-with-query-params" :put
            {:path-params   {}
             :header-params {}
             :query-params  {"query" query }
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       []
             :auth-names    []}))

(defn test-body-with-query-params
  ""
  [body query ]
  (:data (test-body-with-query-params-with-http-info body query)))

(defn test-client-model-with-http-info
  "To test \"client\" model
  To test \"client\" model"
  [body ]
  (check-required-params body)
  (call-api "/fake" :patch
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn test-client-model
  "To test \"client\" model
  To test \"client\" model"
  [body ]
  (:data (test-client-model-with-http-info body)))

(defn test-endpoint-parameters-with-http-info
  "Fake endpoint for testing various parameters
假端點
偽のエンドポイント
가짜 엔드 포인트
  Fake endpoint for testing various parameters
假端點
偽のエンドポイント
가짜 엔드 포인트"
  ([number double pattern-without-delimiter byte ] (test-endpoint-parameters-with-http-info number double pattern-without-delimiter byte nil))
  ([number double pattern-without-delimiter byte {:keys [integer int32 int64 float string binary date date-time password callback ]}]
   (check-required-params number double pattern-without-delimiter byte)
   (call-api "/fake" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"integer" integer "int32" int32 "int64" int64 "number" number "float" float "double" double "string" string "pattern_without_delimiter" pattern-without-delimiter "byte" byte "binary" binary "date" date "dateTime" date-time "password" password "callback" callback }
              :content-types ["application/xml; charset=utf-8" "application/json; charset=utf-8"]
              :accepts       ["application/xml; charset=utf-8" "application/json; charset=utf-8"]
              :auth-names    ["http_basic_test"]})))

(defn test-endpoint-parameters
  "Fake endpoint for testing various parameters
假端點
偽のエンドポイント
가짜 엔드 포인트
  Fake endpoint for testing various parameters
假端點
偽のエンドポイント
가짜 엔드 포인트"
  ([number double pattern-without-delimiter byte ] (test-endpoint-parameters number double pattern-without-delimiter byte nil))
  ([number double pattern-without-delimiter byte optional-params]
   (:data (test-endpoint-parameters-with-http-info number double pattern-without-delimiter byte optional-params))))

(defn test-enum-parameters-with-http-info
  "To test enum parameters
  To test enum parameters"
  ([] (test-enum-parameters-with-http-info nil))
  ([{:keys [enum-form-string-array enum-form-string enum-header-string-array enum-header-string enum-query-string-array enum-query-string enum-query-integer enum-query-double ]}]
   (call-api "/fake" :get
             {:path-params   {}
              :header-params {"enum_header_string_array" (with-collection-format enum-header-string-array :csv) "enum_header_string" enum-header-string }
              :query-params  {"enum_query_string_array" (with-collection-format enum-query-string-array :csv) "enum_query_string" enum-query-string "enum_query_integer" enum-query-integer }
              :form-params   {"enum_form_string_array" (with-collection-format enum-form-string-array :csv) "enum_form_string" enum-form-string "enum_query_double" enum-query-double }
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    []})))

(defn test-enum-parameters
  "To test enum parameters
  To test enum parameters"
  ([] (test-enum-parameters nil))
  ([optional-params]
   (:data (test-enum-parameters-with-http-info optional-params))))

(defn test-inline-additional-properties-with-http-info
  "test inline additionalProperties
  "
  [param ]
  (check-required-params param)
  (call-api "/fake/inline-additionalProperties" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    param
             :content-types ["application/json"]
             :accepts       []
             :auth-names    []}))

(defn test-inline-additional-properties
  "test inline additionalProperties
  "
  [param ]
  (:data (test-inline-additional-properties-with-http-info param)))

(defn test-json-form-data-with-http-info
  "test json serialization of form data
  "
  [param param2 ]
  (check-required-params param param2)
  (call-api "/fake/jsonFormData" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"param" param "param2" param2 }
             :content-types ["application/json"]
             :accepts       []
             :auth-names    []}))

(defn test-json-form-data
  "test json serialization of form data
  "
  [param param2 ]
  (:data (test-json-form-data-with-http-info param param2)))

