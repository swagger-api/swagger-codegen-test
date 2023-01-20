(ns swagger-petstore.api.-another-fake-
  (:require [swagger-petstore.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn test-special-tags-with-http-info
  "To test special tags
  To test special tags"
  [body ]
  (check-required-params body)
  (call-api "/another-fake/dummy" :patch
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn test-special-tags
  "To test special tags
  To test special tags"
  [body ]
  (:data (test-special-tags-with-http-info body)))

