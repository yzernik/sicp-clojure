(defproject sicp "0.1.0-SNAPSHOT"
  :description "SICP solutions in Clojure"
  :url "https://github.com/yzernik/sicp-clojure"
  :license {:name "MIT" :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot sicp.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
