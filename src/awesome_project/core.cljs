(ns awesome-project.core
  (:require [reagent.core :as r]
            [reagent.react-native :as rn]
            [awesome-project.nav :as nav]))

(js/console.log (pr-str ::hello))

(defn app [] [:> nav/App])

(defn hello []
  [rn/view {:style {:flex 1 :align-items "center" :justify-content "center"}}
   [rn/text {:style {:font-size 50}} "Hello Krell!"]])

(defn ^:export -main [& args]
  (js/console.log (pr-str ::main.render))
  (r/as-element [app]))

