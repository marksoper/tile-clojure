(ns tile)
(def area {:x 0 :y 0 :h 1000 :w 1000})
(def tile {
  :x (/ (- (get area :w) (get area :x)) 2)
  :y (/ (- (get area :h) (get area :y)) 2)
})
(defn tileToSVG [tile]
  (str "<rect x=\"" (get tile :x) "\"")
)