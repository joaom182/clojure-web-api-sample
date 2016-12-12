(ns sample.modules.teste.routes
  (:use compojure.core)
  (:use cheshire.core)
  (:use ring.util.response)
  (:require [sample.modules.teste.functions.objects :as objects]))
            
(defn handlers []
  (context "/teste" []
    (defroutes teste-routes

      (GET "/" []
          {:status 200
            :body (objects/get-example-object)
          }) 

      (GET "/:id" [id]
        {:status 200
         :body (objects/get-example-object-with-param id)
        })

      (POST "/" {body :body}
        {:status 200
         :body (objects/get-example-object-with-param body)
        })

      (POST "/inc" {body :body}
        {:status 200
         :body (objects/sum-body-array body)
        })
  ))) 