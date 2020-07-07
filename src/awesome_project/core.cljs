(ns awesome-project.core
  (:require [reagent.core :as r]
            [reagent.react-native :as rn]
            [goog.object :as gobject]
            [react-native-camera :as module]))

(def RNCamera module/RNCamera)

(defn app []
      [rn/view
       {:style {:flex 1 :flexDirection "column" :background-color "black"}}
       [:> RNCamera
        {:style         {:flex 1 :flexDirection "column" :background-color "black"}
         :type          module/RNCamera.Constants.FlashMode.on
         :captureAudio  false
         :onBarCodeRead (fn [data] (js/console.log (pr-str ::onBarCodeRead) data))}]])

(defn error-report [error]
      [rn/view {:style {:padding-horizontal 20 :background-color "pink" :flex 1}}
       [rn/text {:style {:padding-top 80 :font-size 32 :color "red"}} "Error report"]
       [rn/text {:style {:padding-top 20 :font-size 14 :color "black"}} (str error)]
       [rn/text {:style {:padding-top 10 :font-size 12 :color "black"}} (str (gobject/get error "componentStack"))]])

(defn error-boundary []
      (let [*error (r/atom nil)]
           (r/create-class
             {:get-derived-state-from-error (fn [e] (reset! *error e))
              :component-did-catch          (fn [_ _ _] true)
              :reagent-render               (fn [form] (if @*error [error-report @*error] form))})))

(defn ^:export -main [& args]
      (r/as-element [error-boundary [app]]))
