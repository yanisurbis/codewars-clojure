(first "alaska")
(last "alaska")
(clojure.string/capitalize "alaska")
(clojure.string/join "" ["alaska" "alaska"])
(clojure.string/lower-case "alaska")

(defn generate-band-name [noun]
  (cond
    (= (first noun) (last noun))
    (->> [(clojure.string/lower-case noun) (apply str (rest (clojure.string/lower-case noun)))]
         (clojure.string/join "")
         (clojure.string/capitalize))
    :else
    (->> (clojure.string/lower-case noun)
         (clojure.string/capitalize)
         (str "The "))))

(def samples ["knife" "tart" "sandles" "bed"])
(map generate-band-name samples)
