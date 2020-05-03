(ns awesome-project.views
  (:require [reagent.core :as r]
            [reagent.react-native :as rn]))

(js/console.log (pr-str ::hello))

(defn screen1-view []
  [rn/view {:style {:flex 1 :align-items "center" :justify-content "center"}}
     [rn/text {:style {:font-size 50}} "Container 1"]
     [rn/text {:style {:font-size 20}} "Rendered at " (str (js/Date.))]])

(def screen1
  (let [c (r/reactify-component screen1-view)]
    (set! (.-navigationOptions c)
          (fn []
            (clj->js {:headerTitle "Screen 1" })))
    c))
