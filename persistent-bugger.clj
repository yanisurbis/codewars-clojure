; https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/clojure

(defn transform [number]
  (->> (str number)
       (map #(Character/digit % 10))
       (reduce *)))

(transform "123")
(read-string "123")

(defn persistence 
  ([n]
   (persistence n [n]))
  ([n levels]
   (cond
     (= 1 (count (str n)))
     (dec (count levels))
     :else
     (let [transformed-number (transform n)]
       (persistence transformed-number (conj levels transformed-number))))))

(persistence 39)
     
    

