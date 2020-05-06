(ns awesome-project.nav
  (:require [reagent.core :as r]
            [awesome-project.views :as views]
            [react-navigation :as react-navigation]
            [react-navigation-stack :as react-navigation-stack]))

(js/console.log (pr-str ::hello))

(def AppStack
  (react-navigation-stack/createStackNavigator
    (clj->js {:Screen1 {:screen views/screen1}})
    (clj->js {:initialRouteName "Screen1" })))

(def App (react-navigation/createAppContainer AppStack))
