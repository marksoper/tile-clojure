
(defproject tile "0.1.0"
  :description "overlapping square tile art/game"
  :source-paths ["src-clj"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2197"
                  :exclusions [org.apache.ant/ant]]
                 [org.clojure/data.json "0.2.4"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :cljsbuild {
    :builds [{:source-paths ["src-cljs"]
              :compiler {:output-to "js/tile.js"
                         :optimizations :whitespace
                         :pretty-print true}}]})