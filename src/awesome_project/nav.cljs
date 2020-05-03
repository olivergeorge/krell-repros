(ns awesome-project.nav
  (:require [reagent.core :as r]
            [reagent.react-native :as rn]
            ["@react-navigation/native" :refer [NavigationContainer]]
            ["@react-navigation/stack" :refer [createStackNavigator]]
            [awesome-project.views :as views]
            [goog.object :as gobject]))

(def Stack (createStackNavigator))

(defn app []
  (let [Navigator (gobject/get Stack "Navigator")
        Screen (gobject/get Stack "Screen")]
    [:> NavigationContainer
     [:> Navigator
      [:> Screen {:name "Welcome" :component #(r/as-element [views/screen])}]]]))
