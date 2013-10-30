(ns familytree.dataseq
  (use clojure.pprint))

(def Noel {:id 1 :firstname "Noel", :surname "McKevitt", :dob "16-12-1954" :role "father"})
(def Marie {:id 2 :firstname "Marie", :surname "McKevitt", :dob "27-9-1952" :role "mother"})
(def Joe {:id 3 :firstname "Joe", :surname "McKevitt", :dob "9-3-1981" :role "son"})
(def John {:id 4 :firstname "John", :surname "McKevitt", :dob "25-9-1982" :role "son"})
(def James {:id 5 :firstname "James", :surname "McKevitt", :dob "4-1-1985" :role "son"})
(def Marianne {:id 6 :firstname "Maz", :surname "McKevitt", :dob "27-8-1987" :role "daughter"})
(def Claire {:id 7 :firstname "Claire", :surname "McKevitt", :dob "15-9-1988" :role "daughter"})

(def mckevitts (list Noel, Marie, Joe, James, John, Marianne, Claire))
(pprint mckevitts)

