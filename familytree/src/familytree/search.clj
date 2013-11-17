(ns familytree.search
  (use clojure.pprint
       familytree.dataseq))

(defn match-person [surname firstname person]
  (and (= (:firstname person) firstname)
       (= (:surname person) surname)))

(defn find-person [surname firstname]
  (pprint (filter #(match-person surname firstname %)
                  (flatten allfamiles))))

(find-person "McKevitt" "John")
(find-person "McKevitt" "Joe")
(find-person "Smith" "John")