(ns pdg.log
    (:require [clojure.tools.logging :as log]))

(defn log-info [& text]
  (log/info text))

(defn log-warn [& text]
  (log/warn text))

(defn log-error [& text]
  (log/error text))

(defmacro info [& text]
  `(log-info ~@text))

(defmacro warn [& text]
  `(log-warn ~@text))

(defmacro error [& text]
  `(log-error ~@text))
