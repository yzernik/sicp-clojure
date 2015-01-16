(require 'leiningen.exec)
(leiningen.exec/deps '[[org.clojure/math.combinatorics "0.0.4"]
                       [markdown-clj "0.9.25"]])

(require '[clojure.math.combinatorics :as combo]
         '[markdown.core :as md])

;; Any args passed to script are stored in the `*command-line-args*`
;; list, with the first element being the filename of the script.
(println "Hi, lein exec!" *command-line-args*)

(println (combo/combinations [1 2 3] 2))
(println (md/md-to-html-string "Top of the muffin, *to ya*!"))
