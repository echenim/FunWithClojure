(ns funwithclojure.recursion.recursion)

;Today 24/10/2018, we will start with a  series fun with clojure
;the goal to using clojure to explore the world of mathematical algorithm
;the goal to getting to know Clojure intimately
;we find out what makes Clojure tick

;my first implementation for factorial
;this implementation for factorial (N1=N x (N-1))
;this implementation is easy but it is deeply flawed
;this implementation with breakdown as N approach 21
;any values greater than 20 with result in ArithmeticException integer overflow  clojure.lang.Numbers.throwIntOverflow
(defn factorial [num]
  (if (<= num 1)
    1 (* num (factorial (- num 1)))
    )
  )