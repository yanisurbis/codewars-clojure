; https://www.codewars.com/kata/559b8e46fa060b2c6a0000bf/train/clojure
(ns choose1.core)

(defn diagonal [n p])
  ; your code)

(defn generate-seq-by-row-index [row-index]
  (cond
    (= row-index 0)
    [1]
    (= row-index 1)
    [1 1])
    
    
  (let [next-seq (-> (reduce (fn [result elm]
                               (let [prev (:prev result)
                                     res (:res result)]
                                 {:prev elm
                                  :res (conj res (+ prev elm))}))
                       {:prev (first seq)
                        :res [1]}
                       (rest seq))
                     :res
                     (into [1]))]
    next-seq))

(defn binom-rows
  ([]
   (binom-rows 1))
  ([n]
   (lazy-seq ())))


(generate-next-seq `(1 3 3 1))
                 
