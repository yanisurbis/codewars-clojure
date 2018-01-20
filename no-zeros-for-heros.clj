; https://www.codewars.com/kata/no-zeros-for-heros/train/clojure
(apply str (map (partial str "a") (str 123)))
(filter #(not (= 0 %)) [1 2 3 0 0 0])
(filter #(not (= \0 %)) (str "0123450101"))
(take-while #(not (= \0 %)) "123000778")
(apply str (reverse (drop-while #(= \0 %) (reverse (str 123000)))))
(take-while even? [2 2 3])

(defn no-boring-zeros [n]
  (if (= n 0)
    0
    (->> (str n)
         (reverse)
         (drop-while (partial = \0))
         (reverse)
         (apply str)
         (Integer/parseInt))))
  
(no-boring-zeros 123000)
(no-boring-zeros 0)
