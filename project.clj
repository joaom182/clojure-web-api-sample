(defproject simple-clojure-web-api-sample "1.0.0-SNAPSHOT"
  :description "Simple Clojure Web Api Sample"
  :url "http://simple-clojure-web-api-sample.herokuapp.com"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [ring/ring-json "0.1.2"]
                 [org.clojure/data.json "0.2.6"]
                 [cheshire "4.0.3"]]
  :main ^:skip-aot sample.run
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.3.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "simple-clojure-web-api-sample.jar"
  :profiles {:production {:env {:production true}}})