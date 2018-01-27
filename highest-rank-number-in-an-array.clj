; https://www.codewars.com/kata/highest-rank-number-in-an-array

(defn highest-rank
  [data]
  (->> (frequencies data)
       (into (sorted-map-by >))
       (reduce (fn [res elm] (if (> (second elm) (second res)) elm res)))
       (first)))

(highest-rank [12 10 8 12 7 6 4 10 12])
(highest-rank [12 10 8 12 7 6 4 10 12 10])
(highest-rank [12 10 8 8 3 3 3 3 2 4 10 12 10])
