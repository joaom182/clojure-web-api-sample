(ns sample
    (use ring.adapter.jetty)
    (require [sample.routes :as web])
    (:gen-class))

(run-jetty #'web/app {:port 8080})