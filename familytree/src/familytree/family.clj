(ns family
  (:use data)
  (:use clojure.pprint)
  (:use clojure.set))

(defn find-family [families surname]
  (filter #(= (:surname %) surname) families))

(->
  (find-family families "mckevitts")
  pprint)

(def find-preloaded-familes (partial find-family families))

(find-preloaded-familes "mckevitts")

(defn getFamily [surname]
  (find-preloaded-familes surname))

(pprint (getFamily "smiths"))
(pprint (:father (getFamily "mckevitt") "nothing found!"))
(pprint (:mother (getFamily "mckevitt")))
(pprint (:sons (getFamily "mckevitt")))
(pprint (:daughters (getFamily "mckevitt")))

(defn name-starts-with-j? [[key person]]
  (= (first (:firstname person)) \J))

(filter (fn [[k v]] (= (get v :firstname) "Marie")) (seq mckevitts))

(defn getChildren [[k v]]
  (or (= k :sons) (= k :daughters)))

(defn siblings [family]
  ( let [sons (:sons family)
         daugthers (:daughters family)]
    (union sons daugthers)))

(pprint (siblings mckevitts))
(pprint (siblings smiths))
(pprint smiths)

(pprint (seq mckevitts))
