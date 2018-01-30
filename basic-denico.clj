; https://www.codewars.com/kata/596f610441372ee0de00006e/train/clojure

(defn key->numbers [key]
  (let [letters-to-numbers (->> key
                                (sort)
                                (map-indexed vector)
                                (into {})
                                clojure.set/map-invert)]
    (reduce
      (fn [res elm] (conj res (letters-to-numbers elm)))
      []
      key)))

(mod 5 2)
(take 1 (repeat []))

(defn text->vectors [text number-of-vectors]
  (let [vectors (concat (partition 1 number-of-vectors text))]
                       
                     
    vectors))

(text->vectors "cseerntiofarmit on  " 5)

(key->numbers "crazy")

(defn denico [k m])
