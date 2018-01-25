; https://www.codewars.com/kata/559b8e46fa060b2c6a0000bf/train/clojure
(ns choose1.core)

(defn diagonal [n p])
  ; your code)

(defn generate-next-seq [seq]
  (let [next-seq-without-ones (:res (reduce (fn [result elm]
                                              (let [prev (:prev result)
                                                    res (:res result)]
                                                {:prev elm
                                                 :res (conj res (+ prev elm))}))
                                      {:prev (first seq)
                                       :res []}
                                      (rest seq)))
        next-seq-with-lead-one (into [1] next-seq-without-ones)
        next-seq (into next-seq-with-lead-one [1])]
    next-seq))


(generate-next-seq `(1 3 3 1))
                 
