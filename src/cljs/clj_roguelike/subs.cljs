(ns clj-roguelike.subs
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
  ::game-state
  (fn [db]
    (:game db)))
