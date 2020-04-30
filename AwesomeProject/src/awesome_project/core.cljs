(ns awesome-project.core
  (:require [reagent.core :as r]
            [reagent.react-native :as rn]))

(defn ^:export -main [& args]
  (r/as-element
    [rn/view {:style {:flex 1 :align-items "center" :justify-content "center"}}
     [rn/text {:style {:font-size 50}} "Hello Krell!"]]))