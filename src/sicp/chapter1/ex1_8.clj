;; Exercise 1.8


;; Newton's method for cube roots is based on the fact that if y is an approximation
;; to the cube root of x, then a better approximation is given by the value

;; http://mitpress.mit.edu/sicp/full-text/book/ch1-Z-G-5.gif

;; Use this formula to implement a cube-root procedure analogous to the square-root
;; procedure. (In section 1.3.4 we will see how to implement Newton's method in
;; general as an abstraction of these square-root and cube-root procedures.)

(defn square [x] (* x x))

(defn cube [x] (* x x x))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn good-enough? [guess prev]
  (< (/ (abs (- guess prev)) guess) 0.001))

(defn improve [guess x]
  (/ (+ (/ x (square guess)) (* 2 guess))
     3))

(defn cube-iter [guess x]
  (def next (improve guess x))
  (if (good-enough? next guess)
    next
    (cube-iter next x)))

(defn cube-rt [x]
  (cube-iter 1.0 x))

