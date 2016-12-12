(ns sample.routes
 (:use compojure.core)
 (:use cheshire.core)
 (:use ring.util.response)
 (:require [compojure.handler :as handler]
           [compojure.route :as route]
           [ring.middleware.json :as middleware]
           [sample.modules.teste.routes :as teste-routes]))
 
(defroutes app-routes
  (context "/api" []
    (defroutes api-routes
      (teste-routes/handlers)))

  (route/not-found "Not Found"))

(def app
    (-> (handler/api app-routes)
        (middleware/wrap-json-body {:keywords? true})
        (middleware/wrap-json-response)))

;; For interactive development:
;; (.stop server)
;; (def server (-main))
