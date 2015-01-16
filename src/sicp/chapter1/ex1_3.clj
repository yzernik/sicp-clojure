;; Exercise 1.3

;; Define a procedure that takes three numbers as arguments and
;; returns the sum of the squares of the two larger numbers.


(defn sum-largest [a b c]
  (if (< a b)
    (if (< a c) 
      (+ b c)
      (+ a b))
    (if (< b c)
      (+ a c)
      (+ a b))))
