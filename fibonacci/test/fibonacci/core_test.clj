(ns fibonacci.core-test
  (:require [clojure.test :refer :all]
            [fibonacci.core :refer :all]))

(deftest a-test
  (testing "fibonacci 0"
    (is (= 0 (fibonacci 0))))

  (testing "fibonacci 1"
    (is (= 1 (fibonacci 1))))

  (testing "fibonacci 1"
    (is (= 3 (fibonacci 4))))

  (testing "fibonacci 1"
    (is (= 13 (fibonacci 7))))

  (testing "fibonacci 1"
    (is (= 55 (fib 10))))
)
