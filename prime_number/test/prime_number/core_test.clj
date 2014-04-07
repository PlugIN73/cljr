(ns prime-number.core-test
  (:require [clojure.test :refer :all]
            [prime-number.core :refer :all]))

(defn assert
  [assertion]
  (is assertion))

(defn !
  [assertion]
  (false? assertion))

(deftest a-test
  (testing "is prime 1 ?"
    (assert (!(is-prime? 1)))))
