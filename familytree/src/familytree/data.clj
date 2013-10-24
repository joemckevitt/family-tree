(ns data
  (use clojure.pprint))

(def Noel {:id 1 :firstname "Noel", :surname "McKevitt", :dob "16-12-1954"})
(def Marie {:id 2 :firstname "Marie", :surname "McKevitt", :dob "27-9-1952"})
(def Joe {:id 3 :firstname "Joe", :surname "McKevitt", :dob "9-3-1981"})
(def John {:id 4 :firstname "John", :surname "McKevitt", :dob "25-9-1982"})
(def James {:id 5 :firstname "James", :surname "McKevitt", :dob "4-1-1985"})
(def Marianne {:id 6 :firstname "Maz", :surname "McKevitt", :dob "27-8-1987"})
(def Claire {:id 7 :firstname "Claire", :surname "McKevitt", :dob "15-9-1988"})

(def mckevitts
  {:surname "mckevitts" :father Noel, :mother Marie, :sons #{Joe, John, James} :daughters #{Claire, Marianne}})

(def John {:id 6 :firstname "John", :surname "Smith", :dob "17-12-1954"})
(def Mary {:id 7 :firstname "Mary", :surname "Smith", :dob "17-12-1962"})
(def Mo {:id 8 :firstname "Mo", :surname "Smith", :dob "17-12-1982"})

(def smiths
  { :surname "smiths" :father John, :mother Mary :sons #{Mo} })

(def families
  (list mckevitts, smiths))

(pprint families)
