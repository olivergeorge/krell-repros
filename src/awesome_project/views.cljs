(ns awesome-project.views
  (:require [reagent.react-native :as rn]))

(defn screen []
  [rn/view {:style {:flex 1 :align-items "center" :justify-content "center"}}
   [rn/text {:style {:font-size 50}} "Hello Krell!"]
   [rn/text {:style {:font-size 20}} "Rendered at " (str (js/Date.))]])