(ns sample.modules.teste.functions.objects)

(defn sum-body-array [body]
    {:result (apply + (:tt body)) :title (:object body)})

(defn get-example-object-with-param [param]
    {:id param})

(defn get-example-object []
    {:propriedade "Objeto" :array [{:propriedade ""}]  :c [{:a 1 :b 9}]})