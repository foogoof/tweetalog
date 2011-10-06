(ns tweetalog.test.core
  (:use [tweetalog.core])
  (:use [clojure.test])
  (:require [cascalog [ops :as c]])
  (:use cascalog.api)
  )

(deftest got-tweets
  (is (<= 0 (count raw-tweets)) "No tests found?"))

(deftest nineteen-foogoof-tweets
  (is (nil? (?<- (stdout)
                 [?who ?count]
                 (raw-tweets _ ?who _ _ _)
                 (= ?who "foogoof")
                 (c/count ?count))))
  "The cake is a lie. If an exception was thrown, fail. Else, probably success.")