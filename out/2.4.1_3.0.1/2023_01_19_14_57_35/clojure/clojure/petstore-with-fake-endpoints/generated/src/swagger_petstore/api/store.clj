(ns swagger-petstore.api.store
  (:require [swagger-petstore.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn delete-order-with-http-info
  "Delete purchase order by ID
  For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors"
  [order-id ]
  (check-required-params order-id)
  (call-api "/store/order/{order_id}" :delete
            {:path-params   {"order_id" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/xml" "application/json"]
             :auth-names    []}))

(defn delete-order
  "Delete purchase order by ID
  For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors"
  [order-id ]
  (:data (delete-order-with-http-info order-id)))

(defn get-inventory-with-http-info
  "Returns pet inventories by status
  Returns a map of status codes to quantities"
  []
  (call-api "/store/inventory" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["api_key"]}))

(defn get-inventory
  "Returns pet inventories by status
  Returns a map of status codes to quantities"
  []
  (:data (get-inventory-with-http-info)))

(defn get-order-by-id-with-http-info
  "Find purchase order by ID
  For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions"
  [order-id ]
  (check-required-params order-id)
  (call-api "/store/order/{order_id}" :get
            {:path-params   {"order_id" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/xml" "application/json"]
             :auth-names    []}))

(defn get-order-by-id
  "Find purchase order by ID
  For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions"
  [order-id ]
  (:data (get-order-by-id-with-http-info order-id)))

(defn place-order-with-http-info
  "Place an order for a pet
  "
  [body ]
  (check-required-params body)
  (call-api "/store/order" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types []
             :accepts       ["application/xml" "application/json"]
             :auth-names    []}))

(defn place-order
  "Place an order for a pet
  "
  [body ]
  (:data (place-order-with-http-info body)))

