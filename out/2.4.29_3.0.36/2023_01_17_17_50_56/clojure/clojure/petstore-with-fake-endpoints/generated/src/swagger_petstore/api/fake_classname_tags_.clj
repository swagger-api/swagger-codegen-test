(ns swagger-petstore.api.fake-classname-tags-
  (:require [swagger-petstore.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn test-classname-with-http-info
  "To test class name in snake case
  To test class name in snake case"
  [body ]
  (check-required-params body)
  (call-api "/fake_classname_test" :patch
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["api_key_query"]}))

(defn test-classname
  "To test class name in snake case
  To test class name in snake case"
  [body ]
  (:data (test-classname-with-http-info body)))

