; https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/clojure

(every? true? (vals {:a true :b false}))

(count "abcdefghijklmnopqrstuvwxyz")

(clojure.string/replace "abcd efg" #"[^A-Za-z]" "")

(defn pangram?
  [s]
  (let [alphabet-dict (zipmap (clojure.string/split "abcdefghijklmnopqrstuvwxyz" #"") (repeat false))
        only-characters (clojure.string/replace s #"[^A-Za-z]" "")
        s-dict (zipmap (clojure.string/split only-characters #"") (repeat true))
        res (merge alphabet-dict s-dict)]
    (every? true? (vals res))))

(defn pangram?
  [s]
  (let [alphabet-dict (zipmap (clojure.string/split "abcdefghijklmnopqrstuvwxyz" #"") (repeat false))
        only-characters (clojure.string/replace (clojure.string/lower-case s) #"[^A-Za-z]" "")
        s-dict (zipmap (clojure.string/split only-characters #"") (repeat true))
        res (merge alphabet-dict s-dict)]
    (every? true? (vals res))))


(pangram? "The quick brown fox jumps over the lazy dog.")
(pangram? "abs")
(pangram? "Pack my box with five dozen liquor jugs.")
(pangram? "The quick brown fox jumps over the lazy dog.")
        



  
