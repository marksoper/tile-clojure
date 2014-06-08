
(ns tile
  (:require [cheshire.core :as json]))

(def area {:x 0 :y 0 :h 1000 :w 1000})
(def tile {
  :x (/ (- (get area :w) (get area :x)) 2)
  :y (/ (- (get area :h) (get area :y)) 2)
})
(json/generate-string tile)
(defn tileToJSON [tile]
  ;json/write-str tile
  (str "<rect x=\"" (get tile :x) "\"")
)