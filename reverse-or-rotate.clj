; https://www.codewars.com/kata/reverse-or-rotate

(count "sample")
(def partitions (partition 3 "1234567"))
(apply str (reduce concat partitions))
(def numbers (map #(Character/digit % 10) (first partitions)))
(into (list (first numbers)) (rest numbers))
(reduce #(+ %1 (reduce *  (repeat 3 (Character/digit %2 10)))) 0 (first partitions))


(defn revrot [strng sz]
  (cond
    (<= sz 0) ""
    (= 0 (count strng)) ""
    (< (count strng) sz) ""
    :else
    (let [parts (partition sz strng)
          rotate-left #(concat (rest %) (list (first %)))
          special? (fn [partition]
                     (let [digit-sum (reduce #(+ %1 (reduce * (repeat 3 (Character/digit %2 10)))) 0 partition)]
                          (= 0 (mod digit-sum 2))))]
      (->> parts
           (map (fn [part]
                  (if (special? part)
                    (reverse part)
                    (rotate-left part))))
           (reduce concat)
           (apply str)))))
      

      

(revrot "123456987654" 6) 
(revrot "123456987653" 6) 
(revrot "66443875" 4) 
(revrot "66443875" 8) 
(revrot "664438769" 8) 
(revrot "123456779" 8) 
(revrot "" 8) 
(revrot "123456779" 0)
(revrot "563000655734469485" 4)
    
  
