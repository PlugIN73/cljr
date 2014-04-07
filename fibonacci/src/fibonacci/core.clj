(ns fibonacci.core)

(defn fibonacci
  [x]
  (if (= x 0)
    0
    (if (= x 1)
      1
      (+ (fibonacci (dec x)) (fibonacci (- x 2))))))

(defn fib
  [x]
  (loop [a 0 b 1 cnt x]
    (if (= cnt 0)
      a
      (recur (+ a b) a (dec cnt)))))

