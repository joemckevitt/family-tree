(ns family
  (:use familytree.data)
  (:use clojure.pprint)
  (:use clojure.set))

(defn find-family-firstname [families firstname]
  (filter #(= (:firstname %) firstname) families))

(pprint (find-family-firstname families "Noel"))

(defn find-family [families surname]
  (filter #(= (:surname %) surname) families))

(->
  (find-family families "mckevitts")
  pprint)

(def find-preloaded-familes (partial find-family families))

(find-preloaded-familes "mckevitts")

(defn getFamily
  ([surname] (find-preloaded-familes surname))
  ([surname firstname] (find-preloaded-familes surname)))

(pprint (getFamily "smiths"))
(pprint (getFamily "mckevitts"))

(pprint (getFamily "mckevitts" "john"))
(pprint (getFamily "mckevitts" nil))




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

;need to write a function which takes both a surname and firstname and returns back a set of matching
;families.  something like
;search-for-family(surname firstname(optional))
