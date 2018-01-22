ode; https://www.codewars.com/kata/5541f58a944b85ce6d00006a/train/clojure

(defn product-fib [prod]
  (let [[a b] (->> (iterate (fn [[a b]] [b (+' a b)]) [0 1])
                   (drop-while (fn [[elmN elmN+1]] (< (* (bigint elmN) elmN+1) prod)))
                   (first))]
    [a b (= (* (bigint a) b) prod)]))

(product-fib 4895256319508074468182850N)
