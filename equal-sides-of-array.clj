; https://www.codewars.com/kata/5679aa472b8f57fb8c000047/solutions/clojure
(defn find-even-index [arr]
  (let [x (->> (map
                 vector 
                 ; sums from right to left
                 (reductions + arr)
                 ; sums from left to right
                 (reverse (reductions + (reverse arr)))
                 ; elements
                 arr)
               (map (fn [[a b c]] [(- a c) (- b c)]))
               (map-indexed vector)
               (drop-while (fn [[ind [a b]]] (not (= a b)))))
        index (first (first x))]
    (if (nil? index) -1 index)))
    


(find-even-index [1 2 3 4])
  
