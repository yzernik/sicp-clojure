;; Exercise 1.5

;; Ben Bitdiddle has invented a test to determine whether the interpreter
;; he is faced with is using applicative-order evaluation or normal-order
;; evaluation. He defines the following two procedures:


(defn p [] (p))

(defn test [x y]
  (if (= x 0)
    0
    y))


;; Then he evaluates the expression

;; (test 0 (p))


;; Applicative-order evaluation will return 0
;; Normal-order evaluation will cause an infinite recursion and stack overflow error.
;; Clojure has a stack overflow.
