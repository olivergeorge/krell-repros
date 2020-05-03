(ns awesome-project.core
  (:require [reagent.core :as r]
            [awesome-project.nav :as nav]))

(defn ^:export -main [& args]
  (r/as-element [nav/app]))
