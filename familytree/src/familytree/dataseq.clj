(ns familytree.dataseq
  (use clojure.pprint))

(def Noel {:id 1
             :firstname "Noel",
             :surname "McKevitt",
             :dob "16-12-1954"
             :role "father"})

(def Marie {:id 2
            :firstname "Marie",
            :surname "McKevitt",
            :dob "27-9-1952"
            :role "mother"})

(def Joe {:id 3
          :firstname "Joe",
          :surname "McKevitt",
          :dob "9-3-1981"
          :role "son"})

(def John {:id 4
           :firstname "John",
           :surname "McKevitt",
           :dob "25-9-1982"
           :role "son"})

(def James {:id 5
            :firstname "James",
            :surname "McKevitt",
            :dob "4-1-1985"
            :role "son"})

(def Marianne {:id 6
               :firstname "Maz",
               :surname "McKevitt",
               :dob "27-8-1987"
               :role "daughter"})

(def Claire {:id 7
             :firstname "Claire",
             :surname "McKevitt",
             :dob "15-9-1988"
             :role "daughter"})


(def JohnSmith {:id 8
             :firstname "John",
             :surname "Smith",
             :dob "15-9-1988"
             :role "father"})

(def MarySmith {:id 9
                :firstname "Mary"
                :surname "Smith"
                :dob "14-12-1983"
                :role "mother"})

(def JimmySmith {:id 10
                 :firstname "Jimmy"
                 :surname "Smith"
                 :dob "14-12-1999"
                 :role "son"})

(def mckevitts (list Noel, Marie, Joe, James, John, Marianne, Claire))
(pprint mckevitts)

(def smiths (list JohnSmith, MarySmith, JimmySmith))
(pprint smiths)

;data structure to contain a list of all the familes
(def allfamiles (list smiths mckevitts))
(pprint allfamiles)

;need to write a function which takes both a surname and firstname and returns back a set of matching
;families.  something like
;search-for-family(surname firstname(optional))
;(defn filter-on-firstname
;  [firstname]
;    (filter #(= (:firstname %) firstname) (flatten allfamiles))
;  )
;
;(defn match-person [surname firstname person]
;  (and (= (:firstname person) firstname)
;       (= (:surname person) surname)))
;
;(defn find-person [surname firstname]
;  (pprint (filter #(match-person surname firstname %)
;                  (flatten allfamiles))))

;(filter-on-firstname "Joe")
;(filter-on-firstname "John")
;(filter-on-firstname "Noel")

