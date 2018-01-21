; https://www.codewars.com/kata/ball-upwards/train/clojure

(defn km-per-hr->m-per-s [v]
  (/ (* v 1000) 3600))

(defn m-per-s->km-per-hr [v]
  (/ (* v 3600) 1000))

(defn get-height [v t]
  (- (* v t) (* 0.5 9.81 t t)))

(get-height (km-per-hr->m-per-s 15) 0.1)

(defn intervals
  ([]
   (intervals 1))
  ([n]
   (lazy-seq (cons [(* n 0.1) (* (inc n) 0.1)] (intervals (inc n))))))

(take 4 (intervals))
(take 4 (intervals 2))

(partition 2 1 [1 2 3 4])

(defn max-ball [v0]
  (let [speed (km-per-hr->m-per-s v0)
        get-height-for-speed (partial get-height speed)
        heights (->> (iterate inc 0)
                     (map (partial * 0.1))
                     (map get-height-for-speed)
                     (partition 2 1)
                     (map-indexed vector)
                     (drop-while (fn [[elm [fst snd]]] (< fst snd)))
                     (first))]
    (first heights)))

(max-ball 15)




      

      
        
    
        
    
  
